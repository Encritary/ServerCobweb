package com.mrgenga.servercobweb.network;

import com.mrgenga.servercobweb.Player;


/**
 * author: MagicDroidX
 * Nukkit Project
 */
public interface SourceInterface {

    Integer putPacket(Player player, byte[] buffer);

    Integer putPacket(Player player, byte[] buffer, boolean needACK);

    Integer putPacket(Player player, byte[] buffer, boolean needACK, boolean immediate);

    void close(Player player);

    void close(Player player, String reason);

    void setName(String name);

    boolean process();

    void shutdown();

    void emergencyShutdown();
}
