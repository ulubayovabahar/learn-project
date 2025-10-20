package Lesson_5;
import java.util.Scanner;

public class homework_4 {
    public static void main(String[] args) {

//        Task 4:
//
//        Task 1-də yaradılmış massivi ədədlərin artmasına görə sıralayın
//        (bubble sort alqoritmini araşdırmalı ola bilərsiniz).

        Scanner input =  new Scanner(System.in);
        System.out.println("Massivin uzunlugunu daxil edin: ");
        int uzunluq = input.nextInt();
        int[] massiv = new int[uzunluq];

        int temp; //massivlerin yerini deyismek ucun ist olunan deyisen(tava usulu :D)

        for(int i=0; i<massiv.length; i++){
            System.out.println((i+1) + " Massivin elementini daxil edin: ");
            int element = input.nextInt();
            massiv[i] = element;
        }

        for(int i=0; i< massiv.length; i++){
            System.out.print(massiv[i] + " , ");
        }

        for(int i=0; i< massiv.length; i++) {
            for (int j = 0; j < massiv.length - i - 1; j++) {
                if (massiv[j] > massiv[j + 1]) {
                    temp = massiv[j];
                    massiv[j] = massiv[j + 1];
                    massiv[j + 1] = temp;
                }
            }
        }

        System.out.println();
        for(int i=0; i< massiv.length; i++){
            System.out.print(massiv[i] + " , ");
        }





    }
}
