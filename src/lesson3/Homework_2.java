package Lesson_3;
import java.util.Scanner;

public class Homework_2 {
    public static void main(String[] args) {
//        Task 2 - Xəzinə oyunu:
//
//        İstifadəçi scanner vasitəsilə 1-100 aralığında ədəd daxil etməlidir (yoxlayın).
//        Əgər ədəd xəzinə kodu ilə eynidirsə, ekrana "xəzinə tapdınız!" yazısı çıxarılsın.
//        Əgər istifadəçinin daxil etdiyi ədəd xəzinə kodundan maksimum 5 vahid fərqlənirsə,
//        ekrana "çox yaxın idin..." yazısı çıxsın.
//        Qalan bütün hallarda öz tərcihinizə uyğun istifadəçiyə səhv kod yazdığını
//        göstərən yazını ekrana çıxarın.
//        Qeyd: xəzinənin düzgün kodunu variable ilə kodda saxlayın.

        Scanner input = new Scanner(System.in);

        System.out.println("Xezineni tapmaq ucun 1-100 araliginda bir reqem daxil edin:");
        int eded = input.nextInt();

        int xezine = 84;
        int ferq = eded - xezine;

        if(eded<0 || eded>100){
            System.out.println("1-100 araliginda eded daxil etmelisiniz!");
        }
        else if(eded>=0 && eded<=100 && eded==xezine){
            System.out.println("Xezine tapdiniz!");
        }
        else if((eded > xezine && ferq <= 5) || (eded < xezine && ferq >= -5)){
            System.out.println("Cox yaxin idin...");
        }
        else{
            System.out.println("Teessuf ki, xezine tapa bilmediniz");
        }

        input.close();
    }
}
