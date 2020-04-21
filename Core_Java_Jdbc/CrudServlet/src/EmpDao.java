import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmpDao {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		 Connection con =null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javajdbc", "root", "admin");
	

} catch (Exception e ) {
	System.out.println("Exception Occurs"+e);
}
	return con;
}
	public static int save(Emp e) {
		int status =0;
		try {
			Connection con = EmpDao.getConnection();
			PreparedStatement pstmt = con.prepareStatement("insert into crudtable (name,password,email,country)values(?,?,?,?");
			pstmt.setString(1, e.getName());
			pstmt.setString(2, e.getPassword());
			pstmt.setString(3, e.getEmail());
			pstmt.setString(4, e.getCountry());
			status = pstmt.executeUpdate();
			con.close();
			
		}catch (Exception ex ) {
			System.out.println("Exception occur in Create Statement"+e);
		}
		return status;
	}
}
