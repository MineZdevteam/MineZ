package de.Janomine.MineZ.Listeners.Player;

import java.util.logging.Logger;

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
	
	private final Logger log = Logger.getLogger("Minecraft");
	
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
	
		 
		@EventHandler
		
		public void Werbung(AsyncPlayerChatEvent event) {
			Player player = event.getPlayer();
			 String nachricht = event.getMessage();
			 String Playername = player.getName();
			 
			 if(event.getMessage().contains("nitrado.net")){
				 event.setCancelled(true);
				 this.log.warning("==================Autoban Werbung==================");
				 this.log.warning(Playername + " wurde Permannent Gebannt Grund: Serverwerbung.");
				 this.log.warning("Chat-Nachricht: " +  nachricht);
				 this.log.warning("==================Autoban Werbung==================");
				 player.setBanned(true);
				 player.kickPlayer(ChatColor.RED + "Autoban Serverwerbung.");
				 Bukkit.broadcastMessage(ChatColor.RED + Playername + " wurde §4Permannent §cGebannt! Grund: " + ChatColor.AQUA + "Autban Serverwerbung.");
			 }
		}
}

	

