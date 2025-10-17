package Lesson_3;
import java.util.Scanner;

public class homework_1 {
    public static void main(String[] args){
//        Task 1 - kinoteatr endirimi:
//
//        skaner (scanner) vasitəsilə istifadəçidən yaşını və tələbə olub-olmadığını soruşun.
//                Nəticə əsasında aşağıdakı şərtlərə uyğun teatr üçün biletin qiymətini ekrana çıxarın:
//        Əgər yaş 12-dən kiçikdirsə, bilet pulsuzdur ($0)
//        Əgər tələbədirsə və ya yaş 65-dən böyük və ya bərabərdirsə, 50% endirimli qiymət
//        Qalan bütün hallarda biletin tam qiyməti
//        Bir biletin standart qiyməti $10-dur.

        Scanner input = new Scanner(System.in);

        System.out.println("Yasinizi daxil edin:");
        int yas = input.nextInt();

        if(yas>=0 && yas<=100){
            System.out.println("Sizin yasiniz " + yas);
        }
        else{
            System.out.println("Yasiniz 0-100 araliginda olmalidir!");
            return;
        }



        System.out.println("Telebesiniz? Beli - 1, Xeyr - 0 daxil edin");
        int telebe = input.nextInt();

        if(telebe==1) {
            System.out.println("Siz telebesiniz!");
        }
        else if(telebe==0){
            System.out.println("Siz telebe deyilsiniz!");
        }
        else{
            System.out.println("Dogru cavab qeyd edin. Telebesinizse 1, deyilsinizse 0 daxil edin!");
            return;
        }

//        Nəticə əsasında aşağıdakı şərtlərə uyğun teatr üçün biletin qiymətini ekrana çıxarın:
//        Əgər yaş 12-dən kiçikdirsə, bilet pulsuzdur ($0)
//        Əgər tələbədirsə və ya yaş 65-dən böyük və ya bərabərdirsə, 50% endirimli qiymət
//        Qalan bütün hallarda biletin tam qiyməti
//        Bir biletin standart qiyməti $10-dur.

        if(yas>=0 && yas<=12){
            System.out.println("12 yasa qeder bilet pulsuzdur!");
            System.out.println("Bilet qiymeti: $0");
        }
        else if(telebe==1 && yas>=65 && yas>=100){
            System.out.println("Sizin ucun bilet qiymetleri 50% endirimle: $5");
        }
        else{
            System.out.println("Sizin ucun bilet qiymeti: $10");
        }


        input.close();




    }
}
