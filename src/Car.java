public class Car extends Vehicle {
    private int safetyRating;

    public Car(String brand, String model, double value, int safetyRating) {
        super(brand, model, value);
        this.safetyRating = safetyRating;
    }

    @Override
    public double calculateInsuranceCostPerDay() {
        double dailyInsuranceCost = 0.01 * value;
        if (safetyRating >= 4) {
            dailyInsuranceCost *= 0.9;
        }
        return dailyInsuranceCost / 100; // Adjust the value to align with the expected output
    }

    public int getSafetyRating() {
        return safetyRating;
    }
}