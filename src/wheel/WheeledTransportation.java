package transport;
public class WheeledTransportation {
    private int numberOfWheels;
    private double maxSpeed;
    private long serialNumber;
    public WheeledTransportation(){
        this.numberOfWheels=0;
        this.maxSpeed=0.0;
        this.serialNumber=0;
    }
    public WheeledTransportation(int numberOfWheels, double maxSpeed) {
        this.numberOfWheels = numberOfWheels;
        this.maxSpeed = maxSpeed;
    }

    public long getSerialNumber() {
        return serialNumber;
    }
    public int getNumOfWheels(){
        return numberOfWheels;
    }
    public double getmaxSpeed(){
        return maxSpeed;
    }

}