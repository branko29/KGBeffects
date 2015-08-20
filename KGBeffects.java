package org.kgb.branko29;




import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;



		public final class KGBeffects extends org.bukkit.plugin.java.JavaPlugin implements Listener
		{
			
			public KGBeffects() {}
	 
			public void onEnable()
			{
				getServer().getPluginManager().registerEvents(this, this);
				getLogger().info("KGBeffects v1.0 has been succesfully enabled!");
			}
	 
			public void onDisable()
			{
				getLogger().info("KGBeffects v1.0 has been succesfully disabled! See ya!");
			}
		
			
		@EventHandler
		public void onJoin(PlayerJoinEvent event){
			Player p = event.getPlayer();

		
			if(p.hasPermission("kgbeffects.speedboost.1")) {
				p.removePotionEffect(PotionEffectType.SPEED);
				p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 18000, 0));
				}
			if(p.hasPermission("kgbeffects.speedboost.2")) {
				p.removePotionEffect(PotionEffectType.SPEED);
				p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 18000, 1));
				}
			if(p.hasPermission("kgbeffects.speedboost.3")) {
				p.removePotionEffect(PotionEffectType.SPEED);
				p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 18000, 2));
				}
			if(p.hasPermission("kgbeffects.speedboost.4")) {
				p.removePotionEffect(PotionEffectType.SPEED);
				p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 18000, 3));
				}
			if(p.hasPermission("kgbeffects.speedboost.5")) {
				p.removePotionEffect(PotionEffectType.SPEED);
				p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 18000, 4));
				}
			
			
			if(p.hasPermission("kgbeffects.jump.1")) {
				p.removePotionEffect(PotionEffectType.JUMP);
				p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 18000, 0));
				}
			if(p.hasPermission("kgbeffects.jump.2")) {
				p.removePotionEffect(PotionEffectType.JUMP);
				p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 18000, 1));
				}
			if(p.hasPermission("kgbeffects.jump.3")) {
				p.removePotionEffect(PotionEffectType.JUMP);
				p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 18000, 2));
				}
			if(p.hasPermission("kgbeffects.jump.4")) {
				p.removePotionEffect(PotionEffectType.JUMP);
				p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 18000, 3));
				}
			if(p.hasPermission("kgbeffects.jump.5")) {
				p.removePotionEffect(PotionEffectType.JUMP);
				p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 18000, 4));
				}
			
			
			if(p.hasPermission("kgbeffects.haste.1")) {
				p.removePotionEffect(PotionEffectType.FAST_DIGGING);
				p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 18000, 0));
				}
			if(p.hasPermission("kgbeffects.haste.2")) {
				p.removePotionEffect(PotionEffectType.FAST_DIGGING);
				p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 18000, 1));
				}
			if(p.hasPermission("kgbeffects.haste.3")) {
				p.removePotionEffect(PotionEffectType.FAST_DIGGING);
				p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 18000, 2));
				}
			if(p.hasPermission("kgbeffects.haste.4")) {
				p.removePotionEffect(PotionEffectType.FAST_DIGGING);
				p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 18000, 3));
				}
			if(p.hasPermission("kgbeffects.haste.5")) {
				p.removePotionEffect(PotionEffectType.FAST_DIGGING);
				p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 18000, 4));
				}
			
			
			if(p.hasPermission("kgbeffects.nightvision")) {
				p.removePotionEffect(PotionEffectType.NIGHT_VISION);
				p.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 18000, 0));
				}
			
			
			if(p.hasPermission("kgbeffects.regeneration.1")) {
				p.removePotionEffect(PotionEffectType.REGENERATION);
				p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 18000, 0));
				}
			if(p.hasPermission("kgbeffects.regeneration.2")) {
				p.removePotionEffect(PotionEffectType.REGENERATION);
				p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 18000, 1));
				}
			if(p.hasPermission("kgbeffects.regeneration.3")) {
				p.removePotionEffect(PotionEffectType.REGENERATION);
				p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 18000, 2));
				}
			if(p.hasPermission("kgbeffects.regeneration.4")) {
				p.removePotionEffect(PotionEffectType.REGENERATION);
				p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 18000, 3));
				}
			if(p.hasPermission("kgbeffects.regeneration.5")) {
				p.removePotionEffect(PotionEffectType.REGENERATION);
				p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 18000, 4));
				}

			
			if(p.hasPermission("kgbeffects.fireresistance")) {
				p.removePotionEffect(PotionEffectType.FIRE_RESISTANCE);
				p.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 18000, 0));
				}
			
			
			if(p.hasPermission("kgbeffects.saturation")) {
				p.removePotionEffect(PotionEffectType.SATURATION);
				p.addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, 18000, 0));
				}
			
			
			if(p.hasPermission("kgbeffects.absorption")) {
				p.removePotionEffect(PotionEffectType.ABSORPTION);
				p.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 18000, 0));
				}

			
			if(p.hasPermission("kgbeffects.waterbreathing")) {
				p.removePotionEffect(PotionEffectType.WATER_BREATHING);
				p.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, 18000, 0));
				}		
			
			
			if(p.hasPermission("kgbeffects.Invisibility")) {
				p.removePotionEffect(PotionEffectType.INVISIBILITY);
				p.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 18000, 0));
				}
			
			
			if(p.hasPermission("kgbeffects.health.1")) {
				p.removePotionEffect(PotionEffectType.HEALTH_BOOST);
				p.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 1800000, 0));
				}
			if(p.hasPermission("kgbeffects.health.1")) {
				p.removePotionEffect(PotionEffectType.REGENERATION);
				p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 100, 5));
				}
			if(p.hasPermission("kgbeffects.health.2")) {
				p.removePotionEffect(PotionEffectType.HEALTH_BOOST);
				p.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 1800000, 1));
				}
			if(p.hasPermission("kgbeffects.health.2")) {
				p.removePotionEffect(PotionEffectType.REGENERATION);
				p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 100, 5));
				}
			if(p.hasPermission("kgbeffects.health.3")) {
				p.removePotionEffect(PotionEffectType.HEALTH_BOOST);
				p.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 1800000, 2));
				}
			if(p.hasPermission("kgbeffects.health.3")) {
				p.removePotionEffect(PotionEffectType.REGENERATION);
				p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 100, 5));
				}
			if(p.hasPermission("kgbeffects.health.4")) {
				p.removePotionEffect(PotionEffectType.HEALTH_BOOST);
				p.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 1800000, 3));
				}
			if(p.hasPermission("kgbeffects.health.4")) {
				p.removePotionEffect(PotionEffectType.REGENERATION);
				p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 100, 5));
				}
			if(p.hasPermission("kgbeffects.health.5")) {
				p.removePotionEffect(PotionEffectType.HEALTH_BOOST);
				p.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 1800000, 4));
				}
			if(p.hasPermission("kgbeffects.health.5")) {
				p.removePotionEffect(PotionEffectType.REGENERATION);
				p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 100, 5));
				}
			

			if(p.hasPermission("kgbeffects.strength.1")) {
				p.removePotionEffect(PotionEffectType.INCREASE_DAMAGE);
				p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 18000, 0));
				}
			if(p.hasPermission("kgbeffects.strength.2")) {
				p.removePotionEffect(PotionEffectType.INCREASE_DAMAGE);
				p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 18000, 1));
				}
			if(p.hasPermission("kgbeffects.strength.3")) {
				p.removePotionEffect(PotionEffectType.INCREASE_DAMAGE);
				p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 18000, 2));
				}
			if(p.hasPermission("kgbeffects.strength.4")) {
				p.removePotionEffect(PotionEffectType.INCREASE_DAMAGE);
				p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 18000, 3));
				}
			if(p.hasPermission("kgbeffects.strength.5")) {
				p.removePotionEffect(PotionEffectType.INCREASE_DAMAGE);
				p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 18000, 4));
				}
			}
		

		@EventHandler
		public void PlayerInteractEvent(PlayerInteractEvent event){
			 Player p = (Player) event.getPlayer();
		
		
			if(p.hasPermission("kgbeffects.speedboost.1")) {
				p.removePotionEffect(PotionEffectType.SPEED);
				p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 18000, 0));
				}
			if(p.hasPermission("kgbeffects.speedboost.2")) {
				p.removePotionEffect(PotionEffectType.SPEED);
				p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 18000, 1));
				}
			if(p.hasPermission("kgbeffects.speedboost.3")) {
				p.removePotionEffect(PotionEffectType.SPEED);
				p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 18000, 2));
				}
			if(p.hasPermission("kgbeffects.speedboost.4")) {
				p.removePotionEffect(PotionEffectType.SPEED);
				p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 18000, 3));
				}
			if(p.hasPermission("kgbeffects.speedboost.5")) {
				p.removePotionEffect(PotionEffectType.SPEED);
				p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 18000, 4));
				}
			
		
			if(p.hasPermission("kgbeffects.jump.1")) {
				p.removePotionEffect(PotionEffectType.JUMP);
				p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 18000, 0));
				}
			if(p.hasPermission("kgbeffects.jump.2")) {
				p.removePotionEffect(PotionEffectType.JUMP);
				p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 18000, 1));
				}
			if(p.hasPermission("kgbeffects.jump.3")) {
				p.removePotionEffect(PotionEffectType.JUMP);
				p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 18000, 2));
				}
			if(p.hasPermission("kgbeffects.jump.4")) {
				p.removePotionEffect(PotionEffectType.JUMP);
				p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 18000, 3));
				}
			if(p.hasPermission("kgbeffects.jump.5")) {
				p.removePotionEffect(PotionEffectType.JUMP);
				p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 18000, 4));
				}
			
			
			if(p.hasPermission("kgbeffects.haste.1")) {
				p.removePotionEffect(PotionEffectType.FAST_DIGGING);
				p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 18000, 0));
				}
			if(p.hasPermission("kgbeffects.haste.2")) {
				p.removePotionEffect(PotionEffectType.FAST_DIGGING);
				p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 18000, 1));
				}
			if(p.hasPermission("kgbeffects.haste.3")) {
				p.removePotionEffect(PotionEffectType.FAST_DIGGING);
				p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 18000, 2));
				}
			if(p.hasPermission("kgbeffects.haste.4")) {
				p.removePotionEffect(PotionEffectType.FAST_DIGGING);
				p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 18000, 2));
				}
			if(p.hasPermission("kgbeffects.haste.5")) {
				p.removePotionEffect(PotionEffectType.FAST_DIGGING);
				p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 18000, 2));
				}
			
			
			if(p.hasPermission("kgbeffects.nightvision")) {
				p.removePotionEffect(PotionEffectType.NIGHT_VISION);
				p.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 18000, 0));
				}

			
			if(p.hasPermission("kgbeffects.regeneration.1")) {
				p.removePotionEffect(PotionEffectType.REGENERATION);
				p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 18000, 0));
				}
			if(p.hasPermission("kgbeffects.regeneration.2")) {
				p.removePotionEffect(PotionEffectType.REGENERATION);
				p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 18000, 1));
				}
			if(p.hasPermission("kgbeffects.regeneration.3")) {
				p.removePotionEffect(PotionEffectType.REGENERATION);
				p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 18000, 2));
				}
			if(p.hasPermission("kgbeffects.regeneration.4")) {
				p.removePotionEffect(PotionEffectType.REGENERATION);
				p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 18000, 3));
				}
			if(p.hasPermission("kgbeffects.regeneration.5")) {
				p.removePotionEffect(PotionEffectType.REGENERATION);
				p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 18000, 4));
				}
			
			
			if(p.hasPermission("kgbeffects.fireresistance")) {
				p.removePotionEffect(PotionEffectType.FIRE_RESISTANCE);
				p.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 18000, 0));
				}
			
			
			if(p.hasPermission("kgbeffects.saturation")) {
				p.removePotionEffect(PotionEffectType.SATURATION);
				p.addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, 18000, 0));
				}

			
			if(p.hasPermission("kgbeffects.absorption")) {
				p.removePotionEffect(PotionEffectType.ABSORPTION);
				p.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 18000, 0));
				}

			
			if(p.hasPermission("kgbeffects.waterbreathing")) {
				p.removePotionEffect(PotionEffectType.WATER_BREATHING);
				p.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, 18000, 0));
				}
			
			
			if(p.hasPermission("kgbeffects.strength.1")) {
				p.removePotionEffect(PotionEffectType.INCREASE_DAMAGE);
				p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 18000, 0));
				}
			if(p.hasPermission("kgbeffects.strength.2")) {
				p.removePotionEffect(PotionEffectType.INCREASE_DAMAGE);
				p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 18000, 1));
				}
			if(p.hasPermission("kgbeffects.strength.3")) {
				p.removePotionEffect(PotionEffectType.INCREASE_DAMAGE);
				p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 18000, 2));
				}
			if(p.hasPermission("kgbeffects.strength.4")) {
				p.removePotionEffect(PotionEffectType.INCREASE_DAMAGE);
				p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 18000, 3));
				}
			if(p.hasPermission("kgbeffects.strength.5")) {
				p.removePotionEffect(PotionEffectType.INCREASE_DAMAGE);
				p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 18000, 4));
				}
		 	}
		 

		@EventHandler
		public void PlayerQuitEvent(PlayerQuitEvent event){
			 Player p = (Player) event.getPlayer();
	
			if(p.hasPotionEffect(PotionEffectType.SPEED)) {
				p.removePotionEffect(PotionEffectType.SPEED);
				}
			

			if(p.hasPotionEffect(PotionEffectType.JUMP)) {
				p.removePotionEffect(PotionEffectType.JUMP);
				}
			
			
			if(p.hasPotionEffect(PotionEffectType.FAST_DIGGING)) {
				p.removePotionEffect(PotionEffectType.FAST_DIGGING);
				}
			
			
			if(p.hasPotionEffect(PotionEffectType.NIGHT_VISION)) {
				p.removePotionEffect(PotionEffectType.NIGHT_VISION);
				}
			
			if(p.hasPotionEffect(PotionEffectType.REGENERATION)) {
				p.removePotionEffect(PotionEffectType.REGENERATION);
				}
			
			
			if(p.hasPotionEffect(PotionEffectType.FIRE_RESISTANCE)) {
				p.removePotionEffect(PotionEffectType.FIRE_RESISTANCE);
				}
			
			
			if(p.hasPotionEffect(PotionEffectType.SATURATION)) {
				p.removePotionEffect(PotionEffectType.SATURATION);
				}

			
			if(p.hasPotionEffect(PotionEffectType.ABSORPTION)) {
				p.removePotionEffect(PotionEffectType.ABSORPTION);
				}

			
			if(p.hasPotionEffect(PotionEffectType.WATER_BREATHING)) {
				p.removePotionEffect(PotionEffectType.WATER_BREATHING);
				}
			
			if(p.hasPotionEffect(PotionEffectType.HEALTH_BOOST)) {
				p.removePotionEffect(PotionEffectType.HEALTH_BOOST);
				}
			
			if(p.hasPotionEffect(PotionEffectType.INCREASE_DAMAGE)) {
				p.removePotionEffect(PotionEffectType.INCREASE_DAMAGE);
				}
			}
		}
