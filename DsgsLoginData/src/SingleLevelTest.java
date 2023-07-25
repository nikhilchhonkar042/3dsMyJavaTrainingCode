import java.time.LocalDate;
public class SingleLevelTest {
	public static void main(String [] args) {
		
		
		/*Person personObj1 = new Person('M',"nikhil",23);
		personObj1.showPerson();
		Person personObj2 = new Person(20);
		personObj2.showPerson();
		Student studentObj1 = new Student();
		System.out.println("<-------------->");
		Student studentobj1 = new Student('M',"Nikhil",34 ,234,"fkhsdafksdhf","chemical",999);
		studentobj1.showStudent();
		Employee empObj1 = new Employee() ;
		System.out.println("<-------------->");
		*/
		AdhaarCard adhaarCard1 = new AdhaarCard();
		adhaarCard1.setAdhaarNumber("1231 2312 3123");
		adhaarCard1.setAddress("C 709, West Avenue, Mumbai 16");
		adhaarCard1.setNameOnAdhaar("Peter Dsouza");
		adhaarCard1.setFatherName("Patrick Dsouza");
		adhaarCard1.setDateOfBirth(LocalDate.of(2002, 3, 25));
		adhaarCard1.setMobileNumber("9870445533");
		
		AdhaarCard adhaarCard2 = new AdhaarCard();
		adhaarCard2.setAdhaarNumber("9820 2312 3123");
		adhaarCard2.setAddress("D 909, East Avenue, Nagpur 16");
		adhaarCard2.setNameOnAdhaar("Dinesh Sawant");
		adhaarCard2.setFatherName("Guru Sawant");
		adhaarCard2.setDateOfBirth(LocalDate.of(2003, 12, 15));
		adhaarCard2.setMobileNumber("8899445533");


		AdhaarCard adhaarCard3 = new AdhaarCard();
		adhaarCard3.setAdhaarNumber("1231 5312 6123");
		adhaarCard3.setAddress("D22, Ram Mahal, Pune 333");
		adhaarCard3.setNameOnAdhaar("Satish Kulkarni");
		adhaarCard3.setFatherName("Shyam Kulkarni");
		adhaarCard3.setDateOfBirth(LocalDate.of(2000, 7, 29));
		adhaarCard3.setMobileNumber("8870445511");
		
Person personObj = new Person( 'M',"NIKHIL",23);

personObj.setAdhaarCard(adhaarCard1);
		
		personObj.showPerson();
		System.out.println("-----------------");
		
		
		Student studentObj = new Student('F',"Seema",44,   323," Damini Vidyapeeth","Che Eng",499);
		studentObj.setAdhaarCard(adhaarCard2);
		studentObj.showStudent();	
		
		System.out.println("-----------------");
		
		
		Employee empObj = new Employee('F',"Jena",21,   543,"IIT","CSE Eng",979, 212,"Airtel Inc","SDE",889);
		empObj.setAdhaarCard(adhaarCard3);
		empObj.showEmployee();
		
	}
}
class PanCard
{
	private String panNumber;
	private String nameOnPan;
	private LocalDate dateOfBirth;
	private String address;
	private String mobileNumber;
	private String fatherName;
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	public String getNameOnPan() {
		return nameOnPan;
	}
	public void setNameOnPan(String nameOnPan) {
		this.nameOnPan = nameOnPan;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	void printPanCard() {
		System.out.println("-----ADHAAR CARD INFO -----");
		System.out.println("Pan Number  : "+panNumber);
		System.out.println("Pan Name    : "+nameOnPan);
		System.out.println("Pan Address : "+address);
		System.out.println("Birthdate      : "+dateOfBirth);
		System.out.println("Father Name    : "+fatherName);
		System.out.println("Mobile Number  : "+mobileNumber);
		
	}
	
}
class AdhaarCard 
{
	private String adhaarNumber;
	private String nameOnAdhaar;
	private LocalDate dateOfBirth;
	private String address;
	private String mobileNumber;
	private String fatherName;
	
	public String getAdhaarNumber() {
		return adhaarNumber;
	}
	public void setAdhaarNumber(String adhaarNumber) {
		this.adhaarNumber = adhaarNumber;
	}
	public String getNameOnAdhaar() {
		return nameOnAdhaar;
	}
	public void setNameOnAdhaar(String nameOnAdhaar) {
		this.nameOnAdhaar = nameOnAdhaar;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	void printAdhaarCard() {
		System.out.println("-----ADHAAR CARD INFO -----");
		System.out.println("Adhaar Number  : "+adhaarNumber);
		System.out.println("Adhaar Name    : "+nameOnAdhaar);
		System.out.println("Adhaar Address : "+address);
		System.out.println("Birthdate      : "+dateOfBirth);
		System.out.println("Father Name    : "+fatherName);
		System.out.println("Mobile Number  : "+mobileNumber);
		
	}
	
}
class  Person{
	private char gender;
	private String name;
	private int age;
	private AdhaarCard adhaarCard;
	
	Person(){
		//super();// already present there
	}
	
