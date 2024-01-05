package transport;
public class Metro extends Train {
    private int totalNumOfStops;
    private static long baseNumber = 25000;
    private long serialNumber;
    public Metro(){
        super();
        this.totalNumOfStops=0;
        this.serialNumber=baseNumber++;
    }
    public Metro(int numberOfWheels, double maxSpeed, int numOfVehicles, String nameOfTheStartingStation, String nameOfTheDestinationStation, int totalNumOfStops ){
        super(numberOfWheels,maxSpeed,numOfVehicles,nameOfTheStartingStation,nameOfTheDestinationStation);
        this.totalNumOfStops = totalNumOfStops;
        this.serialNumber=baseNumber++;
    }
    public int getTotalNumsOfStops(){
        return totalNumOfStops;
    }
    @Override
    public long getSerialNumber(){
        return serialNumber;
    }
}
