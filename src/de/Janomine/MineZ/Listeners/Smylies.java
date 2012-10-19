package de.Janomine.MineZ.Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class Smylies implements Listener {
	
	@EventHandler
	
	public void Smylies(AsyncPlayerChatEvent event) {
		
		if(event.getMessage().contains(":D")) {
			event.getMessage().replaceAll(":D", "TEST");
			
		}
	}

}
