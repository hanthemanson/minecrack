package me.hanthemanson.DeathMessages.Listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

import me.hanthemanson.DeathMessages.Main;
import me.hanthemanson.DeathMessages.utils.Utils;

public class PlayerDeathListener implements Listener{
	
	private static Main plugin;
	
	public PlayerDeathListener(Main plugin) {
		this.plugin = plugin;
		
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void onPlayerDeath(PlayerDeathEvent e) {
		if (e.getEntity().getKiller() instanceof Player) {
			Player killer = e.getEntity().getKiller();
			Player p = e.getEntity();
			
			killer.sendMessage(Utils.chat("&5 you have murdered &e" + p.getDisplayName() + "&5, congratulations"));
			p.sendMessage(Utils.chat( "&4" + killer.getDisplayName() + " has chopped your head off"));
			return;
		}
	}
}
