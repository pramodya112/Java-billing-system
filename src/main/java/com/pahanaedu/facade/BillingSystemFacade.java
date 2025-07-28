package com.pahanaedu.facade;

import com.pahanaedu.dao.DatabaseManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BillingSystemFacade {
    private DatabaseManager dbManager = DatabaseManager.getInstance();

    public boolean authenticate(String username, String password) throws SQLException {
        String query = "SELECT * FROM users WHERE username = ? AND password = ?";
        ResultSet rs = dbManager.executeQuery(query, username, password);
        return rs.next();
    }
}