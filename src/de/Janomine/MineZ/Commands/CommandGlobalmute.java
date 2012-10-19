package de.Janomine.MineZ.Commands;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandGlobalmute implements CommandExecutor  {
	
	public final Logger logger = Logger.getLogger("Minecraft");
	 public static boolean Muted;
	  public static String MuteMessage = "Du kannst nicht Chatten, während Globalmute aktiviert ist.";

	public boolean onCommand(CommandSender sender, Command cmd, String alias, String[] args) {
		
		 Player p = (Player)sender;
		 String playername = p.getName();
		 Player player = (Player)sender;
		 
		 if ((cmd.getName().equalsIgnoreCase("Globalmute") || (cmd.getName().equalsIgnoreCase("Gmute"))))  {
			if(!player.hasPermission("MineZ.Globalmute")) {
				
				
			player.sendMessage(ChatColor.RED + "Du hast keinen Zugriff auf diesen Befehl!");
		  return true;
	
}
			 if (Muted) {
		         Bukkit.broadcastMessage(ChatColor.WHITE + "[" + ChatColor.GRAY + "MineZ" + ChatColor.WHITE + "]" + ChatColor.GREEN + " Globalmute wurde Deaktiviert.");
		          this.logger.info("[MineZ] Globalmute wurde von "  + player.getName() + " Aktiviert.");
		          Muted = false;
		          return true;
		        }
		        else {
		        	 Bukkit.broadcastMessage(ChatColor.WHITE + "[" + ChatColor.GRAY + "MineZ" + ChatColor.WHITE + "]" + ChatColor.GREEN + " Globalmute wurde Aktiviert.");
		          this.logger.info("[MineZ] Globalmute wurde von "  + player.getName() + " Aktiviert.");
		          Muted = true;	
		          return true;
		        }	
		 }
		return false;


	}
}


