package com.firstApp.Example.game;

public class GameRunner {
    private GamingConsole game;

    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Running the game " + game);
        game.up();
        game.right();
    }
}
