package pack04;

public class Ex18Lion extends Ex18Animal {
	@Override
	public String name() {
		return "내 이름은 사자라고 해.";
	}
	@Override
	public String eat() {
		String gogi = "생고기";
		return gogi;
	}
	
	@Override
	public String action() {
		return "밤에 움직임";
	}	
	public void eatOther() {
		System.out.println("가끔 물도 마심");
	}
}
