
public class FinalFieldTest {

	public static void main(String[] args) {
		final float PI = 3.14f; // local variable of mian
		System.out.println("PI"+PI);
		
		
		Circle circ1 = new Circle(56.32f);
		Circle circ2 = new Circle(6.32f);
		Circle circ3 = new Circle(4.32f);
		Circle circ4 = new Circle(52.32f);
		
		circ1.calcArea();
		circ2.calcArea();
		circ3.calcArea();
		circ4.calcArea();
		
		Car car1 = new Car("Blue","RJ-05-292342");
		Car car2 = new Car("Red","RJ-01-2923432");
		Car car3 = new Car("Black","RJ-14-293422");
		Car car4 = new Car("Blue","RJ-02-24422");
		car1.showCar();
		car2.showCar();
		car3.showCar();
		car4.showCar();
	}

}
class Car 
{
	private String color;
	private final String numberPlate ;
	
	Car (String c, String np){
		color = c;
		numberPlate = np;
	}
	
	void setCar(String c, String np) {
		color = c;
		// numberplate =np;
	}
	void showCar() {
		System.out.println("Car : "+color);
		System.out.println("NP  : "+numberPlate);
	}
	
}

class Circle
{
	private float radius;
	
	private static final float PI=3.14f; //constant | data member | universal constant
	
	
	
	public Circle(float radius) {
		super();
		this.radius = radius;
		
	}
	void calcArea() {
		float area = PI * radius *radius ;
		System.out.println("Area : "+area);
	}
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
}