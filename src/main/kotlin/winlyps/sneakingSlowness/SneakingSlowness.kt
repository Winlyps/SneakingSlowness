package winlyps.sneakingSlowness

import org.bukkit.plugin.java.JavaPlugin

class SneakingSlowness : JavaPlugin() {

    override fun onEnable() {
        // Register the event listener
        getServer().pluginManager.registerEvents(SneakingListener(this), this)
        logger.info("SneakingSlowness plugin enabled!")
    }

    override fun onDisable() {
        logger.info("SneakingSlowness plugin disabled!")
    }
}