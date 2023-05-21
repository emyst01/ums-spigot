package me.loryyyy.az_hub.hub.hubNeeds;

import me.loryyyy.az_hub.AZ_HUB;
import me.loryyyy.az_hub.files.database.Database;
import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.scheduler.BukkitRunnable;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.File;
import java.util.*;

public class UM { //Useful Methods

    public static Inventory createItem(Material material, String displayName, String lore1, String lore2, Inventory inventory, int index) {
        ItemStack function = new ItemStack(material);
        ItemMeta functionMeta = function.getItemMeta();
        functionMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        functionMeta.setDisplayName(displayName);
        ArrayList<String> lore = new ArrayList<>();
        if (!Objects.equals(lore1, "")) {
            lore.add(lore1);
        }
        if (!Objects.equals(lore2, "")) {
            lore.add(lore2);
        }
        functionMeta.setLore(lore);
        function.setItemMeta(functionMeta);
        if (inventory.getSize() == 36) {
            if (index < 36) {
                if(index != -1)
                    inventory.setItem(index, function);
                else inventory.addItem(function);
            } else {
                PlayerInventory inv = (PlayerInventory) inventory;
                if (index == 36) {
                    inv.setBoots(function);
                }
                if (index == 37) {
                    inv.setLeggings(function);
                }
                if (index == 38) {
                    inv.setChestplate(function);
                }
                if (index == 39) {
                    inv.setHelmet(function);
                }
                return inv;
            }
        } else {
            if(index != -1)
                inventory.setItem(index, function);
            else inventory.addItem(function);
        }
        return inventory;

    }

    public static Inventory createItem(Material material, String displayName, ArrayList<String> lore, Inventory inventory, int index) {
        ItemStack function = new ItemStack(material);
        ItemMeta functionMeta = function.getItemMeta();
        functionMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        functionMeta.setDisplayName(displayName);
        functionMeta.setLore(lore);
        function.setItemMeta(functionMeta);
        if (inventory.getSize() == 36) {
            if (index < 36) {
                inventory.setItem(index, function);
            } else {
                PlayerInventory inv = (PlayerInventory) inventory;
                if (index == 36) {
                    inv.setBoots(function);
                }
                if (index == 37) {
                    inv.setLeggings(function);
                }
                if (index == 38) {
                    inv.setChestplate(function);
                }
                if (index == 39) {
                    inv.setHelmet(function);
                }
                return inv;
            }
        } else {
            inventory.setItem(index, function);
        }
        return inventory;

    }public static Inventory createItem(Material material, int dur, String displayName, ArrayList<String> lore, Inventory inventory, int index) {
        ItemStack function = new ItemStack(material);
        ItemMeta functionMeta = function.getItemMeta();
        functionMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        functionMeta.setDisplayName(displayName);
        functionMeta.setLore(lore);
        function.setItemMeta(functionMeta);
        function.setDurability((byte)dur);
        if (inventory.getSize() == 36) {
            if (index < 36) {
                inventory.setItem(index, function);
            } else {
                PlayerInventory inv = (PlayerInventory) inventory;
                if (index == 36) {
                    inv.setBoots(function);
                }
                if (index == 37) {
                    inv.setLeggings(function);
                }
                if (index == 38) {
                    inv.setChestplate(function);
                }
                if (index == 39) {
                    inv.setHelmet(function);
                }
                return inv;
            }
        } else {
            inventory.setItem(index, function);
        }
        return inventory;

    }

    public static Inventory createItem(Material material, String displayName, String lore1, String lore2, String lore3, String lore4, String lore5, Inventory inventory, int index) {
        ItemStack function = new ItemStack(material);
        ItemMeta functionMeta = function.getItemMeta();
        functionMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        functionMeta.setDisplayName(displayName);
        ArrayList<String> lore = new ArrayList<>();
        if (!Objects.equals(lore1, "")) {
            lore.add(lore1);
        }
        if (!Objects.equals(lore2, "")) {
            lore.add(lore2);
        }
        if (!Objects.equals(lore3, "")) {
            lore.add(lore3);
        }
        if (!Objects.equals(lore4, "")) {
            lore.add(lore4);
        }
        if (!Objects.equals(lore5, "")) {
            lore.add(lore5);
        }
        functionMeta.setLore(lore);
        function.setItemMeta(functionMeta);
        if (inventory.getSize() == 36) {
            if (index < 36) {
                inventory.setItem(index, function);
            } else {
                PlayerInventory inv = (PlayerInventory) inventory;
                if (index == 36) {
                    inv.setBoots(function);
                }
                if (index == 37) {
                    inv.setLeggings(function);
                }
                if (index == 38) {
                    inv.setChestplate(function);
                }
                if (index == 39) {
                    inv.setHelmet(function);
                }
                return inv;
            }
        } else {
            inventory.setItem(index, function);
        }
        return inventory;
    }

