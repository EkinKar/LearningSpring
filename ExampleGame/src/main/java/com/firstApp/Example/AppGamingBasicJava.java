package com.firstApp.Example;

import com.firstApp.Example.game.GameRunner;
import com.firstApp.Example.game.MarioGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {


        var marioGame = new MarioGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();
    }
}