	Person (int age){
		this('F', "NONAME", age);
		/*System.out.println("START=> Person(int)");
		this.age = age;
	System.out.println("FINISH=> Person(int)");*/
	}
	
	Person(char gender, String name, int age){
		System.out.println("START=> Person(char,String,int) ctor....");
		if(gender == 'M' || gender =='F') {
			this.gender = gender;
		}
		else {
			//
			//
			RuntimeException runtimeGenderEx = new RuntimeException("Invalide gender :"+gender );
			throw runtimeGenderEx;
		}
		if(age>=1 && age<=99) {
			this.age = age;
		}
		else {
			RuntimeException runtimeAgeEx = new RuntimeException("Invalide age :"+age );
			throw runtimeAgeEx;
		}
		if(name.matches("^[a-zA-Z]*$")) {
			this .name = name;
		}
		else {
			RuntimeException runtimeNameEx = new RuntimeException("Invalide name :"+name );
			throw runtimeNameEx;
		}
		
	}
	void showPerson() {
		System.out.println("<-Person->");
		System.out.println("Gender :"+gender);
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
		if(adhaarCard!=null) {
			adhaarCard.printAdhaarCard();
			
		}
		else {
			System.out.println("Adhaar is not set");
		}
	}

	public AdhaarCard getAdhaarCard() {
		return adhaarCard;
	}

	public void setAdhaarCard(AdhaarCard adhaarCard) {
		this.adhaarCard = adhaarCard;
	}
	
	
	
	//System.out.println("Done checking data ");
}	
class Student extends Person{
	private int rollNumber;
	private String collegeName;
	private String stream;
	private float totalMarks;

	Student(){
		//super();
		//System.out.println("Student() ctor....");
	}
		Student(char gender, String name, int age, int rollNumber , String collegeName , String stream , float totalMarks){
			super(gender, name, age);//REUSE THE ctor OF THE PARENT
			System.out.println("Student() ctor...");
			
			if(Validator.checkNumber(rollNumber,1,500)) {
				this.rollNumber = rollNumber;
			}
			else {
				RuntimeException runtimeRollEx = new RuntimeException("Invalid Roll Number : "+rollNumber);
				throw  runtimeRollEx;
			}
			if(Validator.checkString(collegeName)){
				this.collegeName = collegeName;
			}
			else {
				RuntimeException runtimeNameEx = new RuntimeException("Invalid collegeName : "+collegeName);
				throw runtimeNameEx;
			}
			if(Validator.checkString(stream)) {
				this.stream = stream;
			}
			else {
				RuntimeException runtimeNameEx = new RuntimeException("Invalid stream : "+stream);
				throw runtimeNameEx;
			}
			

			if(Validator.checkNumber(totalMarks, 1, 1000)) {
				this.totalMarks = totalMarks;			
			}
			else {
				RuntimeException runtimeMarksEx = new RuntimeException("Invalid Marks : "+totalMarks);
				throw runtimeMarksEx;
			}
			
		}
		
		void showStudent() {
			super.showPerson();// super. to invoke super class member/data/function
			System.out.println("<--Student-->");
			System.out.println("---- STUDENT ----");
			System.out.println("ROLLNO : "+rollNumber);
			System.out.println("COLLGE : "+collegeName);
			System.out.println("STREAM : "+stream);
			System.out.println("MARKS  : "+totalMarks);
		}
	}

class Employee extends Student {
	private int empno;
	private String companyName;
	private String designation;
	float salary;
	
	Employee(char gender, String name, int age, int rollNumber,String collegeName, String stream, float totalMarks,int empno, String companyName, String designation, float salary) {
		super( gender,  name,  age,  rollNumber, collegeName,  stream,  totalMarks);
		System.out.println("Employee() ctor...");
		
		if(Validator.checkNumber(empno, 100, 2000)) {
			this.empno = empno;			
		}
		else {
			RuntimeException runtimeEmpnoEx = new RuntimeException("Invalid empno : "+empno);
			throw runtimeEmpnoEx;
		}
		
		if(Validator.checkStringWithSpace(companyName)) {
			this.companyName = companyName;
		}
		else {
			RuntimeException runtimeCompanyNameEx = new RuntimeException("Invalid companyName : "+companyName);
			throw runtimeCompanyNameEx;
		}
		
		if(Validator.checkStringWithSpace(designation)) {
			this.designation = designation;
		}
		else {
			RuntimeException runtimeDesignationEx = new RuntimeException("Invalid designation : "+designation);
			throw runtimeDesignationEx;
		}
		

		if(Validator.checkNumber(salary, 5000, 20000)) {
			this.salary = salary;			
		}
		else {
			RuntimeException runtimeSalaryEx = new RuntimeException("Invalid salary : "+salary);
			throw runtimeSalaryEx;
		}
	}
	
	void showEmployee() {
		super.showStudent(); 
		System.out.println("---- EMPLOYEE ----");
		System.out.println("EMPNO  : "+empno);
		System.out.println("COMPANY: "+companyName);
		System.out.println("DESG   : "+designation);
		System.out.println("SALARY : "+salary);
	}
}