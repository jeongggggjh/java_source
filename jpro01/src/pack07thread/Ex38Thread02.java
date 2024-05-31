package pack07thread;

public class Ex38Thread02 implements Runnable {
	
	public Ex38Thread02() {
		
	}
	
	public Ex38Thread02(String name) {
		Thread tt = new Thread(this, name);
		tt.start();
	}
	public void run() {
		for(int i = 1; i <= 50; i++) {
			// System.out.print(i + " ");
			System.out.println(i + " : " + Thread.currentThread().getName());
			try {
				Thread.sleep(10); // thread를 일정 시간 동안 비활성화				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	public static void main(String[] args) {
		/*
		Ex38Thread02 my1 = new Ex38Thread02();
		Ex38Thread02 my2 = new Ex38Thread02();
		Thread t1 = new Thread(my1);
		t1.start();
		Thread t2 = new Thread(my2);
		t2.start();
		*/
		new Ex38Thread02("하나");
		new Ex38Thread02("둘");
		
		System.out.println("프로그램 종료");
	}
}
	
