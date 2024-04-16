package pack04;

public class Ex24AnnoniMain {

	public static void main(String[] args) {
		// 내부 무명(익명) 클래스 연습
		Ex24Saram saram = new Ex24Saram();
		System.out.println(saram.getIr());
		
		System.out.println();
		Ex24Person person = new Ex24Person();
		Ex24Saram saram2 = person.getSaram();
		System.out.println(saram2.getIr());
		
		System.out.println("hotfix 작업공간에서 적음");
	}

}
