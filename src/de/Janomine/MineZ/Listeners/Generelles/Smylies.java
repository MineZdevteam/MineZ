package de.Janomine.MineZ.Listeners.Generelles;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class Smylies implements Listener {
	
	@EventHandler
	
	public void Smylies(AsyncPlayerChatEvent event) {		
			event.setMessage(event.getMessage().replaceAll(":D", "٩(͡๏̯͡๏)۶")); //Einige Zeilen weg, da wiederherstellung.			}

}
}