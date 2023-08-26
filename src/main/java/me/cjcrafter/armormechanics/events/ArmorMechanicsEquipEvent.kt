package me.cjcrafter.armormechanics.events

import me.deecaad.core.mechanics.Mechanics
import org.bukkit.entity.Entity
import org.bukkit.event.HandlerList
import org.bukkit.event.entity.EntityEvent
import org.bukkit.inventory.ItemStack
import org.bukkit.potion.PotionEffect

class ArmorMechanicsEquipEvent(
    what: Entity,
    val armor: ItemStack,
    val armorTitle: String,
    var equipMechanics: Mechanics?,
    var potions: List<PotionEffect>
) :
    EntityEvent(what) {

    override fun getHandlers(): HandlerList {
        return handlerList
    }

    companion object {
        val handlerList = HandlerList()
    }
}
