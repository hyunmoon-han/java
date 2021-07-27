package Test;

import java.util.Scanner;

public class Test20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("10이하의 정수를 입력:");
		int a=sc.nextInt();
		int b=1;
		for(int i=a; i>=1;i--) {
			b=b*i;
			if(a>10) {
				System.out.println("10넘음.종료");
				break;
			}
		}System.out.println("입력한정수의 패패패팩토리얼:"+b);
		
	}

}
