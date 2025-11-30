package Lesson_4;
import java.util.Scanner;

public class equals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Eded daxil edin: ");
        String eded = input.next();;
        boolean dogru = eded.equals("5");
        System.out.println(dogru);
    }
}
