package Test;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("입력하세요:");
		String a=s.nextLine();
		while(a!=null) {//while(a.isEmpty()
//			System.out.print("입력하세요:");
//			String a=s.nextLine();
			if(a.equals("x")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else if(a.equals("m")) {
				System.out.println("메뉴리스트");
				//continue;
				
			}else if(a.equals("o")) {
				System.out.println("주문");
			
			}else if(a.equals("s")) {
				System.out.println("매출현황");
				
			}else {
				System.out.println("틀리다 임마 다시해라.");
				System.out.println("종료할려면 x를 입려력력력력력해");
			}
			System.out.print("입력하세요2:");
			a=s.nextLine();
		}System.out.println("프로그램이 종료되었습니다.");
		
		
				
	}

}
