package de.Janomine.MineZ.Listeners;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import de.Janomine.MineZ.Commands.CommandGlobalmute;


public class GlobalMuteListener implements Listener  {
	public final Logger logger = Logger.getLogger("Minecraft");
	
	@EventHandler
	
	
	public void Globalmute(AsyncPlayerChatEvent event) {
		
	Player player = event.getPlayer();
		    if ((!event.getPlayer().hasPermission("MineZ.GlobalMute.Override")) && 
		      (CommandGlobalmute.Muted)) {
		      event.setCancelled(true);
		      event.getPlayer().sendMessage(ChatColor.RED + CommandGlobalmute.MuteMessage);
		    }
		  }
		
	}


