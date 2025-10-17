package Lesson_4;
import java.util.Scanner;

public class homework_3 {
    public static void main(String[] args) {

//        Task 3:
//
//        Domino daşlarını aşağıdakı formada ekrana çıxaran proqram yazın (boşu 0 kimi nəzərə alın):
//        0x0 0x1 0x2 0x3 0x4 0x5 0x6
//        1x1 1x2 1x3 1x4 1x5 1x6
//...
//        Qeyd, həlldə iç-içə dövrdən (nested loop) istifadə olunmalıdır.

        for(int i=0; i<=6; i++){
            for (int j=i; j<=6; j++){
                System.out.print(i + "x" + j);
            }
            System.out.println();
        }
    }
}
