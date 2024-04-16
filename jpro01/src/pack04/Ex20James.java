package pack04;

//신입 지원자 제임스

public class Ex20James implements Ex20Resume {
	private String irum, phone, skill;

	public Ex20James() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void setIrum(String irum) {
		if(irum.equals(null)) {
			this.irum = "아무개";
		}
		else {
			this.irum = irum;
		}
		this.irum = irum;
	}
	@Override
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setSkill(String s) {
		skill = s;
	}
	@Override
	public void printData() {
		// Ex20Resume.SIZE = "B5"; // err : final이라 바꿀 수 없음.
		System.out.println("용지 규격은 " + Ex20Resume.SIZE);
		System.out.println("이름 : " + irum + ", 전화 : " + phone + ", 보유기술 : " + skill);
	}

}
