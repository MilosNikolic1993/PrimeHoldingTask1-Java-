import java.time.LocalDate;

public class Rental {
    private Vehicle vehicle;
    private int rentalDays;
    private LocalDate reservationStartDate;
    private LocalDate reservationEndDate;
    private LocalDate actualReturnDate;

    public Rental(Vehicle vehicle, int rentalDays, LocalDate reservationStartDate, LocalDate actualReturnDate) {
        this.vehicle = vehicle;
        this.rentalDays = rentalDays;
        this.reservationStartDate = reservationStartDate;
        this.reservationEndDate = reservationStartDate.plusDays(rentalDays);
        this.actualReturnDate = actualReturnDate;
    }

    public double calculateRentalCostPerDay() {
        if (vehicle instanceof Car) {
            return rentalDays <= 7 ? 20 : 15;
        } else if (vehicle instanceof Motorcycle) {
            return rentalDays <= 7 ? 15 : 10;
        } else if (vehicle instanceof CargoVan) {
            return rentalDays <= 7 ? 50 : 40;
        }
        return 0.0;
    }

    public double calculateTotalRentalCost() {
        return calculateRentalCostPerDay() * rentalDays;
    }

    public double calculateInsuranceCostPerDay() {
        return vehicle.calculateInsuranceCostPerDay();
    }

    public double calculateTotalInsuranceCost() {
        return calculateInsuranceCostPerDay() * rentalDays;
    }

    public double calculateInsuranceAdditionPerDay() {
        return 0.50;
    }

    public double calculateTotalInsuranceAddition() {
        return calculateInsuranceAdditionPerDay() * rentalDays;
    }

    public double calculateTotalCost() {
        return calculateTotalRentalCost() + calculateTotalInsuranceCost() + calculateTotalInsuranceAddition();
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public LocalDate getReservationStartDate() {
        return reservationStartDate;
    }

    public LocalDate getReservationEndDate() {
        return reservationEndDate;
    }

    public LocalDate getActualReturnDate() {
        return actualReturnDate;
    }
}