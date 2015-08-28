package com.plugin.main;
import org.bukkit.plugin.java.JavaPlugin;

import com.plugin.main.Commands;

public class Main extends JavaPlugin {
	public void onEnable() {
		getCommand("test").setExecutor(new Commands());
	}
	
	public void onDisable() {
		
	}
}
