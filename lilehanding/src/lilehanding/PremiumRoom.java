package lilehanding;

public class PremiumRoom extends Room {
    private boolean hasAC;
    private boolean hasFridge;
    private boolean hasTV;
    private boolean hasWiFi;

    public PremiumRoom(String name, boolean hasAC, boolean hasFridge, boolean hasTV, boolean hasWiFi) {
        super(name);
        this.hasAC = hasAC;
        this.hasFridge = hasFridge;
        this.hasTV = hasTV;
        this.hasWiFi = hasWiFi;
    }

    @Override
    public float calculateRent() {
        // Calculate rent for Premium Room (room basic rent + electricity + wifi + washing + ro water + food)
        float basicRent = 5000; // Basic rent for Premium Room
        float electricityCharge = 2000; // Monthly electricity charge
        float wifiCharge = 500; // Monthly wifi charge
        float washingCharge = 1000; // Monthly washing charge
        float roWaterCharge = 300; // Monthly RO water charge
        float foodCharge = 4000; // Monthly food charge

        return basicRent + electricityCharge + wifiCharge + washingCharge + roWaterCharge + foodCharge;
    }

    @Override
    public String toString() {
        return super.toString() + ", AC: " + hasAC + ", Fridge: " + hasFridge + ", TV: " + hasTV + ", WiFi: " + hasWiFi;
    }
}

