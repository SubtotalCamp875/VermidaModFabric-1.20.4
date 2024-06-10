package net.subtotalcamp875.vermidamod.block.entity;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.subtotalcamp875.vermidamod.item.ModItems;
import net.subtotalcamp875.vermidamod.screen.BloodCondensingScreenHandler;
import org.jetbrains.annotations.Nullable;

public class BloodCondensingStationBlockEntity extends BlockEntity implements ExtendedScreenHandlerFactory, ImplementedInventory {
    private final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(9, ItemStack.EMPTY);

    private static final int INPUT_SLOT = 2;
    private static final int OUTPUT_SLOT = 8;
    private static final int FUEL_OUTPUT_SLOT = 5;
    private static final int FUEL_INPUT_SLOT_1 = 0;
    private static final int FUEL_INPUT_SLOT_2 = 1;
    private static final int FUEL_INPUT_SLOT_3 = 3;
    private static final int FUEL_INPUT_SLOT_4 = 4;
    private static final int FUEL_INPUT_SLOT_5 = 6;
    private static final int FUEL_INPUT_SLOT_6 = 7;


    protected final PropertyDelegate propertyDelegate;
    private int progress = 0;
    private int maxProgress = 160;

    public BloodCondensingStationBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.BLOOD_CONDENSING_STATION_BLOCK_ENTITY, pos, state);
        this.propertyDelegate = new PropertyDelegate() {
            @Override
            public int get(int index) {
                return switch (index) {
                    case 0 -> BloodCondensingStationBlockEntity.this.progress;
                    case 1 -> BloodCondensingStationBlockEntity.this.maxProgress;
                    default -> 0;
                };
            }

            @Override
            public void set(int index, int value) {
                switch (index) {
                    case 0 -> BloodCondensingStationBlockEntity.this.progress = value;
                    case 1 -> BloodCondensingStationBlockEntity.this.maxProgress = value;
                }
            }

            @Override
            public int size() {
                return 2;
            }
        };
    }

    @Override
    public void writeScreenOpeningData(ServerPlayerEntity player, PacketByteBuf buf) {
        buf.writeBlockPos(this.pos);
    }

    @Override
    public Text getDisplayName() {
        return Text.literal("Blood Condensing Station");
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return inventory;
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        Inventories.writeNbt(nbt, inventory);
        nbt.putInt("blood_condensing_station.progress", progress);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        Inventories.readNbt(nbt, inventory);
        progress = nbt.getInt("blood_condensing_station.progress");
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory playerInventory, PlayerEntity player) {
        return new BloodCondensingScreenHandler(syncId, playerInventory, this, this.propertyDelegate);
    }

    public void tick(World world, BlockPos pos, BlockState state) {
        if(world.isClient()) {
            return;
        }

        if(isOutputSlotEmptyOrReceivable()) {
            if(this.hasRecipe()) {
                this.increaseCraftProgress();
                markDirty(world, pos, state);

                if(hasCraftingFinished()) {
                    this.craftItem(craftingResult());
                    this.resetProgress();
                }
            } else {
                this.resetProgress();
            }
        } else {
            this.resetProgress();
            markDirty(world, pos, state);
        }
    }

    private void resetProgress() {
        this.progress = 0;
    }

    private void craftItem(Item pItem) {
        ItemStack result = new ItemStack(pItem, 1);

        ItemStack fuelOutput = new ItemStack(Items.GLASS_BOTTLE, 6);
        this.removeStack(INPUT_SLOT, 1);
        this.removeStack(FUEL_INPUT_SLOT_1, 1);
        this.removeStack(FUEL_INPUT_SLOT_2, 1);
        this.removeStack(FUEL_INPUT_SLOT_3, 1);
        this.removeStack(FUEL_INPUT_SLOT_4, 1);
        this.removeStack(FUEL_INPUT_SLOT_5, 1);
        this.removeStack(FUEL_INPUT_SLOT_6, 1);

        this.setStack(OUTPUT_SLOT, new ItemStack(result.getItem(),
                getStack(OUTPUT_SLOT).getCount() + result.getCount()));
        this.setStack(FUEL_OUTPUT_SLOT, new ItemStack(fuelOutput.getItem(),
                getStack(FUEL_OUTPUT_SLOT).getCount() + fuelOutput.getCount()));
    }

    private Item craftingResult() {
        if (this.getStack(INPUT_SLOT).getItem() == ModItems.SHAMAN_BLOOD) {
            return ModItems.SLIGHTLY_CONDENSED_SHAMAN_BLOOD;
        } else if (this.getStack(INPUT_SLOT).getItem() == ModItems.SLIGHTLY_CONDENSED_SHAMAN_BLOOD) {
            return ModItems.LIGHTLY_CONDENSED_SHAMAN_BLOOD;
        } else if (this.getStack(INPUT_SLOT).getItem() == ModItems.LIGHTLY_CONDENSED_SHAMAN_BLOOD) {
            return ModItems.CONDENSED_SHAMAN_BLOOD;
        } else if (this.getStack(INPUT_SLOT).getItem() == ModItems.CONDENSED_SHAMAN_BLOOD) {
            return ModItems.VERY_CONDENSED_SHAMAN_BLOOD;
        } else if (this.getStack(INPUT_SLOT).getItem() == ModItems.VERY_CONDENSED_SHAMAN_BLOOD) {
            return ModItems.EXTREMELY_CONDENSED_SHAMAN_BLOOD;
        }
        return null;
    }

    private boolean hasCraftingFinished() {
        return progress >= maxProgress;
    }

    private void increaseCraftProgress() {
        progress++;
    }

    private boolean hasRecipe() {
        boolean hasCraftingItem = true;

        ItemStack result = null;

        if (craftingResult() != null) {
            result = new ItemStack(craftingResult());
        } else {
            hasCraftingItem = false;
        }

        return hasCraftingItem && canInsertAmountIntoOutputSlot(result.getCount()) && canInsertItemIntoOutputSlot(result.getItem()) && hasFuel();
    }

    private boolean hasFuel() {
        boolean hasFuelItem = this.getStack(FUEL_INPUT_SLOT_1).getItem() == ModItems.SHAMAN_BLOOD &&
                this.getStack(FUEL_INPUT_SLOT_2).getItem() == ModItems.SHAMAN_BLOOD &&
                this.getStack(FUEL_INPUT_SLOT_3).getItem() == ModItems.SHAMAN_BLOOD &&
                this.getStack(FUEL_INPUT_SLOT_4).getItem() == ModItems.SHAMAN_BLOOD &&
                this.getStack(FUEL_INPUT_SLOT_5).getItem() == ModItems.SHAMAN_BLOOD &&
                this.getStack(FUEL_INPUT_SLOT_6).getItem() == ModItems.SHAMAN_BLOOD;

        return hasFuelItem;
    }

    private boolean canInsertItemIntoOutputSlot(Item item) {
        return this.getStack(OUTPUT_SLOT).getItem() == item || this.getStack(OUTPUT_SLOT).isEmpty();
    }

    private boolean canInsertAmountIntoOutputSlot(int count) {
        return this.getStack(OUTPUT_SLOT).getCount() + count <= getStack(OUTPUT_SLOT).getMaxCount();
    }

    private boolean isOutputSlotEmptyOrReceivable() {
        return this.getStack(OUTPUT_SLOT).isEmpty() || this.getStack(OUTPUT_SLOT).getCount() < this.getStack(OUTPUT_SLOT).getMaxCount();
    }
}