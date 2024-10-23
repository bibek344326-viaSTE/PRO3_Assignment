package Server.database;

import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:postgresql://localhost:5432/postgres?currentSchema=slaughterhousedb";
    private static final String USER = "postgres";
    private static final String PASSWORD = "captos123";

    public DatabaseConnection() throws RemoteException {
        try {
            // Connect to PostgreSQL database

            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres?currentSchema=slaughterhousedb", "postgres", "P@ssw0rd");
            System.out.println("Connected to the PostgreSQL database.");
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RemoteException("Could not connect to the database.");
        }
    }
}


