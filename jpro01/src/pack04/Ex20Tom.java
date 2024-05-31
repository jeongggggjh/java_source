package pack04;

// 신입 지원자 톰

public class Ex20Tom implements Ex20Resume {
	private String irum, phone, juso;

	public Ex20Tom() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void setIrum(String irum) {
		// TODO Auto-generated method stub	
		this.irum = irum;
	}
	@Override
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setJuso(String juso) {
		this.juso = juso;
	}
	@Override
	public void printData() {
		// Ex20Resume.SIZE = "B5"; // err : final이라 바꿀 수 없음.
		System.out.println("용지 규격은 " + Ex20Resume.SIZE);
		System.out.println("이름 : " + irum + ", 전화 : " + phone + ", 주소 : " + juso);
	}

}
