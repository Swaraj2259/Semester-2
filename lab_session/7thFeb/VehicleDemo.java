
class Vehicle {
    String make, model, fuelType;
    int year;

    // Constructor
    public Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    public void displayDetails() {
        System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year + ", Fuel Type: " + fuelType);
    }
    public void fueleff(){
        System.out.println("Fuel Efficiency: "+this.model);
    }
    // public void 
}
class Truck extends Vehicle{
    public Truck(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }
}

class Car extends Vehicle{
    public Car(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }
}
class Motorcycle extends Vehicle{
    public Motorcycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }
}

class VehicleDemo{
    public static void main(String[] args) {
        Truck t = new Truck("Tata", "407", 2010, "Diesel");
        Car c = new Car("Maruti", "Swift", 2015, "Petrol");
        Motorcycle m = new Motorcycle("Royal Enfield", "Classic 350", 2018, "Petrol");

        t.displayDetails();
        c.displayDetails();
        m.displayDetails();
    }
}