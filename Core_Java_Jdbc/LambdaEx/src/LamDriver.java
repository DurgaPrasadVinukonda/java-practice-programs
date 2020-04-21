import java.awt.List;
import java.util.*;  


public class LamDriver {
	public static void main (String[] args) {
		ArrayList<String> s1 =new ArrayList<String> ();
		s1.add("Sai");
		s1.add("Mani");
		s1.add("Prasad");
		s1.add("Durga");
		s1.add("Durga");
		s1.add("Durga");
		//Traversing List through Iteratior
		Iterator it=s1.iterator();
		while(it.hasNext()){  
			System.out.println(it.next());  
			}  
		
		
		
		
		
}

}


