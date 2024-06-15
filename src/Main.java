
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

               Vehicle car = new Car("Mitsubishi", "Mirage", 15000.00, 3);
                LocalDate startDate = LocalDate.of(2024, 6, 3);
                LocalDate returnDate = LocalDate.of(2024, 6, 13);
                Rental rental = new Rental(car, 10, startDate, returnDate);
                Invoice.printInvoice(rental, "John Doe");


            }
        }


