package lilehanding;

public class WashingArea {
    private boolean electricityAvailable;
    private boolean washingPowderAvailable;
    private boolean electricityIsOn;
  

    public WashingArea(boolean electricityIsOn, boolean washingPowderAvailable) {
        this.setElectricityIsOn(electricityIsOn);
        this.washingPowderAvailable = washingPowderAvailable;
    }

    public void simulateWashingAreaErrors() throws ElectricityLossException, Exception {
        double randomValue = Math.random();
        if (randomValue < 0.2) { // 20% chance of electricity loss
            throw new ElectricityLossException("Electricity is lost in the washing area.");
        }

        randomValue = Math.random();
        if (randomValue < 0.3) { // 30% chance of washing powder loss
            if (washingPowderAvailable) {
                washingPowderAvailable = false;
                throw new Exception("Washing powder is all used up.");
            }
        }
    }

    
    

    public void washClothes() throws ElectricityAndWashingPowderLossException {
        if (!electricityAvailable) {
            throw new ElectricityAndWashingPowderLossException("Electricity is gone in the washing area.");
        }

        if (!washingPowderAvailable) {
            throw new ElectricityAndWashingPowderLossException("Washing powder is all used up in the washing area.");
        }

        System.out.println("Washing clothes...");
    }

	public boolean isElectricityIsOn() {
		return electricityIsOn;
	}

	public void setElectricityIsOn(boolean electricityIsOn) {
		this.electricityIsOn = electricityIsOn;
	}
	
}

