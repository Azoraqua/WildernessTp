package io.wildernesstp.portal;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;
import java.util.Objects;

/**
 * MIT License
 * <p>
 * Copyright (c) 2019 Quintin VanBooven
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
public class PortalEditSession {

    public static ItemStack WAND;

    static {
        ItemStack WAND = new ItemStack(Material.GOLDEN_AXE);
        ItemMeta WAND_META = Objects.requireNonNull(WAND.getItemMeta());
        WAND_META.setDisplayName("WildernessTP Portal Wand");
        WAND_META.setLore(Arrays.asList("§9Left-click to select point one.", "§9Right-click to select point two."));
        WAND_META.addItemFlags(ItemFlag.values());
        WAND.setItemMeta(WAND_META);

        PortalEditSession.WAND = WAND;
    }

    private final Player player;
    private Location posOne, posTwo;

    public PortalEditSession(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPosOne(Location posOne) {
        this.posOne = posOne;
    }

    public Location getPosOne() {
        return posOne;
    }

    public boolean isPosOneSet() {
        return posOne != null;
    }

    public void setPosTwo(Location posTwo) {
        this.posTwo = posTwo;
    }

    public Location getPosTwo() {
        return posTwo;
    }

    public boolean isPosTwoSet() {
        return posTwo != null;
    }
}
