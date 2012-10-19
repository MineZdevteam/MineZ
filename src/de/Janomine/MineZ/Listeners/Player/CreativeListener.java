package de.Janomine.MineZ.Listeners.Player;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class CreativeListener implements Listener {
	
	
	@EventHandler
	
	
	
	public void CreativeBlockBreak(BlockBreakEvent event) {
	
		 
		Player player = event.getPlayer();
		String Playername = player.getName();
		GameMode gm = player.getGameMode();
		if(gm == GameMode.CREATIVE){
		if(!player.hasPermission("MineZ.Creative.Abbauen")) {
			player.sendMessage(ChatColor.RED + "Du kannst im Creative nichts abbauen.");
			event.setCancelled(true);
			return;
		}
		}else{event.setCancelled(true);} //Dadurch wird der BuildListener überflüssig. ACHTUNG Buildlistener aus den registered Events kommentiert!
		
	}
	@EventHandler
	
	
	
	public void CreativeBlockPlace(BlockPlaceEvent event) {
		
		Player player = event.getPlayer();
		String Playername = player.getName();
		GameMode gm = player.getGameMode();
		 
		if(gm == GameMode.CREATIVE){
		if(!player.hasPermission("MineZ.Creative.Bauen")) {
			player.sendMessage(ChatColor.RED + "Du kannst im Creative nicht Bauen.");
			event.setCancelled(true);
			return;
		}
		}else{event.setCancelled(true);} //s. Oben
}
	
	
	@EventHandler
	
	public void CreativeLogin(PlayerJoinEvent event) {

		Player player = event.getPlayer();
		String Playername = player.getName();
		GameMode gm = player.getGameMode();
		 
		if(gm == GameMode.CREATIVE){
		if(!player.hasPermission("MineZ.Creative.behalten")) {
			player.setGameMode(GameMode.SURVIVAL);
			player.sendMessage(ChatColor.GRAY + "Dein Gamemode wurde Zurückgesetzt.");
			return;
			
		}
		}
		
	}
	
	
	@EventHandler
	
	public void CreativeDrop(PlayerDropItemEvent event) {

		Player player = event.getPlayer();
		String Playername = player.getName();
		if(player.getGameMode() == GameMode.CREATIVE){ // Diese Zeile hast du Vergessen ;)
			if(!player.hasPermission("MineZ.Creative.Drop")) {				
				player.sendMessage(ChatColor.RED + "Du Kannst im Creative Modus keine Items droppen!");
				event.setCancelled(true);
				return;				
			}
		}

	}
}
