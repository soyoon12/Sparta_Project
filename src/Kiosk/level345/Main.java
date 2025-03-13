package Kiosk.level345;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.setMenu();

        Kiosk kiosk = new Kiosk();
        kiosk.start();

    }
}