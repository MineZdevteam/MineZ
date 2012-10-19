package de.Janomine.MineZ.Listeners.Player;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class RuckSack implements Listener {
	
	public void Rucksack(PlayerInteractEvent event) {
		
		Player player = event.getPlayer();
		String Playername = player.getName();		
		
		 if (player.getItemInHand().getType() == Material.CHEST) {
			 if (event.getAction() == Action.RIGHT_CLICK_AIR) {
		 }
		if(!player.hasPermission("MineZ.Rucksack")) {
			//event.setCancelled(true); Überflüssig, warum eine Animation, die nichts bringt, canceln?
			return;
			
			
			
		}
		player.sendMessage("§8Rucksack geöffnet.");
		
	}

}
	
}
