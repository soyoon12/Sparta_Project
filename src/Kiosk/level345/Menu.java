package Kiosk.level345;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    //역할: 메뉴 아이템 받아오기 및 다형성? -> 버거 디저트등
    //속성

    private int getMenu_Index;
    // MenuItem 클래스를 List로 관리

    private static List<List<MenuItem>> menu = new ArrayList<List<MenuItem>>();
    private static List<MenuItem> BurgerItems = new ArrayList<>();
    private static List<MenuItem> DrinksItems = new ArrayList<>();
    private static List<MenuItem> DessertsItems = new ArrayList<>();


    //게터세터 menulist에 메뉴 넣기
    public void setMenu() {
        menu.add(BurgerItems);
        menu.add(DrinksItems);
        menu.add(DessertsItems);
        BurgerItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        BurgerItems.add(new MenuItem("SmokeShack",8.9,"베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        BurgerItems.add(new MenuItem("Cheese burger",6.9,"포테이토 번과 비프패티, 치즈가 토핑된 치즈 버거"));
        BurgerItems.add(new MenuItem("Hamburger ",5.4,"비프패티를 기반으로 야채가 들어간 기본버거"));

    }
//    public void getMenu() {
//        for (List<MenuItem> menulist : menu) {
//            int index = 1;
//            System.out.println(index + ". " + menulist.name + " | w " + menulist.price + " | " + menulist.description);
//            index++;
//        }
//    }

    //세부항목 메뉴에
    //버거 세부항목 가져오기
    public void getBurger() {
        int index = 1;

        for (MenuItem menulist : BurgerItems) {

            System.out.println(index + ". " + menulist.name + " | w " + menulist.price + " | " + menulist.description);
            index++;
        }
    }

    //마실것 세부항목
    public void getDrinks() {
        int index = 1;
        for (MenuItem menulist : DrinksItems) {

            System.out.println(index + ". " + menulist.name + " | w " + menulist.price + " | " + menulist.description);
            index++;
        }
    }

    //디저트 세부항목
    public void getDesserts() {
        int index = 1;
        for (MenuItem menulist : DessertsItems) {
            System.out.println(index + ". " + menulist.name + " | w " + menulist.price + " | " + menulist.description);
            index++;
        }
    }

    //세부내용 불러오기
    public void getmenuItmes_01(int index){
        this.getMenu_Index = index-1;
        MenuItem menuitem =this.BurgerItems.get(getMenu_Index);

        System.out.println("선택한 메뉴 : " + menuitem.name + " | w " + menuitem.price + " | " + menuitem.description);
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");

    }

    public void getmenuItmes_02(int index){
        this.getMenu_Index = index-1;
        MenuItem menuitem =this.DrinksItems.get(getMenu_Index);

        System.out.println("선택한 메뉴 : " + menuitem.name + " | w " + menuitem.price + " | " + menuitem.description);

    }

    public void getmenuItmes_03(int index){
        this.getMenu_Index = index-1;
        MenuItem menuitem =this.DessertsItems.get(getMenu_Index);

        System.out.println("선택한 메뉴 : " + menuitem.name + " | w " + menuitem.price + " | " + menuitem.description);

    }
}