package lilehanding;

import java.util.ArrayList;
import java.util.List;

public class Floor {
    private String name;
    private List<String> amenities;
    private List<Room> rooms;
    private List<String> basementParkings;

    public Floor(String name) {
        this.name = name;
        amenities = new ArrayList<>();
        rooms = new ArrayList<>();
        basementParkings = new ArrayList<>();
    }

    public void addAmenity(String category, String name) {
        amenities.add(category + ": " + name);
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void addBasementParking(String parkingType) {
        basementParkings.add(parkingType);
    }

    public void printDetails() {
        System.out.println("Floor: " + name);
        System.out.println("Amenities: ");
        for (String amenity : amenities) {
            System.out.println("- " + amenity);
        }
        System.out.println("Rooms: ");
        for (Room room : rooms) {
            room.printDetails();
        }
        System.out.println("Basement Parking: ");
        for (String parkingType : basementParkings) {
            System.out.println("- " + parkingType);
        }
        System.out.println();
    }
}
