package Test;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String str=s.nextLine();
		if(str.equals("a")||str.equals("A")) {
			System.out.println("Apple");
		}else if(str.equals("b")||str.equals("B")) {
			System.out.println("Banana");
		}else if(str.equals("w")||str.equals("W")) {
			System.out.println("Watermelon");
		}else if(str.equals("s")||str.equals("S")) {
			System.out.println("Strawberry");
		}else {
			System.out.println("모르는 이니셜");
		}
		System.out.println("프로그램 종료");
	}

}
