package com.bespalov.shop.config;

import com.bespalov.shop.dao.CommandDAO;
import com.bespalov.shop.model.Product;
import com.bespalov.shop.model.Shop;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class Commands implements CommandDAO {
    private Properties properties;
    private Path path;

    public Commands() {
        path = Paths.get("shop_1/src/main/resources/command.properties");
        properties = new Properties();
        try {
            properties.load(new FileInputStream(path.toFile()));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    @Override
    public String getAllProduct() {
        String msg = properties.getProperty("select.all.products");
        msg = String.format(msg, "title", "incoming_date", "serial_number", "product");
        return msg;
    }

    @Override
    public String getProduct(String title) {
        String msg = properties.getProperty("select.one.product");
        msg = String.format(msg, "title", "incoming_date", "serial_number", title);
        return msg;
    }

    //TODO proceed init source
    @Override
    public String addProduct(Product product) {
        String msg = properties.getProperty("add.one.product");
        msg = String.format(msg, "title", "incoming_date", "serial_number");
        return msg;
    }

    @Override
    public String updateProduct(Product product) {
        String msg = properties.getProperty("update.one.product");
        msg = String.format(msg, "title", "incoming_date", "serial_number");
        return msg;
    }

    @Override
    public String deleteProduct(String title) {
        String msg = properties.getProperty("select.all.products");
        msg = String.format(msg, "title", "incoming_date", "serial_number");
        return msg;
    }

    @Override
    public String getAllShop() {
        String msg = properties.getProperty("select.all.products");
        msg = String.format(msg, "title", "incoming_date", "serial_number");
        return msg;
    }

    @Override
    public String getShop(String title) {
        String msg = properties.getProperty("select.all.products");
        msg = String.format(msg, "title", "incoming_date", "serial_number");
        return msg;
    }

    @Override
    public String addShop(Shop shop) {
        String msg = properties.getProperty("select.all.products");
        msg = String.format(msg, "title", "incoming_date", "serial_number");
        return msg;
    }

    @Override
    public String updateShop(Shop shop) {
        String msg = properties.getProperty("select.all.products");
        msg = String.format(msg, "title", "incoming_date", "serial_number");
        return msg;
    }

    @Override
    public String deleteShop(String title) {
        String msg = properties.getProperty("select.all.products");
        msg = String.format(msg, "title", "incoming_date", "serial_number");
        return msg;
    }
}
