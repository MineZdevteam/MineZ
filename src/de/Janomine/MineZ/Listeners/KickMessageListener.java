package de.Janomine.MineZ.Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerKickEvent;

public class KickMessageListener implements Listener {
	
	
	
	@EventHandler
	public void KickMessage(PlayerKickEvent event) {
	
		    	
		    	event.setLeaveMessage(null);
		    }
		    
		  
	} 
		  

	

	


