package com.bespalov.shop.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Product {
    private String title;
    private Date incomingDate;
    private String serialNumber;

    public Product(String title, Date incomingDate, String serialNumber) {
        this.title = title;
        this.incomingDate = incomingDate;
        this.serialNumber = serialNumber;
    }

    public Product() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getIncomingDate() {
        return incomingDate;
    }

    public void setIncomingDate(Date incomingDate) {
        this.incomingDate = incomingDate;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", incomingDate=" + incomingDate +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }
}
