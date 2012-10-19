package de.Janomine.MineZ.Main;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;


import de.Janomine.MineZ.Commands.CommandChatClear;
import de.Janomine.MineZ.Commands.CommandGlobalmute;
import de.Janomine.MineZ.Listeners.BuildListener;
import de.Janomine.MineZ.Listeners.CreativeListener;
import de.Janomine.MineZ.Listeners.GlobalMuteListener;
import de.Janomine.MineZ.Listeners.LoggingMessages;
import de.Janomine.MineZ.Listeners.PlayerListener;
import de.Janomine.MineZ.Listeners.Smylies;
import de.Janomine.MineZ.Listeners.TodListener;

public class main extends JavaPlugin {
	
	
	public final Logger log = Logger.getLogger("Minecraft");
	
	
	public void onEnable() {
		
		this.log.info("[MineZ] Plugin wird geladen.");
		setCommands();
		registerListeners();
		
	}
	
	public void onLoad() {
		
		this.log.info("[MineZ] System geladen.");
		
	}
	
	
	
	
	public void onDisable() {
		this.log.warning("[MineZ] System wurde heruntergefahren.");
		
		
		
		
		
	}
	
	
	private void registerListeners() {
		this.log.info("[MineZ] Listener Werden geladen.");
		getServer().getPluginManager().registerEvents(new LoggingMessages(), this);
		getServer().getPluginManager().registerEvents(new Smylies(), this);
		getServer().getPluginManager().registerEvents(new GlobalMuteListener(), this);
		getServer().getPluginManager().registerEvents(new PlayerListener(), this);
		getServer().getPluginManager().registerEvents(new TodListener(), this);
		getServer().getPluginManager().registerEvents(new BuildListener(), this);
		this.log.info("[MineZ] Listener geladen und Enabled.");
	}

	
	public void setCommands() {
	
		getCommand("ChatClear").setExecutor(new CommandChatClear());
		getCommand("Globalmute").setExecutor(new CommandGlobalmute());
		this.log.info("[MineZ] Commands Listener Enabled.");
	}
}
