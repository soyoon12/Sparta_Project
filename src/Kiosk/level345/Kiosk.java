package Kiosk.level345;

import Kiosk.level2.MenuItem;

import java.util.Scanner;

public class Kiosk {
    //메뉴 받아서 보여주는 역할
    //속성

    Menu menu = new Menu();
    boolean while_input= true;
    //메소드
    public void start(){

        Scanner scanner = new Scanner(System.in);

        while(while_input){

            System.out.println("[MAIN MENU]");
            System.out.println("1. Burgers");
            System.out.println("2. Drinks");
            System.out.println("3. Desserts");
            System.out.println("0. 종료     | 종료 ");

            int choice_main = scanner.nextInt();

            switch(choice_main){

                case 1:
                    System.out.println("[BURGER MENU]");
                    menu.getBurger();
                    System.out.println("0. 뒤로가기");
                    int choice_burger = scanner.nextInt();
                    menu.getmenuItmes_01(choice_burger);
                    if(choice_burger==0){
                    break;
                    }
                    break;


                case 2:
                    System.out.println("[DRINKS MENU]");
                    menu.getDrinks();
                    System.out.println("0. 뒤로가기");
                    int choice_drinks = scanner.nextInt();
                    menu.getmenuItmes_02(choice_drinks);
                    if(choice_drinks==0){
                        break;
                    }
                    break;


                case 3:
                    System.out.println("[DESSERTS MENU]");
                    menu.getDesserts();
                    System.out.println("0. 뒤로가기");
                    int choice_desserts = scanner.nextInt();
                    menu.getmenuItmes_03(choice_desserts);
                    if(choice_desserts==0){
                        break;
                    }
                    break;

                default:
                    System.out.println("다시 선택해 주세요");

                case 0:
                    System.out.println("프로그램을 종료합니다");
                    while_input=false;
            }


        }

    }
}


