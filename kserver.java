package ru.filkworld.cf;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class kserver extends JavaPlugin {

	public void onEnable() {
		
		Bukkit.getPluginManager().registerEvents(new Handler(), this);
		getCommand("suget") .setExecutor(new suget(this));
		
		getLogger().info("Hello ktem!");
	}
	
	public void onDisable() {
		
		getLogger().info("Goodbye ktem!");
		
	}
}
