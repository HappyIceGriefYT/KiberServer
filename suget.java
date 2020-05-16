package ru.filkworld.cf;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class suget implements CommandExecutor {

	public suget(kserver kserver) {
	      this.plugin = plugin;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] arg3) {
		if(sender.hasPermission("kiber.suget")) {
		    sender.sendMessage("§eВы дружили с одним учёным у вас была семья и дети но потом вы связались с нелегалами и вашу семью застрелили, учёный не мог видеть как вы страдаете и погрузил вас в крио камеру и вы проснулись сейчас спустя 85 лет");
			return true;
		}
		
		
		return false;
	}
	

}
 
