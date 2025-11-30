package Lesson_3;
import java.util.Scanner;

public class switch_case_break_default {
    public static void main(String[] args) {
        //Switch - secim etmek
        //case - secim


//        Task -1

//        İstifadəçidən həftənin gününü 1-dən 7-yə qədər olan ədəd kimi alın. switch-case istifadə edərək həmin ədədə uyğun günün adını ekrana çıxarın.
//        1 → Bazar ertəsi
//        2 → Çərşənbə axşamı
//        3 → Çərşənbə
//        4 → Cümə axşamı
//        5 → Cümə
//        6 → Şənbə
//        7 → Bazar
//        Əgər istifadəçi 1–7 xaricində ədəd daxil edərsə, "Yanlış ədəd daxil etdiniz" mesajını göstərin.

//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Heftenin gununu daxil edin: ");
//        int hefteninGunun = input.nextInt();
//
//        switch (hefteninGunun){
//            case 1:
//                System.out.println("Bazar ertesi");
//                break;
//            case 2:
//                System.out.println("Cersenbe axsami");
//                break;
//            case 3:
//                System.out.println("Cersenbe");
//                break;
//            case 4:
//                System.out.println("Cume axsami");
//                break;
//            case 5:
//                System.out.println("Cume");
//                break;
//            case 6:
//                System.out.println("Senbe");
//                break;
//            case 7:
//                System.out.println("Bazar");
//                break;
//            default:
//                System.out.println("Yanlish eded daxil etdiniz!");



//          Task: 2

//        İstifadəçidən 0–100 arasında bal (imtahan nəticəsi) daxil etməsini istəyin.
//        switch-case istifadə edərək həmin bala görə qiyməti ekrana çıxarın. Qiymətləndirmə aşağıdakı kimidir:
//        90–100 → "A"
//        80–89 → "B"
//        70–79 → "C"
//        60–69 → "D"
//        0–59 → "F"
//        Əgər bal 0–100 aralığında deyilsə, "Yanlış bal daxil etdiniz" mesajı çıxarın.
//        Qeyd: switch-case ilə bu məsələdə bal / 10 kimi bölüb istifadə etmək rahat olur
//        (məsələn, 85 → 8, 73 → 7 və s.).

//        Scanner input = new Scanner(System.in);
//
//        System.out.println("0-100 arasinda imtahan neticesi daxil edin: ");
//        int bal = input.nextInt();
//        int yuvarlaqlashdirilmishBal = bal / 10;
//
//        switch (yuvarlaqlashdirilmishBal){
//            case 10:
//            case 9:
//                System.out.println("A");
//                break;
//            case 8:
//                System.out.println("B");
//                break;
//            case 7:
//                System.out.println("C");
//                break;
//            case 6:
//                System.out.println("D");
//                break;
//            case 5:
//                System.out.println("E");
//                break;
//            case 4:
//            case 3:
//            case 2:
//            case 1:
//            case 0:
//                System.out.println("F");
//                break;
//            default:
//                System.out.println("Yanlish bal daxil ediniz!");
//        }



//          Task: 3

//        Sadə kalkulyator proqramı yaz.
//        İstifadəçidən iki ədəd və bir əməliyyat (+, -, *, /) daxil etməsini istəyin.
//        switch-case istifadə edərək həmin əməliyyatı icra edib nəticəni ekrana çıxarın.
//        Tələblər:
//        + → toplama
//        - → çıxma
//        * → vurma
//        / → bölmə (əgər ikinci ədəd 0-dırsa, "Sıfıra bölmək olmaz" yaz)
//        Əgər əməliyyat tanınmırsa, "Yanlış əməliyyat" mesajı çıxar.
//
//        Nümunə iş prinsipi:
//        Birinci ədədi daxil edin: 12
//        İkinci ədədi daxil edin: 4
//        Əməliyyatı daxil edin (+, -, *, /): *
//        Nəticə: 48


//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Birinci ededi daxil edin: ");
//        int birinciEded = input.nextInt();
//
//        System.out.println("Ikinci ededi daxil edin: ");
//        int ikinciEded = input.nextInt();
//
//        System.out.println("Emeliyyati daxil edin (+, -, *, /): ");
//        char emeliyyat = input.next().charAt(0);
//
//        switch (emeliyyat){
//            case '+':
//                System.out.println(birinciEded + ikinciEded);
//                break;
//            case '-':
//                System.out.println(birinciEded - ikinciEded);
//                break;
//            case '*':
//                System.out.println(birinciEded * ikinciEded);
//                break;
//            case '/':
//                System.out.println(birinciEded / ikinciEded);
//                break;
//            default:
//                System.out.println("Dogru emeliyyat daxil etmemisiniz! ");
//        }




//        Task 4:

//        İstifadəçidən bir il nömrəsini daxil etməsini istəyin. switch-case istifadə edərək həmin ilin artikil il olub-olmadığını ekrana çıxarın.
//        Qaydalar:
//        Artikil il → 4-ə bölünür, amma 100-ə bölünmür və ya 400-ə bölünür.
//        Əgər il artikil il isə → "Artikil ildir" yazın.
//        Əks halda → "Artikil il deyil" yazın.


//        Scanner input = new Scanner(System.in);
//
//        System.out.println("4 reqemli il daxil edin: ");
//        int il = input.nextInt();
//
//        int artikil = ((il % 4 == 0 && il % 100 != 0) || il % 400 == 0) ? 1 : 0;
//
//        switch (artikil) {
//            case 1:
//                System.out.println("Artikil ildir ");
//                break;
//            case 0:
//                System.out.println("Artikil il deyil! ");
//                break;
//        }


    }
}
