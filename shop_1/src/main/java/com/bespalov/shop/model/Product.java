package com.bespalov.shop.model;

import com.bespalov.shop.repository.ElementRepository;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@IdClass(ProductPK.class)
@XmlType(name = "product")
public class Product implements ElementRepository{
    private String title;
    private String incomingDate;
    private String serialNumber;
    private int idProduct;
    private int shopId;
    private int count;
    private String condition;

    public Product(String title, String incomingDate, String serialNumber, int count, String condition) {
        this.title = title;
        this.incomingDate = incomingDate;
        this.serialNumber = serialNumber;
        this.count = count;
        this.condition = condition;
    }

    public Product() {
    }

    @Basic
    @Column(name = "Title", nullable = false, length = 100)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "Incoming_date", nullable = false)
    public String getIncomingDate() {
        return incomingDate;
    }

    public void setIncomingDate(String incomingDate) {
        this.incomingDate = incomingDate;
    }

    @Basic
    @Column(name = "Serial_number", nullable = false, length = 50)
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

    @Id
    @Column(name = "ID_Product", nullable = false)
    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    @Id
    @Column(name = "Shop_id", nullable = false)
    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    @Basic
    @Column(name = "Count", nullable = false)
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Basic
    @Column(name = "Condition", nullable = false, length = 50)
    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Product product = (Product) object;

        if (idProduct != product.idProduct) return false;
        if (shopId != product.shopId) return false;
        if (count != product.count) return false;
        if (title != null ? !title.equals(product.title) : product.title != null) return false;
        if (incomingDate != null ? !incomingDate.equals(product.incomingDate) : product.incomingDate != null)
            return false;
        if (serialNumber != null ? !serialNumber.equals(product.serialNumber) : product.serialNumber != null)
            return false;
        if (condition != null ? !condition.equals(product.condition) : product.condition != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idProduct;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (incomingDate != null ? incomingDate.hashCode() : 0);
        result = 31 * result + (serialNumber != null ? serialNumber.hashCode() : 0);
        result = 31 * result + shopId;
        result = 31 * result + count;
        result = 31 * result + (condition != null ? condition.hashCode() : 0);
        return result;
    }
}
