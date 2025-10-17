package Lesson_6_practice;

public class Classes {
    public static void main(String[] args) {
        // OOP - Object Oriented Programming
        // ClassAdi ObyektA = new ClassAdi();

//        Calculator calculator1 = new Calculator();
//        calculator1.eded1 = 10;
//        calculator1.eded2 = 20;
//        System.out.println(calculator1.eded1);
//        System.out.println(calculator1.eded2);
//
//        Calculator calculator2 = new Calculator();
//        calculator2.eded1 = 30;
//        calculator2.eded2 = 40;
//        System.out.println(calculator2.eded1);
//        System.out.println(calculator2.eded2);

        //Consturctors - “qurucu” və ya “obyekt yaradıcısı”

//        Calculator calculator3;
//        calculator3 = new Calculator(1,2);
//        calculator3.eded1 = 45;
//        System.out.println(calculator3.eded1 + " " + calculator3.eded2);

//        Calculator m1 = new Calculator(10,15, "purple");
//        System.out.println(m1.toplama());
//        System.out.println(m1.cixma());
//        System.out.println(m1.vurma());
//        System.out.println(m1.bolme());
//
//        Calculator m2 = new Calculator(6 ,8, "pink");
//        System.out.println(m2.toplama());

        int result = cem(5,7);
        print(result);

    }

    public static void print(int result){
        System.out.println("netice: " + result);
    }

    public static int cem(int a, int b){
        return a+b;
    }

}
