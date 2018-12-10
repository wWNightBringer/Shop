package com.bespalov.shop.database;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connection {
    private java.sql.Connection connection;
    private String login = "root";
    private String password = "root";
    private String url = "jdbc:mysql://localhost:3306/shop_store";
    private Statement statement;

    public Connection() throws ClassNotFoundException {

    }

    public Statement initConnection() {
        try {
            connection = DriverManager.getConnection(url, login, password);
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return statement;
    }
}
