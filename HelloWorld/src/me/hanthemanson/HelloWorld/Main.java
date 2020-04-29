package me.hanthemanson.HelloWorld;

import org.bukkit.plugin.java.JavaPlugin;

import me.hanthemanson.HelloWorld.commands.HelloCommand;
import net.md_5.bungee.api.ChatColor;


public class Main extends JavaPlugin{

	@Override
	public void onEnable() {
		new HelloCommand(this);
		getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "\nHelloWorld Enabled\n");
	}
	
	public void onDisable() {
		getServer().getConsoleSender().sendMessage(ChatColor.RED + "\nMain Disabled\n");
	}
	
}
