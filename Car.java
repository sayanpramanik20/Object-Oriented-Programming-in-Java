public class Car {
    String brand;
    String model;
    String color;
    double maxspeed;

    Car(String brand, String model, String color, double maxspeed){
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.maxspeed = maxspeed;
    }

void display(){
    System.out.println(brand + " " + model + " " + color + " " + maxspeed);
}
    public static void main(String[] args) {
        Car car1 = new Car ("BMW", "X7DW", "black", 200);
        Car car2 = new Car ("Porsche", "H8VM", "Blue", 250);
        Car car3 = new Car ("Jaguar", "Y6S4", "Black", 180);

        car1.display();
        car2.display();
        car3.display();
    }
}
