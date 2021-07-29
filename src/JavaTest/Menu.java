package JavaTest;

import java.util.ArrayList;

public class Menu {
	private ArrayList<String>alName;
	private ArrayList<Integer>alPrice;
	
	
	void init() {
		this.alName=new ArrayList<String>();
		this.alPrice=new ArrayList<Integer>();
	}
	void addName(String name) {
		this.alName.add(name);
	}
	void addPrice(int price) {
		this.alPrice.add(price);
	}
	
	
	public void showMenu() {
		
		for(int i=0;i<alName.size();i++) {

			System.out.println("메뉴:"+alName.get(i)+" $"+alPrice.get(i));
		}
	 
	}
	
	
//	public ArrayList<Integer> getAlPrice() {
//		return alPrice;
//	}
//	
//	public ArrayList<String> getAlName() {
//		return alName;
//	}
	
	
	
	
}
