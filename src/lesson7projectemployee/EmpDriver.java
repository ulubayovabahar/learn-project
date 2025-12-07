package lesson7projectemployee;
import l7.Employee;

import java.util.Scanner;

public class EmpDriver {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Adinizi daxil edin: ");
        String name = input.next();

        System.out.println("Maasinizi daxil edin: ");
        double salary = input.nextDouble();

        System.out.println("Is saatinizi daxil edin: ");
        int workHours = input.nextInt();

        System.out.println("ISe qebul ilini daxil edin: ");
        int hireYear = input.nextInt();


        Employee employe1 = new Employee(name, salary, workHours, hireYear);
        System.out.println(employe1);





    }
}
