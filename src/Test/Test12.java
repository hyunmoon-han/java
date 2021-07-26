package Test;

public class Test12 {

	public static void main(String[] args) {
		
		int n=5;
		int a;
		int s=0;
		for(int i=1;i<=n;i++) {
			if(i%2!=0) {
				for(a=1;a<=n;a++) {
					s++;
					System.out.print(s+"\t");
				}
				s=s+n;
			}else {
				for(a=1;a<=n;a++) {
					System.out.print(s+"\t");
					s--;
				}
				s=s+n;
			}
			System.out.println("");
		}
		
	}
}
			
		
	


