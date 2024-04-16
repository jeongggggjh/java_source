package pack04;

public class Ex19HandPhone implements Ex19Volume {
	private int volLevel;

	public Ex19HandPhone() {
		volLevel = 0;
	}

	@Override
	public void volumeUp(int level) {
		// 인터페이스의 추상메소드를 오버라이딩
		if (level > 100) {
			level = 100;
		}
		volLevel += level;
		System.out.println("핸드폰 소리를 올리면 " + volLevel);

	}

	@Override
	public void volumeDown(int level) {
		volLevel -= level;
		if (volLevel < 0) {
			volLevel = 0;
		}
		System.out.println("핸드폰 소리를 내리면 " + volLevel);

	}
}
