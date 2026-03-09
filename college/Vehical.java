package college;

class Vehicle {
    String brandName;
    public Vehicle(String brandName) {
        this.brandName = brandName;
    }
}

class Car extends Vehicle {
    String model;
    double price;

    public Car(String brandName, String model, double price) {
        super(brandName); 
        this.model = model;
        this.price = price;
    }

    public void display() {
        System.out.println("Brand: " + brandName + ", Model: " + model + ", Price: " + price);
    }

    public static void main(String[] args) {
        Car c = new Car("Toyota", "Camry", 25000);
        c.display();
    }
}
