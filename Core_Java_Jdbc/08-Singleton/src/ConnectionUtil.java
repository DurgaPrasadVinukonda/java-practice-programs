
public class ConnectionUtil {
	
	private ConnectionUtil() {
		
	}
	private static ConnectionUtil object;
	
	public  static ConnectionUtil createObject() {
		if (object == null) {
		object = new ConnectionUtil();
	}
		return object;
	

}
}
