package Lesson_5;
import java.util.Scanner;

public class homework_3 {
    public static void main(String[] args) {

//        Task 3:
//        Task 1-də yaradılmış massivdə ən çox təkrarlanan ədədi və onun neçə dəfə təkrarlandığını tapın.

//        Task 1:
//        İstifadəçidən N ədədi istəyin və həmin uzunluqda massiv yaradın.
//        Sonra istifadəçidən N sayda ədəd istəyin və bu ədədləri array-a əlavə edin.

        Scanner input = new Scanner(System.in);
        System.out.println("Massivin uzunlugunu daxil edin: ");
        int eded = input.nextInt();
        int[] ededler = new int[eded];
        int tekrarlanma = 0;
        int tekrarlanan_eded = 0;

        for (int i = 0; i < ededler.length; i++) {
            System.out.println((i + 1) + " - Ededi daxil edin: ");
            int element = input.nextInt();
            ededler[i] = element;
        }

        for (int i = 0; i < ededler.length; i++) {
            System.out.print(ededler[i] + " , ");
        }

        for (int i = 0; i < ededler.length; i++) {
            for (int j = i + 1; j < ededler.length; j++) {
                if (ededler[i] == ededler[j]) {
                    tekrarlanan_eded = ededler[i];
                    tekrarlanma++;
                }
            }
        }
            System.out.println();
            System.out.println("En cox tekrarlanan eded: " + tekrarlanan_eded);
            System.out.println("Tekrarlanma sayi: " + tekrarlanma);


        }
    }
