package com.mygdx.game;

import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g3d.particles.values.PrimitiveSpawnShapeValue;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.badlogic.gdx.scenes.scene2d.utils.Layout;
import com.badlogic.gdx.utils.Scaling;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.ScalingViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

public class MainMenu implements Screen {

    private PreGame game;
    public BitmapFont font;

    private OrthographicCamera camera;
    private Viewport viewport;
    private GlyphLayout layout;

    public MainMenu(PreGame game) {
        this.game = game;
        font = new BitmapFont(Gdx.files.internal("pixelfont.fnt"),Gdx.files.internal("pixelfont.png"),false);
        font.setColor(Color.BLACK);

        camera = new OrthographicCamera();
        viewport = new FitViewport(PreGame.V_WIDTH / PreGame.PPM, PreGame.V_HEIGHT / PreGame.PPM, camera);
        layout = new GlyphLayout(font, "Click to Start Game");
    }

    @Override
    public void show() {
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        game.batch.begin();
        font.draw(game.batch, "Click to Start Game", viewport.getScreenWidth() / 2 - layout.width / 2, viewport.getScreenHeight() / 2 + 50);
        game.batch.end();

        if(Gdx.input.isTouched()){
            game.setScreen(new MainGame(game));
        }
    }

    @Override
    public void resize(int width, int height) {
        viewport.update(width, height);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
    }

}
