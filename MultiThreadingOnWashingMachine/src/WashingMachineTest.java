public class WashingMachineTest {
    public static void main(String[] args) {
        System.out.println("MAIN started...\n");

        Cloth cloth[] = new Cloth[3];

        cloth[0] = new Cloth("Silk", "Red", 1000, "Jeans", false);
        cloth[1] = new Cloth("Wool", "Black", 2000, "Sweater", false);
        cloth[2] = new Cloth("Denim", "Blue", 1500, "Jeans", true);

        Water water = new Water("Hard", 34, "40C");
        Electricity elect = new Electricity("ac", 278f, 27, 4, "Birla");
        WashingPowder washPowder = new WashingPowder(20, "Nirma", "top load", false, 400);

        WashingMachine washingMachine1 = new WashingMachine(1, washPowder, water, elect, cloth);
        WashingMachine washingMachine2 = new WashingMachine(2, washPowder, water, elect, cloth);
        WashingMachine washingMachine3 = new WashingMachine(3, washPowder, water, elect, cloth);

        Thread thread1 = new Thread(washingMachine1);
        Thread thread2 = new Thread(washingMachine2);
        Thread thread3 = new Thread(washingMachine3);

        thread1.start();
        thread2.start();
        thread3.start();
// error 1 
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nMAIN finished...\n");
    }
}
//class InsufficientPowder extends Exception {
//    InsufficientPowder(String msg) {
//        super(msg);
//    }
//}
class WaterLogging extends RuntimeException {
    WaterLogging(String msg) {
        super(msg);
    }
}
class VoltageDrop extends RuntimeException {
    VoltageDrop (String msg) {
        super(msg);
    }
}
// 


class WashingMachine implements Runnable {

    boolean waterLogging = false;
    boolean voltageDrop = false;
    private int machineNumber;
    private WashingPowder washPowder;
    private Water water;
    private Electricity elect;
    private Cloth[] cloth;

