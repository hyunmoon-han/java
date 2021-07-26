package Test;

public class Test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 중첩 for 문은 열 과 행 느낌 가로 세로 구하고 변수 정해서 계산하는거
		
		int n=4;
		int s=0;
		
		for(int i=0;i<n;i++) {
			if(i%2==0) {
				for(int j=0;j<n;j++) {
					s++;
					System.out.print(s+"\t");
				}
				
			}else {
				for(int j=0;j<n;j++) {
					System.out.print(s+"\t");
					s--;
				}
				
			}System.out.println("");
			s=s+n;
		}
	}

}
