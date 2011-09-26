package de.bananaco.permissions.fornoobs;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.World;

public class PlayerCase {

	private static Server server = Bukkit.getServer();
	
	public static String correctCase(String player) {
		for(World world : server.getWorlds()) {
			File file = new File(world.getName()+"/players/");
			for(File subfile : file.listFiles()) {
				String name = subfile.getName().replace(".dat", "");
				if(name.equalsIgnoreCase(player))
					return name;
			}
		}
		return null;
	}
	
}