    public static Inventory createItem(ItemStack itemStack, String displayName, String lore1, String lore2, Inventory inventory, int index) {
        ItemMeta functionMeta = itemStack.getItemMeta();
        functionMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        functionMeta.setDisplayName(displayName);
        ArrayList<String> lore = new ArrayList<>();
        if (!Objects.equals(lore1, "")) {
            lore.add(lore1);
        }
        if (!Objects.equals(lore2, "")) {
            lore.add(lore2);
        }
        functionMeta.setLore(lore);
        itemStack.setItemMeta(functionMeta);
        if (inventory.getSize() == 36) {
            if (index < 36) {
                inventory.setItem(index, itemStack);
            } else {
                PlayerInventory inv = (PlayerInventory) inventory;
                if (index == 36) {
                    inv.setBoots(itemStack);
                }
                if (index == 37) {
                    inv.setLeggings(itemStack);
                }
                if (index == 38) {
                    inv.setChestplate(itemStack);
                }
                if (index == 39) {
                    inv.setHelmet(itemStack);
                }
                return inv;
            }
        } else {
            inventory.setItem(index, itemStack);
        }
        return inventory;
    }
    public static Inventory createItem(ItemStack itemStack, String displayName, String lore1, String lore2, String lore3, String lore4, String lore5, Inventory inventory, int index) {
        ItemMeta functionMeta = itemStack.getItemMeta();
        functionMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        functionMeta.setDisplayName(displayName);
        ArrayList<String> lore = new ArrayList<>();
        if (!Objects.equals(lore1, "")) {
            lore.add(lore1);
        }
        if (!Objects.equals(lore2, "")) {
            lore.add(lore2);
        }if (!Objects.equals(lore3, "")) {
            lore.add(lore3);
        }if (!Objects.equals(lore4, "")) {
            lore.add(lore4);
        }if (!Objects.equals(lore5, "")) {
            lore.add(lore5);
        }
        functionMeta.setLore(lore);
        itemStack.setItemMeta(functionMeta);
        if (inventory.getSize() == 36) {
            if (index < 36) {
                inventory.setItem(index, itemStack);
            } else {
                PlayerInventory inv = (PlayerInventory) inventory;
                if (index == 36) {
                    inv.setBoots(itemStack);
                }
                if (index == 37) {
                    inv.setLeggings(itemStack);
                }
                if (index == 38) {
                    inv.setChestplate(itemStack);
                }
                if (index == 39) {
                    inv.setHelmet(itemStack);
                }
                return inv;
            }
        } else {
            inventory.setItem(index, itemStack);
        }
        return inventory;
    }

    public static Inventory createItem(Material material, String displayName, String lore1, String lore2, Inventory inventory, int index, int amount) {
        ItemStack function = new ItemStack(material, amount);
        ItemMeta functionMeta = function.getItemMeta();
        functionMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        functionMeta.setDisplayName(displayName);
        ArrayList<String> lore = new ArrayList<>();
        if (!Objects.equals(lore1, "")) {
            lore.add(lore1);
        }
        if (!Objects.equals(lore2, "")) {
            lore.add(lore2);
        }
        functionMeta.setLore(lore);
        function.setItemMeta(functionMeta);
        if (inventory.getSize() == 36) {
            if (index < 36) {
                inventory.setItem(index, function);
            } else {
                PlayerInventory inv = (PlayerInventory) inventory;
                if (index == 36) {
                    inv.setBoots(function);
                }
                if (index == 37) {
                    inv.setLeggings(function);
                }
                if (index == 38) {
                    inv.setChestplate(function);
                }
                if (index == 39) {
                    inv.setHelmet(function);
                }
                return inv;
            }
        } else {
            inventory.setItem(index, function);
        }
        return inventory;
    }
    public static Inventory createItem(Material material, int durability, String displayName, String lore1, String lore2, String lore3, String lore4, String lore5, Inventory inventory, int index, int amount) {
        ItemStack function = new ItemStack(material, amount);
        ItemMeta functionMeta = function.getItemMeta();
        functionMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        functionMeta.setDisplayName(displayName);
        ArrayList<String> lore = new ArrayList<>();
        if (!Objects.equals(lore1, "")) {
            lore.add(lore1);
        }
        if (!Objects.equals(lore2, "")) {
            lore.add(lore2);
        }if (!Objects.equals(lore3, "")) {
            lore.add(lore3);
        }if (!Objects.equals(lore4, "")) {
            lore.add(lore4);
        }if (!Objects.equals(lore5, "")) {
            lore.add(lore5);
        }
        functionMeta.setLore(lore);
        function.setItemMeta(functionMeta);
        function.setDurability((short) durability);
        if (inventory.getSize() == 36) {
            if (index < 36) {
                inventory.setItem(index, function);
            } else {
                PlayerInventory inv = (PlayerInventory) inventory;
                if (index == 36) {
                    inv.setBoots(function);
                }
                if (index == 37) {
                    inv.setLeggings(function);
                }
                if (index == 38) {
                    inv.setChestplate(function);
                }
                if (index == 39) {
                    inv.setHelmet(function);
                }
                return inv;
            }
        } else {
            inventory.setItem(index, function);
        }
        return inventory;
    }

