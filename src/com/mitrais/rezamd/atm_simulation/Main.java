package com.mitrais.rezamd.atm_simulation;

import com.mitrais.rezamd.atm_simulation.enumerator.ScreenTypeEnum;
import com.mitrais.rezamd.atm_simulation.screen.Screen;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Screen currentScreen = Screen.getScreen(ScreenTypeEnum.WELCOME_SCREEN);
        while (true) {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            currentScreen = Screen.getScreen(currentScreen.displayScreen());
        }
    }
}