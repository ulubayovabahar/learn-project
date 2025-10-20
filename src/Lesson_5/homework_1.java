package Lesson_5;
import java.util.Scanner;

public class homework_1 {
    public static void main(String[] args) {

//        Task 1:
//        İstifadəçidən N ədədi istəyin və həmin uzunluqda massiv yaradın.
//        Sonra istifadəçidən N sayda ədəd istəyin və bu ədədləri array-a əlavə edin.

        Scanner input = new Scanner(System.in);
        System.out.println("Massivin uzunlugunu daxil edin: ");
        int eded = input.nextInt();
        int[] ededler = new int[eded];

        for(int i=0; i<ededler.length; i++){
            System.out.println((i+1) + " - Ededi daxil edin: ");
            int element = input.nextInt();
            ededler[i] = element;
        }
        for(int i=0; i<ededler.length; i++){
            System.out.print(ededler[i] + " , ");
        }









    }
}
