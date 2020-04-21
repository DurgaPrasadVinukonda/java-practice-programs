package jdbcallpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCStatemnts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/EMP", "root", "admin");
			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery("select * from Employees");
			while (rs.next()) {
				System.out.println("Database values are " + rs.getInt(1) + " " + rs.getInt(2) + " " + rs.getString(3)
						+ " " + rs.getString(4));
			}
//			prepared Statements
			PreparedStatement pstmt = con.prepareStatement("Insert into Employees Values (?,?,?,?)");
			pstmt.setInt(1, 45);
			pstmt.setInt(2,22);
            pstmt.setString(3, "Prasad");	
            pstmt.setString(4, "Vinukonda");
		    pstmt.executeUpdate();
			 
			
		} catch (Exception e) {
			System.out.println("Got an exception" + e);
		}
	}

}
