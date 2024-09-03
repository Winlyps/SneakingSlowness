package winlyps.sneakingSlowness

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerToggleSneakEvent
import org.bukkit.potion.PotionEffect
import org.bukkit.potion.PotionEffectType

class SneakingListener(private val plugin: SneakingSlowness) : Listener {

    @EventHandler
    fun onPlayerToggleSneak(event: PlayerToggleSneakEvent) {
        val player = event.player
        if (event.isSneaking) {
            // Apply slowness effect
            player.addPotionEffect(PotionEffect(PotionEffectType.SLOW, Integer.MAX_VALUE, 1))
        } else {
            // Remove slowness effect
            player.removePotionEffect(PotionEffectType.SLOW)
        }
    }
}