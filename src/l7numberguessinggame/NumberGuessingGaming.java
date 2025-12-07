package l7numberguessinggame;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGaming {
    public static void main(String[] args) {

//        Məsələ: Edəd Tapma Oyunu

//        Kompüter 0–99 aralığında təsadüfi bir ədəd seçir.
//        İstifadəçiyə bu ədədi tapmaq üçün 5 cəhd imkanı verilir.
//        Hər cəhd üçün istifadəçi bir ədəd daxil edir:
//        Əgər ədəd 0–99 aralığında deyilsə, proqram istifadəçiyə xəbərdarlıq edir və həmin cəhd sayılmır.
//        Hər daxil edilən ədəd yadda saxlanılır (istifadəçinin bütün texminləri bir array-də saxlanır).
//        Əgər ədəd təsadüfi seçilmiş ədədə bərabərdirsə, oyun bitir və istifadəçi qazanır.
//        Əks halda, proqram istifadəçiyə yanıldığını bildirir və qalan cəhd sayını göstərir.
//        İstifadəçi bütün cəhdləri istifadə edib düzgün ədəd tapa bilməzsə, oyun bitir və proqram uduzduğunu bildirir.
//        Oyun sonunda proqram:
//        İstifadəçi düzgün tapıbsa, doğru ədədi və qalan cəhd sayını göstərir.
//        İstifadəçi tapa bilməyibsə, təəssüf mesajı göstərir.
//        İstifadəçinin etdiyi bütün texminlər ekrana çıxarılır (yalnız daxil edilmiş ədədlər göstərilir, 0-lar çıxarılır).

        int texmin, can = 5;
        int i = 0;

        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int eded = rand.nextInt(100);
        int[] texminler = new int[5];

        boolean oyunDurumu = false;

        System.out.println(eded);
        System.out.println("Ededi texmin etmek oyununa xos gelmisiniz! ");
        System.out.println("0-99 arasinda olan ededi tapmalisiniz");
        System.out.println("Sadece 5 texmin etmek sansiniz var. Ugurlar!");

        while(can>0){
            System.out.println("Texmin edin: ");
            texmin = input.nextInt();
            texminler[i++] = texmin;

            if(texmin<0 || texmin>100){
                System.out.println("0-99 araliginda eded daxil edin! ");
                continue;
            }
            if(texmin==eded){
                oyunDurumu = true;
                break;
            }else{
                System.out.println("Yanlish texmin etdiniz! Qalan yoxlama sayiniz: " + --can);
            }
        }

        if(oyunDurumu){
            System.out.println("Tebrikleer!!! Dogru texmin etdiniz!");
            System.out.println("Texmin etdiyiniz eded: " + eded);
            System.out.println("Qalan yoxlama sayiniz: " + can);
        }else{
            System.out.println("Teessuf! Texmin ede bilmediniz!");
        }

        System.out.print("Texminleriniz: ");

        for(int value : texminler){
            if(value!=0){
                System.out.print(value + " , ");
            }
        }
    }
}
