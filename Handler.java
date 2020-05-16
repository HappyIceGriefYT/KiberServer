package ru.filkworld.cf;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class Handler implements Listener {
	
	@EventHandler
	public void join(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		p.playSound(p.getLocation(), Sound.FIREWORK_BLAST, 1, 3);
		p.sendMessage("§aДобро пожаловать на режим KiberCity");
		p.sendMessage("§6Чтобы посмотреть сюжет напишите - §e/suget");
	}
	
	@EventHandler
	public void block(BlockBreakEvent e) {
		
		Player p = e.getPlayer();
				p.sendMessage("§сОшибка '§e k1' §cсообщите в vk.com/filkworld_restore");
				Bukkit.broadcastMessage("§aFilkWorld §fстатус оболочки защиты сервера: §cотключена");
				Bukkit.broadcastMessage("§cСкоро сервер будет выключен");
	}

}
