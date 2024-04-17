package pack05;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex31Student {
	ArrayList<Ex31StudDto> list = new ArrayList<Ex31StudDto>();
	Ex31StudDto dto;
	
//	public void insertList(String name, int kor, int eng) {
//		dto = new Ex31StudDto(name, kor, eng);
//		list.add(dto);
//	}
	
	public void insertList(String name, int kor, int eng) {
		dto = new Ex31StudDto();
		dto.setName(name);
		dto.setKor(kor);
		dto.setEng(eng);
		list.add(dto);
	}
	
	public void showList() {
		for(Ex31StudDto i : list) {
			System.out.println("이름 : " + i.getName() + ", 국어 : " + i.getKor() + ", 영어 : " + i.getEng() + ", 총점 : " + (i.getEng() + i.getKor()));
		}
		System.out.println("응시인원 : " + list.size());
	}
	public static void main(String[] args) {
		Ex31Student student = new Ex31Student();
		
		
		int kor, eng;
		String name, yn;
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			try {
			System.out.print("이름 입력 : ");
			name = sc.next();
			System.out.print("국어 점수 : ");
			kor = sc.nextInt();
			System.out.print("영어 점수 : ");
			eng = sc.nextInt();
			student.insertList(name, kor, eng);
			student.showList();
			System.out.println("계속 할까요 ? (y/n)");
			
			yn = sc.next();
			if(yn.equals("n")) {
				System.out.println("n을 입력해서 종료합니다.");
				student.showList();
				System.exit(0);
			}
			else if(yn.equals("y")) 
				continue;
			} catch (Exception e) {
				System.out.println("처리 중 오류 발생 : " + e);
				break;
			}
		}
	}
}

