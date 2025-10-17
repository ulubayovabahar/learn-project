package Lesson_2;

public class BitwiseOperators {
    public static void main(String[] args) {

//           Unary operators

//      ++ -- - + ! ~
//      Unary operatorlar – yalnız bir ədəd (operand) üzərində işləyən operatorlardır.
//      "Unary" sözü "bir" mənasını verir, yəni bu operatorun işləməsi üçün tək bir dəyər kifayətdir.
//      Icrement(artim) ++ Prefix (evvel yerlesdirmek)
//      Decrement(azalma) -- Postfix (sonra yerlesdirmek)

//        int number = 12;
//        int newNumber = ~ 12;
//        System.out.println(newNumber);

//      Bitwise Operators - Bitwise operatorlar – ədədlər üzərində ikilik (binary) səviyyəsində işləyən operatorlardır.
//      &   '   ^   ~	 <<   >>   >>>
//      &   - AND
//      |   - OR - inclusive
//      ^   - XOR - exclusive

//        int number1 = 15;
//        //00001111
//        int number2 = 20;
//        //00010100
//        //00000100 - & - her iki bit 1 olarsa 1 olur, eks halda 0
//        //00011111 - | - her iki bitden en azi biri 1 olarsa? netice bir olur
//        //00011011 - ^ - iki bit ferqlidirse, netice 1 olur, eynidirse, 0
//        System.out.println(number1 & number2); //4
//        System.out.println(number1 | number2); //31;
//        System.out.println(number1 ^ number2); //27


        //Shift Operatorlari

//        int number = 24;
//        //00011000
//        //sola 2 sifir elave edirik
//        //00000110
//        System.out.println(number >> 2);


//        int number = 25;
//        //00011001
//        //00000011
//        System.out.println(number << 5);

        //sola surushdurmek - 2-e vurmaq
        // saga surushdurmek - 2-e bolmek


        int number = -25;
         System.out.println(number >>>  2);

    }
}
