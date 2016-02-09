package net.m21xx.mc.dummy;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DummyHelloWorldExecutor implements CommandExecutor {

	//private final DummyPlugin plugin;
	
	//public DummyHelloWorldExecutor(DummyPlugin plugin) {
	//	this.plugin = plugin;
	//}
	
	public boolean onCommand(CommandSender pSender, Command pCmd, String arg2,
			String[] arg3) {
		
		if (pSender instanceof Player) {
			Player lPlayer = (Player) pSender;
			lPlayer.sendMessage("Hello world!");
		}
		else {
			pSender.sendMessage("Hello world from game console...");
		}
		
		return true;
	}

}
