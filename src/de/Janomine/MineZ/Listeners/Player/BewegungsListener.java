package de.Janomine.MineZ.Listeners.Player;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class BewegungsListener implements Listener {

	
	@EventHandler
	public void onPlayerMoveEvent(PlayerMoveEvent e){
		if(e.getPlayer().getWorld().getTime() >= 12500){e.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS,2000,11));	}else{e.getPlayer().removePotionEffect(PotionEffectType.BLINDNESS);}
		
	}
}
