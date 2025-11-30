package Lesson_3;
import java.util.Scanner;

public class homework_5 {
    public static void main(String[] args) {

//        Task 5 - Sənin superhero:
//
//        İstifadəçidən rəng və heyvan adı istə (scanner ilə).
//        Əgər rəng qara, heyvan panther-dirsə, "Sən qara panther-sən!" yazısını ekrana çıxar
//        Yox, əgər rəng qırmızı, heyvan isə hörümçəkdirsə, "Sən Spider-man-sən!" yazısını ekrana çıxar
//        Qalan bütün hallarda, "Sən möhtəşəm {daxil edilmiş rəng} {daxil edilmiş heyvanın adı} ola bilərsən!"
//        yazısını ekrana çıxar
//        Qeyd: axırıncı şərtdə rəng və heyvan adı olan hissə istifadəçinin daxil etdiyi olmalıdır.

        Scanner input = new Scanner(System.in);

        System.out.println("Reng adi daxil et:");
        String reng = input.next();

        System.out.println("Heyvan adi daxil et:");
        String heyvan = input.next();

        if(reng.equals("qara") && heyvan.equals("panther")){
            System.out.println("Sen qara panther-san!");
        }
        else if(reng.equals("qirmizi") && heyvan.equals("horumcek")){
            System.out.println("Sen Spider-man-san!");
        }
        else{
            System.out.println("Sen mohtesem " + reng + " " + heyvan + " ola bilersen!");
        }


    }
}
