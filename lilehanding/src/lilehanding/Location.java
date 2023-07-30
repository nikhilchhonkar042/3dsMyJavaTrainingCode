package lilehanding;

import java.util.ArrayList;
import java.util.List;

public class Location {
    private String locationName;
    private List<Building> buildings;

    public Location(String locationName) {
        this.locationName = locationName;
        this.buildings = new ArrayList<>();
    }

    public void addBuilding(Building building) {
        buildings.add(building);
    }

    public String getLocationName() {
        return locationName;
    }

    public List<Building> getBuildings() {
        return buildings;
    }

    public void printDetails() {
        System.out.println("Location: " + locationName);
        System.out.println("Buildings: ");
        for (Building building : buildings) {
            building.printDetails();
        }
        System.out.println();
    }
}
