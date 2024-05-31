package pack04;

public class Ex14Main {

	public static void main(String[] args) {
		// 개과의 동물들 상속으로 처리
		Ex14Dog dog = new Ex14Dog();
		dog.printMsg();
		System.out.println(dog.callName());
		
		System.out.println("HouseDog---------");
		Ex14HouseDog hd = new Ex14HouseDog("집개");
		hd.printMsg();
		System.out.println(hd.callName());
		
		System.out.println("WolfDog-----------");
		Ex14WolfDog wd = new Ex14WolfDog("늑대");
		wd.printMsg();
		System.out.println(wd.callName());
		wd.display();
		
		System.out.println("\n\n주소 치환 ****************");
		Ex14WolfDog bushdog = wd; // 같은 타입의 변수에게 주소를 치환
		wd.printMsg();
		bushdog.printMsg();
		
		System.out.println();
		// Ex14HouseDog hd2 = wd; // Type mismatch 에러
		Ex14Dog dog2 = wd; // 타입은 다르지만 부모변수에 자식변수 주소 치환 가능
		dog2.printMsg();
		
		Ex14Dog dog3 = new Ex14Dog();
		dog3.printMsg();
		// Ex14WolfDog wd2 = dog3; // 자식 객체변수에 부모변수 주소 치환은 불가
		// wd = dog3;
		
	}

}