    public static Inventory createItem(Material material, int durability, String displayName, String lore1, String lore2, Inventory inventory, int index, int amount) {
        ItemStack function = new ItemStack(material, amount);
        ItemMeta functionMeta = function.getItemMeta();
        functionMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        functionMeta.setDisplayName(displayName);
        ArrayList<String> lore = new ArrayList<>();
        if (!Objects.equals(lore1, "")) {
            lore.add(lore1);
        }
        if (!Objects.equals(lore2, "")) {
            lore.add(lore2);
        }
        functionMeta.setLore(lore);
        function.setItemMeta(functionMeta);
        function.setDurability((short) durability);
        if (inventory.getSize() == 36) {
            if (index < 36) {
                inventory.setItem(index, function);
            } else {
                PlayerInventory inv = (PlayerInventory) inventory;
                if (index == 36) {
                    inv.setBoots(function);
                }
                if (index == 37) {
                    inv.setLeggings(function);
                }
                if (index == 38) {
                    inv.setChestplate(function);
                }
                if (index == 39) {
                    inv.setHelmet(function);
                }
                return inv;
            }
        } else {
            inventory.setItem(index, function);
        }
        return inventory;
    }

    public static Inventory createItem(Material material, String displayName, String lore1, String lore2, Inventory inventory, int index, int amount, Enchantment enchantment, int level) {
        ItemStack function = new ItemStack(material, amount);
        ItemMeta functionMeta = function.getItemMeta();
        functionMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        functionMeta.setDisplayName(displayName);
        if (enchantment != null) {
            functionMeta.addEnchant(enchantment, level, true);
        }
        ArrayList<String> lore = new ArrayList<>();
        if (!Objects.equals(lore1, "")) {
            lore.add(lore1);
        }
        if (!Objects.equals(lore2, "")) {
            lore.add(lore2);
        }
        functionMeta.setLore(lore);
        function.setItemMeta(functionMeta);
        if (inventory.getSize() == 36) {
            if (index < 36) {
                inventory.setItem(index, function);
            } else {
                PlayerInventory inv = (PlayerInventory) inventory;
                if (index == 36) {
                    inv.setBoots(function);
                }
                if (index == 37) {
                    inv.setLeggings(function);
                }
                if (index == 38) {
                    inv.setChestplate(function);
                }
                if (index == 39) {
                    inv.setHelmet(function);
                }
                return inv;
            }
        } else {
            inventory.setItem(index, function);
        }
        return inventory;
    }
    public static Inventory createItem(Material material, String displayName, String lore1, String lore2, Inventory inventory, int index, int amount, Enchantment enchantment, int level, boolean hideEnchant) {
        ItemStack function = new ItemStack(material, amount);
        ItemMeta functionMeta = function.getItemMeta();
        functionMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        functionMeta.setDisplayName(displayName);
        if (enchantment != null) {
            functionMeta.addEnchant(enchantment, level, true);
        }
        ArrayList<String> lore = new ArrayList<>();
        if (!Objects.equals(lore1, "")) {
            lore.add(lore1);
        }
        if (!Objects.equals(lore2, "")) {
            lore.add(lore2);
        }
        functionMeta.setLore(lore);
        function.setItemMeta(functionMeta);
        if (inventory.getSize() == 36) {
            if (index < 36) {
                inventory.setItem(index, function);
            } else {
                PlayerInventory inv = (PlayerInventory) inventory;
                if (index == 36) {
                    inv.setBoots(function);
                }
                if (index == 37) {
                    inv.setLeggings(function);
                }
                if (index == 38) {
                    inv.setChestplate(function);
                }
                if (index == 39) {
                    inv.setHelmet(function);
                }
                return inv;
            }
        } else {
            inventory.setItem(index, function);
        }
        return inventory;
    }

