package pack04;

public class Ex18FindUtil {
	public static void find(Ex18Animal ani) {
		ani.animalPrint();
		// instanceof : 객체 타입 비교연산자.
		if(ani instanceof Ex18Cow) {
			Ex18Animal a = ani;
			System.out.println(a.name());
			System.out.println(a.eat());
		}
		else if(ani instanceof Ex18Lion) {
			System.out.println(ani.name());
		}
	}
} 
