package lilehanding;

import java.util.ArrayList;
import java.util.List;

public class City {
    private String cityName;
    private List<Location> locations;

    public City(String cityName) {
        this.cityName = cityName;
        this.locations = new ArrayList<>();
    }

    public void addLocation(Location location) {
        locations.add(location);
    }

    public String getCityName() {
        return cityName;
    }

    public List<Location> getLocations() {
        return locations;
    }

    public void printDetails() {
        System.out.println("City: " + cityName);
        System.out.println("Locations: ");
        for (Location location : locations) {
            location.printDetails();
        }
        System.out.println();
    }
}
