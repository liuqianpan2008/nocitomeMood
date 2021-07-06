package fenglin.nocitome.world;

import fenglin.nocitome.Block.Ynnuf.BlockRegistry;
import net.minecraft.block.BlockState;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class onSetUpEvent {
    public static  void generateOres(final BiomeLoadingEvent event){
        //滑稽矿
        oreGenerate(event.getGeneration(),
                OreFeatureConfig.FillerBlockType.field_241882_a,
                BlockRegistry.obsidianBlock.get().getDefaultState(),
                6,      //矿脉最大数量（vanilla没有规定最小数量)
                5,  //矿物生成最小y值
                0,      //TopOffset最好设为0
                20  //矿物生成最大y值
        );
    }
    private static void oreGenerate(BiomeGenerationSettingsBuilder sttings, RuleTest fullerType, BlockState state,int veinSize,int minimalheight,int Topoffset,int maximalHeight) {
        sttings.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                Feature.ORE.withConfiguration(new OreFeatureConfig(fullerType, state, veinSize))
                        .withPlacement(
                                Placement.field_242908_m.configure(new TopSolidRangeConfig(
                                        minimalheight,
                                        Topoffset,
                                        maximalHeight
                                        )
                                )
                        )
        );
    }
}