    public static Inventory createItem(Material material, String displayName, String lore1, String lore2, Inventory inventory, int index, int amount, Enchantment enchantment, int level, Enchantment enchant, int level2) {
        ItemStack function = new ItemStack(material, amount);
        ItemMeta functionMeta = function.getItemMeta();
        functionMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        functionMeta.setDisplayName(displayName);
        functionMeta.addEnchant(enchantment, level, true);
        functionMeta.addEnchant(enchant, level2, true);
        ArrayList<String> lore = new ArrayList<>();
        if (!Objects.equals(lore1, "")) {
            lore.add(lore1);
        }
        if (!Objects.equals(lore2, "")) {
            lore.add(lore2);
        }
        functionMeta.setLore(lore);
        function.setItemMeta(functionMeta);
        if (inventory.getSize() == 36) {
            if (index < 36) {
                inventory.setItem(index, function);
            } else {
                PlayerInventory inv = (PlayerInventory) inventory;
                if (index == 36) {
                    inv.setBoots(function);
                }
                if (index == 37) {
                    inv.setLeggings(function);
                }
                if (index == 38) {
                    inv.setChestplate(function);
                }
                if (index == 39) {
                    inv.setHelmet(function);
                }
                return inv;
            }
        } else {
            inventory.setItem(index, function);
        }
        return inventory;
    }
    public static Inventory createItem(Material material, String displayName, String lore1, String lore2, String lore3, String lore4, String lore5, String lore6, Inventory inventory, int index, int amount) {
        ItemStack function = new ItemStack(material);
        function.setAmount(amount);
        ItemMeta functionMeta = function.getItemMeta();
        functionMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        functionMeta.setDisplayName(displayName);
        ArrayList<String> lore = new ArrayList<>();
        if (!Objects.equals(lore1, "")) {
            lore.add(lore1);
        }
        if (!Objects.equals(lore2, "")) {
            lore.add(lore2);
        }
        if (!Objects.equals(lore3, "")) {
            lore.add(lore3);
        }
        if (!Objects.equals(lore4, "")) {
            lore.add(lore4);
        }
        if (!Objects.equals(lore5, "")) {
            lore.add(lore5);
        }if (!Objects.equals(lore6, "")) {
            lore.add(lore6);
        }
        functionMeta.setLore(lore);
        function.setItemMeta(functionMeta);
        if (inventory.getSize() == 36) {
            if (index < 36) {
                inventory.setItem(index, function);
            } else {
                PlayerInventory inv = (PlayerInventory) inventory;
                if (index == 36) {
                    inv.setBoots(function);
                }
                if (index == 37) {
                    inv.setLeggings(function);
                }
                if (index == 38) {
                    inv.setChestplate(function);
                }
                if (index == 39) {
                    inv.setHelmet(function);
                }
                return inv;
            }
        } else {
            inventory.setItem(index, function);
        }
        return inventory;
    }

