package Practice;

public class EmployeeMain {

	public static void main(String[] args) {
		System.out.print("[임시직] ");
		Temporary tem = new Temporary("홍길동", 23, 20, 150000);
		tem.print();
		
		System.out.print("[정규직] ");
		Regular reg = new Regular("신기해", 25, 3450000);
		reg.print();
		
		System.out.print("[영업직] ");
		Salesman sal = new Salesman("손오공", 27, 2890000, 30000, 0.25);
		sal.print();
		
		System.out.print("[관리직] ");
		Manager man = new Manager("사오정", 33, 4578000);
		man.print();
	}
}
