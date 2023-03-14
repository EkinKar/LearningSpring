package com.firstApp.Example;

import com.firstApp.Example.game.GameRunner;
import com.firstApp.Example.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {
    public static void main(String[] args) {
        try (var context =
                     new AnnotationConfigApplicationContext
                             (GamingConfig.class)) {
            context.getBean(GamingConsole.class).up();

            context.getBean(GameRunner.class).run();
        }
    }
}
