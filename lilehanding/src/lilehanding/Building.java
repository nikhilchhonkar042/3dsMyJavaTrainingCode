package lilehanding;

import java.util.ArrayList;
import java.util.List;

public class Building {
    private String cityName;
    private String locationName;
    private String buildingName;
    private String address;
    private List<Floor> floors;
    private Basement basement;

    public Building(String cityName, String locationName, String buildingName, String address) {
        this.cityName = cityName;
        this.locationName = locationName;
        this.buildingName = buildingName;
        this.address = address;
        this.floors = new ArrayList<>();
    }

    public void addFloor(Floor floor) {
        floors.add(floor);
    }

    public void addBasementParking(String basementDetails) {
        this.basement = new Basement(basementDetails);
    }

    public String getCityName() {
        return cityName;
    }

    public String getLocationName() {
        return locationName;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public String getAddress() {
        return address;
    }

    public List<Floor> getFloors() {
        return floors;
    }

    public Basement getBasement() {
        return basement;
    }

    @Override
    public String toString() {
        StringBuilder buildingInfo = new StringBuilder();
        buildingInfo.append("City: ").append(cityName).append("\n");
        buildingInfo.append("Location: ").append(locationName).append("\n");
        buildingInfo.append("Building Name: ").append(buildingName).append("\n");
        buildingInfo.append("Address: ").append(address).append("\n");

        if (basement != null) {
            buildingInfo.append("Basement Parking: ").append(basement.getBasementDetails()).append("\n");
        } else {
            buildingInfo.append("Basement Parking: Not Available\n");
        }

        buildingInfo.append("Floors: ").append("\n");
        for (Floor floor : floors) {
            buildingInfo.append(floor.toString()).append("\n");
        }

        return buildingInfo.toString();
    }

	public void printDetails() {
		// TODO Auto-generated method stub
        System.out.println("City: " + cityName);
        System.out.println("Location: " + locationName);
        System.out.println("Building Name: " + buildingName);
        System.out.println("Address: " + address);

        if (basement != null) {
            System.out.println("Basement Parking: " + basement.getBasementDetails());
        } else {
            System.out.println("Basement Parking: Not Available");
        }

        System.out.println("Floors: ");
        for (Floor floor : floors) {
            floor.printDetails();
        }
		
	}
}
