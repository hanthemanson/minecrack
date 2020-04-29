package me.hanthemanson.Listeners;

import org.bukkit.plugin.java.JavaPlugin;

import me.hanthemanson.Listeners.join.JoinListener;

public class Main extends JavaPlugin{

	 @Override
	 public void onEnable() {
		 saveDefaultConfig();
		 
		 new JoinListener(this);
	 }
}
