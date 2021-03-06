package com.bespalov.shop.database;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Connection {
    private java.sql.Connection connection;
    private String login = "root";
    private String password = "root";
    private String url = "jdbc:mysql://localhost:3306/shop_store";
    private Statement statement;
    private PreparedStatement preparedStatement;

    public Connection() throws ClassNotFoundException {
        try {
            connection = DriverManager.getConnection(url, login, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Statement initConnection() {
        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return statement;
    }

    public PreparedStatement getPreparedStatement(String msg) {
        try {
            preparedStatement = connection.prepareStatement(msg);
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return preparedStatement;
    }
}
