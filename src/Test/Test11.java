package Test;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for문을 이용해서  홀수 구하기.
//		Scanner s=new Scanner(System.in);
//		System.out.println("입력한 정수의 홀수구하기. 정수를 입력하세요:");
//		int a=s.nextInt();
//		for(int i=1;i<=a;i++) {
//			if(i%2==1) {
//				System.out.println(i);
//			}
//		}
		
		//2단부터9단 구구단 구하기.
		for(int a=2;a<=9;a++) {
			for(int b=1;b<=9;b++)
				System.out.println(a+"x"+b+"="+a*b);
		}
		//break  - 가장 안쪽의 반복문을 탈출(switch제외)  continue  가장 안쪽의 반복문 위 (조건문)으로
		
	}

}
