package interfce;

public class InterfaceClass  implements Interface2{
	public int ty2( int a1) {
		return a1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceClass ic =new InterfaceClass();
		
		System.out.println(ic.ty2(5));
		
		

	}

}
