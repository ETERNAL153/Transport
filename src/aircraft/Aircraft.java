package transport;

public class Aircraft {
    private double price;
    private double maxElevation;
    private static long baseNumber=10000;
    private long serialNumber;

    public Aircraft(){
        this.price=0.0;
        this.maxElevation=0.0;
        this.serialNumber=baseNumber++;
    }
    public Aircraft(double price,double maxElevation){
        this.price=price;
        this.maxElevation=maxElevation;
        this.serialNumber=baseNumber++;
    }
    public double getprice() {
        return price;
    }
    public double getmaxElevation() {
        return maxElevation;
    }
    public long getSerialNumber(){
        return serialNumber;
    }
}
