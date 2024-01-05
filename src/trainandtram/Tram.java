package transport;

public class Tram extends Metro {
    private int yearOfCreation;
    private static long baseNumber = 30000;
    private long serialNumber;
    public Tram(){
        super();
        this.yearOfCreation=0;
        this.serialNumber=baseNumber++;

    }

    public Tram(int numberOfWheels, double maxSpeed, int numOfVehicles, String nameOfTheStartingStation, String nameOfTheDestinationStation, int totalNumberOfStops, int yearOfCreation ){
        super(numberOfWheels,maxSpeed,numOfVehicles,nameOfTheStartingStation,nameOfTheDestinationStation,totalNumberOfStops);
        this.yearOfCreation = yearOfCreation;
        this.serialNumber=baseNumber++;
    }

    public int getYearOfCreation() {
        return yearOfCreation;
    }

    @Override
    public long getSerialNumber(){
        return serialNumber;
    }
}