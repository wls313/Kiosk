package kiosk.lv4;

public class MenuItem {
    // 이름, 가격, 설명 필드 선언하여 관리
    private String name;
    private double price;
    private String explain;
    private String type;

    public MenuItem(String name,String type,double price,String explain) {
        this.price = price;
        this.explain = explain;
        this.type = type;
        if (type.equalsIgnoreCase("burger")) {
            this.name = name; // burger name
        } else if (type.equalsIgnoreCase("dessert")) {
            this.name = name; // dessert name
        } else if (type.equalsIgnoreCase("drink")) {
            this.name = name; // dessert name
        } else {
            throw new IllegalArgumentException("Invalid type: " + type);
        }
    }

    // 구조에 맞게 함수를 선언해놓고 가져다 사용하세요.
    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }
    //getter
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }


    public double getPrice() {
        return price;
    }

    public String getExplain() { // 수정된 메서드 이름
        return explain;
    }

}