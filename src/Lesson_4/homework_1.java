package Lesson_4;
import java.util.Scanner;

public class homework_1 {
    public static void main(String[] args) {

//        Task 1:
//        İstifadəçidən ədəd alın.
//        0-dan başlayaraq həmin ədədədək hər bir ədəd üçün aşağıdakı qaydanı
//        tətbiq edin.
//        Əgər ədəd 3, 5, 15-dən yalnız 3-ə bölünürsə, ekrana "fizz" yazısı çıxsın.
//        Əgər ədəd 3, 5, 15-dən yalnız 5-ə bölünürsə, ekrana "buzz" yazısı çıxsın.
//        Əgər ədəd 15-ə bölünürsə, ekrana "fizzbuzz" yazısı çıxsın.
//        Qalan bütün hallarda ədədin özü ekrana çıxsın.

        Scanner input = new Scanner(System.in);

        System.out.println("Musbet bir eded daxil edin.(0 daxil etmek olmaz!) ");
        int eded = input.nextInt();

        for(int i=0 ; i<=eded; i++) {

            if (i == 0) {
                System.out.println("0 daxil etmek olmaz!");
            } else if (i < 0) {
                System.out.println("Eded musbet eded olmalidir!");
            } else if (i % 15 == 0) {
                System.out.println("fizzbuzz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else {
                System.out.println("Daxil etdiyiniz eded: " + i);
            }
        }

        input.close();

    }
}
