package pack04;

public class Ex19Radio implements Ex19Volume {
	private int volLevel;

	public Ex19Radio() {
		volLevel = 0;
	}

	@Override
	public void volumeUp(int level) {
		// 인터페이스의 추상메소드를 오버라이딩
		volLevel += level;
		System.out.println("라디오 볼륨을 올리면 " + volLevel);

	}

	@Override
	public void volumeDown(int level) {
		volLevel -= level;
		System.out.println("라디오 볼륨을 내리면 " + volLevel);

	}
}
