package Activity2;
import java.util.Random;

public class Transport extends Road {
    private Integer transportId;
    private float consumption;
    private double fuelTank;

    public Transport(float consumption, double fuelTank) {
        this.consumption = 0;
        this.fuelTank = 0;
    }


    public void setTransportId(Integer transportId) {
        this.transportId = transportId;
    }

    public void setConsumption(float consumption) {
        this.consumption = consumption;
    }

    public void setFuelTank(double fuelTank) {
        this.fuelTank = fuelTank;
    }

    public float getConsumption() {
        return consumption;
    }

    public double getFuelTank() {
        return fuelTank;
    }

    public Integer getTransportId() {
        return transportId;
    }

    public int generateId() {
        Random random = new Random();
        return random.nextInt(300);
    }

    public String toString() {
        return " ( " +
                "fuel tank = " + fuelTank + "\n" +
                "consumption = " + consumption + "\n" +
                ")";
    }

    public boolean move() {
        if (getDistance() / getConsumption() >= fuelTank) {
            System.out.println("You will arrive!");

        }
        else {
            System.out.println("You need more fuel");

        }
        return true;



    }
}

