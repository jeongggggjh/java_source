package pack04;

public class Ex19Main {

	public static void main(String[] args) {
		Ex19Volume volume; // O
		
		Ex19Radio radio = new Ex19Radio();
		Ex19Tv tv = new Ex19Tv();
		Ex19HandPhone phone = new Ex19HandPhone();
		
		radio.volumeUp(5);
		radio.volumeDown(2);
		tv.volumeUp(10);
		tv.volumeDown(7);
		phone.volumeUp(7);
		phone.volumeDown(1);
		
		System.out.println("-----------");
		volume = radio;
		volume.volumeUp(1);
		volume = tv;
		volume.volumeUp(2);
		volume = phone;
		volume.volumeUp(3);
		
		System.out.println("-----------");
		Ex19Volume volArr[] = new Ex19Volume[3];
		volArr[0] = radio;
		volArr[1] = tv;
		volArr[2] = phone;
		
		for(int a = 0; a < volArr.length; a++) {
			volArr[a].volumeDown(1);
		}
		System.out.println("-----------");
		for(Ex19Volume mbc : volArr) {
			mbc.volumeDown(1);
		}

	}

}
