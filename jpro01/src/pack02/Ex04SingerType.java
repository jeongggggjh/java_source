package pack02;

public class Ex04SingerType { // 가수들이 가져야할 기본 멤버들 클래스로 작성
	private String name = "무명 가수"; // 이름
	private String title = "아 대한민국"; // 곡 제목
	// ...
	
	// 생성자를 통해 멤버 변수에 값 저장
	public Ex04SingerType(String name, String title) {
		this.name = name;
		this.title = title;
	}

	public String getName() { // getter
		return name;
	}

	public String getTitle() {
		return title;
	}

	public void sing() {
		System.out.println(name + " is singing " + title + "...");
	}

	public static void main(String[] args) {
		// 응용 프로그램 시작용 메소드
		// Ex04SingerType 멤버는 아님
		Ex04SingerType bts = new Ex04SingerType("BTS", "Dynamite");
		bts.sing();
		System.out.println("가수 이름 : " + bts.getName());
		System.out.println("곡 제목 : " + bts.getTitle());
		
		System.out.println();
		
		Ex04SingerType newjeans = new Ex04SingerType("NewJeans", "Ditto");
		newjeans.sing();
		System.out.println("가수 이름 : " + newjeans.getName());
		System.out.println("곡 제목 : " + newjeans.getTitle());
		
	}
}
