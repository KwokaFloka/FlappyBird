package com.kwok10.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.kwok10.game.FlappyBird;
import com.kwok10.game.sprites.Bird;

public class PlayState extends State {
    private Bird bird;
    private Texture bg;
    public PlayState(GameStateManager g) {
        super(g);
        bird = new Bird(50, 300);
        cam.setToOrtho(false, FlappyBird.WIDTH / 2, FlappyBird.HEIGHT / 2);
        this.bg = new Texture("bkgrnd.png");
    }

    @Override
    protected void handleInput() {
        if (Gdx.input.justTouched()) {
            bird.jump();
        }
    }

    @Override
    public void update(float dt) {
        handleInput();
        bird.update(dt);
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.setProjectionMatrix(cam.combined);
        sb.begin();
        sb.draw(bg, cam.position.x - (cam.viewportWidth / 2), 0, bg.getWidth() / 1.5f, bg.getHeight() / 1.6f);
        sb.draw(bird.getTexture(), bird.getPos().x, bird.getPos().y, bird.getTexture().getWidth() / 4, bird.getTexture().getHeight() / 4);
        sb.end();
    }

    @Override
    public void dispose() {

    }
}
