package kiosk.lv4;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<MenuItem> menuItems;
    // MenuItem 클래스를 List로 관리
    public Menu() {
        this.menuItems = new ArrayList<>();
    }

    // List에 들어있는 MenuItem을 순차적으로 보여주는 함수
    public void addMenuItem(MenuItem item) {
        menuItems.add(item);
    }
    // List를 리턴하는 함수

    public List<MenuItem> getMenuItems() { // 추가된 메서드
        return menuItems;
    }
}