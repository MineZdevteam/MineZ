package de.Janomine.MineZ.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandChatClear implements CommandExecutor {

	

	  public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
		  boolean succeed = false;
		  Player player = (Player)sender;

               String Playername = player.getName();
		    if (cmd.getName().equalsIgnoreCase("ChatClear")) {
		      if(!player.hasPermission("MineZ.ChatClear")) {
		    	  player.sendMessage(ChatColor.RED + "Du hast keinen Zugriff auf diesen Befehl.");
		    	  return true;
		    	  
		      }
		        for (Player p : Bukkit.getOnlinePlayers()) {
		        	
		        	if(!p.hasPermission("MineZ.keinChatClear")) {
		        	    for (int x = 0; x < 120; x++) {
				            p.sendMessage(" ");
				            if (x == 119) {
				              p.sendMessage(ChatColor.GRAY + "Der Chat wurde von " + ChatColor.GREEN +  Playername + ChatColor.GRAY + " Geleert.");
				              succeed = true;
				            }
				            p.sendMessage(ChatColor.GRAY + "Der Chat wurde von " + ChatColor.GREEN +  Playername + ChatColor.GRAY + " Geleert.");
				            
				          }
		        	    
		        	    
				        }
				       
				      }
				    
		        		
		        	}
		 
			return succeed;
	  }
	  
}
