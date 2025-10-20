package Lesson_5;
import java.util.Scanner;

public class homework_2 {
    public static void main(String[] args) {

//        Task 2:
//        Task 1-də yaradılmış massiv içində ən kiçik və ən böyük ədədi tapın.

//        Task 1:
//        İstifadəçidən N ədədi istəyin və həmin uzunluqda massiv yaradın.
//        Sonra istifadəçidən N sayda ədəd istəyin və bu ədədləri array-a əlavə edin.


        Scanner input = new Scanner(System.in);
        System.out.println("Massivin uzunlugunu daxil edin: ");
        int eded = input.nextInt();
        int[] ededler = new int[eded];

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<ededler.length; i++){
            System.out.println((i+1) + " - Ededi daxil edin: ");
            int element = input.nextInt();
            if(element>max){
                max=element;
            }
            if(element<min){
                min=element;
            }
            ededler[i] = element;
        }
        for(int i=0; i<ededler.length; i++){
            System.out.print(ededler[i] + " , ");
        }
        System.out.println();
        System.out.println("Massivin en boyuk ededi: " + max);
        System.out.println("Massivin en kicik ededi: " + min);







    }
}
