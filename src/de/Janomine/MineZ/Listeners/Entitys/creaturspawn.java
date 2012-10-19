package de.Janomine.MineZ.Listeners.Entitys;

import org.bukkit.Bukkit;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class creaturspawn implements Listener {

	@SuppressWarnings("deprecation")
	@EventHandler
	public void onCreatureSpawn(CreatureSpawnEvent e){
		if(!e.getEntity().equals((EntityType.COW))){
			e.getEntity().getWorld().spawnCreature(e.getEntity().getLocation(), EntityType.ZOMBIE);
			e.getEntity().getWorld().spawnCreature(e.getEntity().getLocation(), EntityType.ZOMBIE);
			e.setCancelled(true);
		}
	}
}
