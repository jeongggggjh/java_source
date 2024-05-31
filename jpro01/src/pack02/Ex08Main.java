package pack02;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Ex08Main {

	public static void main(String[] args) {
		// 싱글톤 패턴 연습
		Ex08SingletonClass s1 = new Ex08SingletonClass();
		System.out.println(s1.kor);

		Ex08SingletonClass s2 = new Ex08SingletonClass();
		System.out.println(s2.kor);
		
		System.out.println(s1 + " " + s2);
		System.out.println(s1.hashCode() + " " + s2.hashCode());
		
		System.out.println("-----------------------");
		Ex08SingletonClass s3 = Ex08SingletonClass.getInstance();
		System.out.println(s3.kor);
		
		Ex08SingletonClass s4 = Ex08SingletonClass.getInstance();
		System.out.println(s4.kor);
		
		System.out.println(s3.hashCode() + " " + s4.hashCode());
		
		System.out.println("날짜 출력 싱글톤 사용 예");
		LocalDate mynow = LocalDate.now();
		LocalDateTime mynow2 = LocalDateTime.now();
		System.out.println(mynow.hashCode() + " " + mynow2.hashCode());
		System.out.println(mynow2.getHour());
		
	}

}
