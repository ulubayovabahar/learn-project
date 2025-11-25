package Lesson_6;
import java.util.Scanner;

public class Overloading_practice {
//        Məsələ 1:
//        İki ədədin cəmini hesablayan topla() metodu yaz.
//        Sonra eyni adlı metodu yaz ki, 3 ədəd toplaya bilsin.
//        Main-də hər iki variantı çağır və nəticəni çap et.

    static int cem(int a, int b){
        return a+b;
    }

    static int cem(int a, int b, int c){
        return a+b+c;
    }

//    Məsələ 2:
//    cemiYaz() adlı metod yaz:
//    biri int tipində 2 ədəd qəbul etsin,
//    digəri double tipində 2 ədəd qəbul etsin.
//    İkisi də eyni adlı metod olsun, amma fərqli tipli parametrlərlə işləsin.
//    Hər biri nəticəni ekrana çap etsin.

    static void cemiYaz(int a, int b){
        System.out.println("int versiyasi: " + (a+b));
    }

    static void cemiYaz(double a, double b){
        System.out.println("double versiyasi: " + (a+b));
    }

//      Məsələ 3:
//      multiply() adlı metod yaz:
//      2 int parametri ilə işləsin (int × int)
//      3 int parametri ilə işləsin (int × int × int)
//      2 double parametri ilə işləsin (double × double)
//      Main-də bu 3 variantı çağır və fərqli nəticələri çap et.

    static void multiply(int a, int b){
        System.out.println("Iki int ile : " + (a+b));
    }

    static void multiply(int a, int b, int c){
        System.out.println("Uc int ile : " + (a+b+c));
    }

    static void multiply(double a, double b){
        System.out.println("Iki double ile : " + (a+b));
    }

//    Məsələ 4:
//    printInfo() adlı metod yaz:
//    bir versiyası yalnız ad qəbul etsin və çap etsin.
//    ikinci versiyası ad + yaş qəbul etsin və çap etsin.
//    üçüncü versiyası ad + yaş + şəhər qəbul etsin və çap etsin.

    static void printInfo(String ad){
        System.out.println("Ad: " + ad);
    }
    static void printInfo(String ad, int yas){
        System.out.println("Ad: " + ad + " Yas: " + yas);
    }
    static void printInfo(String ad, int yas, String seherAdi){
        System.out.println("Ad: " + ad + " Yas: " + yas + " Seher adi: " + seherAdi);
    }

//    Məsələ 5:
//    findMax() adlı metod yaz:
//    biri 2 int parametr qəbul etsin və maksimumu qaytarsın,
//    biri 3 int parametr qəbul etsin və maksimumu qaytarsın,
//    biri isə 2 double parametr qəbul etsin və maksimumu qaytarsın.

    static void findMax(int a, int b){
        if(a>b){
            System.out.println(a);
        }else if(b>a){
            System.out.println(b);
        }else{
            System.out.println(a + "=" + b);
        }
    }
    static void findMax(int a, int b, int c){
        if(a>b && a>c){
            System.out.println(a);
        }else if(b>a && b>c){
            System.out.println(b);
        }else if(c>a && c>b){
            System.out.println(c);
        }else{
            System.out.println("Beraberlik var");
        }
    }
    static void findMax(double a, double b){
        if(a>b){
            System.out.println(a);
        }else if(b>a){
            System.out.println(b);
        }else{
            System.out.println(a + "=" + b);
        }
    }

//    Məsələ 6 (bonus):
//    area() adlı metod yaz:
//    biri dairənin sahəsini hesablasın (area(double radius)),
//    biri düzbucaqlının sahəsini (area(double width, double height)),
//    biri üçbucağın sahəsini (area(double base, double height,
//    boolean isTriangle) — bu “true” olarsa üçbucaq kimi hesablansın).

    static double area(double radius){ //Dairenin sahesi
        double daireninSahesi = 2 * 3.14 * radius * radius;
        System.out.println("Dairenin sahesi: " + daireninSahesi);
        return daireninSahesi;
    }
    static double area(double width, double height){ //Duzbucaqlinin sahesi
        double duzbucaqlininSahesi = width * height;
        System.out.printf("Duzbucaqlinin sahesi: %.2f\n" , duzbucaqlininSahesi);
        return duzbucaqlininSahesi;
    }
    static double area(double base, double height, boolean isTriangle) { //Ucbucagin sahesi
        if (isTriangle == true) {
            double ucbucaginSahesi = 0.5 * base * height;
            System.out.println("Ucbucagin sahesi: " + ucbucaginSahesi);
            return ucbucaginSahesi;
        } else {
            return area(base, height);
        }
    }
    public static void main(String[] args) {

        System.out.println(cem(3,5));
        System.out.println(cem(3,5,8));

        cemiYaz(6,7);
        cemiYaz(6,6.8);

        multiply(3.5,3.4);
        multiply(3.8,8);
        multiply(3, 4,5);
        multiply(2,4,5);

        printInfo("Miu");
        printInfo("Miu", 18);
        printInfo("Miu", 21, "Baku");

        findMax(5,5);
        findMax(4.5, 5);
        findMax(3,4,5);

        area(7);
        area(5);
        area(6.8,9);
        area(3, 2, false);


    }
}
