package com.sieadev.allthebasics.util;

import com.sieadev.allthebasics.events.frozenPlayerEvent;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import java.util.HashMap;

public class freezePlayer {
	public static void freezePlayer(Player p, String t){
        if (!p.hasPermission("atb.freeze")){
            p.sendMessage("§cYou don't have the required permissions to use this command.");
            return;
        }

        Player target = getPlayerFromString.getPlayerFromString(p, t);

        if (target == null){
            return;
        }

        freeze(target, p);
    }

	public static void freeze(Player target, Player user){
        frozenPlayerEvent.toggleFreeze(target, user);
    }

}
