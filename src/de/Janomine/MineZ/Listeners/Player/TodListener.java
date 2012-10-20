package de.Janomine.MineZ.Listeners.Player;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerKickEvent;

import de.Janomine.MineZ.Main.main;





public class TodListener implements Listener {
private main Plugin;

public TodListener(main instance){
	this.Plugin = instance;	
}
	

	  @EventHandler
	  public void onEntityDeath(EntityDeathEvent event) {
	      if(event.getEntity().getType() == EntityType.ZOMBIE){
	    	  Bukkit.broadcastMessage("1");
	    	  Zombie z = (Zombie) event.getEntity();
				if(this.Plugin.zombieinv.contains(z)){
			    	  Bukkit.broadcastMessage("2");
					for(int i = 0;i < this.Plugin.zombieinv.size();i++){
				    	  Bukkit.broadcastMessage("3");
						if(this.Plugin.zombieinv.get(i).equals(z)){
					    	  Bukkit.broadcastMessage("4"); // Bis hier geht er
							for(int ii = 0;i < this.Plugin.zombieinvstack.get(i).size();i++){
						    	  Bukkit.broadcastMessage("5");
								event.getEntity().getLocation().getWorld().dropItem(event.getEntity().getLocation(), this.Plugin.zombieinvstack.get(i).get(ii));
							}

						}
					}
				}
	      }
	    if ((event instanceof PlayerDeathEvent)) {
	      Player player = (Player)event.getEntity();
	      String Playername = player.getName();
	      if (!player.hasPermission("MineZ.Tod.Nokick") || (player.isOp())) {
	    	  ((PlayerDeathEvent) event).setDeathMessage(ChatColor.GOLD + Playername + ChatColor.RED + " ist Gestorben.");
	    	  player.kickPlayer(ChatColor.RED + "Du bist Gestorben!");	    	 
	    	  this.Plugin.zombieinv.add((Zombie)player.getWorld().spawnCreature(player.getLocation(), EntityType.ZOMBIE));
	    	  this.Plugin.zombieinvstack.add(event.getDrops());
	    	  event.getDrops().clear();
	    	  player.remove();
	        return;
	      }

}
	  }   
	  
}
	 