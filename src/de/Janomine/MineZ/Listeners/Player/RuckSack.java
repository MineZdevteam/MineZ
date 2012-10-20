package de.Janomine.MineZ.Listeners.Player;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class RuckSack implements Listener {
	
	@EventHandler
	@SuppressWarnings("deprecation")
	public void Rucksack(PlayerInteractEvent event) {
		
		Player player = event.getPlayer();
		String Playername = player.getName();		
		 if (player.getItemInHand().getType() == Material.CHEST) {
			 if (event.getAction() == Action.RIGHT_CLICK_AIR) {
				 Inventory inv = 
				            Bukkit.createInventory(player, 54, "Rucksack");
				          player.openInventory(inv);
				          player.updateInventory();
				          player.sendMessage("§8Rucksack geöffnet.");
		
	}
			 
		 }			 

}
		 
		 @EventHandler
		  public void inventoryOpen(InventoryOpenEvent e)
		  {
		    Player p = (Player)e.getPlayer();
		    Inventory inv = e.getInventory();
		    if (e.getView().getTitle() == "Rucksack")
		    {
		    	
		    	inv.setItem(0, new ItemStack(Material.EGG, 1));
		    }
}
}