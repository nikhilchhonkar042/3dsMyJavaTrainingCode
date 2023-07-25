
public class AbstractTest {
	public static void main(String[] args) {
		
				//Cannot instantiate the type GeometricalShape
		GeometricalShape geoShape = new Square(20);
		
		geoShape.calcArea();
		geoShape.calcPerimeter();
		
		System.out.println("-------------");
		
		geoShape = new Rectangle(5,2);
		geoShape.calcArea();
		geoShape.calcPerimeter();
	}
}

// class with abstract power **
abstract class GeometricalShape
{
	abstract void calcArea(); //METHOD WITHOUT BODY
	abstract void calcPerimeter();
	
	void fillColor() { //METHOD WITH BODY
		System.out.println("Filling color...");
	}
}


//The type Square must implement the inherited abstract method GeometricalShape.calcArea()
class Square extends GeometricalShape //inheritance of implementation
{
	private int length;
	
	public Square(int length) {
		super();
		this.length = length;
	}
	
	void calcArea() {//   MANDATORY
		float area = length * length;
		System.out.println("Square area : "+area);
	}
	void calcPerimeter() {     //   MANDATORY
		float perimeter = 4 * length;
		System.out.println("Perimeter of Square : "+perimeter);
	}

	public int getlength() {
		return length;
	}
	
}

class Rectangle extends Square         //inheritance of derivation
{
	int width;

	public Rectangle(int length, int width) {
		super(length);// calling length from super class, no need to write it again 
		this.width = width;
	}
	// we have to overwrite it other wise wo super class ka method use karega , os ko update ker na is must 
	void calcArea() {//MANDATORY
		float area = getlength() * width;
		System.out.println("Rectangle area : "+area);
	}
	void calcPerimeter() { //MANDATORY
		float perimeter = 2*(getlength() + width);// have to use getlength bec yha per private length of super class can not call directly .
		System.out.println("Perimeter of Rectangle : "+perimeter);
	}
	
}
