package me.carandev.backpackplugin;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Hello world!
 *
 */
public class App extends JavaPlugin {
  @Override
  public void onEnable() {
    getLogger().info("Hola mundo");
  }

  @Override
  public void onDisable() {
    getLogger().info("Adios, SpigotMC!");
  }
}
