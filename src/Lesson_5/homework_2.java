package Lesson_5;
import java.util.Scanner;

public class homework_2 {
    public static void main(String[] args) {

//        Task 2:
//        Task 1-də yaradılmış massiv içində ən kiçik və ən böyük ədədi tapın.


        Scanner input = new Scanner(System.in);

        System.out.println("Massivin uzunlugunu daxil edin:");
        int massivin_uzunlugu = input.nextInt();

        int[] ededler = new int[massivin_uzunlugu];

        for(int i=0; i<massivin_uzunlugu; i++){
            System.out.println("Ededleri daxil edin:");
            ededler[i] = input.nextInt();
        }
        for(int eded : ededler){
            System.out.print(eded + " ");
        }





    }
}
