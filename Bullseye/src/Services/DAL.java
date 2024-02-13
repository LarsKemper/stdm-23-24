package Services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAL {
    protected static final String URL = "jdbc:sqlite:../../db/bullseye.db";
    private Connection connection;

    public DAL() {
        this.connection = null;
    }

    public Connection getConnection() {
        return connection;
    }

    public void connect() {
        try {
            this.connection = DriverManager.getConnection(URL);
            System.out.println("Connection to SQLite has been established.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (this.connection != null) {
                    this.connection.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public void createTables() {
        // execute db/create.sql
    }

    public void seed() {
        // execute db/seed.sql
    }
}