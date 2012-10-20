package de.Janomine.MineZ.Listeners.Player;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class PlayerListener implements Listener {
	
	
	
		 @EventHandler(priority = EventPriority.HIGHEST)
		 public void Funk(AsyncPlayerChatEvent event) {
			 Player player = event.getPlayer();
			 String nachricht = event.getMessage();
			 String Playername = player.getName();
			 
			 if (player.getItemInHand().getType() == Material.BOOK_AND_QUILL) {
				 String edit = event.getFormat().replaceAll(":", ChatColor.GREEN + "[Funk]" + ChatColor.RESET +  " : ");
				 event.setFormat(edit);
				 return;
			 }
		 }
}
		
	

