package com.academy;

import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws IOException , InterruptedException {
        Rectangle rek1 = new Rectangle(new Point(3, 2), new Point(5, 6));
   /*
        //19.1

        Cat kissemiss = new Cat();
        Dog doggo = new Dog();
        kissemiss.makeSound();
        doggo.makeSound();
        Animal dog = doggo;
        ((Dog)dog).sit();


        //19.2

        Terminal terminal = new DefaultTerminalFactory().createTerminal();
        Screen screen = new TerminalScreen(terminal);
        screen.startScreen();

        List<Flake> shapes = new ArrayList<>();
        for (int i = 0;i<24*200;i++) {
            Random xRandom = new Random();
            int xFalling = xRandom.nextInt(80);
            int yFaling = -xRandom.nextInt(10000);
            shapes.add(new Flake(xFalling, yFaling));
        }
        UI snowflakes = new Snowflakes(screen);
        snowflakes.draw(shapes);
    }
}

*/      //20.1


        User id = new User();
        id.User(3);
        id.User(0);
        id.User(-1);

        //20.2
        TrafficLight tl = new TrafficLight();
        while(true) {
            tl.Tick();
            boolean red = tl.isRed();
            boolean yellow = tl.isYellow();
            boolean green = tl.isGreen();
            System.out.printf("RED: %b, YELLOW: %b, GREEN: %b%n", red, yellow, green);
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e)
            { System.out.println("Interrupted");
            }
        }
    }


}


