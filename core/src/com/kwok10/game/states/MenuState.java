package com.kwok10.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.kwok10.game.FlappyBird;

public class MenuState extends State{
    private Texture bkgrnd;
    private Texture playBtn;

    public MenuState(GameStateManager g) {
        super(g);
        this.bkgrnd = new Texture("CS125.svg");
        playBtn = new Texture("Playbutton.png");
    }

    @Override
    public void dispose() {
        bkgrnd.dispose();
        playBtn.dispose();
    }

    @Override
    public void handleInput() {
        if (Gdx.input.justTouched()) {
            gsm.set(new PlayState(gsm));
            dispose();
        }
    }

    @Override
    public void update(float dt) {
        handleInput();

    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(bkgrnd, 0, 0, FlappyBird.WIDTH, FlappyBird.HEIGHT);
        sb.draw(playBtn, (FlappyBird.WIDTH / 2) - (playBtn.getWidth() / 2), (FlappyBird.HEIGHT / 2) - (playBtn.getHeight() / 2));
        sb.end();
    }


}
