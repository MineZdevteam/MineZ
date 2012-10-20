package de.Janomine.MineZ.Main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.PluginCommand;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;


import de.Janomine.MineZ.Commands.CommandChatClear;
import de.Janomine.MineZ.Commands.CommandGlobalmute;
import de.Janomine.MineZ.Commands.CommandMineZ;
import de.Janomine.MineZ.Listeners.KickMessageListener;
import de.Janomine.MineZ.Listeners.Entitys.EntityByEntityListener;
import de.Janomine.MineZ.Listeners.Entitys.EntityListener;
import de.Janomine.MineZ.Listeners.Entitys.ProjectileTrifftListener;
import de.Janomine.MineZ.Listeners.Entitys.creaturspawn;
import de.Janomine.MineZ.Listeners.Generelles.GlobalMuteListener;
import de.Janomine.MineZ.Listeners.Generelles.JoinListener;
import de.Janomine.MineZ.Listeners.Generelles.LoggingMessages;
import de.Janomine.MineZ.Listeners.Generelles.Smylies;
import de.Janomine.MineZ.Listeners.Player.BewegungsListener;
import de.Janomine.MineZ.Listeners.Player.BuildListener;
import de.Janomine.MineZ.Listeners.Player.CreativeListener;
import de.Janomine.MineZ.Listeners.Player.PlayerListener;
import de.Janomine.MineZ.Listeners.Player.RuckSack;
import de.Janomine.MineZ.Listeners.Player.SpielerSchadenListener;
import de.Janomine.MineZ.Listeners.Player.TodListener;
import de.Janomine.MineZ.Listeners.World.ExplosionsListener;
import de.Janomine.MineZ.Listeners.World.WorldListener;


public class main extends JavaPlugin {
	 public List<Zombie> zombieinv = new ArrayList<Zombie>();
	 public List<List<ItemStack>> zombieinvstack = new ArrayList<List<ItemStack>>();
	
	public final Logger log = Logger.getLogger("Minecraft");
	
	  
	

	
	public void onEnable() {
		
		this.log.info("[MineZ] Plugin wird geladen.");
		setCommands();
		registerListeners();
		loadfiles();
		this.log.info("[MineZ] Files. geladen.");
		loading();
	}
	
	private void loadfiles() {
		//minezconfig mconfig = new minezconfig("config");
		//his.log.info(mconfig.getString("meldung.config.loaded"));
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
		//getServer().getPluginManager().registerEvents(new Smylies(), this); //Deaktiviert wegen Bugs.
		getServer().getPluginManager().registerEvents(new JoinListener(), this);
		getServer().getPluginManager().registerEvents(new GlobalMuteListener(), this);
		getServer().getPluginManager().registerEvents(new PlayerListener(), this);
		getServer().getPluginManager().registerEvents(new TodListener(this), this);
		getServer().getPluginManager().registerEvents(new SpielerSchadenListener(), this);
		getServer().getPluginManager().registerEvents(new KickMessageListener(), this);
		getServer().getPluginManager().registerEvents(new EntityListener(), this);
		getServer().getPluginManager().registerEvents(new ProjectileTrifftListener(), this);
		getServer().getPluginManager().registerEvents(new BewegungsListener(), this);
		getServer().getPluginManager().registerEvents(new WorldListener(), this);
		getServer().getPluginManager().registerEvents(new creaturspawn(this), this);
		getServer().getPluginManager().registerEvents(new EntityByEntityListener(this), this);
		getServer().getPluginManager().registerEvents(new ExplosionsListener(), this);
		getServer().getPluginManager().registerEvents(new RuckSack(), this);
		//getServer().getPluginManager().registerEvents(new BuildListener(), this); Kommentar in CreativeListener ansehen!
		getServer().getPluginManager().registerEvents(new CreativeListener(), this); //Dieses Event war nicht registered ^^
		this.log.info("[MineZ] Listener geladen und Enabled.");
	}

	
	public void setCommands() {
		getCommand("MineZ").setExecutor(new CommandMineZ(this));
		getCommand("MZ").setExecutor(new CommandMineZ(this));
		getCommand("ChatClear").setExecutor(new CommandChatClear());
		getCommand("Globalmute").setExecutor(new CommandGlobalmute());
		this.log.info("[MineZ] Commands Listener Enabled.");
	}
public void loading() {
	
	
}
	


}


