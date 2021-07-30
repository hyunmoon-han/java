package JavaTest;

public class Car {
	private String nColor;
	private int maxSpeed;
	private int nSpeed;
	private int quest;
	private String modelName;
	private int nWheel;
	
	
	public String getnColor() {
		return nColor;
	}
	public void setnColor(String nColor) {
		this.nColor = nColor;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public int getnSpeed() {
		return nSpeed;
	}
	public void setnSpeed(int nSpeed) {
		this.nSpeed = nSpeed;
	}
	public int getQuest() {
		return quest;
	}
	public void setQuest(int quest) {
		this.quest = quest;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public int getnWheel() {
		return nWheel;
	}
	public void setnWheel(int nWheel) {
		this.nWheel = nWheel;
	}
	Car(){
//		this.nColor="blue";
//		this.quest=5;
//		this.maxSpeed=240;
//		this.nSpeed=0;
		this("blue",5,240,0);// 이부분은 가장 위에 존재.
	}
	Car(String nColor , int quest,int maxSpeed,int nSpeed){
		this.nColor=nColor;
		this.quest=quest;
		this.maxSpeed=maxSpeed;
		this.nSpeed=nSpeed;
	}
	
	Car(String nColor,int quest,int maxSpeed,int nSpeed,String modelName,int nWheel){
//		this.nColor=nColor;
//		this.quest=quest;
//		this.maxSpeed=maxSpeed;
//		this.nSpeed=nSpeed;
		this(nColor,quest,maxSpeed,nSpeed);// 다른 생성자 호출
		
		this.modelName=modelName;
		this.nWheel=nWheel;
	}
}
