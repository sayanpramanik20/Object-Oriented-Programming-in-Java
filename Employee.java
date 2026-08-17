/*  Employee ID
    Employee Name
    Private Salary
    Write suitable methods to:
    Set salary
    Retrieve salary
    Do not allow a negative salary. */

import java.util.Scanner;
public class Employee {
    int ID;
    String name;
    private double salary;

    Employee(int ID, String name, double salary) {
        this.ID = ID;
        this.name = name;
        this.salary = salary;
    }

    void setsalary() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the salary amount to be added: ");
        double input = scan.nextDouble();
        this.salary = this.salary + input;
        System.out.println("total Salary is : " + salary);
    }
    void retrievesalary() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the salary amount to be retrieved: ");
        double input = scan.nextDouble();
        if (input <= salary) {
            this.salary = this.salary - input;
            System.out.println("total Salary is : " + salary);
        } else {
            System.out.println("Error!! Salary can't be negative.");
        }
    }
    void displaysalary() {
        System.out.println("His/her current salary is: "+ this.salary);
    }

    public static void main (String[]args){
        Employee e1 = new Employee(28, "sayan", 12300.45);

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 1 to set salary or // to retrieve salary // 2 to display the salary: ");
        int input = scan.nextInt();

        do {
            if (input == 1) {
                e1.setsalary();
            } else if (input == 0) {
                e1.retrievesalary();
            } else if (input == 2) {
                e1.displaysalary();
            }

            System.out.print("Enter 1 to set salary and 0 to retrieve salary: ");
            input = scan.nextInt();

        } while(input != 2);
    }
}