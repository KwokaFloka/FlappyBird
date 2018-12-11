package com.kwok10.game.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector3;

public class Bird {
    private static final int GRAVITY = -15;
    private Vector3 pos;
    private Vector3 vel;
    private Texture bird;

    public Bird(int x, int y) {
        this.pos = new Vector3(x, y, 0);
        this.vel = new Vector3(0,0,0);
        this.bird = new Texture(("Bird.png"));
    }

    public void update(float dt) {
        if (pos.y > 0) {
            this.vel.add(0, GRAVITY, 0);
        }
        this.vel.scl(dt);
        this.pos.add(0, this.vel.y, 0);
        if (pos.y < 0) {
            pos.y = 0;
        }
        this.vel.scl(1/dt);
    }

    public Vector3 getPos() {
        return pos;
    }

    public void setPos(Vector3 pos) {
        this.pos = pos;
    }

    public Texture getTexture() {
        return bird;
    }

    public void setTexture(Texture bird) {
        this.bird = bird;
    }

    public void jump() {
        this.vel.y = 250;
    }
}
