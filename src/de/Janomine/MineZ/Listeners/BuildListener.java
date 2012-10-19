package de.Janomine.MineZ.Listeners;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;

public class BuildListener implements Listener {
	

	  @EventHandler
	  public void onBreak(BlockBreakEvent event) {
	   
	      try
	      {
	        Player p = event.getPlayer();
	        if (((p.getItemInHand().getType() == Material.IRON_SPADE) && (event.getBlock().getType() == Material.WEB)) || 
	          ((p.getItemInHand().getType() == Material.WOOD_HOE) && (event.getBlock().getType() == Material.MELON_BLOCK)) || 
	          ((p.getItemInHand().getType() == Material.WOOD_HOE) && (event.getBlock().getType() == Material.BROWN_MUSHROOM)) || 
	          ((p.getItemInHand().getType() == Material.WOOD_HOE) && (event.getBlock().getType() == Material.RED_MUSHROOM)) || 
	          (event.getBlock().getType() == Material.CAKE_BLOCK) || (event.getBlock().getType() == Material.CAKE))
	        {
	          if (event.getBlock().getType() == Material.WEB) event.getBlock().setType(Material.AIR);
	          if (event.getBlock().getType() == Material.MELON_BLOCK) { event.getBlock().setType(Material.AIR); dropMelons(p, event.getBlock().getLocation()); }
	        } else {
	          event.setCancelled(true);
	        }
	      } catch (Exception ex) { event.setCancelled(true); }
	    }
	  

	  @EventHandler
	  public void onPlace(BlockPlaceEvent event) {
		
			 
			
	    Player player = event.getPlayer();
	    GameMode gm = player.getGameMode();
	        if(event.getBlock().getType() != Material.WEB && (event.getBlock().getType() != Material.CACTUS &&  (event.getBlock().getType() != Material.CAKE_BLOCK && (event.getBlock().getType() != Material.STONE_BUTTON && (!(gm == GameMode.CREATIVE)))))) { 
	          event.setCancelled(true);
	          
	        } else {
				
				event.setCancelled(false);
			}
	  }
	        
	  

   	  
	  
	  
	 
      
	    	  
	    	 
	      
	    	  
	    	  
	      
	    	  
	  


public void dropMelons(Player p, Location l)
{
  p.getWorld().dropItemNaturally(l, new ItemStack(Material.MELON));
}

}
