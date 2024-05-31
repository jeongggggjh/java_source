package pack;

public class Info {
	private int no;
	private String name;
	private int kor;
	private int eng;
	
	public Info(int no, String name, int kor, int eng) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}

	public int getNo() {
		return no;
	}

	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}
	
}
