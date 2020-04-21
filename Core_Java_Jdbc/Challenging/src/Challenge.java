import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Challenge {

//	public static void main(String[] args) {
//		String name ="Sai Manikanta Durga Prasad";
//	
//		
////		if (name.contains(" ")) {
////			String name3 = name.replaceAll("\\s+", "");
////			System.out.println(name3);
////			int nv =name3.length();
////			
////		    for ( int i =0; i<nv -1;i++) {
////		    	for (int j=nv -1;j <=i;j--) {
////		    	char s1 =name3.charAt(i);
////		    	char s2 =name3.charAt(j);
////		    	
////		    	if(s1 == s2) {
////		    		System.out.println("Contains a Duplicate Characters");
////		    	}else {
////		    		System.out.println("No Similiar VALUES");
////		    	}
////		    	
////		    		
////		    	}
////		    }
////		}else {
////			System.out.println("Bye");
////		}
////		
//		String name2 ="saia";
//		for (int i =0;i< name2.length();i++) {
//			System.out.println(name2.charAt(i));
//		}
// int[] arr = {1,2,3,4};
// int max =arr[0];
// for ( int i=1; i<arr.length;i++) {
//	 if (arr[i] > max){
//		 max = arr[i];
//		 
//	 }
//	 return max;
//	 
// }
//	}
	 
		 private int data=30;  
		 class Inner{  
		  void msg(){System.out.println("data is "+data);}  
		 }  
		 public static void main(String args[]){  
			 Challenge obj=new Challenge();  
			 Challenge.Inner in=obj.new Inner();  
		  in.msg();  
		 }  
		}  
}
