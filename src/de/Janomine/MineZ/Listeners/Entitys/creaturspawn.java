package de.Janomine.MineZ.Listeners.Entitys;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class creaturspawn {

	@SuppressWarnings("deprecation")
	@EventHandler
	public void onCreatureSpawn(CreatureSpawnEvent e){
		if(!e.getEntity().equals((EntityType.COW))){
			e.getEntity().getWorld().spawnCreature(e.getEntity().getLocation(), EntityType.ZOMBIE);
			e.setCancelled(true);
		}
	}
}
