package kiosk.lv4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private List<Menu> menus;  // MenuItem을 관리하는 리스트
    private Scanner scanner;

    public Kiosk(List<Menu> menus) {
        this.menus = menus;
        scanner = new Scanner(System.in);
    }

    public void start() {
        // 스캐너 선언
        System.out.println("[ MAIN MENU ]");
        System.out.println("1. Burger");
        System.out.println("2. Drink");
        System.out.println("3. Desserts");
        System.out.println("0. 종료    | 종료");

        // 숫자 입력 받기
        int order = scanner.nextInt();
        int num = 1;
        // 입력 받은 숫자가 올바르다면 인덱스로 활용하여 List에 접근하기
        if (order >= 1 && order <= 3) {
            Menu selectedMenu = menus.get(order - 1);
            List<MenuItem> chooseMenu = new ArrayList<>(); // 필터링된 항목을 저장할 리스트
            List<MenuItem> menuItems = selectedMenu.getMenuItems();
            for (MenuItem item : menuItems) {
                String menuName = String.format("%-13s", item.getName());
                System.out.println(num+ ". " + menuName + "| W " + item.getPrice() + " | " + item.getExplain());
                chooseMenu.add(item);
                num ++;
            }
            System.out.println("0. 뒤로가기");

            order = scanner.nextInt();

            if (order > 0 && order <= chooseMenu.size()) { // 유효한 입력인지 확인
                MenuItem selectedItem = chooseMenu.get(order - 1); // 선택된 항목 가져오기
                System.out.println("선택한 메뉴: " + selectedItem.getName() + " | W " + selectedItem.getPrice() + " | " + selectedItem.getExplain());
            } else if (order == 0) {
                start();
            } else {
                System.out.println("입력값이 잘못됐습니다.");
            }
        }
    }
}
