package de.Janomine.MineZ.Commands;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class CommandMineZ implements CommandExecutor {
	
	public final Logger logger = Logger.getLogger("Minecraft");
	
	public boolean onCommand(CommandSender sender, Command cmd, String alias, String[] args) {
		boolean succeed = false;
		 Player p = (Player)sender;
		 String playername = p.getName();
		 Player player = (Player)sender;
		 
		 if ((cmd.getName().equalsIgnoreCase("MineZ") || (cmd.getName().equalsIgnoreCase("MZ"))))  {
	if(args.length == 0) {
		player.sendMessage(ChatColor.GOLD + "=====MineZ====");
		player.sendMessage(ChatColor.GREEN + "/MineZ Spawn" + ChatColor.WHITE + "In der MineZ Welt Spawnen.");
				return true;
			}
		 
		 
		 if(args[0].equalsIgnoreCase("Spawn")) {
			 
			 Location Location = player.getLocation();
			 
			 player.sendMessage(ChatColor.RED + "Du bist nun in der Welt, viel Glück.");
			 player.getInventory().clear();
			 player.setHealth(20);
			 player.setFireTicks(0);
			 player.setFoodLevel(10);
			 player.getInventory();
			
			 player.getInventory().addItem(new ItemStack[] { new ItemStack(373, 1) });
			 player.getInventory().addItem(new ItemStack[] { new ItemStack(Material.PAPER, 1) });
			 player.getInventory().addItem(new ItemStack[] { new ItemStack(Material.WOOD_SWORD, 1) });
			 player.getInventory().addItem(new ItemStack[] { new ItemStack(Material.BOOK_AND_QUILL, 1) });
			 player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS,50,1));
			 player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION,120,6));
			//Hier muss dann das porten an eine zufällige Stelle in der Welt hin.
			 //Die koordinaten kommen dann in eine config. kk ?
			 return true;
		 
		 }}
		return false;
	}

	}


