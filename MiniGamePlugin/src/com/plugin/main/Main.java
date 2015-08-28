package com.plugin.main;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	public void onEnable() {
		getCommand("test").setExecutor(new Commands());
	}
	
	public void onDisable() {
		
	}
}
