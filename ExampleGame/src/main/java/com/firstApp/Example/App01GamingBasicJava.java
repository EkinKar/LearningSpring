package com.firstApp.Example;

import com.firstApp.Example.game.GameRunner;
import com.firstApp.Example.game.PacmanGame;

public class App01GamingBasicJava {
    public static void main(String[] args) {

        //var game = new SuperContraGame();
        //var game = new MarioGame();
        var game = new PacmanGame(); // Object creation
        var gameRunner = new GameRunner(game); // Object creation + wiring of dependencies
        //Game is a dependency of GameRunner
        gameRunner.run();
    }
}
