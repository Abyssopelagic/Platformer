package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by ksbay on 8/27/2016.
 */
public class PreGame extends Game {

    public SpriteBatch batch;

    public final static int V_WIDTH = 400;
    public final static int V_HEIGHT = 208;
    public static final float PPM = 100;

    @Override
    public void create(){
        batch = new SpriteBatch();
        setScreen(new MainMenu(this));
    }
    @Override
    public void render(){
        super.render();
    }
}