    public static Inventory createItem(Material material, String displayName, String lore1, String lore2, Inventory inventory, int index, int amount, Enchantment enchantment, int level, Enchantment enchant, int level2, Enchantment ench, int level3) {
        ItemStack function = new ItemStack(material, amount);
        ItemMeta functionMeta = function.getItemMeta();
        functionMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        functionMeta.setDisplayName(displayName);
        functionMeta.addEnchant(enchantment, level, true);
        functionMeta.addEnchant(enchant, level2, true);
        functionMeta.addEnchant(ench, level3, true);
        ArrayList<String> lore = new ArrayList<>();
        if (!Objects.equals(lore1, "")) {
            lore.add(lore1);
        }
        if (!Objects.equals(lore2, "")) {
            lore.add(lore2);
        }
        functionMeta.setLore(lore);
        function.setItemMeta(functionMeta);
        if (inventory.getSize() == 36) {
            if (index < 36) {
                inventory.setItem(index, function);
            } else {
                PlayerInventory inv = (PlayerInventory) inventory;
                if (index == 36) {
                    inv.setBoots(function);
                }
                if (index == 37) {
                    inv.setLeggings(function);
                }
                if (index == 38) {
                    inv.setChestplate(function);
                }
                if (index == 39) {
                    inv.setHelmet(function);
                }
                return inv;
            }
        } else {
            inventory.setItem(index, function);
        }
        return inventory;
    }
    public static Inventory createItem(Material material, String displayName, String lore1, String lore2, String lore3, String lore4, String lore5, Inventory inventory, int index, int amount) {
        ItemStack function = new ItemStack(material);
        function.setAmount(amount);
        ItemMeta functionMeta = function.getItemMeta();
        functionMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        functionMeta.setDisplayName(displayName);
        ArrayList<String> lore = new ArrayList<>();
        if (!Objects.equals(lore1, "")) {
            lore.add(lore1);
        }
        if (!Objects.equals(lore2, "")) {
            lore.add(lore2);
        }
        if (!Objects.equals(lore3, "")) {
            lore.add(lore3);
        }
        if (!Objects.equals(lore4, "")) {
            lore.add(lore4);
        }
        if (!Objects.equals(lore5, "")) {
            lore.add(lore5);
        }
        functionMeta.setLore(lore);
        function.setItemMeta(functionMeta);
        if (inventory.getSize() == 36) {
            if (index < 36) {
                inventory.setItem(index, function);
            } else {
                PlayerInventory inv = (PlayerInventory) inventory;
                if (index == 36) {
                    inv.setBoots(function);
                }
                if (index == 37) {
                    inv.setLeggings(function);
                }
                if (index == 38) {
                    inv.setChestplate(function);
                }
                if (index == 39) {
                    inv.setHelmet(function);
                }
                return inv;
            }
        } else {
            inventory.setItem(index, function);
        }
        return inventory;
    }
    public static void prepGui(Inventory inv, int glassStart, int glassEnd, int arrow, String exitOrBack){
        for (int i = glassStart; i < glassEnd; i++) {
            createItem(Material.STAINED_GLASS_PANE, 7, ChatColor.DARK_GRAY + " ", "", "", inv, i, 1);
        }
        createItem(Material.ARROW, ChatColor.RED + exitOrBack, "", "", inv, arrow);
    }
    public static void prepStand(ArmorStand stand, String name) {
        stand.setGravity(false);
        stand.setSmall(true);
        stand.setVisible(false);
        stand.setCustomName(name);
        stand.setCustomNameVisible(true);
    }
    public static void destroyNearStands(Location location, double ray){
        ArmorStand stand = (ArmorStand) location.getWorld().spawnEntity(location, EntityType.ARMOR_STAND);
        stand.setVisible(false);
        List<Entity> entities = stand.getNearbyEntities(ray, ray, ray);
        for(Entity en : entities){
            if(en instanceof ArmorStand)
                en.remove();
        }
        stand.remove();
    }
    public static String uppercase(String str, int pos) {
        if (str == null || str.isEmpty() || pos < 0 || pos >= str.length()) {
            return str;
        }
        char[] chars = str.toCharArray();
        chars[pos] = Character.toUpperCase(chars[pos]);
        return new String(chars);
    }
    public static World loadWorld(String world) {
        File activeWorldFolder = new File(Bukkit.getWorldContainer().getParentFile(), world);
        World bukkitWorld = Bukkit.createWorld(new WorldCreator(activeWorldFolder.getName()));
        if (bukkitWorld != null) bukkitWorld.setAutoSave(false);
        return bukkitWorld;
    }
    public static boolean isNearNPC(Player p){
        for(Entity en : p.getNearbyEntities(6, 6, 6)){
            if(en instanceof Player){
                Player pl = (Player) en;
                if(isNPC(pl)) return true;
            }
        }
        return false;
    }
    public static ChatColor getTpsColor(int tps){
        if(tps >= 18) return ChatColor.GREEN;
        if(tps >= 10) return ChatColor.YELLOW;
        return ChatColor.RED;
    }
    public static boolean probability(int num, int den){
        Random r = new Random();
        int res = r.nextInt(den) + 1;
        return res <= num;
    }
    public static int probability(int per1, int per2, int per3, int per4){
        Random r = new Random();
        int res = r.nextInt(100)+1;
        if(res<=per1) return 1;
        if(res<=per1+per2) return 2;
        if(res<=per1+per2+per3) return 3;
        if(res<=per1+per2+per3+per4) return 4;
        return 0;
    }
    public static int probability(int per1, int per2, int per3){
        Random r = new Random();
        int res = r.nextInt(100)+1;
        if(res<=per1) return 1;
        if(res<=per1+per2) return 2;
        if(res<=per1+per2+per3) return 3;
        return 0;
    }
    public static float getNearestYaw(float yaw){
        if(yaw >= 337.5 || yaw <= 22.5) return 0;
        if(yaw > 22.5 && yaw < 67.5) return 45;
        if(yaw >= 67.5 && yaw <= 112.5) return 90;
        if(yaw > 112.5 && yaw < 157.5) return 135;
        if(yaw >= 157.5 && yaw <= 202.5) return 180;
        if(yaw > 202.5 && yaw < 247.5) return 225;
        if(yaw >= 247.5 && yaw < 292.5) return 270;
        return 315;
    }
    public static float fixYaw(float yaw){
        if(yaw >= 0) return yaw;
        return 360 + yaw;
    }
    public static void setLocation(FileConfiguration config, String configPlace, Player p) {
        config.set(configPlace + ".world", p.getLocation().getWorld().getName());
        config.set(configPlace + ".x", p.getLocation().getX());
        config.set(configPlace + ".y", p.getLocation().getY());
        config.set(configPlace + ".z", p.getLocation().getZ());
        config.set(configPlace + ".yaw", p.getLocation().getYaw());
        config.set(configPlace + ".pitch", p.getLocation().getPitch());
    }

