import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JavaJDBCFileInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
 //Registering the Sql Conection
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javajdbc", "root", "admin");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from imge");
		rs.next();
		int id = rs.getInt(1);
		Blob blob = rs.getBlob(2);
		FileOutputStream fos = new FileOutputStream("\"C:\\Users\\van\\Desktop\\javacopy2.txt\"");
		long size = blob.length();
		byte[] data = blob.getBytes(1, (int)size);
		fos.write(data);
		fos.close();
		con.close();
		
		
		
	}

}
