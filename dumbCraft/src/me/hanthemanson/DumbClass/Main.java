package me.hanthemanson.DumbClass;

import org.bukkit.plugin.java.JavaPlugin;

import me.hanthemanson.DumbClass.listeners.DumbListeners;

public class Main extends JavaPlugin{
	
	public void onEnable() {
		new DumbListeners(this);
	}
	public void onDisable() {
		
	}

}
