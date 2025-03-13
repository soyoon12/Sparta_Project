package Kiosk.level2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String name="";
        String descrption = "";
        double price = 0;
        int index=1;
        List<MenuItem> list = new ArrayList<>();

        list.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        list.add(new MenuItem("SmokeShack",8.9,"베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        list.add(new MenuItem("Cheese burger",6.9,"포테이토 번과 비프패티, 치즈가 토핑된 치즈 버거"));
        list.add(new MenuItem("Hamburger ",5.4,"비프패티를 기반으로 야채가 들어간 기본버거"));
        while(true){
            System.out.println("[SHEAKESHACK MENU]");

            for(MenuItem menulist : list){

                System.out.println(index+". "+menulist.name+" | w "+menulist.price+" | "+menulist.description);
                index++;
            }

            System.out.println("0. 종료     | 종료 ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            if(choice==0){
                System.out.println("프로그램을 종료합니다");
                break;
            }
        }


    }
}