    public static Location getLocation(FileConfiguration config, String configPlace) {
        return new Location(Bukkit.getWorld(config.getString(configPlace + ".world")), config.getDouble(configPlace + ".x"), config.getDouble(configPlace + ".y"), config.getDouble(configPlace + ".z"), (float) config.getDouble(configPlace + ".yaw"), (float) config.getDouble(configPlace + ".pitch"));
    }

    public static void setBlockLoc(FileConfiguration config, String configPlace, Block block) {
        config.set(configPlace + ".x", block.getX());
        config.set(configPlace + ".y", block.getY());
        config.set(configPlace + ".z", block.getZ());
        config.set(configPlace + ".world", block.getWorld().getName());
    }

    public static Location getBlockLoc(FileConfiguration config, String configPlace, World world) {
        return new Location(world, config.getInt(configPlace + ".x"), config.getInt(configPlace + ".y"), config.getInt(configPlace + ".z"));
    }

    public static Location getBlockLoc(FileConfiguration config, String configPlace) {
        return new Location(Bukkit.getWorld(config.getString(configPlace + ".world")), config.getInt(configPlace + ".x"), config.getInt(configPlace + ".y"), config.getInt(configPlace + ".z"));
    }

    public static void clearArmor(Player p) {
        p.getInventory().setHelmet(null);
        p.getInventory().setChestplate(null);
        p.getInventory().setLeggings(null);
        p.getInventory().setBoots(null);
    }public static void clearArmorDown(Player p) {
        p.getInventory().setChestplate(null);
        p.getInventory().setLeggings(null);
        p.getInventory().setBoots(null);
    }

    public static boolean isIn(int min, int max, int number) {
        return min <= number && number <= max;
    }

