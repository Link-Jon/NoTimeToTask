package tiffit.todolist.gui;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiListExtended;
import tiffit.todolist.TODOList;
import tiffit.todolist.items.TODOItem;

public class NewTaskSelectionList extends GuiListExtended {
	
	List<NewTaskEntry> tasks = new ArrayList<NewTaskEntry>();
	
	public NewTaskSelectionList(Minecraft mcIn, int widthIn, int heightIn, int topIn, int bottomIn, int slotHeightIn) {
		super(mcIn, widthIn, heightIn, topIn, bottomIn, slotHeightIn);
		for(String str : TODOList.taskRegistry.getKeys()){
			Class<? extends TODOItem> clazz = TODOList.taskRegistry.getObject(str);
			tasks.add(new NewTaskEntry(clazz, this));
		}
	}

	@Override
	public IGuiListEntry getListEntry(int index) {
		return tasks.get(index);
	}

	@Override
	protected int getSize() {
		return tasks.size();
	}
	
	public NewTaskEntry getSelected(){
		for(int i = 0; i < tasks.size(); i++){
			NewTaskEntry entry = tasks.get(i);
			if(entry.selected){
				return entry;
			}
		}
		return null;
	}

}