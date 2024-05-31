package pack02;

public class Ex07Production {
	private String name;
	private int price;
	private double weight;

	public Ex07Production() {}
	
	public Ex07Production(String name, int price, double weight) {
		this.name = name;
		this.price = price;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void show() {
		System.out.println("name : " + name + ", price : " + price + ", weight : " + weight);
	}

}
