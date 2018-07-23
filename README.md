# EasyInventoryAPI v1.0
This project was coded in Minecraft version 1.13.

The purpose of this API is for you to copy and paste the InventoryBase.java into your project(s) and utilize its methods.
This repository does not show you how to register events or how to open the inventory for the player. Therefore, looking at
the Core.java is pointless as it contains nothing within it. The ExampleInventory.java shows you how to create a class and
inventory utilizing the methods.

All the methods in InventoryBase.java have been tested and work properly.

Please do not forget to add "api-version: 1.13" to your plugin.yml. The code should still work but you will receive errors
in the console and some items might not work if you forget this.

**Note**: Do not try to compile and run this plugin. It will not work due to the fact the event is not registered and there is 
no way of opening the inventory provided. It is suggested you create your own, new, inventory.
