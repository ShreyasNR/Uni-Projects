

public class PartTimeStaff extends Staff {

    private double timeFraction;

    public double getTimeFraction() {
        return timeFraction;
    }

    public void setTimeFraction(double timeFraction) {
        this.timeFraction = timeFraction;
    }

    public PartTimeStaff(String name, String id, String position, double timeFraction) {
        super(name, id, position);
        this.timeFraction = timeFraction;
    }

    public PartTimeStaff() {
        

    }

    @Override
    public String toString() {
        return getName() + "\t\t" + getId() + "\t\t" + getPosition() + "\t\t" + String.valueOf(getTimeFraction());

    }
    
}
