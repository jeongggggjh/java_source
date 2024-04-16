package pack03;

public class Ex10CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex10PohamCar tom = new Ex10PohamCar("미스터 톰");
		tom.playCarTurnHandle(30);
		System.out.println(tom.ownerName + "의 회전량은 " + tom.turnMessageShow + " " + tom.handle.quantity);
		tom.playCarTurnHandle(-20);
		System.out.println(tom.ownerName + "의 회전량은 " + tom.turnMessageShow + " " + tom.handle.quantity);
		System.out.println();
		Ex10PohamCar james = new Ex10PohamCar("제임스 삼촌");
		james.playCarTurnHandle(0);
		System.out.println(james.ownerName + "의 회전량은 " + james.turnMessageShow + " " + james.handle.quantity);
		
	}

}
