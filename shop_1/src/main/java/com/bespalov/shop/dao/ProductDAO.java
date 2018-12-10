package com.bespalov.shop.dao;

import com.bespalov.shop.model.Product;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface ProductDAO {
    public void addProduct(Product product);

    public void updateProduct(Product product);

    public void deleteProduct(String title);

    public Product getProduct(String title);

    public List<Product> getAllProduct();

    public void deleteAllProduct();
}
