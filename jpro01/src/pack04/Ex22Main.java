package pack04;

public class Ex22Main {

	public static void main(String[] args) {
		System.out.println("속도 : " + Ex22Flyer.FAST);

		Ex22Bird bird = new Ex22Bird();
		bird.fly();
		
		Ex22Airplane airplane = new Ex22Airplane();
		airplane.fly();
		
		System.out.println("-----------");
		Ex22FlyerUtil.show(bird);
		System.out.println();
		Ex22FlyerUtil.show(airplane);
		
		System.out.println("-----------");
		Ex22Ball ball = new Ex22Ball();
		ball.fly();
	}

}
