package de.Janomine.MineZ.Listeners.Entitys;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.Location;
import org.bukkit.entity.Animals;
import org.bukkit.entity.CreatureType;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Monster;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

import de.Janomine.MineZ.Main.main;

public class creaturspawn implements Listener {
private main plugin;

	public creaturspawn(main instance){
		this.plugin = instance;
	}
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onCreatureSpawn(CreatureSpawnEvent e){
		//boolean doit = true;
		//if(!e.getEntity().equals(EntityType.COW) && !e.getEntity().equals(EntityType.ZOMBIE) && e.getEntity() instanceof Monster){
			//for(int i = 0;i < plugin.allspawned.size();i++){
				//if(e.getEntity().equals(plugin.allspawned.get(i))){
					//doit = false;
				//}
			//}
			//if(doit){
				//Location loc = e.getLocation();
				//Entity a = e.getEntity().getWorld().spawnEntity(loc, EntityType.ZOMBIE);
				//Entity b  = e.getEntity().getWorld().spawnEntity(loc, EntityType.ZOMBIE);
				//plugin.allspawned.add(a);
				//plugin.allspawned.add(b);
				//e.setCancelled(true);
			//}
           
		//}
	}
}
