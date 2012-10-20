package de.Janomine.MineZ.Listeners.Entitys;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class EntityByEntityListener {

	
	@EventHandler
	public void onEntityByEntityListener(EntityDamageByEntityEvent e){
		if(e.getEntity().getType() == EntityType.ZOMBIE  && e.getDamager() instanceof Player){
			Zombie z = (Zombie) e.getEntity();
			if(!(z.getHealth() + 2 > z.getMaxHealth())){
				z.setHealth(z.getHealth() + 2);
			}else if (!(z.getHealth() + 1 > z.getMaxHealth())){
				z.setHealth(z.getHealth() + 1);
			}
		}
	}
}
