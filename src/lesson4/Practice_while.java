package Lesson_4;
import java.util.Scanner;

public class Practice_while {
    public static void main(String[] args) {
        //user 2 eded daxil edir(iller) . bu iller araliginda olan her bir
        // ilin gunlerinin cemini tapin ve ekrana cixarin
        //leap il nezere alin
        //leap il 400-e bolunen, ve ya 4-e bolunub de 100-e bolunmeyen illerdir  2000 2009
        // 2009-2000  9 9/4 = 2 q1
        // 4*2 = 8 8*365 + 1*366

//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Birinci ededi daxil edin:");
//        int birinciEded = input.nextInt();
//
//        System.out.println("Ikinci ededi daxil edin:");
//        int ikinciEded = input.nextInt();
//
//        int cem=0;
//
//        for(int i=birinciEded; i<=ikinciEded; i++)
//        {
//            if(i%400==0 || ( i%4==0 && i%100!=0)){
//                cem+=366;
//        }
//            else{
//                cem+=365;
//            }
//        }
//        System.out.println(cem);

//        if(i%400==0 || ( i%4==0 && i%100!=0)){
//
//            cem+=i;
//        }
//        System.out.println(cem);


//         isitifadeciden eded alin
//          0-dan baslayaraq hemin edededek her bir eded ucun asagidaki qaydani tetbiq edin.
//        Task 3 - İngilis rəqəm oyunu:
//        Oyunun şərti belədir:
//        Verilən ədəd 15-ə bölünürsə, "fizzbuzz" deməlisən
//        Yalnız 5-ə bölünürsə, "buzz" deməlisən
//        Yalnız 3-ə bölünürsə, "fizz" deməlisən
//        Yuxarıdakı heç bir şərt ödənmədikdə, sadəcə ədədin özünü deməlisən
//        Proqram istifadəçidən ədəd istəməlidir və yuxarıdakı şərtlərə əsasən
//        lazımi cavabı ekrana çıxarmalıdır.
//        Qeyd: ədədin 0-dan böyük olmasından əmin olun.



//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Musbet bir eded daxil edin.(0 daxil etmek olmaz!) ");
//        int eded = input.nextInt();
//
//        for(int i=0 ; i<=eded; i++) {
//
//            if (i == 0) {
//                System.out.println("0 daxil etmek olmaz!");
//            } else if (i < 0) {
//                System.out.println("Eded musbet eded olmalidir!");
//            } else if (i % 15 == 0) {
//                System.out.println("fizzbuzz");
//            } else if (i % 5 == 0) {
//                System.out.println("buzz");
//            } else if (i % 3 == 0) {
//                System.out.println("fizz");
//            } else {
//                System.out.println("Daxil etdiyiniz eded: " + i);
//            }
//        }
//
//        input.close();



        //Istifadeci eded daxil edir
        //1-den baslayaraq o edededek her tam ededin 2 qatini ekrana cixarin

//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Eded daxil edin: ");
//        int eded = input.nextInt();
//
//        for(int i=1; i<eded; i++){
//                System.out.println(i*2);
//        }

        //istifadeciden eded alin
        //0 ededin faktorialini hesablayin
        //eded 0-dan boyuk olmalidir

//        System.out.println("Eded daxil edin: ");
//        int a = input.nextInt();  //3
//        int factorial = 1;
//
//        if(a>0){  //1*2*3
//            for(int i=1; i<=a; i++){
//                factorial *=i;
//            }
//            System.out.println(factorial);
//        }
//        else{
//            System.out.println("Daxil etdiyiniz eded 0-dan boyuk olmalidir!");
//        }

//      ----------------------------------------------------------------------------------------------

//        WHILE - while döngüsü, bir şərt doğru olduğu müddətcə bir blok kodu təkrar-təkrar
//        icra etmək üçün istifadə olunur
//        doğru olduğu müddətcə kod işləyir → şərt yenidən yoxlanır və proses davam edir.

//        Dövrün neçə dəfə işləyəcəyini əvvəlcədən bilmədikdə, şərtə görə davam edəndə rahatdır.


//        Task:1
//        1-den 5-e qeder reqemleri ekrana cap etmek

//        int i=1;
//
//        while(i<=5){
//            System.out.println(i);
//            i++;
//        }

        // Task 2:

        //Misal 2 – İstifadəçidən daxil edilən rəqəm 0 olmadıqca təkrar soruşmaq

        Scanner input = new Scanner(System.in);
//        int reqem;
//
//        do{
//            System.out.println("Reqem daxil edin: ");
//            reqem = input.nextInt();
//        }
//        while(reqem!=0);
//            System.out.println("Sistem dayandi");


//        İstifadəçidən ardıcıl tam ədədlər daxil etməsi tələb olunur.
//        Proqram daxil edilən ədədlərin ən böyüyünü tapmalıdır.
//        İstifadəçi 0 daxil etdikdə proqram dayansın və ən böyük ədədi ekrana çıxarsın.


//        Rəqəmlərin cəmini tapmaq
//        İstifadəçidən bir tam ədəd daxil etməsini tələb et. while döngüsü ilə bu ədədin rəqəmlərinin cəmini hesabla.
//        Məsələn: 472 → 4 + 7 + 2 = 13

//        System.out.println("Eded daxil edin");
//        int eded = input.nextInt(); //472
//        int qaliq = 0;
//        int cem = 0;
//
//        while(eded>0){
//            qaliq = eded % 10; //qaliq = 2
//            cem += qaliq;  //0+2 = 2
//            eded = eded/10; 47
//        }
//        System.out.println(cem);


//        Əksinə yazmaq
//        İstifadəçidən bir tam ədəd daxil etməsini tələb et. while ilə bu ədədin rəqəmlərini tərsinə yazdır.
//        Məsələn: 583 → 385

        System.out.println("Eded daxil edin:");
        int a = input.nextInt(); //472
        int qaliq = 0;

        while(a>0){
            qaliq = a % 10;  // qaliq = 2


        }



//        Cüt ədədlərin cəmi
//        İstifadəçidən bir müsbət tam ədəd daxil etməsini tələb et. 1-dən həmin ədədə qədər olan bütün cüt ədədlərin cəmini while ilə tap.
//        Məsələn: 10 → 2 + 4 + 6 + 8 + 10 = 30


//        Ən böyük rəqəmi tapmaq
//        İstifadəçidən bir tam ədəd daxil et. while ilə həmin ədədin ən böyük rəqəmini tap.
//        Məsələn: 39482 → ən böyük rəqəm = 9


//        Ədədin qüvvətini tapmaq
//        İstifadəçidən iki tam ədəd daxil etməsini tələb et: əsas və qüvvət. while istifadə edərək əsası qüvvətə yüksəlt.
//        Məsələn: 3 və 4 → 3⁴ = 81


        //İstifadəçidən 0-dan böyük ədəd istəyin və o ədəddən 0-adək (daxil olmaqla) geri sayım edin.
        //0 ve menfi daxil edene qeder davam etsin.

//        int eded;
//
//        do {
//            System.out.println("Ededi daxil edin");
//            eded = input.nextInt();
//
//            if (eded <= 0) {
//                System.out.println("menfi eded ve 0 daxil etmek olmaz!");
//            }
//        }while (eded <= 0);
//
//            for (int i = eded; i >= 0; i--) {
//                System.out.println(i);
//            }

//        İstifadəçidən 1–10 aralığında bir ədəd soruş.
//        Əgər ədəd 1–10 arasındadır → "Hello" çap et və proqram dayansın.
//        Əks halda → "1-10 araliginda eded daxil edin" mesajı göstərilsin və yenidən soruşulsun.

//            int eded;
//
//            do{
//                System.out.println("1-10 araliginda eded daxil edin:");
//                eded = input.nextInt();
//                if(eded < 1 || eded > 10){
//                    System.out.println("1-10 araliginda eded daxil edin: ");
//                }
//            }
//
//            while(eded < 1 || eded > 10);
//            System.out.println("Hello");


//        İstifadəçidən 1–7 aralığında bir gün nömrəsi soruş:
//        1 → Bazar ertəsi
//        2 → Çərşənbə axşamı
//        3 → Çərşənbə
//        4 → Cümə axşamı
//        5 → Cümə
//        6 → Şənbə
//        7 → Bazar

        int eded;

        do{
            System.out.println("1-7 araliginda eded daxil edin: ");
            eded = input.nextInt();
            if(eded<=0 || eded>7){
                System.out.println("1-7 araliginda eded daxil edin! ");
            }
        }while(eded<=0 || eded>7);






//        İstifadəçidən istənilən qədər ədəd daxil etməsini tələb et və bu ədədlərin cəmini və ortalamasını tap.
//        İstifadəçi 0 daxil etdikdə giriş dayansın.
//        0 daxil edilmir, sadəcə dayandırıcıdır.
//        Sonda ekrana cəmi və ortalama çıxsın.
//        Nümunə:
//        Eded daxil edin: 5
//        Eded daxil edin: 3
//        Eded daxil edin: 7
//        Eded daxil edin: 0
//        Cem: 15
//        Ortalama: 5.0

//        do{
//            System.out.println("Eded daxil edin");
//        }




    }
}
