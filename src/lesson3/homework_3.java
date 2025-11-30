package Lesson_3;
import java.util.Scanner;

public class homework_3 {
    public static void main(String[] args) {
//        Task 3 - İngilis rəqəm oyunu:
//        Oyunun şərti belədir:
//        Verilən ədəd 15-ə bölünürsə, "fizzbuzz" deməlisən
//        Yalnız 5-ə bölünürsə, "buzz" deməlisən
//        Yalnız 3-ə bölünürsə, "fizz" deməlisən
//        Yuxarıdakı heç bir şərt ödənmədikdə, sadəcə ədədin özünü deməlisən
//        Proqram istifadəçidən ədəd istəməlidir və yuxarıdakı şərtlərə əsasən
//        lazımi cavabı ekrana çıxarmalıdır.
//        Qeyd: ədədin 0-dan böyük olmasından əmin olun.

        Scanner input = new Scanner(System.in);

        System.out.println("Musbet bir eded daxil edin.(0 daxil etmek olmaz!) ");
        int eded = input.nextInt();

        if(eded==0){
            System.out.println("0 daxil etmek olmaz!");
        }
        else if(eded<0){
            System.out.println("Eded musbet eded olmalidir!");
        }
        else if(eded%15==0){
            System.out.println("fizzbuzz");
        }
        else if (eded%5==0) {
            System.out.println("buzz");
        }
        else if(eded%3==0){
            System.out.println("fizz");
        }
        else{
            System.out.println("Daxil etdiyiniz eded: " + eded);
        }

        input.close();

    }
}
