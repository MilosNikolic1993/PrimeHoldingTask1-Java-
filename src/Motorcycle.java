public class Motorcycle extends Vehicle {
    private int riderAge;

    public Motorcycle(String brand, String model, double value, int riderAge) {
        super(brand, model, value);
        this.riderAge = riderAge;
    }

    @Override
    public double calculateInsuranceCostPerDay() {
        double dailyInsuranceCost = 0.0002 * value;
        if (riderAge < 25) {
            dailyInsuranceCost *= 1.2;
        }
        return dailyInsuranceCost;
    }

    public int getRiderAge() {
        return riderAge;
    }
}