package pack05;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex28ListTest {

	public static void main(String[] args) {
		// List류의 ArrayList로 연습 : 중복 가능, 순서O
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("lee");
		list.add("lee");
		list.add("lee");
		list.add("park");
		list.add("hong");
		// list.remove("park"); // 부분 삭제
		list.remove(0); // List는 가능, Set은 불가
		// list.clear(); // 모두 삭제
		System.out.println("크기 : " + list.size());
		
		for(Object obj : list) {
			System.out.println(obj);
		}
		System.out.println();
		// Iterator(반복자) : 개발자가 컨테이너, 특히 리스트를 순화 할 수 있게 해주는 객체.
		Iterator iter = list.iterator();
		while(iter.hasNext()) {
			String s = (String)iter.next();
			System.out.println(s);
		}
	}

	
}
