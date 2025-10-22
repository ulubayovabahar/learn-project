package Lesson_6;
import java.util.Scanner;

public class Return_Methods {

    static int hesablaQuvveti (int a, int b){
        int result = 1;

        for(int i=1; i<=b; i++){
            result*=a;
        }
        return result;
    }

//    💡 Məsələ 1 — Sadə salam
//    Metod yaz: salamVer()
//➡ Çağıranda ekranda “Salam, Bahar!” çıxsın.

    static void salamVer()
    {
        System.out.println("Hello World! ");
    }

//💡 Məsələ 2 — İki ədədin cəmini çap et
//    Metod yaz: cemYaz(int a, int b)
//    Parametr kimi iki ədəd alsın və onların cəmini çap etsin (return olmasın).

    static void cemYaz(int a, int b){
        int c = a+ b;
        System.out.println(c);
    }

//    Məsələ 3 — Tək və ya cüt olduğunu göstər
//    Metod yaz: tekVeyaCut(int x)
//➡ Əgər ədəd təkdirsə “Tək ədəd”, cütdürsə “Cüt ədəd” yazsın.

    static void tekVeyaCut(int x){
        if(x==0){
            System.out.println(x + " - sifirdir");
        }else if(x%2==0){
            System.out.println(x + " - cut ededdir");
        }else{
            System.out.println(x + " - tek ededdir");
        }
    }

//    Bu tapşırıqlarda metod nəticə qaytarır, sən isə onu istifadə edirsən.
//💡 Məsələ 4 — Cəmi qaytaran metod
//    Metod yaz: int cem(int a, int b)
//➡ İki ədədin cəmini qaytarsın, amma çap etməsin.
//    Sonra main()də nəticəni çap et.

    static int cem(int a, int b){
        int c = a + b;
        return c;
    }


//    Məsələ 5 — Kvadrat qaytaran metod
//    Metod yaz: int kvadrat(int x)
//➡ Verilən ədədin kvadratını hesablayıb return etsin.

    static int kvadrat(int x){
        int kvadrat = x*x;
        return kvadrat;
    }

//💡 Məsələ 6 — Ədədin qüvvəti (yenidən)
//    int quvvet(int a, int b)
//➡ Döngü ilə a^b hesabla və nəticəni qaytar.

//    static int hesablaQuvveti (int a, int b){
//        int result = 1;
//
//        for(int i=1; i<=b; i++){
//          result*=a;
//        }
//        return result;
//    }


//    💡 Məsələ 7 — Ən böyük ədədi tap
//    Metod yaz: int max(int a, int b)
//➡ Hansı ədəd böyükdürsə, onu qaytarsın.

    static int max(int c, int d){
        int result;
        if(c>d){
            result = c;
        } else if(c<d){
            result = d;
        }else{
            result = c;
        }
        return result;
    }

//    3️⃣ Qarışıq (void + return birlikdə)
//    Burda məqsəd — bir metod hesablama aparır (return), digəri isə çap edir (void).
//    Məsələ 8 — İki metodla işləmək

    static int kvadratiHesabla(int y){
        int c = y * y;
        return c;
    }
    static void neticeniYaz(int deyer){
        System.out.println("Netice: " + deyer);
    }

//    İndi maraqlı bir sual:
//    Əgər sən max(int c, int d)-yə üç ədəd (məsələn max(3, 7, 5)) müqayisə etdirmək istəsən,
//    onu necə yazardın? İstəyirsən növbəti addımda onu birlikdə addım-addım yazaq? - yaz

    static int maxi(int a, int b){
        if(a>=b) {
            return a;
        }
        else{
            return b;
        }
    }

    static int maxi(int c, int d, int e){
        return maxi(maxi(c,d),e);
    }

    public static void main(String[] args) {

        int netice = hesablaQuvveti(3,4);
        System.out.println(netice);

        salamVer();
        cemYaz(3,5);
        tekVeyaCut(5);

        int cem_netice = cem(5,5);
        System.out.println(cem_netice);

        int kvadrat_netice = kvadrat(9);
        System.out.println(kvadrat_netice);

        int muqayise = max(5,5);
        System.out.println(muqayise);

        int kvadrat2 = kvadrat(5);
        neticeniYaz(kvadrat2);

        int enBoyukMax = maxi(10,20,255);
        System.out.println(enBoyukMax);


    }
}
