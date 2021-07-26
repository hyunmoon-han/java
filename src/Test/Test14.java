package Test;

public class Test14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//10000 이하의 피보나치 수열을 구하는 프로그램.
//		int a=0;
//		int b=1;
//		int c=0;
//		while(a+b<=10000) {
//			c=a+b;
//			a=b;
//			b=c;
//			System.out.println(c);
//		}
		//몇번 반복하기
		int a=0;
		int b=1;
		int c=0;
		for(c=0;c<10000;c=a+b) {  
//			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
			
		}
//		int a=0;
//		int b=1;
//		int c=0;
//		for(int i=0;i<500;i++) {
//			c=a+b;
//			a=b;
//			b=c;
//			System.out.println(c);
//			if(a+b>10000) {
//				break;
//			}i++;
//		}
//			
	}

}
