package lilehanding;



class ImproperParkingException extends Exception {
    public ImproperParkingException(String message) {
        super(message);
    }
}


public class BasementParking {
    private boolean carProperlyParked;
    private boolean bikeProperlyParked;

    public BasementParking(boolean carProperlyParked, boolean bikeProperlyParked) {
        this.carProperlyParked = carProperlyParked;
        this.bikeProperlyParked = bikeProperlyParked;
    }
    
    // Method to simulate improper parking in the basement
//    public void simulateImproperParking() throws ImproperParkingException {
//        double randomValue = Math.random();
//        if (randomValue < 0.1) { // 10% chance of improper parking
//            throw new ImproperParkingException("Car or bike is not properly parked in the basement.");
//        }
    
    
    public void simulateParkingErrors() throws ImproperParkingException {
        double randomValue = Math.random();
        if (randomValue < 0.4) { // 40% chance of improper car parking
            carProperlyParked = false;
            throw new ImproperParkingException("Car is not properly parked in the basement.");
        }

        randomValue = Math.random();
        if (randomValue < 0.5) { // 50% chance of improper bike parking
            bikeProperlyParked = false;
            throw new ImproperParkingException("Bike is not properly parked in the basement.");
        }
    }
    public void checkParkingStatus() throws ImproperParkingException {
        if (!carProperlyParked || !bikeProperlyParked) {
            throw new ImproperParkingException("Car or bike is not properly parked in the basement.");
        }

        System.out.println("Parking area is properly maintained.");
    }

	public void simulateImproperParking() {
		// TODO Auto-generated method stub
		
	}
}
