package me.frog.inventoryapi;

import me.frog.inventoryapi.util.InventoryBase;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;

public class ExampleInventory extends InventoryBase {

    public Inventory testMenu() {
        Inventory inv = Bukkit.createInventory(null, 54, "Test Menu");

        /*
            The only methods not shown are the ones with no lore specified with
             an item. To remove the lore simply remove that section from the examples
             below.
         */

        inv.setItem(10, addButton(Material.RED_WOOL, ChatColor.RED + "Red Wool",
                new String[] {
                        "This is an example of adding an",
                        "item with a lore."
                }, false));

        inv.setItem(15, addAmountButton(Material.COBBLESTONE, 1, ChatColor.GRAY + "Cobblestone",
                new String[] {
                        "This is an example of adding an",
                        "amount button.",
                        "",
                        "This will do the equivalent of",
                        "the addButton() method."
                }, false));

        inv.setItem(16, addAmountButton(Material.COBBLESTONE, 64, ChatColor.GRAY + "Cobblestone",
                new String[] {
                        "This is an example of adding an",
                        "amount button.",
                        "",
                        "This will create a full stack",
                        "within the inventory.",
                }, false));

        inv.setItem(28, addButton(Material.DIAMOND_SWORD, ChatColor.BLUE + "Diamond Sword",
                new String[] {
                        "This is an example of an item",
                        "with attributes."
                }, false));

        inv.setItem(29, addButton(Material.DIAMOND_SWORD, ChatColor.BLUE + "Diamond Sword",
                new String[] {
                        "This is an example of an item",
                        "without attributes."
                }, true));

        inv.setItem(46, addSpecialButton(Material.DIAMOND, 1, ChatColor.AQUA + "Enchanted Diamond",
                new String[] {
                        "This is an example of an item",
                        "with the enchant name."
                }, false,false));

        inv.setItem(47, addSpecialButton(Material.DIAMOND, 1, ChatColor.AQUA + "Enchanted Diamond",
                new String[] {
                        "This is an example of an item",
                        "without the enchant name."
                }, false,true));

        return inv;
    }
}
