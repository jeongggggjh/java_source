package pack07thread;

public class Ex42BreadPlate {
	private int breadCount = 0; // 스레드 간 자원 공유 대상

	public Ex42BreadPlate() {

	}
	// 현재 메소드를 스레드로 호출하면 해당 스레드의 처리가 진행되는 동안 락이 걸림 
	public synchronized void makeBread() {
		if (breadCount >= 10) {
			System.out.println("빵 생산율 목표 초과(10개 기준)");
			try {
				wait(); // thread를 not runnable 상태로 만듦				
			} catch (Exception e) {
				
			}
		}
		breadCount++; 
		System.out.println("빵 생산 총 수 : " + breadCount + "개");
		notify(); // thread를 runnable 상태로 되돌림	
	}
	public synchronized void eatBread() {
		if (breadCount < 1) {
			System.out.println("빵이 없어 기다림");
			try {
				wait(); // thread를 not runnable 상태로 만듦				
			} catch (Exception e) {
				
			}
		}
		breadCount--; // 빵을 소비
		System.out.println("빵 소비 후 총 수 : " + breadCount + "개");
		notify();
	}
}
