package com.bespalov.shop.model;

public class Shop {
    private String title;
    private String city;
    private String address;

    public Shop(String title, String city, String address) {
        this.title = title;
        this.city = city;
        this.address = address;
    }

    public Shop() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "title='" + title + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
