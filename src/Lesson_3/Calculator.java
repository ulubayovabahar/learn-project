package Lesson_3;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Birinci ededi daxil edin: ");
        int eded1 = input.nextInt();

        System.out.println("Etmek istediyiniz emeliyyati daxil edin (+, -, *, /) : ");
        char emeliyyat = input.next().charAt(0);

        System.out.println("Ikinci ededi daxil edin: ");
        int eded2 = input.nextInt();

        switch (emeliyyat){
            case '+':
                System.out.println(eded1+eded2);
                break;
            case '-':
                System.out.println(eded1-eded2);
                break;
            case '*':
                System.out.println(eded1*eded2);
                break;
            case '/':
                System.out.println(eded1/eded2);
                break;
            default:
                System.out.println("Dogru emeliyyat daxil edin!");
                System.out.println("Sadece bu emeliyyatlari daxil eded bilersiniz: +, -, *, / ");



        }



    }
}
