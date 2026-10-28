package com.mycompany.oopproject;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class UserDAO {
public boolean UserValidation(String Email, String Password){
String query =" SELECT USER_PASSWORD FROM USERS WHERE USER_EMAIL= ?";

try (Connection connect=Database_Connection_Utility.getConnection();
     PreparedStatement state= connect.prepareStatement(query)){
    
    state.setString(1, Email);
    ResultSet rs=state.executeQuery();
    
    if (rs.next()){
        String DBPassword=rs.getString("USER_PASSWORD");
        return DBPassword.equals(Password);
    }
} catch (SQLException error){
    error.printStackTrace();
}
return false;
}
}