package de.Janomine.MineZ.Listeners.Generelles;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class JoinListener implements Listener {
	
	@EventHandler
	public void Join(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		player.sendMessage(ChatColor.GREEN + "MineZ");
		player.sendMessage(ChatColor.RED + "Willkommen auf dem Deutschen " + ChatColor.GREEN + "ⓂⓘⓝⓔⓏ " + ChatColor.RED + "Server.");
		player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 7, 400)); // 80 sind 4 Sekunden, 20 Ticks = 1 Sekunde  ^^ War ein bisschen kurz ;D
	    player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 50, 1));   
	    
		
	}

	
	
	}

