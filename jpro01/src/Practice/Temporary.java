package Practice;

public class Temporary extends Employee {
	public int ilsu;
	public int ildang;

	public Temporary() {
	}

	public Temporary(String irum, int nai, int ilsu, int ildang) {
		super(irum, nai);
		this.ilsu = ilsu;
		this.ildang = ildang;
	}

	double pay() {
		return 0;
	}

	public void print() {
		display();
		System.out.println(", 월급 : " + (ilsu * ildang));

	}
}
