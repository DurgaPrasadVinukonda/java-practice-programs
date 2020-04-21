package jdbcdemo2;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.*;  
 


public class JDBCPrepSt {
	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
		//Register the Database
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javajdbc", "root", "admin");
//		
		File file = new File("C:\\Users\\van\\Desktop\\java.txt");
		FileInputStream fis =new FileInputStream(file);
		int size = fis.available();
		byte b [] =new byte[size];
		fis.read(b);
		String data =  new String(b);
//		System.out.println(data);
//		String fileName2= new String(data);
//		System.out.println(fileName2);
		//Created a New Copy for the FileName
		File cfile =new File("C:/Users/van/Desktop/javacopy.txt");
		//In this it will able to write the code 
		FileOutputStream fos =new FileOutputStream(cfile);
		//from the above code It will take that data and keep in the store 
         fos.write(b);
         String datacopy =new String(b);
         //System.out.println(cfile);
         fis.close();
         fos.close();
		
//		con.close();
		
		
	}

}
