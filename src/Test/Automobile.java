package Test;

public class Automobile {
	//추가 해서 갸갸갸갸갸
	public static void main(String[] args) {
		Car a=new Car();
		a.dailyRun.add(21);
		a.dailyRun.add(31);
		a.dailyRun.add(41);
		for (int run:a.dailyRun) {
			System.out.println(run);
		}
		for(int i=0;i<a.dailyRun.size();i++) {
			System.out.println(a.dailyRun.get(i));
		}
	}

}