    public WashingMachine(int machineNumber, WashingPowder washPowder, Water water, Electricity elect, Cloth[] cloth) {
        this.machineNumber = machineNumber;
        this.washPowder = washPowder;
        this.water = water;
        this.elect = elect;
        this.cloth = cloth;
    }

    
    public void run() {
        double value = Math.random() % 10;
        if (value < 0.50) {
            waterLogging = true;
        } else {
            System.out.println("Water Logging is FINE...!!! in Washing Machine"+ machineNumber);
            
        }

        if (waterLogging) {
            throw new WaterLogging("Water Logging detected in Washing Machine " + machineNumber);
        }
        double value1 = Math.random() % 10;
        if (value1 < 0.20) {
            voltageDrop = true;
        } else {
            System.out.println("Voltage is FINE...!!! in Washing Machine"+ machineNumber);
            
        }

        if (voltageDrop) {
            throw new WaterLogging("Voltage Drop is detected in Washing Machine " + machineNumber);
            
        }

        Laundry laundry = new Laundry();
        laundry.setNumberOfCloths(cloth.length);
        laundry.setTimeRequired(1.6f);
        laundry.setWaterUsed(water.getQuantity());
        laundry.setElectricityUsed(elect.getUnitUsed());
        laundry.setCostOfWashingPowder(washPowder.getPrice());
        float cost = washPowder.getPrice() + (elect.getUnitUsed() * elect.getCostPerUnit());
        laundry.setTotalCost(cost);
        laundry.setCostOfWashingPowder(cost / cloth.length);

        System.out.println("Washing machine " + machineNumber + " started (Thread ID: " + Thread.currentThread().getId() + ")");
        System.out.println("Laundry in washing machine " + machineNumber + ": " + laundry);

        // Simulating the washing process by sleeping the thread for some time
        try {
            for (int i = 0; i < 50; i++) {
                System.out.println("Washing machine " + machineNumber + " is running iteration " + i + " (Thread ID: " + Thread.currentThread().getId() + ")");
                Thread.sleep(1000); // Sleep for 1 second (simulating washing)
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
      

//   //         Simulating insufficient washing powder condition
//        if (value < 0.10) {
//            try {
//                throw new InsufficientPowder("Insufficient washing powder. Please refill.");
//            } catch (InsufficientPowder ex) {
//                System.out.println("Error: " + ex.getMessage());
//            }

        System.out.println("Washing machine " + machineNumber + " finished (Thread ID: " + Thread.currentThread().getId() + ")");
    }
}

// Other classes (Cloth, Water, Electricity, WashingPowder, Laundry) remain unchanged...

/*
 * 
 * 
 * 
class WashingMachine implements Runnable {

    private WashingPowder washPowder;
    private Water water;
    private Electricity elect;
    private Cloth[] cloth;

    public WashingMachine(WashingPowder washPowder, Water water, Electricity elect, Cloth[] cloth) {
        this.washPowder = washPowder;
        this.water = water;
        this.elect = elect;
        this.cloth = cloth;
    }

    @Override
    public void run() {
        Laundry laundry = new Laundry();
        // The laundry code here...

        int num = 1;
        for (int i = 0; i < 20; i++) {
            System.out.println("Washing machine " + num + " is running" + i);
        }
    }

    // Other methods and variables of the WashingMachine class...
}

class WashingMachine extends Machine { //isA
	
	WashingTub washTub = new WashingTub(0, null); //hasA

	
		Laundry run(WashingPowder washPowder, Water water, Electricity elect, Cloth cloth[]) {
			Laundry laundry = new Laundry();
			laundry.setNumberOfCloths(cloth.length);
			laundry.setTimeRequired(1.6f);
			laundry.setWaterUsed(water.getQuantity());
			laundry.setElectricityUsed(elect.getUnitUsed());
			laundry.setCostOfWashingPowder(washPowder.getPrice());
			float cost = washPowder.getPrice() + (elect.getUnitUsed()*elect.getCostPerUnit());
			laundry.setTotalCost(cost);
			laundry.setCostOfWashingPowder(cost/cloth.length);
			int num=1;
			for(int i =0; i<20;i++) { 
				System.out.println("the washing "+num+" machine is running"+i);
			}
			num++;
			return laundry;
		}
}


*/

class Laundry {
	private int numberOfCloths; //cloth.length
	private float timeRequired;
	private float totalCost ;// cloth.length * price per cloth
	private float waterUsed;
	private float electricityUsed;
	private float costOfWashingPowder; //
	
	public Laundry () {
		
	}
	public Laundry(int numberOfCloths, float timeRequired, float totalCost, float waterUsed, float electricityUsed,
			float costOfWashingPowder) {
		super();
		this.numberOfCloths = numberOfCloths;
		this.timeRequired = timeRequired;
		this.totalCost = totalCost;
		this.waterUsed = waterUsed;
		this.electricityUsed = electricityUsed;
		this.costOfWashingPowder = costOfWashingPowder;
	}

	
	public String toString() {
		return "Laundry [numberOfCloths=" + numberOfCloths + ", timeRequired=" + timeRequired + ", totalCost="
				+ totalCost + ", waterUsed=" + waterUsed + ", electricityUsed=" + electricityUsed
				+ ", costOfWashingPowder=" + costOfWashingPowder + "]";
	}

	public int getNumberOfCloths() {
		return numberOfCloths;
	}

	public void setNumberOfCloths(int numberOfCloths) {
		this.numberOfCloths = numberOfCloths;
	}

	public float getTimeRequired() {
		return timeRequired;
	}

	public void setTimeRequired(float timeRequired) {
		this.timeRequired = timeRequired;
	}

	public float getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(float totalCost) {
		this.totalCost = totalCost;
	}

	public float getWaterUsed() {
		return waterUsed;
	}

	public void setWaterUsed(float waterUsed) {
		this.waterUsed = waterUsed;
	}

	public float getElectricityUsed() {
		return electricityUsed;
	}

	public void setElectricityUsed(float electricityUsed) {
		this.electricityUsed = electricityUsed;
	}

	public float getCostOfWashingPowder() {
		return costOfWashingPowder;
	}

	public void setCostOfWashingPowder(float costOfWashingPowder) {
		this.costOfWashingPowder = costOfWashingPowder;
	}
	
	
	
	
	
}

class Tub {
	
}

class WashingTub  extends Tub {
	private int capacity;
	private String type; //
	public WashingTub(int capacity, String type) {
		super();
		this.capacity = capacity;
		this.type = type;
	}
	
	public String toString() {
		return "WashingTub [capacity=" + capacity + ", type=" + type + "]";
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}

class Powder {
	
}

class WashingPowder extends Powder { // isA

	private int quantity;
	private String brand;
	private String type;
	private boolean scented;
	private float price;
	
	public WashingPowder(int quantity, String brand, String type, boolean scented, float price) {
		super();
		this.quantity = quantity;
		this.brand = brand;
		this.type = type;
		this.scented = scented;
		this.price = price;
	}
	
	
	public String toString() {
		return "WashingPowder [quantity=" + quantity + ", brand=" + brand + ", type=" + type + ", scented=" + scented
				+ ", price=" + price + "]";
	}
	

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isScented() {
		return scented;
	}

	public void setScented(boolean scented) {
		this.scented = scented;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	
}

class Water {
	private String type;
	private int quantity;
	private String temperature;
	
	public Water(String type, int quantity, String temperature) {
		super();
		this.type = type;
		this.quantity = quantity;
		this.temperature = temperature;
	}
	
	public String toString() {
		return "Water [type=" + type + ", quantity=" + quantity + ", temperature=" + temperature + "]";
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

}

class Electricity {
	private String type; 
	private float voltage; 
	private int costPerUnit;
	private int unitUsed;
	private String supplier;
	public Electricity(String type, float voltage, int costPerUnit, int unitUsed, String supplier) {
		super();
		this.type = type;
		this.voltage = voltage;
		this.costPerUnit = costPerUnit;
		this.unitUsed = unitUsed;
		this.supplier = supplier;
	}
	
	public String toString() {
		return "Electricity [type=" + type + ", voltage=" + voltage + ", costPerUnit=" + costPerUnit + ", unitUsed="
				+ unitUsed + ", supplier=" + supplier + "]";
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getVoltage() {
		return voltage;
	}
	public void setVoltage(float voltage) {
		this.voltage = voltage;
	}
	public int getCostPerUnit() {
		return costPerUnit;
	}
	public void setCostPerUnit(int costPerUnit) {
		this.costPerUnit = costPerUnit;
	}
	public int getUnitUsed() {
		return unitUsed;
	}
	public void setUnitUsed(int unitUsed) {
		this.unitUsed = unitUsed;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	
	
	
}

class Cloth {
	private String material; //
	private String color;
	private float cost;
	private String type;
	private boolean clean; //
	
	public Cloth(String material, String color, float cost, String type, boolean clean) {
		super();
		this.material = material;
		this.color = color;
		this.cost = cost;
		this.type = type;
		this.clean = clean;
	}
	
	public String toString() {
		return "Cloth [material=" + material + ", color=" + color + ", cost=" + cost + ", type=" + type + ", clean="
				+ clean + "]";
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isClean() {
		return clean;
	}
	public void setClean(boolean clean) {
		this.clean = clean;
	}
	

	
}