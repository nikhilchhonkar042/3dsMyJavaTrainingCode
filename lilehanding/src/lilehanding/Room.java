package lilehanding;

public abstract class Room {
    protected String name;

    public Room(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract float calculateRent();

    public void printDetails() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Room: " + name;
    }
    // Method to simulate electricity loss
    public void simulateElectricityLoss() throws ElectricityLossException {
        double randomValue = Math.random();
        if (randomValue < 0.3) { // 30% chance of electricity loss
            throw new ElectricityLossException("Electricity is lost in the room.");
        }
    }

    // Method to simulate room key loss
    public void simulateRoomKeyLoss() throws RoomKeyLossException {
        double randomValue = Math.random();
        if (randomValue < 0.1) { // 10% chance of room key loss
            throw new RoomKeyLossException("Room key is lost.");
        }
    
    // Method to simulate electricity loss in the room
    public void simulateElectricityLoss() throws ElectricityLossException {
        System.out.println("Electricity is gone in " + name + ". Please contact the management.");
        throw new ElectricityLossException("Electricity loss in the room: " + name);
    }

    // Method to simulate room key loss
    public void simulateRoomKeyLoss() throws RoomKeyLossException {
        System.out.println("Room key is lost in " + name + ". Please contact the management.");
        throw new RoomKeyLossException("Room key loss in the room: " + name);
    }
}
