package io.wildernesstp.util;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TeleportManager {

    private static final List<UUID> moved = new ArrayList<>();
    private static final List<UUID> needToTeleport = new ArrayList<>();

    public static void addToTeleport(UUID uuid){
        needToTeleport.add(uuid);
    }

    public static boolean checkTeleport(UUID uuid){
        return needToTeleport.contains(uuid);
    }

    public static void moved(UUID uuid){
        if(!moved.contains(uuid)){
            moved.add(uuid);
            needToTeleport.remove(uuid);
        }
    }

    public static void removeAll(UUID uuid){
        moved.remove(uuid);
        needToTeleport.remove(uuid);
    }

    public static void noMoney(UUID uuid){
        needToTeleport.remove(uuid);
    }
}
