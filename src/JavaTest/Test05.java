package JavaTest;

import java.util.ArrayList;
import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner str=new Scanner(System.in);
		Scanner s=new Scanner(System.in);
		Menu menu=new Menu();
		menu.init();
		//메뉴이름 /가격 을 입력하는 루틴
		//메뉴이름이 ""이 입력되면 루틴(반복문)종료
		//그동안 입력된 메뉴명/가격 출력.
		System.out.print("메뉴를 입력:");
		String name=str.nextLine();
		
		while(!name.equals("")) {
			System.out.print("가격:");
			int price=s.nextInt();
			menu.addName(name);
			menu.addPrice(price);
			System.out.print("메뉴를 입력:");
			name=str.nextLine();
		}
		
		System.out.println("total");
		menu.showMenu();
		
//		ArrayList<String> a= menu.getAlName();
//		ArrayList<Integer> b= menu.getAlPrice();
//		for(int i=0;i<a.size();i++) {
//			
//			System.out.println(a.get(i)+""+b.get(i));
//		}
		
		
	}

}
