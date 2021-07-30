package JavaTest;

public class Test06{
	public static void main(String[]args) {
		Car grandeur=new Car("black",5,320,50,"Grandeur",4);
		System.out.println(grandeur.getnColor());
		System.out.println(grandeur.getQuest());
		System.out.println(grandeur.getMaxSpeed());
		System.out.println(grandeur.getnSpeed());
		System.out.println(grandeur.getModelName());
		System.out.println(grandeur.getnWheel());
	}
}