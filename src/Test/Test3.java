package Test;

import java.util.Scanner;

public class Test3 {
	//이름을 입력하고 이름이 같으면 이름을 출력 /아니면 다시입력
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String name="HHM";
		while(true) {
			System.out.print("문자열을 입력하세요:");
			String ac=s.nextLine();
			
			if(ac.equals(name)) {
				System.out.println(name);
				break;
			}else if(ac.isEmpty()) {
				System.out.println("종료합니다.");
				break;
			}
			else {
				System.out.println("이름이 다릅니다.");
				
			}
		}
		
	}

}
