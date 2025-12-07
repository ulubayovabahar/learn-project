package l7arrayavarage;

import java.util.Scanner;

public class Avarage {
    public static void main(String[] args) {

        int[] notlar = new int[6];
        int cem = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Xosh geldinin! Ballarinizi sira ile daxil edin.");

        System.out.println("Riyaziyyat 1: ");
        notlar[0]= input.nextInt();

        System.out.println("Ingilis dili 2: ");
        notlar[1] = input.nextInt();

        System.out.println("Fizika 3: ");
        notlar[2] = input.nextInt();

        System.out.println("Tarix 4: ");
        notlar[3] = input.nextInt();

        System.out.println("Kimya 5: ");
        notlar[4] = input.nextInt();

        System.out.println("Idman 6: ");
        notlar[5] = input.nextInt();

        for(int not : notlar){
            cem+=not;
        }

        System.out.println("Ortalamaniz: " + cem/ notlar.length);

    }
}
