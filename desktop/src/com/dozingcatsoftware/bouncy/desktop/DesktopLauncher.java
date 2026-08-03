package com.dozingcatsoftware.bouncy.desktop;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.dozingcatsoftware.bouncy.Bouncy;

public class DesktopLauncher {
    public static void main(String[] args) {
        Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
        config.setTitle("Vector Pinball");
        config.setWindowedMode(480, 800);
        config.useVsync(true);
        config.setForegroundFPS(60);
        new Lwjgl3Application(new Bouncy(), config);
    }
}
