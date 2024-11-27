package kiosk.lv4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Menu 객체 생성하면서 카테고리 이름 설정
        Menu menu = new Menu();

        // ArrayList를 사용하여 Menu 객체를 관리
        List<Menu> menus = new ArrayList<>();

        // Menu 객체 생성
        /**
         * burger 메뉴
         */

        Menu burgerMenu = new Menu();
        burgerMenu.addMenuItem(new MenuItem("ShackBurger","burger",6.9,"토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgerMenu.addMenuItem(new MenuItem("SmokeShack","burger",8.9,"베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgerMenu.addMenuItem(new MenuItem("Cheeseburger","burger",6.9,"포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgerMenu.addMenuItem(new MenuItem("Hamburger","burger",5.4,"비프패티를 기반으로 야채가 들어간 기본버거"));
        menus.add(burgerMenu);

        Menu drinkMenu = new Menu();
        drinkMenu.addMenuItem(new MenuItem("smoothie","drink",4.5,"스무디"));
        drinkMenu.addMenuItem(new MenuItem("cola","drink",3.0,"콜라"));
        drinkMenu.addMenuItem(new MenuItem("zeroCola","drink",3.0,"제로콜라"));
        drinkMenu.addMenuItem(new MenuItem("cider","drink",3.0,"사이다"));
        menus.add(drinkMenu);

        Menu dessertMenu = new Menu();
        dessertMenu.addMenuItem(new MenuItem("applePie","dessert",3.0,"애플파이"));
        dessertMenu.addMenuItem(new MenuItem("eggTart","dessert",2.5,"에그타르트"));
        dessertMenu.addMenuItem(new MenuItem("frenchFries","dessert",2.0,"감자튀김"));
        dessertMenu.addMenuItem(new MenuItem("cheeseStrick","dessert",1.5,"치즈스틱"));
        menus.add(dessertMenu);

        // Kiosk 객체 생성
        Kiosk kiosk = new Kiosk(menus);

        // Kiosk 내 시작하는 함수 호출
        Kiosk.start();
    }

}
