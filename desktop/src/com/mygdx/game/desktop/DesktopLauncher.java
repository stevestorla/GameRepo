package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.SideScroller;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Framerate test";
		config.width = 1280;
		config.height = 720;
		config.fullscreen = false;

		config.vSyncEnabled = false; // Setting to false disables vertical sync
		config.foregroundFPS = 80; // Setting to 0 disables foreground fps throttling
		config.backgroundFPS = 80; // Setting to 0 disables background fps throttling
		config.forceExit = true;
		config.vSyncEnabled = false;
		new LwjglApplication(new SideScroller(), config);

	}
}
