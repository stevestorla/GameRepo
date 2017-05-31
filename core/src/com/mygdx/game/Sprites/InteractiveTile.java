package com.mygdx.game.Sprites;

import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TiledMapTile;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.badlogic.gdx.physics.box2d.World;

import static com.mygdx.game.SideScroller.PPM;

/**
 * Created by steven on 5/31/2017.
 */

public abstract class InteractiveTile {
    protected World world;
    protected TiledMap map;
    protected TiledMapTile tile;
    protected Rectangle bounds;
    protected Body body;
    public InteractiveTile(World world, TiledMap map, Rectangle bounds ) {
        this.world = world;
        this.map = map;
        this.bounds = bounds;
        BodyDef bdef = new BodyDef();
        FixtureDef fdef = new FixtureDef();
        PolygonShape shape = new PolygonShape();

        bdef.type = BodyDef.BodyType.StaticBody;
        bdef.position.set((bounds.getX() + bounds.getWidth() / 2) / PPM, (bounds.getY() + bounds.getHeight() / 2) / PPM);

        body = world.createBody(bdef);
        shape.setAsBox((bounds.getWidth() / 2) / PPM, (bounds.getHeight() / 2) / PPM);
        fdef.shape = shape;
        body.createFixture(fdef);

    }
}
