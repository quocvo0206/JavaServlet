package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
    public Connection connect(){

        String url = "jdbc:mysql://localhost:3306/asong";
        String username = "root";
        String password = "Qazwsx01234";

        System.out.println("Connecting database...");

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Database connected!");
            return DriverManager.getConnection(url, username, password);
        } catch (SQLException | ClassNotFoundException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        }
    }
}
