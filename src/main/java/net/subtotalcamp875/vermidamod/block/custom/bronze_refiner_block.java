package net.subtotalcamp875.vermidamod.block.custom;

import net.minecraft.block.BlockState;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class bronze_refiner_block extends Block {
    public bronze_refiner_block(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos,
                              PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (player.getHandItems().equals(Items.COPPER_BLOCK)) {
            Iterable<ItemStack> $$6 = player.getHandItems();
            $$6.shrink(1);
            popResource(world, pos, new ItemStack(ModItems.BRONZE_KEY.get()));
            world.playSound(player, pos, SoundEvents.BLOCK_SMITHING_TABLE_USE, SoundCategory.BLOCKS, 1f, 1f);
            return ActionResult.CONSUME;
        }
        else {
            world.playSound(player, pos, SoundEvents.BLOCK_REDSTONE_TORCH_BURNOUT, SoundCategory.BLOCKS, 1f, 1f);
            return ActionResult.FAIL;
        }
    }
}