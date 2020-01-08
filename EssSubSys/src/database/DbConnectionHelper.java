package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnectionHelper {
	private static String jdbcUrl = "jdbc:mysql://localhost:3306/ess_sub_database";
	private static String user = "ess_sub_admin";
	private static String pass = "adminion";

	public Connection getDbConnection() {
		Connection con = null;
		
		try {
			System.out.println("Connecting to database: " + jdbcUrl);
			con = DriverManager.getConnection(jdbcUrl, user, pass);
			System.out.println("Connection success");

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
		}
		
		return con;
	}
}