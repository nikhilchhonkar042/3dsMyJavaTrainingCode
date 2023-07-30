package lilehanding;

public class GlobalPGService {
    public static void main(String[] args) {
        try {
            // Creating cities
            City city1 = new City("Pune");
            City city2 = new City("Mumbai");

            // Creating locations within each city
            Location location1 = new Location("Central Park, Pune");
            Location location2 = new Location("Andheri, Mumbai");
            Location location3 = new Location("Powai, Mumbai");

            // Creating buildings within each location
            Building building1 = new Building("Pune", "Central Park", "Skyrise Apartments", "1234 Park Avenue");
            Building building2 = new Building("London", "Westminster", "Luxury Residences", "4567 Oxford Street");
            Building building3 = new Building("Paris", "Champs-Élysées", "Eiffel Towers", "789 Avenue des Champs-Élysées");
            Building building4 = new Building("Tokyo", "Shinjuku", "Highrise Condos", "1010 Shinjuku Avenue");
            Building building5 = new Building("Mumbai", "Bandra", "Seaside Villas", "555 Bandstand Road");

            // Creating floors within each building
            Floor floor1 = new Floor("Floor 1, Skyrise Apartments, Central Park, Pune");
            Floor floor2 = new Floor("Floor 2, Skyrise Apartments, Central Park, Pune");
            Floor floor3 = new Floor("Floor 1, Building 1, Andheri, Mumbai");
            Floor floor4 = new Floor("Floor 2, Building 1, Andheri, Mumbai");
            Floor floor5 = new Floor("Floor 1, Building 1, Powai, Mumbai");
            Floor floor6 = new Floor("Floor 2, Building 1, Powai, Mumbai");

            // Adding amenities to floors
            floor1.addAmenity("Top Floor Open Area", "Rest Area");
            floor1.addAmenity("Top Floor Open Area", "TV Area");
            floor1.addAmenity("Top Floor Open Area", "Meeting Area");

            floor2.addAmenity("Gym", "Treadmill");
            floor2.addAmenity("Gym", "Cycle");
            floor2.addAmenity("Gym", "Gym Equipments");

            floor3.addAmenity("Mess", "Mess");

            floor4.addAmenity("Play Area", "Table Tennis");
            floor4.addAmenity("Play Area", "Pool");
            floor4.addAmenity("Play Area", "Carom");
            floor4.addAmenity("Washing Area", "Washing Area");

            // Creating rooms on each floor
            Room room1 = new PremiumRoom("Room 101, Floor 1, Skyrise Apartments, Central Park, Pune", true, true, true, true);
            Room room2 = new PremiumRoom("Room 102, Floor 1, Skyrise Apartments, Central Park, Pune", true, true, true, true);
            Room room3 = new NormalRoom("Room 201, Floor 2, Skyrise Apartments, Central Park, Pune");
            Room room4 = new NormalRoom("Room 202, Floor 2, Skyrise Apartments, Central Park, Pune");
            Room room5 = new NormalRoom("Room 101, Floor 1, Building 1, Andheri, Mumbai");
            Room room6 = new PremiumRoom("Room 102, Floor 1, Building 1, Andheri, Mumbai", true, true, true, true);
            Room room7 = new NormalRoom("Room 101, Floor 1, Building 1, Powai, Mumbai");
            Room room8 = new NormalRoom("Room 102, Floor 1, Building 1, Powai, Mumbai");

            // Adding rooms to floors
            floor1.addRoom(room1);
            floor1.addRoom(room2);
            floor2.addRoom(room3);
            floor2.addRoom(room4);
            floor3.addRoom(room5);
            floor3.addRoom(room6);
            floor4.addRoom(room7);
            floor4.addRoom(room8);

            // Adding basement parking types to buildings
            building1.addBasementParking("Car Parking");
            building1.addBasementParking("Bike Parking");
            building2.addBasementParking("Car Parking");
            building2.addBasementParking("Bike Parking");
            building3.addBasementParking("Car Parking");
            building3.addBasementParking("Bike Parking");

            // Adding floors to buildings
            building1.addFloor(floor1);
            building1.addFloor(floor2);
            building2.addFloor(floor3);
            building3.addFloor(floor4);
            building2.addFloor(floor5);
            building3.addFloor(floor6);

            // Adding buildings to locations
            location1.addBuilding(building1);
            location2.addBuilding(building2);
            location3.addBuilding(building3);

            // Adding locations to cities
            city1.addLocation(location1);
            city2.addLocation(location2);
            city2.addLocation(location3);
            
            
            
//            // Creating more buildings
//            Building building6 = new Building("Pune", "Koregaon Park", "Lakeview Residency", "2468 MG Road");
//            Building building7 = new Building("Mumbai", "Colaba", "Harbor View Apartments", "789 Seaface Drive");
//            Building building8 = new Building("Pune", "Hinjewadi", "Tech Park Towers", "1357 Rajiv Gandhi Infotech Park");
//            Building building9 = new Building("Mumbai", "Dadar", "City Central Homes", "456 Dadar West Road");
//
//            // Creating more floors
//            Floor floor7 = new Floor("Floor 1, Lakeview Residency, Koregaon Park, Pune");
//            Floor floor8 = new Floor("Floor 2, Lakeview Residency, Koregaon Park, Pune");
//            Floor floor9 = new Floor("Floor 1, Harbor View Apartments, Colaba, Mumbai");
//            Floor floor10 = new Floor("Floor 2, Harbor View Apartments, Colaba, Mumbai");
//            Floor floor11 = new Floor("Floor 1, City Central Homes, Dadar, Mumbai");
//            Floor floor12 = new Floor("Floor 2, City Central Homes, Dadar, Mumbai");
//
//            // Adding amenities to floors
//            floor7.addAmenity("Top Floor Open Area", "Rest Area");
//            floor7.addAmenity("Top Floor Open Area", "TV Area");
//            floor7.addAmenity("Top Floor Open Area", "Meeting Area");
//
//            floor8.addAmenity("Gym", "Treadmill");
//            floor8.addAmenity("Gym", "Cycle");
//            floor8.addAmenity("Gym", "Gym Equipments");
//
//            floor9.addAmenity("Mess", "Mess");
//
//            floor10.addAmenity("Play Area", "Table Tennis");
//            floor10.addAmenity("Play Area", "Pool");
//            floor10.addAmenity("Play Area", "Carom");
//            floor10.addAmenity("Washing Area", "Washing Area");
//
//            // Creating rooms on each floor
//            Room room9 = new PremiumRoom("Room 101, Floor 1, Lakeview Residency, Koregaon Park, Pune", true, true, true, true);
//            Room room10 = new PremiumRoom("Room 102, Floor 1, Lakeview Residency, Koregaon Park, Pune", true, true, true, true);
//            Room room11 = new NormalRoom("Room 201, Floor 2, Lakeview Residency, Koregaon Park, Pune");
//            Room room12 = new NormalRoom("Room 202, Floor 2, Lakeview Residency, Koregaon Park, Pune");
//            Room room13 = new NormalRoom("Room 101, Floor 1, Harbor View Apartments, Colaba, Mumbai");
//            Room room14 = new PremiumRoom("Room 102, Floor 1, Harbor View Apartments, Colaba, Mumbai", true, true, true, true);
//            Room room15 = new NormalRoom("Room 101, Floor 1, City Central Homes, Dadar, Mumbai");
//            Room room16 = new NormalRoom("Room 102, Floor 1, City Central Homes, Dadar, Mumbai");
//
//            // Adding rooms to floors
//            floor7.addRoom(room9);
//            floor7.addRoom(room10);
//            floor8.addRoom(room11);
//            floor8.addRoom(room12);
//            floor9.addRoom(room13);
//            floor9.addRoom(room14);
//            floor10.addRoom(room15);
//            floor10.addRoom(room16);
//
//            // Adding basement parking types to buildings
//            building6.addBasementParking("Car Parking");
//            building6.addBasementParking("Bike Parking");
//            building7.addBasementParking("Car Parking");
//            building7.addBasementParking("Bike Parking");
//            building8.addBasementParking("Car Parking");
//            building8.addBasementParking("Bike Parking");
//            building9.addBasementParking("Car Parking");
//            building9.addBasementParking("Bike Parking");
//
//            // Adding floors to buildings
//            building1.addFloor(floor1);
//            building1.addFloor(floor2);
//            building2.addFloor(floor3);
//            building3.addFloor(floor4);
//            building2.addFloor(floor5);
//            building3.addFloor(floor6);
//            building6.addFloor(floor7);
//            building6.addFloor(floor8);
//            building7.addFloor(floor9);
//            building7.addFloor(floor10);
//            building8.addFloor(floor11);
//            building8.addFloor(floor12);
//
//            // Adding buildings to locations
//            location1.addBuilding(building1);
//            location2.addBuilding(building2);
//            location3.addBuilding(building3);
//            location1.addBuilding(building6);
//            location2.addBuilding(building7);
//            location3.addBuilding(building8);
//            location2.addBuilding(building9);
//            // ... Add more buildings to locations as needed ...
//
//            // Adding locations to cities
//            city1.addLocation(location1);
//            city2.addLocation(location2);
//            city2.addLocation(location3);

//            // Printing details
//            city1.printDetails();
//            city2.printDetails();
            // Printing details
            System.out.println("Details of " + city1.getCityName() + ":");
            city1.printDetails();
            System.out.println();

            System.out.println("Details of " + city2.getCityName() + ":");
            city2.printDetails();
            System.out.println();
            
            
//            // Simulate electricity loss in a room
//            room1.simulateElectricityLoss();
//
//            // Simulate room key loss
//            room2.simulateRoomKeyLoss();
//
//            // Simulate electricity and washing powder loss in the washing area
//            WashingArea washingArea = new WashingArea(false, false);
//            washingArea.simulateWashingAreaErrors();
//
//            // Simulate improper parking in the basement
//            BasementParking basementParking = new BasementParking(false, true);
//            basementParking.simulateImproperParking();
//
//            
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        
    }
}
