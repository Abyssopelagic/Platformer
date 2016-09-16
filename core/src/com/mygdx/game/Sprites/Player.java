package com.mygdx.game.Sprites;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.*;
import com.mygdx.game.PreGame;

/**
 * Created by ksbay on 9/15/2016.
 */
public class Player extends Sprite {

    public World world;
    public Body b2Body;

    public Player(World world) {
        this.world = world;
        definePlayer();
    }

    public void definePlayer() {
        BodyDef bdef = new BodyDef();
        bdef.position.set(32 / PreGame.PPM, 32 / PreGame.PPM);
        bdef.type = BodyDef.BodyType.DynamicBody;
        b2Body = world.createBody(bdef);

        FixtureDef fdef = new FixtureDef();
        CircleShape shape = new CircleShape();

        shape.setRadius(5 / PreGame.PPM);

        fdef.shape = shape;
        b2Body.createFixture(fdef);
    }
}
