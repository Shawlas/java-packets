package com.ghostface.dev;

import com.ghostface.dev.impl.JChatServer;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

import java.net.InetSocketAddress;


public class ServerApp {
    public static void main(String[] args) throws IOException {
        @NotNull InetSocketAddress address = new InetSocketAddress("0.0.0.0",5551);
        JChatServer chatServer = new JChatServer(address);

        try {
            chatServer.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
