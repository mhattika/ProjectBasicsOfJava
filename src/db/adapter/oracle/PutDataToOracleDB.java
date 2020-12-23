package db.adapter.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class PutDataToOracleDB {

	public static void main(String[] args) {
		
		Connection con=DriverManager.GetConnection("jdbc:oracle:thin:@localhost:1521/pdborcl","hr","hr");
		
		Statement stmt = con.createStatement(); // create statement through connection object
		String s = "insert into user values(102,'mercury1','mercury2')"; //insert , update,delete
		stmt.executeQuery(s);
		con.close();
		System.out.println("Transaction completed")
	}

}
