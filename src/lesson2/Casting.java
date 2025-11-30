package Lesson_2;

import java.util.Scanner;

public class Casting {
    public static void main(String[] args) {

        //Java-da casting iki əsas növə bölünür:
        //Implicit Casting (Widening Conversion)
        //Explicit Casting (Narrowing Conversion)

        //Implicit Casting (Widening Conversion)
        //Kiçik tip → böyük tip çevrilməsidir.
        //Avtomatik baş verir, çünki məlumat itkisi yoxdur.

        int a = 100;
        double b = a;
        System.out.println(b);

        //Explicit Casting (Narrowing Conversion)
        //Böyük tip → kiçik tip çevrilir.
        //Əl ilə (type) yazaraq edilir, çünki məlumat itkisi ola bilər.

        double x = 9.78;
        int y = (int) x;
        System.out.println(y);










    }
}
