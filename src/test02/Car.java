package test02;

public class Car {
	test frontleft;
	Tire frontRight;
	Tire backLeft;
	Tire backRight;
	
	
	Car(){
		this.frontleft=new test("왼쪽앞",6, null);
		this.frontRight=new Tire("오른쪽앞",2);
		this.backLeft=new Tire("왼쪽 뒤",3);
		this.backRight=new Tire("오른쪽 뒤",4);
	}
	int run() {
		System.out.println("자동차가 달립니다.");
		if(frontleft.roll()==false) {
			stop();return 1;
		}
		if(frontRight.roll()==false) {
			stop();return 2;
		}
		if(backLeft.roll()==false) {
			stop();return 3;
		}
		if(backRight.roll()==false) {
			stop();return 4;
		}
		return 0;
	}
	void stop() {
		System.out.println(" 자동차가 멈춥니다.");
	}
	
}	
