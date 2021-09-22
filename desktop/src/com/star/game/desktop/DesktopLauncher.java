package com.star.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.star.game.StarGame;

public class DesktopLauncher {

	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = 1280;
		config.height = 720;
		new LwjglApplication(new StarGame(), config);

	}
//	1. Разобраться с кодом
//2. Сделать по кнопке S движение назад с уменьшенной скоростью
//3. Сделать астероид, который летает в произвольную сторону и пересекает экран( и появляется с другой стороны)

}
