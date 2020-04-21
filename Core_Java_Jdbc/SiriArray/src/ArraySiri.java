
import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

public class ArraySiri {
	public static <E> void gnric(E[] arraye){
	for (E element :arraye) {
		System.out.println(element);
	}
	System.out.println();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String[] geeks = {"Rahul", "Utkarsh", 
                 "Shubham", "Neelam"}; 
		Integer[] gks= {1,2,3,45};
		gnric(geeks);
		gnric(gks);
		
		
		
		
		

	}

}
