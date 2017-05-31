package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.Screens.PlayScreen;

public class SideScroller extends Game {
	public static final int V_WIDTH = 800;
	public static final int V_HEIGHT = 400;
	public static final float PPM = 100;

	public SpriteBatch batch;
    private Music music;
	@Override
	public void create () {
        music = Gdx.audio.newMusic(Gdx.files.internal("01 game-game_0.ogg"));
        music.setLooping(true);
        music.setVolume(0.5f);
        music.play();
		batch = new SpriteBatch();
		setScreen(new PlayScreen(this));
	}

    @Override
    public void dispose() {
        super.dispose();
        music.dispose();
    }

    @Override
	public void render () {
		super.render();
	}
}
