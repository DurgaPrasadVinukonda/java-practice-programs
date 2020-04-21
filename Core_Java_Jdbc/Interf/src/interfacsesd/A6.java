package interfacsesd;

public class A6 implements printable {
	 public void print() {
		System.out.println("Print chey hey");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int data=100/0;
		}
//		catch(ArithmeticException e) {
//			System.out.println((e));
//		}
		finally{
		System.out.println("reset the code");
	}
	}

}
