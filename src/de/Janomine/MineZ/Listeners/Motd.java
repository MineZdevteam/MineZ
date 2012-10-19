package de.Janomine.MineZ.Listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Motd implements Listener  {

	
	
	@EventHandler
	
	
	public void Motd(PlayerJoinEvent event )  {
		
		
		
		Player player = event.getPlayer();
		player.sendMessage("");
		
	}
}
