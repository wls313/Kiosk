package kiosk.lv4;

public class MenuItem {
    // 이름, 가격, 설명 필드 선언하여 관리
    private String name;
    private double price;
    private String explain;

    public MenuItem(String name,double price,String explain) {
        this.price = price;
        this.explain = explain;
        this.name = name;
    }

    //setter
    public void setName(String name) {
        this.name = name;
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

    public double getPrice() { return price; }

    public String getExplain() { // 수정된 메서드 이름
        return explain;
    }

}