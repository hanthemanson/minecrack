package me.hanthemanson.HelloWorld.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.hanthemanson.HelloWorld.Main;

public class HelloCommand implements CommandExecutor {
	
	private Main plugin;
	
	public HelloCommand(Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("hello").setExecutor(this);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage(ChatColor.BLUE + "Only players can send this command");
			return true;
		}
		Player p = (Player) sender;
		
		if (p.hasPermission("hello.use")) {
			p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "yes, you are opped, but do not think you are significant in the grand scheme of things");
			return true;
		} else {
			p.sendMessage(ChatColor.RED + "you do not have permission, you fool");
		}	
		return false;
	}

}
