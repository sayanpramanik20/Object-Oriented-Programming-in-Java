import java.util.Scanner;
public class Atm {
    int pin;
    int balance;

    Atm(int pin, int balance) {
        this.pin = pin;
        this.balance = balance;
    }
    // change pin:
    void changepin() {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter the old pin: ");
        int old_pin = a.nextInt();
        if (old_pin == pin) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the new pin : ");
            int input = scan.nextInt();
            if (input == pin) {
                System.out.println("Enter a different pin.");
            }
            else {
                pin = input;
                System.out.println("pin changed succesfully.");
            }
        }
        else{
            System.out.println("Enter the correct pin.");
        }
    }
    // deposit
    void deposit(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the amount to deposit: ");
        int input = scan.nextInt();
        balance = balance + input;
        System.out.println("your current balance is: "+ balance);
    }
    // withdraw
    void withdraw(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the amount to withdraw: ");
        int input = scan.nextInt();

        System.out.print("Enter your pin: ");
        int a = scan.nextInt();
        if(a == pin){

            if(input<=balance){
                balance = balance - input;
                System.out.println("Your current balance is: "+ balance);}
            else{
                System.out.println("balance can't be negative");}
        }
        else{
            System.out.printf("wrong pin!!");
        }
    }
    // check balance
    void check(){
        System.out.println("your balance : "+balance);
    }

    public static void main(String[] args){
        Atm a1 = new Atm(1234, 2000);

        int input;
        do{
            Scanner scan = new Scanner(System.in);
            System.out.print("check balance (1) / deposit money(2) / withdraw money(3) / change pin(4) / exit(0) : ");
            input = scan.nextInt();

            if(input == 1){
                a1.check();}
            else if(input == 2){
                a1.deposit();}
            else if(input == 3){
                a1.withdraw();}
            else if(input == 4){
                a1.changepin();}

        }while(input != 0);
    }
}