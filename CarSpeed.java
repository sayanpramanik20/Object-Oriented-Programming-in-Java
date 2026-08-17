import java.util.Scanner;
public class CarSpeed {
    String brand;
    String model;
    int speed;


    CarSpeed(String brand, String model, int speed) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
    }

    void IncreaseSpeed(){
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the speed to increase: ");
        int addspeed = scn.nextInt();

        speed = speed + addspeed;
        if(speed <= 180) {
            System.out.println("The speed becomes: " + speed);
        }
        else{
            System.out.println("Error !! The Speed limit is 180 !!");
        }
    }

    void DecreaseSpeed(){
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the speed to decrease: ");
        int cutspeed = scn.nextInt();

        if(speed >= cutspeed) {
            speed = speed - cutspeed;
        }
        else{
            System.out.println("Not valid !!");
        }
        System.out.println("The current speed is: "+ speed);
    }

    void displayspeed(){
        System.out.println("The current speed is: " + speed);
    }

    void exit(){
        System.out.println("Exit!!");
    }

    public static void main(String[] args) {
        CarSpeed car1 = new CarSpeed("bmw", "xu2j", 10);
        Scanner scn = new Scanner(System.in);
        System.out.print("increase(1) or decrease(0) or display(2) or exit(3) : "); //not println
        int input = scn.nextInt();
        do{

            if (input == 1) {
                car1.IncreaseSpeed();
                }
            else if (input == 0) {
                    car1.DecreaseSpeed();
                }
            else if (input == 2) {
                    car1.displayspeed();
                }
            System.out.print("increase(1) or decrease(0) or display(2) or exit(3) : "); //not println
            input = scn.nextInt();
        } while(input != 3);
    }
}