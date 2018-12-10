package com.bespalov.shop.impl;

import com.bespalov.shop.config.Commands;
import com.bespalov.shop.dao.ProductDAO;
import com.bespalov.shop.database.Connection;
import com.bespalov.shop.model.Product;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDAOImpl implements ProductDAO {
    private Connection connection;
    private Commands commands;

    public ProductDAOImpl() throws ClassNotFoundException {
        connection = new Connection();
        commands = new Commands();
    }

    public void addProduct(Product product) {


    }

    public void updateProduct(Product product) {

    }

    public void deleteProduct(String title) {

    }

    public Product getProduct(String title) {
        Product product = null;
        try {
            ResultSet set = connection.initConnection().executeQuery(commands.getProduct("'" + title + "'"));
            while (set.next()) {
                product = new Product(set.getString("Title"), set.getDate("Incoming_date"), set.getString("Serial_number"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return product;
    }

    public List<Product> getAllProduct() {
        List<Product> list = new ArrayList<>();
        try {
            ResultSet set = connection.initConnection().executeQuery(commands.getAllProduct());
            while (set.next()) {
                list.add(new Product(set.getString("Title"), set.getDate("Incoming_date"), set.getString("Serial_number")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (list.isEmpty())
                list.clear();
        }
        return list;
    }

    public void deleteAllProduct() {

    }
}
