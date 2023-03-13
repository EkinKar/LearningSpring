package com.firstApp.Example.game;

public class GameRunner {
    MarioGame game;

    public GameRunner(MarioGame game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Running the game " + game);
        game.up();
        game.right();
    }
}
