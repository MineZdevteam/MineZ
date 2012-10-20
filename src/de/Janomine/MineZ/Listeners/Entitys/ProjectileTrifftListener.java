package de.Janomine.MineZ.Listeners.Entitys;

import org.bukkit.entity.Egg;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;

public class ProjectileTrifftListener implements Listener {

	@EventHandler
	public void onProjectileHitEvent(ProjectileHitEvent e){
		if(e.getEntity() instanceof Egg){
			e.getEntity().getWorld().createExplosion(e.getEntity().getLocation(),3F);
		}
	}
}
