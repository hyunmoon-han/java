package JavaTest;

import java.util.ArrayList;

public class Menu {
	private ArrayList<String>alName;
	private ArrayList<Integer>alPrice;
////	static int a=1;
//	static void seta(int n) {
//		a=n;
//	}
//	static int geta() {
//		return a;
//	}
	//static final a=1; ->필드 수정불가
	Menu() {// 매개변수가 없는 생성자-> 기본생성자(default constructor)
		this.alName=new ArrayList<String>();
		this.alPrice=new ArrayList<Integer>();
//		this.addName("아메리카노"); = this.alName.add("아메리카노");
		///생성자에 초기값을 설정해서 실행할수 있음(설정에는 필드값을 줄수도 있고 메서드를 호출할수도 있음.
		//for(int i=0;i<alName.size();i++) {

//		System.out.println(this.alName.get(i)+"\t $"+this.alPrice.get(i)) = this.showMenu();
//	}	
		addName("Americano");
		addName("Espresso");
		addName("Latte");
		addPrice(2000);
		addPrice(2500);
		addPrice(3000);
		
		showMenu();

		
	}/*생성자 -용도 :주로 초기화 작업용.
		명명법: 클래스와 이름이 같아야됨
		반환값: 반환값이 없다.(반환할 수 없이 ,작업만 실행)
		실행/호출:new연산자가 실행된 직후, 자동실행
		다른 메소드를 호출할수 있다!!!!!!!!!!!!!
		*/
	//생성자 오버로딩 <- 다형성    (매개변수를 다르게 해서 여러개의 생성자를 정의 할수있는 기능 )
	Menu(String a,int b) {
		
		this.alName=new ArrayList<String>();
		this.alPrice=new ArrayList<Integer>();
	}
	
			
	
	void addName(String name) {
		this.alName.add(name);
	}
	void addPrice(int price) {
		this.alPrice.add(price);
	}
	
	
	public void showMenu() {
		
		for(int i=0;i<alName.size();i++) {

			System.out.println(this.alName.get(i)+"\t $"+this.alPrice.get(i));
		}
	 
	}
	
	
//	public ArrayList<Integer> getAlPrice() {
//		return alPrice;
//	}
//	
//	public ArrayList<String> getAlName() {
//		return alName;
//	}
	
	
	
	
}
