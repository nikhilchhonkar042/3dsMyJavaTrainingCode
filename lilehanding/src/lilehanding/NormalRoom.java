package lilehanding;

public class NormalRoom extends Room {
    public NormalRoom(String name) {
        super(name);
    }

    @Override
    public float calculateRent() {
        // Calculate rent for Normal Room (room basic rent + electricity + wifi + washing + ro water + food)
        float basicRent = 3000; // Basic rent for Normal Room
        float electricityCharge = 2000; // Monthly electricity charge
        float wifiCharge = 500; // Monthly wifi charge
        float washingCharge = 1000; // Monthly washing charge
        float roWaterCharge = 300; // Monthly RO water charge
        float foodCharge = 4000; // Monthly food charge

        return basicRent + electricityCharge + wifiCharge + washingCharge + roWaterCharge + foodCharge;
    }
}
