package de.Janomine.MineZ.Listeners.Player;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerKickEvent;





public class TodListener implements Listener {
	
	

	  @EventHandler
	  public void onEntityDeath(EntityDeathEvent event) {
	    if ((event instanceof PlayerDeathEvent)) {
	      Player player = (Player)event.getEntity();
	      String Playername = player.getName();
	      if (!player.hasPermission("MineZ.Tod.Nokick") || (player.isOp())) {
	    	  ((PlayerDeathEvent) event).setDeathMessage(ChatColor.GOLD + Playername + ChatColor.RED + " ist Gestorben.");
	    	  player.kickPlayer(ChatColor.RED + "Du bist Gestorben!");
	    	  
	    	  player.remove();
	        return;
	      }

}
	  }   
	  
}
	 