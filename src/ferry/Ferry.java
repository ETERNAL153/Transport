package transport;

public class Ferry {
    private double maxSpeed;
    private double maxLoad;
    private static long baseNumber=70000;
    private long serialNumber;

    public Ferry(){
        this.maxSpeed=0.0;
        this.maxLoad=0.0;
        this.serialNumber=baseNumber++;
    }
    public Ferry(double maxSpeed,double maxLoad){
        this.maxSpeed=maxSpeed;
        this.maxLoad=maxLoad;
        this.serialNumber=baseNumber++;
    }
}
