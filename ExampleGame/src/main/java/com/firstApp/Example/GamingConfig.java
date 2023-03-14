package com.firstApp.Example;

import com.firstApp.Example.game.GameRunner;
import com.firstApp.Example.game.GamingConsole;
import com.firstApp.Example.game.PacmanGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfig {

    @Bean
    public GamingConsole game() {
        var game = new PacmanGame();
        return game;
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        return new GameRunner(game);
    }
}
