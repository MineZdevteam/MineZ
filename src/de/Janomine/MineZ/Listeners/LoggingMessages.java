package de.Janomine.MineZ.Listeners;

import java.util.logging.Logger;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class LoggingMessages implements Listener {
	
	
	public final Logger log = Logger.getLogger("Minecraft");
	
	@EventHandler
	
	
	public void LoggingMessagesJoin(PlayerJoinEvent event ) {
		
		
		Player player = event.getPlayer();
		String Playername = player.getName();
		this.log.info("[MineZ] " + Playername + " Hat den Server betreten.");
		event.setJoinMessage(null);
	}
	@EventHandler
	
	
	public void LoggingMessagesLeave(PlayerQuitEvent event ) {
		
		
		Player player = event.getPlayer();
		String Playername = player.getName();
		this.log.info("[MineZ] " + Playername + " Hat den Server verlassen.");
		
		event.setQuitMessage(null);
	}
}
