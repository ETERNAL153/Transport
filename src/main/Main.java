package transport;

public class Main {
    public static void main(String[] args) {
        // Create multiple Train objects
        Train train1 = new Train(4, 60.5, 8, "Station X", "Station Y");
        Train train2 = new Train(6, 55.2, 10, "Station P", "Station Q");
        Train train3 = new Train(8, 72.3, 12, "Station M", "Station N");

        // Print Train data for each object
        System.out.println("Train 1 Data:");
        printTrainData(train1);

        System.out.println("Train 2 Data:");
        printTrainData(train2);

        System.out.println("Train 3 Data:");
        printTrainData(train3);

        // Create multiple Metro objects
        Metro metro1 = new Metro(6, 45.8, 10, "Station A", "Station B", 15);
        Metro metro2 = new Metro(8, 50.0, 12, "Station C", "Station D", 20);
        Metro metro3 = new Metro(10, 55.5, 14, "Station E", "Station F", 25);

        // Print Metro data for each object
        System.out.println("Metro 1 Data:");
        printMetroData(metro1);

        System.out.println("Metro 2 Data:");
        printMetroData(metro2);

        System.out.println("Metro 3 Data:");
        printMetroData(metro3);

        // Create multiple Tram objects
        Tram tram1 = new Tram(6, 35.2, 6, "Station M", "Station N", 8, 1995);
        Tram tram2 = new Tram(4, 30.0, 4, "Station K", "Station L", 5, 2000);
        Tram tram3 = new Tram(8, 40.5, 8, "Station R", "Station S", 10, 2010);

        // Print Tram data for each object
        System.out.println("Tram 1 Data:");
        printTramData(tram1);

        System.out.println("Tram 2 Data:");
        printTramData(tram2);

        System.out.println("Tram 3 Data:");
        printTramData(tram3);
    }

    private static void printTrainData(Train train) {
        System.out.println("Number of Wheels: " + train.getNumOfWheels());
        System.out.println("Max Speed: " + train.getmaxSpeed());
        System.out.println("Number of Vehicles: " + train.getNumOfVehicles());
        System.out.println("Starting Station: " + train.getStartingStation());
        System.out.println("Destination Station: " + train.getDestinationStation());
        System.out.println("Total Serial Number: " + train.getSerialNumber());
        System.out.println();
    }

    private static void printMetroData(Metro metro) {
        System.out.println("Number of Wheels: " + metro.getNumOfWheels());
        System.out.println("Max Speed: " + metro.getmaxSpeed());
        System.out.println("Number of Vehicles: " + metro.getNumOfVehicles());
        System.out.println("Starting Station: " + metro.getStartingStation());
        System.out.println("Destination Station: " + metro.getDestinationStation());
        System.out.println("Total Number of Stops: " + metro.getTotalNumsOfStops());
        System.out.println("Total Serial Number: " + metro.getSerialNumber());
        System.out.println();
    }

    private static void printTramData(Tram tram) {
        System.out.println("Number of Wheels: " + tram.getNumOfWheels());
        System.out.println("Max Speed: " + tram.getmaxSpeed());
        System.out.println("Number of Vehicles: " + tram.getNumOfVehicles());
        System.out.println("Starting Station: " + tram.getStartingStation());
        System.out.println("Destination Station: " + tram.getDestinationStation());
        System.out.println("Total Number of Stops: " + tram.getTotalNumsOfStops());
        System.out.println("Year of Creation: " + tram.getYearOfCreation());
        System.out.println("Total Serial Number: " + tram.getSerialNumber());
        System.out.println();
    }
}
