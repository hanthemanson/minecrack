package me.hanthemanson.DeathMessages;

import org.bukkit.plugin.java.JavaPlugin;

import me.hanthemanson.DeathMessages.Listeners.PlayerDeathListener;

public class Main extends JavaPlugin{
	
	@Override
	public void onEnable() {
		new PlayerDeathListener(this);
	}

}
