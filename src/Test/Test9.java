package Test;

import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		while (!a.equals("x")) {
			switch(a) {
			case "m":
				System.out.println("메뉴리스트");break;
			case "o":
				System.out.println("주문");break;
			case "s":
				System.out.println("매출현황");break;
				
			}
			a=s.nextLine();
		}
		System.out.println("프로그램 종료");
		
		
		
	
	}
}
