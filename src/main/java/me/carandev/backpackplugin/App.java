package me.carandev.backpackplugin;

import java.util.HashMap;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.plugin.java.JavaPlugin;

import me.carandev.backpackplugin.listeners.PlayerListeners;

/**
 * Hello world!
 *
 */
public class App extends JavaPlugin {
  @Override
  public void onEnable() {
    HashMap<String, Double> players = new HashMap<>();

    for (Player player : Bukkit.getServer().getOnlinePlayers()) {
      players.put(player.getName(), player.getHealth());
    }

    getLogger().info(players.toString());

    getServer().getPluginManager().registerEvents(new PlayerListeners(), this);
  }

  @Override
  public void onDisable() {
    getLogger().info("Adios, SpigotMC!");
  }
}
