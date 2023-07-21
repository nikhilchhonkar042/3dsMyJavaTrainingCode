

public class Ds {
	public static void main(String[] args) {
		
		
		
		Dsgs dsgs1 = new Dsgs ("Diana", 55, "Bank of America", "BOFAUS3N", "345 Oak Street, Los Angeles, CA 90001");
		Dsgs dsgs2 = new Dsgs("Eric", 66, "US Bank", "USBKUS44", "678 Birch Street, Denver, CO 80202");
		Dsgs dsgs3 = new Dsgs("Fiona", 77, "PNC Bank", "PNCCUS33", "910 Cedar Street, Chicago, IL 60603");
		Dsgs dsgs4 = new Dsgs("George", 88, "TD Bank", "NRTHUS33", "123 Walnut Street, Boston, MA 02108");
		Dsgs dsgs5 = new Dsgs("Helen", 99, "Capital One", "NFBKUS33", "456 Chestnut Street, New York, NY 10001");
		Dsgs dsgs6 = new Dsgs("Ian", 11, "HSBC Bank", "MRMDUS33", "789 Hickory Street, Houston, TX 77001");
		Dsgs dsgs7 = new Dsgs("Julia", 22, "BB&T Bank", "BRBTUS33", "1012 Magnolia Street, Atlanta, GA 30303");
		Dsgs dsgs8 = new Dsgs("Kevin", 33, "SunTrust Bank", "SNTRUS3A", "345 Peachtree Street, Miami, FL 33101");

		
		dsgs1.printDsgs();
		dsgs2.printDsgs();
		dsgs3.printDsgs();
		dsgs4.printDsgs();
		dsgs5.printDsgs();
		dsgs6.printDsgs();
		dsgs7.printDsgs();
		dsgs8.printDsgs();
		
		
		
		/*
		dsgs5.showiMyIfsc();
		
		dsgs6.changeBank("PNCCUS33");
		
		dsgs7.nameOfThePerson(14);
		
		
		
		*/
	}
}
class Dsgs{
	private String name ;
	private int id;
	private String  bankName;
	private String ifsc ;
	private String address ;

	public void printDsgs() { // 1st type | no argument | no return type 
		// TODO Auto-generated method stub
		System.out.println("name :"+ name);
		System.out.println("id :"+id);
		System.out.println("bankName :"+bankName);
		System.out.println("ifsc :"+ifsc);
		System.out.println("address :"+address);
		System.out.println();		
	}

	
	void changeBank (String newBank) { // 2nd type | with argument | with out return
		System.out.println("change bank name successful ");
		bankName = newBank;
		System.out.println();
	}
	
	String nameOfThePerson (int id) { // 3nd type | with argument | with out return
		System.out.println();
		System.out.println("Name of the person.. "+ name);
		 
		return name;		
	
	}
	String showiMyIfsc() { //4th type 
		System.out.println();
		 System.out.println("Ifsc :"+ ifsc);
		 return ifsc;
		 
	}
	
	Dsgs(String name, int id, String bankName, String ifsc, String address) {//constructor number 1
		// TODO Auto-generated method stub
		this.name = name;
		this.id = id;
		this.bankName = bankName;
		this.ifsc = ifsc;
		this.address = address;
		}
		
		
/*		
	Dsgs(String name, String bankName, String ifsc, String address) { // constructor number 2
			// TODO Auto-generated method stub
			this.name = name;
			this.ifsc = ifsc;
			this.address = address;
		}
	Dsgs(String name, int id, String bankName, String address) { // constructor number 3
				// TODO Auto-generated method stub
				this.name = name;
				this.id = id;
				this.bankName = bankName;
				this.address = address;			
		}
	
	
*/	
	
	
	
	
}