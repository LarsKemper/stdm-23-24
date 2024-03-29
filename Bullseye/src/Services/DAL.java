package Services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAL {
    protected static final String URL = "jdbc:sqlite:C:/Users/Lars/code/stdm-23-24/Bullseye/db/bullseye.db";
    private Connection connection;

    public DAL() {
        this.connection = null;
    }

    public Connection getConnection() {
        return connection;
    }

    public void connect() {
        try {
            Class.forName("org.sqlite.JDBC");
            this.connection = DriverManager.getConnection(URL);
            System.out.println("Connection to SQLite has been established.");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void disconnect() {
        try {
            if (this.connection != null) {
                this.connection.close();
                System.out.println("Connection to SQLite has been closed.");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}