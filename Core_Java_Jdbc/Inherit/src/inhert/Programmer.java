package inhert;

public class Programmer extends Employee {
	int bonus =1000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Programmer p1 =new Programmer();
		System.out.println("Salary of Bonus is "+p1.bonus);
		System.out.println("Salary of Employe is "+p1.salary);

	}

}
