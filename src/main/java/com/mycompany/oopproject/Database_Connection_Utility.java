
package com.mycompany.oopproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Database_Connection_Utility {


    private static final String URL = "jdbc:mysql://localhost:3306/APEX_BANK";
    private static final String USER = "root";
    private static final String PASSWORD = "root"; 

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
    

