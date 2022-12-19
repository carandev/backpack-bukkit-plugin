package me.carandev.exampleplugin;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Hello world!
 *
 */
public class App extends JavaPlugin {
  @Override
  public void onEnable() {
    getLogger().info("Hola, está de locos SpigotMC, es maravilloso!");
  }

  @Override
  public void onDisable() {
    getLogger().info("Adios, SpigotMC!");
  }
}
