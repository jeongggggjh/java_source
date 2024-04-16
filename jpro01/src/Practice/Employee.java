package Practice;

abstract public class Employee {
	private String irum;
	private int nai;

	public Employee() {

	}

	public Employee(String irum, int nai) {
		this.irum = irum;
		this.nai = nai;
	}

	public int getNai() {
		return nai;
	}

	abstract double pay();

	abstract void print();

	public void display() {
		System.out.print("이름 : " + irum + ", 나이 : " + nai);
	}

}
