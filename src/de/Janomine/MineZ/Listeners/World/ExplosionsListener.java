package de.Janomine.MineZ.Listeners.World;

import java.util.Iterator;
import java.util.List;


import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPhysicsEvent;
import org.bukkit.event.entity.EntityExplodeEvent;

public class ExplosionsListener implements Listener{

	/*public void onExplosionEvent(EntityExplodeEvent e){
		for(int i = 0;i < e.blockList().size();i++){
			Location loc = new Location(Bukkit.getWorld("asdf2"),e.blockList().get(i).getLocation().getX(),e.blockList().get(i).getLocation().getY(),e.blockList().get(i).getLocation().getZ());
			Material type = e.blockList().get(i).getType();
			Bukkit.getWorld("asdf2").getBlockAt(loc).setType(type);
			Bukkit.getWorld("asdf2").getBlockAt(loc).setTypeId(type.getId());
			e.blockList().clear();
		}
	}*/
    @EventHandler(priority = EventPriority.LOW)
    public void onEntityExplode(EntityExplodeEvent event) {
        List<Block> destroyed = event.blockList();
        Iterator<Block> it = destroyed.iterator();
        while (it.hasNext()) {
            Block block = it.next();
                it.remove();
        }
    }
}
