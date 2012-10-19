package de.Janomine.MineZ.Listeners.Player;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class SpielerSchadenListener {

	
	@EventHandler
	public void onPlayerDamage(EntityDamageByEntityEvent e){
		if(e.getEntity() instanceof Player){
			Player p = (Player) e.getEntity();
			if(e.getCause() == DamageCause.ENTITY_EXPLOSION){
				p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 140, 9));
			}
		}
	}
}
