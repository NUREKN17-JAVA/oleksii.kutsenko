package ua.nure.kn.kutsenko.usermanagement.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactoryImpl {
	
	private String driver;
	private String url;
	private String user;
	private String password;
	
	public Connection createConnection() throws DatabaseException {		
		this.driver = "org.hsqldb.jdbcDriver";
		this.url = "jdbc:hsqldb:file:db/usermanagement";
		this.user = "sa";
		this.password = "";
		
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
		
		try {
			return DriverManager.getConnection(this.url, this.user, this.password);
		} catch (SQLException e) {
			throw new DatabaseException(e);
		}
	}
}
