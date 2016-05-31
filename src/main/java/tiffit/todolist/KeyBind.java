package tiffit.todolist;

import org.lwjgl.input.Keyboard;

import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.init.SoundEvents;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent.KeyInputEvent;
import tiffit.todolist.gui.TODOListGui;

public class KeyBind {

	public static KeyBinding openTodoList;
	
	private static String category = "key.categories." + References.MODID;
	
	public static void init(){
		MinecraftForge.EVENT_BUS.register(new KeyBind());
		openTodoList = new KeyBinding("openTodoList", Keyboard.KEY_COMMA, category);
		ClientRegistry.registerKeyBinding(openTodoList);
	}
	
	@SubscribeEvent
	public void keyPress(KeyInputEvent event) {
		Minecraft mc = Minecraft.getMinecraft();
		if(openTodoList.isPressed() && openTodoList.isKeyDown()){
			mc.displayGuiScreen(new TODOListGui());
			Minecraft.getMinecraft().thePlayer.playSound(SoundEvents.UI_BUTTON_CLICK, 4F, 1F);
		}
	}
	
}
