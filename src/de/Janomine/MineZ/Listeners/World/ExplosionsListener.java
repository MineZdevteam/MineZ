package de.Janomine.MineZ.Listeners.World;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;

public class ExplosionsListener implements Listener{

	@EventHandler
	public void onExplosionEvent(EntityExplodeEvent e){
		for(int i = 0;i < e.blockList().size();i++){
			Bukkit.broadcastMessage(e.blockList().get(i).toString());


		}
	}
}
