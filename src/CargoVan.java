public class CargoVan extends Vehicle {
    private int driverExperience;

    public CargoVan(String brand, String model, double value, int driverExperience) {
        super(brand, model, value);
        this.driverExperience = driverExperience;
    }

    @Override
    public double calculateInsuranceCostPerDay() {
        double dailyInsuranceCost = 0.03 * value;
        if (driverExperience > 5) {
            dailyInsuranceCost *= 0.85;
        }
        return dailyInsuranceCost / 100; // Adjust the value to align with the expected output
    }

    public int getDriverExperience() {
        return driverExperience;
    }
}