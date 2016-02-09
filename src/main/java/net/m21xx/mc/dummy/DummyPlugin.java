package net.m21xx.mc.dummy;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class DummyPlugin extends JavaPlugin {

	@Override
	public void onEnable() {
		
		//this.getCommand("helloworld").setExecutor(new DummyHelloWorldExecutor(this));
		this.getCommand("helloworld").setExecutor(new DummyHelloWorldExecutor());
	}
	
	@Override
	public void onDisable() {
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command,
			String label, String[] args) {		
		
		return false;
	}
	
}
