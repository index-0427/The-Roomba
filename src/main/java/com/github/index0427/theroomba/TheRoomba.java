package com.github.index0427.theroomba;

import com.github.index0427.theroomba.blocks.BlockRoombaStand;
import com.github.index0427.theroomba.items.ItemRoomba;
import com.github.index0427.theroomba.mobs.EntityRoomba;
import com.github.index0427.theroomba.mobs.ModelRoomba;
import com.github.index0427.theroomba.mobs.RenderRoomba;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(
        modid = TheRoomba.MOD_ID,
        name = TheRoomba.MOD_NAME,
        version = TheRoomba.VERSION
)
public class TheRoomba {

    public static final String MOD_ID = "theroomba";
    public static final String MOD_NAME = "Theroomba";
    public static final String VERSION = "MC1.12.2_1.0.0";

    public static final Item Roomba = new ItemRoomba();
    public static final Block RoombaStand = new BlockRoombaStand();

    /**
     * This is the instance of your mod as created by Forge. It will never be null.
     */
    @Mod.Instance(MOD_ID)
    public static TheRoomba INSTANCE;

    /**
     * This is the first initialization event. Register tile entities here.
     * The registry events below will have fired prior to entry to this method.
     */
    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        ForgeRegistries.ITEMS.register(Roomba);
        ForgeRegistries.ITEMS.register(new ItemBlock(RoombaStand).setRegistryName("theroomba", "block_roombastand"));

        ForgeRegistries.BLOCKS.register(RoombaStand);

        //アイテム・ブロック登録
        if (event.getSide().isClient()) {
            ModelLoader.setCustomModelResourceLocation(
                    Roomba,
                    0,
                    new ModelResourceLocation(new ResourceLocation("theroomba", "roomba"), "inventory"));
            ModelLoader.setCustomModelResourceLocation(
                    Item.getItemFromBlock(RoombaStand),
                    0,
                    new ModelResourceLocation(new ResourceLocation("theroomba", "block_roombastand"), "inventory"));
        }

        //モブ登録
        if (event.getSide().isClient()) {
            RenderingRegistry.registerEntityRenderingHandler(EntityRoomba.class, new IRenderFactory<EntityRoomba>() {
                @Override
                public Render<? super EntityRoomba> createRenderFor(RenderManager manager) {
                    return new RenderRoomba(manager, new ModelRoomba(), 0.3f);
                }
            });
        }
    }

    /**
     * This is the second initialization event. Register custom recipes
     */
        @Mod.EventHandler
        public void Init (FMLInitializationEvent event){
            EntityRegistry.registerModEntity(
                    new ResourceLocation("theroomba", "roomba"),
                    EntityRoomba.class,
                    "Roomba",
                    0,
                    this,
                    50,
                    1,
                    true,
                    1000,
                    22);

        }

        /**
         * This is the final initialization event. Register actions from other mods here
         */
        @Mod.EventHandler
        public void postinit (FMLPostInitializationEvent event){

        }

        /**
         * Forge will automatically look up and bind blocks to the fields in this class
         * based on their registry name.
         */
        @GameRegistry.ObjectHolder(MOD_ID)
        public static class Blocks {
      /*
          public static final MySpecialBlock mySpecialBlock = null; // placeholder for special block below
      */
        }

        /**
         * Forge will automatically look up and bind items to the fields in this class
         * based on their registry name.
         */
        @GameRegistry.ObjectHolder(MOD_ID)
        public static class Items {
      /*
          public static final ItemBlock mySpecialBlock = null; // itemblock for the block above
          public static final MySpecialItem mySpecialItem = null; // placeholder for special item below
      */
        }

        /**
         * This is a special class that listens to registry events, to allow creation of mod blocks and items at the proper time.
         */
        @Mod.EventBusSubscriber
        public static class ObjectRegistryHandler {
            /**
             * Listen for the register event for creating custom items
             */
            @SubscribeEvent
            public static void addItems(RegistryEvent.Register<Item> event) {
           /*
             event.getRegistry().register(new ItemBlock(Blocks.myBlock).setRegistryName(MOD_ID, "myBlock"));
             event.getRegistry().register(new MySpecialItem().setRegistryName(MOD_ID, "mySpecialItem"));
            */
            }

            /**
             * Listen for the register event for creating custom blocks
             */
            @SubscribeEvent
            public static void addBlocks(RegistryEvent.Register<Block> event) {
           /*
             event.getRegistry().register(new MySpecialBlock().setRegistryName(MOD_ID, "mySpecialBlock"));
            */
            }
        }
    /* EXAMPLE ITEM AND BLOCK - you probably want these in separate files
    public static class MySpecialItem extends Item {

    }

    public static class MySpecialBlock extends Block {

    }
    */

}
