package kr.co.dreamwing.lunchgo.domain;

public class Restaurant {

    String name;
    String address;
    public Restaurant(String name) {
        this.name = name;
    }

    public Restaurant(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Restaurant() {

    }

    public String getName() {
        return name;
    }

    public String getInfomation() {
        return name + " in " + address;
    }
}
