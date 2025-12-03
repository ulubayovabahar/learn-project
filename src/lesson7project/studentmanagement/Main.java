package lesson7project.studentmanagement;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Adinizi daxil edin: ");
        String name = input.next();
        System.out.println("ID daxil edin: ");
        int id = input.nextInt();
        System.out.println("GPA daxil edin: ");
        double gpa = input.nextDouble();
        System.out.println("Daxil oldugunuz ili daxil edin: ");
        int year = input.nextInt();

        Student student1 = new Student(name, id, gpa, year);
        System.out.println(student1);

        student1.raiseYear();
        System.out.println(student1);






    }
}
