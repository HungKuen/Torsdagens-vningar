package com.academy;

import javafx.scene.effect.Light;

public class TrafficLight implements TrafficLightInterface {
    boolean red;
    boolean redyellow;
    boolean yellow;
    boolean green;
    LightState state = LightState.start;

    @Override
    public void Tick() {
        switch (state) {

            case start:
                System.out.println("Starting...");
                state = LightState.red;
                break;
            case red:
                System.out.println("Red");
                state = LightState.redyellow;
                green = false;
                yellow= false;
                red = true;
                break;
            case redyellow:
                System.out.println("RedYellow");
                state = LightState.yellow;
                green = false;
                yellow= true;
                red = true;
                break;
            case yellow:
                System.out.println("Yellow");
                state = LightState.green;
                green = false;
                yellow = true;
                red = false;
                break;
            case green:
                System.out.println("Green");
                state = LightState.red;
                green = true;
                yellow = false;
                red = false;

                break;
        }

    }

    @Override
    public boolean isRed() {
        return red;
    }

    @Override
    public boolean isGreen() {
        return green;
    }

    @Override
    public boolean isYellow() {
        return yellow;
    }
}
