package de.Janomine.MineZ.Listeners.Entitys;

import org.bukkit.Bukkit;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

import de.Janomine.MineZ.Main.main;

public class EntityByEntityListener implements Listener {
private main plugin;
	public EntityByEntityListener(main instance){
		
	}
	@EventHandler
	public void onEntityByEntityListener(EntityDamageByEntityEvent e){
		if(e.getEntity().getType() == EntityType.ZOMBIE  && e.getDamager() instanceof Player){
			Zombie z = (Zombie) e.getEntity();

			int l = z.getHealth() + e.getDamage();
			if(!(z.getHealth() + 1 > z.getMaxHealth()) && !((z.getHealth() + 1) > l)){
				z.setHealth(z.getHealth() + 1);
			}
		}
	}
}
