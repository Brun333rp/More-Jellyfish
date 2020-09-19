package blueduck.morejellyfish.morejellyfishmod.registry;

import blueduck.jellyfishing.jellyfishingmod.JellyfishingMod;
import blueduck.jellyfishing.jellyfishingmod.blocks.AlgaeGrassBlock;
import blueduck.jellyfishing.jellyfishingmod.registry.BlockItemBase;
import blueduck.morejellyfish.morejellyfishmod.MoreJellyfishMod;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MoreJellyfishBlocks {

    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, MoreJellyfishMod.MODID);
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, MoreJellyfishMod.MODID);

    public static final RegistryObject<Block> DEEP_CORALSTONE = BLOCKS.register("deep_coralstone", () -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.PURPLE).sound(SoundType.STONE).hardnessAndResistance(1.5F, 1F).harvestTool(ToolType.PICKAXE).harvestLevel(1)));
    public static final RegistryObject<Item> DEEP_CORALSTONE_ITEM = ITEMS.register("deep_coralstone", () -> new BlockItemBase(DEEP_CORALSTONE.get()));

    public static final RegistryObject<Block> DEEP_CORALSTONE_WALL = BLOCKS.register("deep_coralstone_wall", () -> new WallBlock(Block.Properties.from(DEEP_CORALSTONE.get())));
    public static final RegistryObject<Item> DEEP_CORALSTONE_WALL_ITEM = ITEMS.register("deep_coralstone_wall", () -> new BlockItemBase(DEEP_CORALSTONE_WALL.get()));

    public static final RegistryObject<Block> DEEP_CORALSTONE_STAIRS = BLOCKS.register("deep_coralstone_stairs", () -> new StairsBlock(() -> DEEP_CORALSTONE.get().getDefaultState(), Block.Properties.from(DEEP_CORALSTONE.get())));
    public static final RegistryObject<Item> DEEP_CORALSTONE_STAIRS_ITEM = ITEMS.register("deep_coralstone_stairs", () -> new BlockItemBase(DEEP_CORALSTONE_STAIRS.get()));

    public static final RegistryObject<Block> DEEP_CORALSTONE_SLAB = BLOCKS.register("deep_coralstone_slab", () -> new SlabBlock(Block.Properties.from(DEEP_CORALSTONE.get())));
    public static final RegistryObject<Item> DEEP_CORALSTONE_SLAB_ITEM = ITEMS.register("deep_coralstone_slab", () -> new BlockItemBase(DEEP_CORALSTONE_SLAB.get()));

    public static final RegistryObject<Block> POLISHED_DEEP_CORALSTONE = BLOCKS.register("polished_deep_coralstone", () -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.PURPLE).sound(SoundType.STONE).hardnessAndResistance(1.5F, 1F).harvestTool(ToolType.PICKAXE).harvestLevel(1)));
    public static final RegistryObject<Item> POLISHED_DEEP_CORALSTONE_ITEM = ITEMS.register("polished_deep_coralstone", () -> new BlockItemBase(POLISHED_DEEP_CORALSTONE.get()));

    public static final RegistryObject<Block> POLISHED_DEEP_CORALSTONE_STAIRS = BLOCKS.register("polished_deep_coralstone_stairs", () -> new StairsBlock(() -> POLISHED_DEEP_CORALSTONE.get().getDefaultState(), Block.Properties.from(POLISHED_DEEP_CORALSTONE.get())));
    public static final RegistryObject<Item> POLISHED_DEEP_CORALSTONE_STAIRS_ITEM = ITEMS.register("polished_deep_coralstone_stairs", () -> new BlockItemBase(POLISHED_DEEP_CORALSTONE_STAIRS.get()));

    public static final RegistryObject<Block> POLISHED_DEEP_CORALSTONE_SLAB = BLOCKS.register("polished_deep_coralstone_slab", () -> new SlabBlock(Block.Properties.from(POLISHED_DEEP_CORALSTONE.get())));
    public static final RegistryObject<Item> POLISHED_DEEP_CORALSTONE_SLAB_ITEM = ITEMS.register("polished_deep_coralstone_slab", () -> new BlockItemBase(POLISHED_DEEP_CORALSTONE_SLAB.get()));

    public static final RegistryObject<Block> DEEP_ALGAE_GRASS = BLOCKS.register("deep_algae_grass", () -> new AlgaeGrassBlock(Block.Properties.create(Material.EARTH, MaterialColor.LIME).sound(SoundType.WET_GRASS).hardnessAndResistance(1F, 1F).harvestTool(ToolType.SHOVEL).harvestLevel(0)));
    public static final RegistryObject<Item> DEEP_ALGAE_GRASS_ITEM = ITEMS.register("deep_algae_grass", () -> new BlockItemBase(DEEP_ALGAE_GRASS.get()));



    public static void init() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
