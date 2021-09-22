package com.star.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector2;

public class Asteroid {
    private Texture texture;
    private Vector2 position;
    private Vector2 lastDisplacement;
    private float angel;

    public Asteroid(float dt) {
        this.texture = new Texture("asteroid.png");
        this.position = new Vector2(MathUtils.random(-200, ScreenManager.SCREEN_WIDTH +200),
                MathUtils.random(-200, ScreenManager.SCREEN_HEIGHT + 200));
        this.lastDisplacement = new Vector2(0,0);
        this.angel = MathUtils.random(0.0f, 360.0f);
    }

    public void render(SpriteBatch batch) {
        batch.draw(texture, position.x - 128, position.y - 128, 128, 128, 256, 256,
                1, 1, 0, 0, 0, 256, 256, false, false);
//        batch.draw(texture, position.x - 32, position.y - 32, 32, 32, 64, 64,
//                1, 1,
//                angel, 0, 0, 64, 64, false, false);
    }

    public void update(float dt){

        if (position.x < -100) {
            position.x = ScreenManager.SCREEN_WIDTH + 100;
            position.y = lastDisplacement.y; //+= MathUtils.sinDeg(angel) * 60.0f * dt;

        }
        if (position.x > ScreenManager.SCREEN_WIDTH + 100) {
            position.x = -100;
            position.y = lastDisplacement.y; //+= MathUtils.sinDeg(angel) * 60.0f * dt;

        }
        if (position.y < -100) {
            position.y = ScreenManager.SCREEN_HEIGHT + 100;
            position.x = lastDisplacement.x; //+= MathUtils.cosDeg(angel) * 60.0f * dt;

        }
        if (position.y > ScreenManager.SCREEN_HEIGHT + 100) {
            position.y = -100;
            position.x = lastDisplacement.x; //+= MathUtils.cosDeg(angel) * 60.0f * dt;

        }
        position.x += MathUtils.cosDeg(angel) * 60.0f * dt;
        position.y += MathUtils.sinDeg(angel) * 60.0f * dt;
        lastDisplacement.set(MathUtils.cosDeg(angel) * 60.0f * dt, MathUtils.sinDeg(angel) * 60 * dt);


//        position.x += MathUtils.cosDeg(angel) * 240.0f * dt;
//        position.y += MathUtils.sinDeg(angel) * 240.0f * dt;
//        lastDisplacement.set(MathUtils.cosDeg(angel) * 240.0f * dt,
//                MathUtils.sinDeg(angel) * 240.0f * dt);
//        if (position.x < -200) {
//            position.x = ScreenManager.SCREEN_WIDTH + 200;
//            position.y = MathUtils.random(-200, ScreenManager.SCREEN_HEIGHT + 200);
//            scale = Math.abs(velocity.x) / 40f * 0.8f;

    }
}
