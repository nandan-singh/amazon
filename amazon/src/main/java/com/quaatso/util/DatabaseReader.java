package com.quaatso.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseReader {
	Connection conn = null;

	public boolean openConnection(String url, String dbName, String driver, String userName, String password) {
		try {
			Class.forName(driver).newInstance();
			conn = DriverManager.getConnection(url + dbName, userName, password);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public ResultSet executeQuery(String query) {
		ResultSet rs = null;
		try {
			Statement stmt = conn.createStatement();
			// Execute the SQL Query. Store results in ResultSet
			rs = stmt.executeQuery(query);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return rs;
	}

	public void closeConnection() {
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
