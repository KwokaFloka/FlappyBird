package com.kwok10.game.sprites;

import com.badlogic.gdx.graphics.Texture;

public class Tube {
    private Texture topTube, bottomTube;

    public Tube(float x) {
        topTube = new Texture("toptube.png");
        bottomTube = new Texture("bottomtube.png");
    }
}
