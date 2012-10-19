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
	

	

   	  
	  
	  
	 
      
	    	  
	    	 
	      
	    	  
	    	  
	      
	    	  
	  


public void dropMelons(Player p, Location l)
{
  p.getWorld().dropItemNaturally(l, new ItemStack(Material.MELON));
  p.getWorld().dropItemNaturally(l, new ItemStack(Material.MELON));
}

}
