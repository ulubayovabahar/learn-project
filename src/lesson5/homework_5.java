package Lesson_5;
import java.util.Scanner;

public class homework_5 {
    public static void main(String[] args) {

//        Task 5:
//
//        İstifadəçidən 50-dən böyük olmayan və 1-dən kiçik olmayan N ədədi alın və
//        (2, 4 fibonacci) ardıcıllığının 3-cü elementindən başlayaraq ümumi cəmini göstərən N uzunluqda massiv yaradın.
//        Nümunə: N = 5
//        {6, 16, 32, 58, 100}
//        numune: n =7
//        {6, 16, 32, 58, 100, 158, 258}


        Scanner input = new Scanner(System.in);
        System.out.println("50-den boyuk olmayan ve 1-den kicik olmayan eded daxil edin(massivin uzunlugu) : ");
        int eded;

        do{
                System.out.println("1-50 araliginda eded daxil edin!");
                int element = input.nextInt();
                eded = element;
                if(element<1){
                    System.out.println("Menfi eded daxil etmek olmaz! ");
                }else if(element>50){
                    System.out.println("50-den boyuk eded daxil etmek olmaz! ");
                }
        }while(eded<1 || eded>50);

        int[] massiv = new int[eded];
        massiv[0] = 2;
        massiv[1] = 4;

        int sum =0;

        //fibonacci ardicilligi
                        //5
        for(int i=2; i< massiv.length;i++){
            massiv[i] = massiv[i-1] + massiv[i-2];
            for(int j=0; j<i;j++){
                sum = sum + massiv[j];
            }
            massiv[i] = sum;
        }

        for (int i = 0; i < massiv.length; i++) {
            System.out.print(massiv[i] + " ");
        }







    }
}
