package Test;

import java.util.Scanner;

public class Test17 {

	public static void main(String[] args) {
		// TODO 두수를 입력해서 최소 공배수 최대 공약수 구하기
		Scanner sc=new Scanner(System.in);
		System.out.print("숫자를 입력하세요:");
		int a=sc.nextInt();
		System.out.print("숫자를 입력하세요:");
		int b=sc.nextInt();
		int s=0;
		for(int c=2;c<=a;c++) {
			if(a%c==0&&b%c==0) {
				s=c;
			}
		}System.out.println("최대공약수:"+s);
		System.out.println("최소 공배수 :"+(a*b)/s);
	}

}
