package Lesson_6_practice;

public class Overloading {

    static int add(int a, int b){
        System.out.println("Birinci metod");
        return a+b;
    }

    static int add(int a, int b, int c){
        System.out.println("Ikinci metod");
        return a+b+c;
    }

    static double add(int a, int b, double c){
        System.out.println("Ucuncu metod");
        return a+b+c;
    }


    public static void main(String[] args) {
        System.out.println(add(3,4));
        System.out.println(add(3,4,5));
        System.out.println(add(3,5,7));

    }

}
