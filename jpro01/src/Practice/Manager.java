package Practice;

public class Manager extends Regular {
	public double incentive;

	public Manager(String irum, int nai, int salary) {
		super(irum, nai, salary);
	}

	@Override
	void print() {
		if (pay() >= 2500000) {
			incentive = (pay() * 0.6);
		} else if (pay() >= 2000000) {
			incentive = (pay() * 0.5);
		} else {
			incentive = (pay() * 0.4);
		}

		display();
		System.out.println(", 수령액 : " + (pay() + incentive));
	}

}
