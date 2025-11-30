package Lesson_4;
import java.util.Scanner;
public class homework_2 {
    public static void main(String[] args) {

//        Task 2:
//
//        İstifadəçidən ədəd alın.
//        O ədədin faktorialını hesablayın.
//        Ədəd 0-dan böyük olmalıdır.

        Scanner input = new Scanner(System.in);

        System.out.println("Eded daxil edin: ");
        int a = input.nextInt();  //3
        int factorial = 1;

        if(a>0){  //1*2*3
            for(int i=1; i<=a; i++){
                factorial *=i;
            }
            System.out.println(factorial);
        }
        else{
            System.out.println("Daxil etdiyiniz eded 0-dan boyuk olmalidir!");
        }

    }
}
