package com.plugin.main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor {
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		Player player = (Player) sender;
		
		if (commandLabel.equalsIgnoreCase("test")) {
			sender.sendMessage("This is working");
			sender.sendMessahe("Awesome we actually did it! :D");
		}
		return false;
	}
}
