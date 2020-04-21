package studentadd;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Prepstmt {
//	 Statement stmt = con.createStatement();
//   ResultSet rs = stmt.executeQuery("select * from emp");
//   rs.next();
//   System.out.println("Table is "+rs.getInt("id")+" "+rs.getString("name")+" "+rs.getInt("age"));
////  ResultSet rsp= stmt.executeUpdate("Update emp Set name = 'Vinukonda' where id = 1");
////   
//   String sql ="Update emp Set name = 'Tirumala' where id = 1";
// stmt.executeUpdate(sql); 
// ResultSet rsp =stmt.executeQuery("select * from emp");
// rsp.next();
//   System.out.println("Table is "+rsp.getInt("id")+rsp.getString("name")+rsp.getInt("age"));
  
//   }
	Class.forName("com.mysql.cj.jdbc.Driver");
//  Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/javajdbc","root","admin");  
//// 
//  int option =invalue.nextInt();
//  if (option == 1) {
//
////	   System.out.println("We are Adding A students");
//	   System.out.println("Please Enter City Name ");
//	   String cityName = invalue.nextLine();
//	   System.out.println("City Name was "+cityName);
//	   System.out.println("Please Enter a Country");
//	   String countryName = invalue.nextLine();
//	   System.out.println("Country was"+countryName);
//	    System.out.println("City was :"+cityName+" Country was :"+countryName);
//	    String sql = "Insert into studentd"+"(cityName,countryName)"+ "values(?,?)";
//	 PreparedStatement st  = con .prepareStatement(sql);
////	   //Set paramter values
//	   st.setString(1, cityName);
//	   st.setString(2, countryName);
//	   //Exceute queries 
//	   st.executeUpdate();
//  }else if (invalue.nextInt() == 2) {
//	   System.out.println("Please Enter to which one to be updated ");
////	    
//	   
//	   
//	   System.out.println("Enter City Name was ");
//  }
	   
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  String name = reader.readLine();
  System.out.println(name);

//       
    	   
    	   
       
       }
       
       
       
      
       
       
       
		
		 
		
	}


