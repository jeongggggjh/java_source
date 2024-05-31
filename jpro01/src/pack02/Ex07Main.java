package pack02;

public class Ex07Main {

	public static void main(String[] args) {

		Ex07Production production = new Ex07Production("유니폼", 119000, 0.7);
		production.show();
		
		production.setName("래시포드 유니폼");
		production.show();
		
		Ex07Production production2 = new Ex07Production("어센틱 유니폼", 169000, 0.5);
		production2.show();
		
		System.out.println();
		
		if(production2.equals(production)) {
			System.out.println("같음");
		}
		else {
			System.out.println("다름");
		}
		
	}

}
