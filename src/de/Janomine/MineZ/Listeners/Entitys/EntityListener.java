package de.Janomine.MineZ.Listeners.Entitys;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class EntityListener implements Listener  {
	
	
	@EventHandler
	  public void onFall(EntityDamageEvent event)
	  {
	  
	      if ((event.getEntityType() == EntityType.ZOMBIE) && (event.getCause() == EntityDamageEvent.DamageCause.FALL)) event.setCancelled(true);
	      if ((event.getEntityType() == EntityType.ZOMBIE) && (event.getCause() == EntityDamageEvent.DamageCause.FIRE)) event.setCancelled(true);
	      if ((event.getEntityType() == EntityType.ZOMBIE) && (event.getCause() == EntityDamageEvent.DamageCause.FIRE_TICK)) event.setCancelled(true);
	      if ((event.getEntityType() == EntityType.GIANT) && ((event.getCause() == EntityDamageEvent.DamageCause.ENTITY_EXPLOSION) || (event.getCause() == EntityDamageEvent.DamageCause.BLOCK_EXPLOSION))) event.setCancelled(true);
	      if ((event.getEntityType() == EntityType.ZOMBIE) && (event.getCause() == EntityDamageEvent.DamageCause.LIGHTNING)) event.setCancelled(true);
	      if ((event.getEntityType() == EntityType.ZOMBIE) && (event.getCause() == EntityDamageEvent.DamageCause.SUFFOCATION)) event.setCancelled(true);
	      if ((event.getEntityType() == EntityType.ZOMBIE) && (event.getCause() == EntityDamageEvent.DamageCause.LAVA)) event.setCancelled(true);
	      if ((event.getEntityType() == EntityType.ZOMBIE) && (event.getCause() == EntityDamageEvent.DamageCause.CONTACT)) event.setCancelled(true);
	      if ((event.getEntityType() == EntityType.ZOMBIE) && (event.getCause() == EntityDamageEvent.DamageCause.DROWNING)) event.setCancelled(true);
	  }
	  }
	


