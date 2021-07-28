package Test;

import java.util.Scanner;

public class Test18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("숫자를 입력하세요:");
		int a=sc.nextInt();
		System.out.print("숫자를 입력하세요:");
		int b=sc.nextInt();
		int s=0;
		for(int c=2;c<=a;c++) {
			if(a%c==0&&b%c==0) {
//				System.out.println(c); 
				s=c;
			} 
		}System.out.println("최대공약수:"+s);
		System.out.println("최소 공배수 :"+(a*b)/s);
	}
}