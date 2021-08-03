package test02;

public class Tire {
	public int maxRotation;
	public int accRotation;
	
	public String location;
	
	Tire(String location,int maxRotation){
		this.location=location;
		this.maxRotation=maxRotation;
	}
	boolean roll() {
		++this.accRotation;
		if(this.accRotation<this.maxRotation) {
			System.out.println(this.location+"Tire 남은 수명"+(maxRotation-accRotation));
			return true;
		}
		System.out.println(this.location+"Tire 펑크");
		return false;
	}
}
