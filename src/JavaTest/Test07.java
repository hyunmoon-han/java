package JavaTest;
//부모와 자식 둘다 생성자가 있을경우 자식의 생성자가 실행됨 ->생생자 오버라이딩 (Overriding)-무시한다.

public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal=new Animal();
		
		System.out.println(animal.eye_count);
		System.out.println(animal.feet_count);
		
		Human s=new Human();
		
		System.out.println(s.eye_count);
		System.out.println(s.feet_count);
		s.run();
		s.eye();
		s.sound();
		s.study();
	}

}
