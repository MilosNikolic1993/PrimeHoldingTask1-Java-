 import java.util.*;

 public abstract class Vehicle {
     protected String brand;
     protected String model;
     protected double value;

     public Vehicle(String brand, String model, double value) {
         this.brand = brand;
         this.model = model;
         this.value = value;
     }

     public String getBrand() {
         return brand;
     }

     public String getModel() {
         return model;
     }

     public double getValue() {
         return value;
     }

     public abstract double calculateInsuranceCostPerDay();
 }