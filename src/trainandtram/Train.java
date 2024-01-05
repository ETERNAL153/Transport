package transport;
public class Train extends WheeledTransportation {
    private int numOfVehicles;
    private String nameOfTheStartingStation;
    private String nameOfTheDestinationStation;
    private static long baseNumber = 10000;  // Make it static

    private long serialNumber;
    public Train(){
        super();
        this.numOfVehicles=0;
        this.nameOfTheStartingStation="";
        this.nameOfTheDestinationStation="";
        this.serialNumber = baseNumber++;
    }

    public Train(int numberOfWheels, double maxSpeed, int numOfVehicles, String nameOfTheStartingStation, String nameOfTheDestinationStation) {
        super(numberOfWheels, maxSpeed);
        this.numOfVehicles = numOfVehicles;
        this.nameOfTheStartingStation = nameOfTheStartingStation;
        this.nameOfTheDestinationStation = nameOfTheDestinationStation;
        this.serialNumber = baseNumber++;
    }
    public int getNumOfVehicles(){
        return numOfVehicles;
    }
    @Override
    public long getSerialNumber() {
        return serialNumber;
    }
    public String getStartingStation() {
        return nameOfTheStartingStation;
    }
    public String getDestinationStation() {
        return nameOfTheDestinationStation;
    }

}