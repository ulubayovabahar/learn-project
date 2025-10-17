package Lesson_6_practice;
import java.util.Scanner;

public class Recursive {

        // 1-5 e qeder ededleri cap etmek

//    static void say(int n){
//        if(n>5)
//            return;
//        System.out.println(n);
//        say(n+1);
//
//    }

    // 1-den n-e qeder ededleri toplamaq

//    static int sum(int a){
//        if(a==0)
//            return 0;
//        return a + sum(a-1);
//
//    }

    // 5-den 1-e qeder say

//        static void geriSay(int a){
//            if(a==0)
//                return;
//            System.out.println(a);
//            geriSay(a-1);
//
//        }

    // 1-dən n-ə qədər cüt ədədləri topla:

//    static int cutEdedleriTopla(int a){
//        if(a==0)
//            return 0;
//        if(a%2==0)
//            return a + cutEdedleriTopla(a-1);
//        else
//            return cutEdedleriTopla(a-1);

    //Faktorial (ən klassik rekursiya)  5! = 5 * 4 * 3 * 2 * 1

//    static int factorial(int a){
//        if(a==0)
//            return 1;
//        return a * factorial(a-1);  //5*f(4)  f(4) = 3 * f(3)

    //Rekursiya ile verilmis string-i tersine ekrana cixaran proqram yazin

    // 1-dən n-ə qədər saymaq

    static int cem(int a) {
        if (a == 0)
            return 0;
        return a + cem(a-1);

    }

    static void say(int b){
        if(b==0)
            return;
        say(b-1);
        System.out.println(b);
    }

    // 1-dən n-ə qədər ədədlərin cəmini tapmaq          - 5den 0-a qeder

    static int ceminHesablanmasi(int x){
        if(x==0)
            return 0;
        return x + ceminHesablanmasi(x-1);
    }

    // n-dən 1-ə qədər geriyə sayma     - 5 1
    static void geriSaymaq(int c){
        if(c==0)
            return;
        System.out.println(c);
        geriSaymaq(c-1);

    }

    // 1-dən n-ə qədər toplama

    static int toplamaq(int e){
        if(e==0)
            return 0;
        return e + toplamaq(e-1);
    }

    // Rəqəmlərin cəmini tapmaq
    // Tələb: Verilən ədədin rəqəmlərinin cəmini rekursiv metodla hesabla.
    // Məsələn: 1234 → 1+2+3+4 = 10
    // 1234 % 10 = qaliq 4  .  100 1000

    static int reqemlerinCemininHesablanmasi(int n){
        if(n<=0)
            return 0;
        int qaliq = n % 10;
        return qaliq +reqemlerinCemininHesablanmasi(n/10);
    }

    //Verilən ədədin rəqəmlərinin sayını tapmaq
    //Tələb: Rekursiv metod yaz ki, n ədədinin neçə rəqəm olduğunu hesablasın.
    //Məsələn: 12345 → 5

    static int reqemlerinCemi(int m){
        if(m==0)
            return 0;
        return 1 + reqemlerinCemi(m/10);
    }

    // ededin factorial tapilmasi  // 1 2 3 4 5

    static int f (int x){
        if(x==0)
            return 1;
        return x * f(x-1);
    }

    // sozleri tersine cixar

    static void sozunTersi (String soz){
        if(soz.length() == 0)
            return;
    }











    public static void main(String[] args) {

        // 1-5 e qeder ededleri cap etmek
//        say(1);

        // 1-den n-e qeder ededleri toplamaq
//        System.out.println(sum(5));

        // 5-den 1-e qeder say
//        geriSay(5);

        // 1-dən n-ə qədər cüt ədədləri topla:
//        System.out.println(cutEdedleriTopla(5));

        //Faktorial (ən klassik rekursiya)
//        System.out.println(factorial(5));

        //Rekursiya ile verilmis string-i tersine ekrana cixaran proqram yazin

        // 1-dən n-ə qədər saymaq
        System.out.println(cem(5));

        say(5);

        // 1-dən n-ə qədər ədədlərin cəmini tapmaq

        System.out.println(ceminHesablanmasi(5));

        // n-dən 1-ə qədər geriyə sayma

        geriSaymaq(6);

        // 1-dən n-ə qədər toplama

        System.out.println(toplamaq(5));

        //Rəqəmlərin cəmini tapmaq
        // Tələb: Verilən ədədin rəqəmlərinin cəmini rekursiv metodla hesabla.
        // Məsələn: 1234 → 1+2+3+4 = 10

        System.out.println(reqemlerinCemininHesablanmasi(2345));

        //Verilən ədədin rəqəmlərinin sayını tapmaq
        //Tələb: Rekursiv metod yaz ki, n ədədinin neçə rəqəm olduğunu hesablasın.
        //Məsələn: 12345 → 5

        System.out.println(reqemlerinCemi(12345));

        // factorial hesablanmasi

        System.out.println(f(5));

        // sozleri tersine cixar

        sozunTersi("java");



    }



}


