package me.carandev.backpackplugin.listeners;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.ItemStack;

public final class PlayerListeners implements Listener {

  @EventHandler
  public void onPlayerMove(PlayerMoveEvent event) {
    Location location = event.getPlayer().getLocation();

    location.setY(location.getY() - 1);

    Block block = location.getBlock();

    if (block.getType() == Material.GRASS) {
      block.setType(Material.DIRT);
    }
  }

}
