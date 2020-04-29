package me.hanthemanson.DumbClass.listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import me.hanthemanson.DumbClass.Main;

public class DumbListeners implements Listener{

	private static Main plugin;
	
	public DumbListeners(Main plugin) {
		this.plugin = plugin;
		
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void event(EntityDamageByEntityEvent event) {
		if (!(event.getEntityType() == EntityType.ENDER_DRAGON)) {
			if (event.getEntity() instanceof Mob) {
				Mob e = (Mob) event.getEntity();
				
				e.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 300, 1));
			} else if (event.getEntity() instanceof Player) {
				Player p = (Player) event.getEntity();
				
				p.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 75, 1));
			} else {
				return;	
			}
		}	
	}
}
