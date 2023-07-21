
public class ClassExtensionTest {

	public static void main(String[] args) {
/*		
		Doctor x = new Doctor() ;
		x.diagones();
		x.prescribed();
		x.price(); 
 
*/	
		
/*		
		Surgeon x = new Surgeon();
		x.diagones();//function overloading 
		x.prescribed();//function overloading 
		x.price();//function overloading 
		x.cut();// new token to then class 
		x.stich();// its  own property
*/	
	
		
/*		
		HeartSurgeon x = new HeartSurgeon();
	   //reference variable      object 
		x.diagones();//function overloading 
		x.prescribed();//function overloading 
		x.price();//function overloading 
		x.cut();//function overloading 
		x.stich();//function overloading 
*/	
		
		// thing is not allowed kyuki super class child class ke specifice feacher tocken use nhi ker sakti ,
		
/*		
		Doctor x = new Surgeon();
		x.diagones();
		x.prescribed();
		x.price();
		x.cut();// error
		x.stich();//error
*/		
		
		
		/*
		if (x instanceof Doctor ) {
			System.out.println("Its's a Doctor's object");
		}
		else {
			System.out.println("Its's not a Doctor's object");
		}
		
		System.out.println("=============================");
		if (x instanceof Surgeon ) {
			System.out.println("Its's a Surgeon's object");
		}
		else {
			System.out.println("Its's not a Surgeon's object");
		}
		System.out.println("==========================");
		if (x instanceof HeartSurgeon ) {
			System.out.println("Its's a HeartSurgeon's object");
		}
		else {
			System.out.println("Its's not a HeartSurgeon's object");
		}
		*/
	}

}
class Doctor{
	void diagones () {
		System.out.println("Doctor is diagones.. ENT Report.....");
	}
	void prescribed() {
		System.out.println("Doctor is prescribing ... RGB.. Pills ..");
	}
	
	void price () {
		System.out.println("Doctor is taking charge of 300/- ...");
	}
	
}
class Surgeon extends Doctor {
	void diagones () {
		System.out.println("Surgeon is diagones.. MRI Report.....");
	}
	void prescribed() {
		System.out.println("Surgeon is prescribing ...expencive .. Pills ..");
	}
	
	void price () {
		System.out.println("Surgeon is taking charge of 1000/- ...");
	}
	void cut() {
		System.out.println("Surgeon is cuting ");
	}
	void stich() {
		System.out.println("Surgeon is stiching");
	}
}
class HeartSurgeon extends Surgeon{
	void diagones () {
		System.out.println("HeartSurgeon is diagones.. ECG Report.....");
	}
	void prescribed() {
		System.out.println("HeartSurgeon is prescribing ...expencive .. Pills .. and some yoga");
	}
	
	void price () {
		System.out.println("HeartSurgeon is taking charge of 3000/- ...");
	}
	void cut() {
		System.out.println("HeartSurgeon is cuting ");
	}
	void stich() {
		System.out.println("HeartSurgeon is stiching");
	}
}