    public static void clearEffects(Player p, boolean nv) {
        for (PotionEffect effect : p.getActivePotionEffects()) {
            if(nv) {
                p.removePotionEffect(effect.getType());
                return;
            }
            if(!effect.getType().toString().equalsIgnoreCase("PotionEffectType[16, NIGHT_VISION]")) {
                p.removePotionEffect(effect.getType());
            }
        }
    }
    public static double calcString(String s) throws ScriptException {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");
        Object ob = engine.eval(s);
        double d;
        if(ob instanceof Double)
            d = (double) ob;
        else d = ((Integer) ob).doubleValue();
        return d;
    }
    public static boolean isNPC(Player p){
        return p.hasMetadata("NPC");
    }
    public static double get3dDistance(Location loc1, Location loc2) {
        return Math.sqrt(Math.pow(loc1.getX() - loc2.getX(), 2) + Math.pow(loc1.getY() - loc2.getY(), 2) + Math.pow(loc1.getZ() - loc2.getZ(), 2));
    }public static double get2dDistance(Location loc1, Location loc2) {
        return Math.sqrt(Math.pow(loc1.getX() - loc2.getX(), 2) + Math.pow(loc1.getZ() - loc2.getZ(), 2));
    }
    public static boolean atLeastOneEquals(Material m1, Material m2, Material m3, Material m4, Material m5, Material equal){
        return m1 == equal ||  m2 == equal || m3 == equal || m4 == equal || m5 == equal;
    }
    public static String toMinutes(int sec) {
        String s;
        if (sec % 60 >= 10) {
            s = (sec / 60) + ":" + (sec % 60);
        } else {
            s = (sec / 60) + ":0" + (sec % 60);
        }
        return s;
    }
    public static void addToConfigList(FileConfiguration con, String s, String configPlace) {
        List<String> list = con.getStringList(configPlace);
        list.add(s);
        con.set(configPlace, list);
    }
    public static void addToConfigList(FileConfiguration con, int i, String configPlace) {
        List<Integer> list = con.getIntegerList(configPlace);
        list.add(i);
        con.set(configPlace, list);
    }
    public static void removeFromConfigList(FileConfiguration con, String s, String configPlace) {
        List<String> list = con.getStringList(configPlace);
        list.remove(s);
        con.set(configPlace, list);
    }
    public static void removeFromConfigList(FileConfiguration con, int i, String configPlace) {
        List<Integer> list = con.getIntegerList(configPlace);
        list.remove(i);
        con.set(configPlace, list);
    }
    public static boolean isEnInCircularArea(Entity en, Location centre, int ray, int h){
        ArmorStand as = (ArmorStand) centre.getWorld().spawnEntity(centre, EntityType.ARMOR_STAND);
        as.setVisible(false);
        as.setGravity(false);
        boolean b = as.getNearbyEntities(ray, h, ray).contains(en) && en.getLocation().getY() >= centre.getY();
        as.remove();
        return b;
    }public static boolean isEnInArea(Entity en, ArrayList<Location> border, int h, boolean borderIn){
        return true;
    }
    public static ArrayList<Block> getBlocksNearLoc(Location loc, int sd){
        ArrayList<Block> blocks = new ArrayList<>();
        for (int y = (int) loc.getY() - sd; y <= loc.getY() + sd; y++) {
            for (int x = (int) loc.getX() - sd; x <= loc.getX() + sd; x++) {
                for (int z = (int) loc.getZ() - sd; z <= loc.getZ() + sd; z++) {
                    Location blLoc = new Location(loc.getWorld(), x, y, z);
                    Block b = blLoc.getBlock();
                    blocks.add(b);
                }
            }
        }
        return blocks;
    }
    public static boolean sendNoPermMess(Player p){
        p.sendMessage(ChatColor.RED + "I'm sorry, but you do not have permission to perform this command.");
        return true;
    }public static boolean sendUnKnownCommandMess(Player p){
        p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cAZ&3> &6Unknown command."));
        return true;
    }
    public static ArrayList<String> getCommaList(FileConfiguration config, String configPlace){
        String s = config.getString(configPlace);
        if(s == null){
            return new ArrayList<>();
        }
        return new ArrayList<>(Arrays.asList(s.toLowerCase().split(", ")));
    }public static void addToCommaList(FileConfiguration config, String configPlace, String value){
        String s = config.getString(configPlace);
        ArrayList<String> list;
        if(s != null) {
            String[] array = s.split(", ");
            list = new ArrayList<>(Arrays.asList(array));
        }else{
            list = new ArrayList<>();
        }
        list.add(value);
        String finalString = list.toString().replace("[", "").replace("]", "");
        config.set(configPlace, finalString);
    }public static void removeFromCommaList(FileConfiguration config, String configPlace, String value){
        String s = config.getString(configPlace);
        if(s == null) return;
        String[] array = s.split(", ");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(array));
        list.remove(value);
        String finalString = list.toString().replace("[", "").replace("]", "");
        config.set(configPlace, finalString);
    }
    public static boolean probability(int per){
        Random r = new Random();
        int res = r.nextInt(100) + 1;
        return res <= per;
    }public static void incConfigN(FileConfiguration config, String configPlace, int n){
        config.set(configPlace, config.getInt(configPlace) + n);
    }
    public static void openConfirmGui(Player p, String title, ItemStack item){
        Inventory confirm = Bukkit.createInventory(p, 18, title);
        createItem(Material.EMERALD_BLOCK, 5, ChatColor.GREEN + "Confirm", "", "", confirm, 2, 1);
        createItem(Material.REDSTONE_BLOCK, 14, ChatColor.RED + "Cancel", "", "", confirm, 6, 1);
        confirm.setItem(4, item);
        for (int i = 9; i < 18; i++) {
            createItem(Material.STAINED_GLASS_PANE, 7, ChatColor.DARK_GRAY + AZ_HUB.getInstance().getConfig().getString("ip"), "", "", confirm, i, 1);
        }
        p.openInventory(confirm);
    }
    public static void equipArmor(Player p, ItemStack armor){
        if(armor == null) return;
        Material type = armor.getType();
        if(type == Material.CHAINMAIL_HELMET || type == Material.LEATHER_HELMET || type == Material.IRON_HELMET || type == Material.DIAMOND_HELMET || type == Material.GOLD_HELMET)
            p.getInventory().setHelmet(armor);
        if(type == Material.CHAINMAIL_CHESTPLATE || type == Material.LEATHER_CHESTPLATE || type == Material.IRON_CHESTPLATE || type == Material.DIAMOND_CHESTPLATE || type == Material.GOLD_CHESTPLATE)
            p.getInventory().setChestplate(armor);
        if(type == Material.CHAINMAIL_LEGGINGS || type == Material.LEATHER_LEGGINGS || type == Material.IRON_LEGGINGS || type == Material.DIAMOND_LEGGINGS || type == Material.GOLD_LEGGINGS)
            p.getInventory().setLeggings(armor);
        if(type == Material.CHAINMAIL_BOOTS || type == Material.LEATHER_BOOTS || type == Material.IRON_BOOTS || type == Material.DIAMOND_BOOTS || type == Material.GOLD_BOOTS)
            p.getInventory().setBoots(armor);
    }
    public static void equipArmor(Player p, Material type){
        if(type == null) return;
        if(type == Material.CHAINMAIL_HELMET || type == Material.LEATHER_HELMET || type == Material.IRON_HELMET || type == Material.DIAMOND_HELMET || type == Material.GOLD_HELMET)
            p.getInventory().setHelmet(new ItemStack(type));
        if(type == Material.CHAINMAIL_CHESTPLATE || type == Material.LEATHER_CHESTPLATE || type == Material.IRON_CHESTPLATE || type == Material.DIAMOND_CHESTPLATE || type == Material.GOLD_CHESTPLATE)
            p.getInventory().setChestplate(new ItemStack(type));
        if(type == Material.CHAINMAIL_LEGGINGS || type == Material.LEATHER_LEGGINGS || type == Material.IRON_LEGGINGS || type == Material.DIAMOND_LEGGINGS || type == Material.GOLD_LEGGINGS)
            p.getInventory().setLeggings(new ItemStack(type));
        if(type == Material.CHAINMAIL_BOOTS || type == Material.LEATHER_BOOTS || type == Material.IRON_BOOTS || type == Material.DIAMOND_BOOTS || type == Material.GOLD_BOOTS)
            p.getInventory().setBoots(new ItemStack(type));
    }
    public static Material getArmor(String symbol){
        if (symbol == null) return null;
        symbol = symbol.toUpperCase();
        switch (symbol){
            case "L1": return Material.LEATHER_CHESTPLATE;
            case "L2": return Material.LEATHER_LEGGINGS;
            case "L3": return Material.LEATHER_BOOTS;
            case "I1": return Material.IRON_CHESTPLATE;
            case "I2": return Material.IRON_LEGGINGS;
            case "I3": return Material.IRON_BOOTS;
            case "G1": return Material.GOLD_CHESTPLATE;
            case "G2": return Material.GOLD_LEGGINGS;
            case "G3": return Material.GOLD_BOOTS;
            case "D1": return Material.DIAMOND_CHESTPLATE;
            case "D2": return Material.DIAMOND_LEGGINGS;
            case "D3": return Material.DIAMOND_BOOTS;
            case "C1": return Material.CHAINMAIL_CHESTPLATE;
            case "C2": return Material.CHAINMAIL_LEGGINGS;
            case "C3": return Material.CHAINMAIL_BOOTS;
        }
        return null;
    }
    public static String insertStringAtPosition(String original, String toInsert, int position) {
        return original.substring(0, position) + toInsert + original.substring(position);
    }
    public static ItemStack enchantItem(ItemStack item, Enchantment enchantment, int lvl){
        if(item == null) return null;
        ItemMeta meta = item.getItemMeta();
        meta.addEnchant(enchantment, lvl, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        return item;
    }
    public static ItemStack enchantMaterial(Material mat, Enchantment enchantment, int lvl){
        if(mat == null) return null;
        ItemStack item = new ItemStack(mat);
        ItemMeta meta = item.getItemMeta();
        meta.addEnchant(enchantment, lvl, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        return item;
    }
}