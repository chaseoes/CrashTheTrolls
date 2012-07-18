package me.chaseoes.crashthetrolls;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class CrashTheTrolls extends JavaPlugin {
	
	public boolean onCommand(CommandSender cs, Command cmnd, String string, String[] strings) {
		if (cmnd.getName().equalsIgnoreCase("crash")) {
			if (cs.hasPermission("crashthetrolls.crash")) {
				if (strings.length == 1) {
					Player target = getServer().getPlayer(strings[0]);
					if (target != null) {
					target.sendMessage("You're about to crash!§");
					cs.sendMessage("§aSuccessfully crashed that troll.");
					} else {
						cs.sendMessage("§cThat player is not online or could not be found.");
					}
				} else {
					cs.sendMessage("§cInvalid number of arguments. Usage: /crash <player>");
				}
			} else {
				cs.sendMessage("§cYou don't have permission to preform that action.");
			}
		}
		return true;
	}

}
