package com.in28minutes.learnspringframework;

import org.springframework.boot.SpringApplication;
import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {
        var marioGame= new MarioGame();
        var gameRunner=new GameRunner(marioGame);
        gameRunner.run();
    }
}
