
public class KiteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Kite.showKiteCount();
		
		Kite kite1 = new Kite("Nikhil","Yellow",10, false);
		//kite1.showKite();
		Kite kite2 = new Kite("Sim","Red",20, false);
		//kite2.showKite();
		Kite kite3 = new Kite("prerna","Blue",30, false);
		//kite3.showKite();
		Kite kite4 = new Kite("Yash","Yellow",40, false);
		//kite4.showKite();
		Kite kite5 = new Kite("Vishal","Green",50, false);
		//kite5.showKite();
		
		kite1.kiteFight(kite5);
		Kite.showKiteCount();
		
	
		
		
	}

}
class Kite{
	private String owner;
	private String color;
	private int length;
	private boolean flying;
	private static int kitCount;
	
	public static void showKiteCount() {
		System.out.println(" Toatal Number kites in the sky :"+ kitCount);
	}
	
	public Kite(String owner, String color, int length, boolean flying) {
		super();
		this.owner = owner;
		this.color = color;
		this.length = length;
		this.flying = flying;
		kitCount++;
	}
	
	@Override
	public String toString() {
		return "Kite [owner=" + owner + ", color=" + color + ", length=" + length + "]";
	}

	public static int getKitCount() {
		return kitCount;
	}

	public static void setKitCount(int kitCount) {
		Kite.kitCount = kitCount;
	}
	
	void showKite () {
		System.out.println("Kite Owner :"+ owner);
		System.out.println("Kite color :"+ color);
		System.out.println("Kite length :"+ length);
		System.out.println("Kite count :"+Kite.kitCount);
		System.out.println("<----------->");
	}
	
	
	void kiteFight(Kite ref) {
		
		for(int i =0;i<=20;i++) {
			System.out.println(color+" Kites are fighting with "+ref.color);
			float val = (float) (Math.random()%10);
			
			if(val>0.87) {
				this.flying = false;
				System.out.println(ref.owner+" Winns");
				kitCount--;
				break;
			}
			
			if(val<.01) {
				ref.flying=false;
				System.out.println(this.owner+" Winns");
				kitCount--;
				break;
				
			}
			
			if(val>=.40 && val<=.60) {
				System.out.println("Both loss the fright");
				this.flying = false;
				ref.flying=false;
				kitCount--;
				kitCount--;
				break;
			}
		}
	}

}
















