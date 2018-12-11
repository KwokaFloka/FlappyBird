package com.kwok10.game.states;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.Stack;

public class GameStateManager {

    private Stack<State> states;

    public GameStateManager() {
        this.states = new Stack<State>();
    }

    public void push(State state) {
        this.states.push(state);
    }

    public void pop() {
        states.pop();
    }
    public void set(State state) {
        states.pop();
        this.states.push(state);
    }

    public void updates(float dt) {
        this.states.peek().update(dt);
    }
    public void render(SpriteBatch sb) {
        this.states.peek().render(sb);
    }
}
