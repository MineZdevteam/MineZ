package de.Janomine.MineZ.Listeners.World;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;

public class ExplosionsListener implements Listener{

	@EventHandler
	public void onExplosionEvent(EntityExplodeEvent e){
		for(int i = 0;i < e.blockList().size();i++){
			Location loc = new Location(Bukkit.getWorld("asdf2"),e.blockList().get(i).getLocation().getX(),e.blockList().get(i).getLocation().getY(),e.blockList().get(i).getLocation().getZ());
			Material type = e.blockList().get(i).getType();
			Bukkit.getWorld("asdf2").getBlockAt(loc).setType(type);

		}
	}
}
