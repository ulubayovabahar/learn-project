package Lesson_3;
import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
//        Conditions
//        double balance = 100;
//
//
        Scanner scanner = new Scanner(System.in);
//        double input = scanner.nextInt();
//
//        if(balance>=input){
//            System.out.println("Payment was successful");
//        }
//        else{
//            System.out.println("Not enough balance");
//        }
//
//
//        if(balance<=input){
//            System.out.println("Payment was not successful");
//        }



        // istifadeciden sonsuz sayda eded gotururuk
        // ne vaxt ki 0 yazdi dovr qirilsin
        boolean nextInput = true;


        while(nextInput){
            System.out.println("Eded daxil edin");
             int input = scanner.nextInt();
             if(input>0){
                 for(int i=1; i<=input; i++){
                     System.out.println(i);
                 }
             }
             else if(input<0){
                 System.out.println("Invalid input");
             }
             else{
                 nextInput = false;
             }
        }







    }
}
