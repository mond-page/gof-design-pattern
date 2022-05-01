package com.mond.gofdesignpattern.bridge.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("org.h2.Driver");

        try (Connection conn = DriverManager.getConnection("jdbc:h2:mem:~/test", "sa", "")) {

            String sql = "CREATE TABLE ACCOUNT" +
                    "(id INTEGER NOT NULL," +
                    "email VARCHAR(255)," +
                    "password VARCHAR(255)," +
                    "PRIMARY KEY (id))";

            Statement statement = conn.createStatement();
            statement.execute(sql);

//            PreparedStatement statement1 = conn.prepareStatement(sql);
//            ResultSet resultSet = statement.getResultSet();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
