//SARANYA A/P JAYARAMA REDDY (B22EC3013)

public class Rental {
    private Customer customer;
    private Rentable rentable;
    private Appointment appointment;
    private Location pickupLocation;
    private Location returnLocation;
    private int rentalDays;

    public Rental(Customer customer, Rentable rentable, Appointment appointment, Location pickupLocation, Location returnLocation, int rentalDays){
        this.customer = customer;
        this.rentable = rentable;
        this.appointment = appointment;
        this.pickupLocation = pickupLocation;
        this.returnLocation = returnLocation;
        this.rentalDays = rentalDays;
    }

     public double calculateRentalCost(){
         return rentable.getRentalRate() * rentalDays;
     }

     public Customer getCustomer() {
         return customer;
     }

     public Rentable getRentable() {
         return rentable;
     }

     public Appointment getAppointment() {
         return appointment;
     }

     public Location getPLocation(){
         return pickupLocation;
     }

     public Location getRLocation(){
         return returnLocation;
     }

     public int getRentalDays(){
         return rentalDays;
     }

     public String toString(){
         return customer + " rented " + rentable + " for " + rentalDays + " days. Total cost: RM " + calculateRentalCost() + "\n" + appointment + "\n" + pickupLocation;
     }
}