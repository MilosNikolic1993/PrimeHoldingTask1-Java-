import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Invoice {
    public static void printInvoice(Rental rental, String customerName) {
        Vehicle vehicle = rental.getVehicle();
        System.out.println("Customer Name: " + customerName);
        System.out.println("Rented Vehicle: " + vehicle.getBrand() + " " + vehicle.getModel());
        System.out.println("Vehicle Value: $" + vehicle.getValue());
        if (vehicle instanceof Car) {
            System.out.println("Safety Rating: " + ((Car) vehicle).getSafetyRating());
        } else if (vehicle instanceof Motorcycle) {
            System.out.println("Rider Age: " + ((Motorcycle) vehicle).getRiderAge());
        } else if (vehicle instanceof CargoVan) {
            System.out.println("Driver Experience: " + ((CargoVan) vehicle).getDriverExperience());
        }
        System.out.println("Reservation Start Date: " + rental.getReservationStartDate());
        System.out.println("Reservation End Date: " + rental.getReservationEndDate());
        System.out.println("Actual Return Date: " + rental.getActualReturnDate());
        System.out.println("Rental Days: " + rental.getRentalDays());
        System.out.printf("Rental Cost Per Day: $%.2f%n", rental.calculateRentalCostPerDay());
        System.out.printf("Total Rental Cost: $%.2f%n", rental.calculateTotalRentalCost());
        System.out.printf("Insurance Cost Per Day: $%.2f%n", rental.calculateInsuranceCostPerDay());
        System.out.printf("Total Insurance Cost: $%.2f%n", rental.calculateTotalInsuranceCost());
        System.out.printf("Insurance Addition Per Day: $%.2f%n", rental.calculateInsuranceAdditionPerDay());
        System.out.printf("Total Insurance Addition: $%.2f%n", rental.calculateTotalInsuranceAddition());
        System.out.printf("Total Cost: $%.2f%n", rental.calculateTotalCost());
    }
}