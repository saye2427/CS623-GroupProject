package team4project;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PostgreSQLT4ACID {

	public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
		
		//Load PostgreSQL driver
		Class.forName("org.postgresql.Driver");
		
		//Connect to the default database with credentials
		//Enter your own machine's port # for postgre after localhost
		String url = "jdbc:postgresql://localhost:5432/";
		//Enter your own machine's root here
		String root = "postgre";
		//Enter your own postgre password here
		String password = "password";
				
		Connection connect = DriverManager.getConnection(url, root, password);
		
		//For Atomicity
		connect.setAutoCommit(false);
		
		//For Isolation
		connect.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
		
		Statement query = null;
		try {
			
			//Create statement object for sending SQL statements to the database
			query = connect.createStatement();
			
			//
			
		} catch (SQLException e){
			System.out.println("An exception was thrown");
		}
		

	}

}
