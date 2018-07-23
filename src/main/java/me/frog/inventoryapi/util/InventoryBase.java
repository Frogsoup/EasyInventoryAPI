package me.frog.inventoryapi.util;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public abstract class InventoryBase {

    /**
     * Adds a default item into an inventory without a specified lore.
     *
     * @param material The Minecraft item.
     * @param name The name of the item.
     * @param hideAttributes Hide extra information about a Minecraft item
     *                       (Typically for weapons, tools, or armor).
     * @return The updated Minecraft item.
     */
    public ItemStack addButton(Material material, String name, boolean hideAttributes) {
        ItemStack stack = new ItemStack(material);
        ItemMeta meta = stack.getItemMeta();
        meta.setDisplayName(name);

        if(hideAttributes)
            meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        stack.setItemMeta(meta);

        return stack;
    }

    /**
     * Adds a default item into an inventory with a specified lore.
     *
     * @param material The Minecraft item.
     * @param name The name of the item.
     * @param desc The description, or lore, of the item.
     * @param hideAttributes Hide extra information about a Minecraft item
     *                       (Typically for weapons, tools, or armor).
     * @return The updated Minecraft item.
     */
    public ItemStack addButton(Material material, String name, String[] desc, boolean hideAttributes) {
        ItemStack stack = new ItemStack(material);
        ItemMeta meta = stack.getItemMeta();
        meta.setDisplayName(name);

        List<String> lore = new ArrayList<>();
        for(String str : desc)
            lore.add(str);

        meta.setLore(lore);

        if(hideAttributes)
            meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        stack.setItemMeta(meta);

        return stack;
    }

    /**
     * Adds an item into an inventory with a specified amount and
     *  without a specified lore.
     *
     * @param material The Minecraft item.
     * @param amount The amount of the item.
     * @param name The name of the item.
     * @param hideAttributes Hide extra information about a Minecraft item
     *                      (Typically for weapons, tools, or armor).
     * @return The updated Minecraft item.
     */
    public ItemStack addAmountButton(Material material, int amount, String name, boolean hideAttributes) {
        ItemStack stack = new ItemStack(material, amount);
        ItemMeta meta = stack.getItemMeta();
        meta.setDisplayName(name);

        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        stack.setItemMeta(meta);

        return stack;
    }

    /**
     * Adds an item into an inventory with a specified amount and
     *  with a specified lore.
     *
     * @param material The Minecraft item.
     * @param amount The amount of the item.
     * @param name The name of the item.
     * @param desc The description, or lore, of the item.
     * @param hideAttributes Hide extra information about a Minecraft item
     *                      (Typically for weapons, tools, or armor).
     * @return The updated Minecraft item.
     */
    public ItemStack addAmountButton(Material material, int amount, String name, String[] desc, boolean hideAttributes) {
        ItemStack stack = new ItemStack(material, amount);
        ItemMeta meta = stack.getItemMeta();
        meta.setDisplayName(name);

        List<String> lore = new ArrayList<>();
        for(String str : desc)
            lore.add(str);

        meta.setLore(lore);

        if(hideAttributes)
            meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        stack.setItemMeta(meta);

        return stack;
    }

    /**
     * Adds an enchanted item into an inventory without a specified
     *  lore.
     *
     * @param material The Minecraft item.
     * @param amount The amount of the item.
     * @param name The name of the item.
     * @param hideAttributes Hide extra information about a Minecraft item
     *                       (Typically for weapons, tools, or armor).
     * @param hideEnchant Hides the enchant name that makes the item enchanted.
     * @return The updated Minecraft item.
     */
    public ItemStack addSpecialButton(Material material, int amount, String name, boolean hideAttributes, boolean hideEnchant) {
        ItemStack stack = new ItemStack(material,amount);
        ItemMeta meta = stack.getItemMeta();
        meta.setDisplayName(name);
        meta.addEnchant(Enchantment.DURABILITY, 1, false);

        if(hideAttributes)
            meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        if(hideEnchant)
            meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        stack.setItemMeta(meta);

        return stack;
    }

    /**
     * Adds an enchanted item into an inventory with a specified
     *  lore.
     *
     * @param material The Minecraft item.
     * @param amount The amount of the item.
     * @param name The name of the item.
     * @param desc The description, or lore, or the item.
     * @param hideAttributes Hide extra information about a Minecraft item
     *                       (Typically for weapons, tools, or armor).
     * @param hideEnchant Hides the enchant name that makes the item enchanted.
     * @return The updated Minecraft item.
     */
    public ItemStack addSpecialButton(Material material,  int amount, String name, String[] desc, boolean hideAttributes, boolean hideEnchant) {
        ItemStack stack = new ItemStack(material,amount);
        ItemMeta meta = stack.getItemMeta();
        meta.setDisplayName(name);
        meta.addEnchant(Enchantment.DURABILITY, 1, false);

        List<String> lore = new ArrayList<>();
        for(String str : desc)
            lore.add(str);

        meta.setLore(lore);

        if(hideAttributes)
            meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        if(hideEnchant)
            meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        stack.setItemMeta(meta);

        return stack;
    }
}
