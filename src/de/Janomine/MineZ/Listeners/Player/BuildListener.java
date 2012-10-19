package de.Janomine.MineZ.Listeners.Player;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;



public class BuildListener implements Listener {
	

	

   	  
	  
	  
	 
      
	    	  
	    	 
	      
	    	  
	    	  
	      
	    	  
	  


public void dropMelons(Player p, Location l)
{
  p.getWorld().dropItemNaturally(l, new ItemStack(Material.MELON));
  p.getWorld().dropItemNaturally(l, new ItemStack(Material.MELON));
}

}
