package Lesson_6;
import java.util.Scanner;

public class Method_Overloading {

    Scanner input = new Scanner(System.in);

//    Məsələ 1: İki və Üç Ədədin Cəmi
//    Tapşırıq:
//    Eyni topla adlı metoddan istifadə edərək:
//    İki ədədin cəmini qaytaran metod yaz
//    Üç ədədin cəmini qaytaran metod yaz
//    main metodunda hər iki metoddan istifadə et
//    Suallar:
//    Hansı metod çağırılacaq, əgər topla(2,3) yazsan?
//    Hansı metod çağırılacaq, əgər topla(1,2,3) yazsan?

//    static int cem(int a, int b){
//        return a+b;
//    }
//
//    static int cem(int a, int b, int c){
//        return a+b+c;
//    }

//    Məsələ 2: Double Tipi ilə Overloading
//    Tapşırıq:
//    Əvvəlki məsələdəki metodları double tipli arqumentlərlə də işləyəcək şəkildə overloading et
//    Misal: topla(2.5, 3.5)
//    Suallar:
//    Kompilyator hansı metodu seçəcək?
//    topla(2,3.5) çağırışında nə olacaq?

    static int cem(int a, int b){
        return a+b;
    }

    static int cem(int a, int b, int c){
        return a+b+c;
    }

    static double cem(double a, double b){
        return a+b;
    }

    static double cem(int a, double b){
        return a+b;
    }

//    Məsələ 3: Mesaj Yazmaq
//    Tapşırıq:
//    yaz adlı metod yarat:
//    yaz(String mesaj) → mesajı bir dəfə çap et
//    yaz(String mesaj, int say) → mesajı say qədər çap et
//    yaz(String mesaj, boolean yeniSətr) → əgər yeniSətr true olsa, yeni sətr əlavə et, əks halda əlavə etmə
//    Suallar:
//    yaz("Salam") çağırışında hansı metod işləyir?
//    yaz("Salam", 3) çağırışında hansı metod işləyir?

    static void yaz(String mesaj){
        System.out.println("Salam");
    }

    static void yaz(String mesaj, int say){

        for(int i=1; i<=say; i++){
            System.out.println(mesaj);
        }
    }

    static void yaz(String mesaj, boolean yeniSetr){
        if(yeniSetr==true){
            System.out.println(mesaj);
        }else{
            System.out.print(mesaj);
        }
    }

//    Məsələ 4: “hesabla” metodu
//    Tapşırıq:
//    Aşağıdakı overloading-ləri yarat ⤵️
//    1️⃣ hesabla(int a, int b) → iki ədədin cəmini qaytarsın
//    2️⃣ hesabla(double a, double b) → iki onluq ədədin ortasını qaytarsın
//    3️⃣ hesabla(String soz, int say) → sözü say qədər yan-yana yazsın (sətirə əlavə etmədən)

    static int hesabla(int a, int b){
        return a+b;
    }
    static double hesabla(double a, double b){
        return (a+b)/2;
    }

    static void hesabla(String soz, int say){
        for(int i=0; i<say; i++){
            System.out.print(soz);
        }
        System.out.println();
    }
    public static void main(String[] args) {

//        int cem1 = cem(3,5);
//        System.out.println(cem1);
//        int cem2 = cem(2,4,6);
//        System.out.println(cem2);

        int cem1 = cem(2,3);
        System.out.println(cem1);
        double cem2 = cem(2,3.4);
        System.out.println(cem2);
        double cem3 = cem(2.3, 3.3);
        System.out.println(cem3);
        double cem4 = cem(3.5,4);
        System.out.println(cem4);

        yaz("Salam");
        yaz("Salam", 5);
        yaz("Necesen ", false);
        yaz("bro?",true);

        int hesabla1 = hesabla(3,5);
        System.out.println(hesabla1);
        double hesabla2 = hesabla(6.5, 7.5);
        System.out.println(hesabla2);
        hesabla("Salam", 5);

    }
}
