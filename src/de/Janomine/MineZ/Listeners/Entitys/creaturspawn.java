package de.Janomine.MineZ.Listeners.Entitys;

import org.bukkit.Bukkit;
import org.bukkit.entity.CreatureType;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class creaturspawn implements Listener {

	@SuppressWarnings("deprecation")
	@EventHandler
	public void onCreatureSpawn(CreatureSpawnEvent e){
		if(!e.getEntity().equals((EntityType.COW))){
			//Entity a = e.getEntity().getWorld().spawnEntity(e.getEntity().getLocation(), (EntityType)EntityType.ZOMBIE);
			//Entity b  = e.getEntity().getWorld().spawnEntity(e.getEntity().getLocation(), (EntityType)EntityType.ZOMBIE);
			//e.setCancelled(true);
		}
	}
}
