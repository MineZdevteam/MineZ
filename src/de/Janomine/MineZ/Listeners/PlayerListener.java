package de.Janomine.MineZ.Listeners;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class PlayerListener implements Listener {
	
	
	
		 @EventHandler
		 public void Funk(AsyncPlayerChatEvent event) {
			 Player player = event.getPlayer();
			 String nachricht = event.getMessage();
			 String Playername = player.getName();
			 
			 if (player.getItemInHand().getType() == Material.BOOK_AND_QUILL) {
				 event.setMessage(ChatColor.GREEN + "[Funk] " + nachricht);
				 return;
			 }
			 
		 }
	
}

	
