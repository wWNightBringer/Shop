package com.bespalov.shop;

import com.bespalov.shop.dao.ProductDAO;
import com.bespalov.shop.impl.ProductDAOImpl;

import java.util.ArrayList;
import java.util.List;

public class Factory {
    private List<ProductDAO> productDAOList;

    public Factory() throws ClassNotFoundException {
        productDAOList = new ArrayList<>();
        productDAOList.add(new ProductDAOImpl());
    }

    public void showProduct() {
        for (ProductDAO dao : productDAOList) {
            System.out.println(dao.getAllProduct());
        }

    }
}
