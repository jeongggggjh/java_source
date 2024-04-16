package pack04;

public class Ex20Main {

	public static void main(String[] args) {
		// 지원자가 작성한 이력서를 인사 담당자가 취합하여 이력서 출력
		System.out.println("톰 이력서 작성 후 출력");
		Ex20Tom tom = new Ex20Tom();
		tom.setIrum("톰");
		tom.setPhone("010-0000-0000");
		tom.setJuso("강남구 역삼1동 123");
		tom.printData();
		
		System.out.println();
		
		System.out.println("제임스 이력서 작성 후 출력");
		Ex20James james = new Ex20James();
		james.setIrum("제임스");
		james.setPhone("010-0000-0000");
		james.setSkill("웹 프로그래밍 전문가");
		james.printData();
		
		System.out.println("\n인사 담당자가 이력서 출력");
		Ex20Resume[] resBox = new Ex20Resume[2];
		resBox[0] = tom;
		resBox[1] = james;
		for(Ex20Resume r : resBox) {
			r.printData();
			System.out.println();
		}
	}

}
