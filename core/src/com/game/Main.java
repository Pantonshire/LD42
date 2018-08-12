package com.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.game.graphics.Layer;
import com.game.graphics.TextureManager;
import com.game.profile.Profile;
import com.game.profile.ProfileFactory;

public class Main extends ApplicationAdapter {

	Layer testLayer;
	Profile testProfile;
	
	@Override
	public void create() {
        testLayer = new Layer(1f);
        testProfile = ProfileFactory.INSTANCE.newLegitimate();
	}

	@Override
	public void render() {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        if(Gdx.input.isKeyJustPressed(Input.Keys.SPACE)) {
            testProfile = ProfileFactory.INSTANCE.newLegitimate();
        }

        testLayer.beginSprites();
        testProfile.drawFace(testLayer, 0, 0);
        testLayer.finishSprites();
	}
	
	@Override
	public void dispose() {
		testLayer.dispose();
	}
}
