package JavaTest;

public class Human extends Animal {///Human 은 Animal을 상속한다.
	
	public Human() {
		// TODO Auto-generated constructor stub
		//super(2,4); 부모의 생성자를 호출하는 
		System.out.println("상속이다 임마");
		
		this.eye_count=2;
		this.feet_count=2;
		
	
	}
	void eye(){
		this.eye_count=3;
		System.out.println(this.eye_count);
	}
	void run() {
		System.out.println("건는다.");
	}
	void sound() {
		System.out.println("말한다.");
	}
	void study() {
		System.out.println("공부ㅠㅜㅠ");
	}
}
