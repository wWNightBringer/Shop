package com.bespalov.shop;

import com.bespalov.shop.config.Factory;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLData;

//TODO how install database.sql
public class MainPane {

    public static void main(String[] args) throws ClassNotFoundException {
        Factory factory = new Factory();
        factory.showProduct();

    }


    public void start(Stage primaryStage) {

    }
}
