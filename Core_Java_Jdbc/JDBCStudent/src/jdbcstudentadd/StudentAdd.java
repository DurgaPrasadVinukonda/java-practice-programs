package jdbcstudentadd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentAdd {
	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Please Enter Values 1 ,2,3 To get to add student or delete student or modify student");
			int value = Integer.parseInt(reader.readLine());
			System.out.println("Entered Integer is " + value);
			// Registering the Database
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Geting Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javajdbc", "root", "admin");
			//
			Statement stmt = con.createStatement();
//	ResultSet rs =stmt.executeQuery("select * from emp");

			if (value == 1) {
				System.out.println("Please Add The Student Details");
				System.out.println("Please Enter Student Id");
				int id1 = Integer.parseInt(reader.readLine());
				System.out.println("Please Enter Student City");
				String cname = reader.readLine();
				System.out.println("Please Enter Student Country");
				String ctyname = reader.readLine();
				System.out.println("Student Id is " + id1 + " Student City is " + cname + " Student cname is " + cname);
				PreparedStatement pstmt = con.prepareStatement("Insert into studentd values (?,?,?)");
				// Getting That Values
				pstmt.setInt(1, id1);
				pstmt.setString(2, cname);
				pstmt.setString(3, ctyname);
				pstmt.executeUpdate();
				System.out.println("Query is executed");
				System.out.println("Still need to do operations Enter Y or N ");
				String lValue = reader.readLine();
				if (("n").equals(lValue)) {
					System.out.println("Thank you for your query");

				}
			} else if (value == 2) {
				System.out.println("Are You Modifying the student Details ");
				System.out.println("Which one need to modify city or country");
				String valcityUpdate = reader.readLine();
				if (valcityUpdate.equals("city")) {
					System.out.println("Please Enter City Name");
					String cupName = reader.readLine();
					System.out.println("Please Enter Id aslo ");
					int cidName2 = Integer.parseInt(reader.readLine());
					PreparedStatement pstmt2 = con.prepareStatement("update studentd set city=? where id=?");
					pstmt2.setString(1, cupName);
					pstmt2.setInt(2, cidName2);
					pstmt2.executeUpdate();
					System.out.println("City was Updated");
				} else if (valcityUpdate.equals("country")) {
					System.out.println("Please Enter Country Name");
					String counUpName = reader.readLine();
					System.out.println("Please Enter Id Name");
					int cidName = Integer.parseInt(reader.readLine());
					PreparedStatement pstmt3 = con.prepareStatement("Update studentd Set country =? where id=?");
					pstmt3.setString(1, counUpName);
					pstmt3.setInt(2, cidName);
					pstmt3.executeUpdate();
					System.out.println("Country  was Updated");
				} else {
					System.out.println("Invalid ");
				}
			} else if (value == 3) {
				System.out.println("Are You deleting Students");
				System.out.println("Please Enter the Id Number to delete the records");
				int delName = Integer.parseInt(reader.readLine());
				PreparedStatement ptsmt4 = con.prepareStatement("Delete from studentd where id =?");
				ptsmt4.setInt(1, delName);
				ptsmt4.executeUpdate();
				System.out.println("Values are deleted for that Id" + delName);

			} else {
				System.out.println("Sorry In valid Values ");
			}

		} catch (Exception e) {
			System.out.println("Exception" + e);

		}

	}
}
