package Lesson_3;
import java.util.Scanner;

public class Istifadeci_girisi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Istifadeci adinizi daxil edin: ");
        String ist_ad = input.next();

        System.out.println("Sifreni daxil edin:");
        String sifre = input.next();

        if(ist_ad.equals("java") && sifre.equals("1234")){
            System.out.println("Ugurlu sekilde giris etdiniz! ");
        }else{
            System.out.println("Melumatkari dogru daxil edin! ");
        }

    }
}
