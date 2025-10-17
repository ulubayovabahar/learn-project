package Lesson_3;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        //1-dən 10-a qədər ədədləri çap et

//        for(int i=1; i<=10;i++){
//            System.out.println(i);
//        }

        //5 dəfə "Java öyrənirəm" yaz

//        for(int i=0; i<5; i++){
//            System.out.println("Java oyrenirem");
//        }

        //1-dən 20-yə qədər ədədləri çap et

//        for(int i=0; i<20;i++){
//            System.out.println(i);
//        }

        //10-dan 1-ə qədər geriyə say

//        for(int i=10;i>0;i--){
//            System.out.println(i);
//        }

        //İstifadəçidən 5 dəfə ad soruş və hər dəfə "Salam, [ad]" yaz

//        for(int i=0; i<5; i++){
//            String ad = input.next();
//            System.out.println("Salam, " + ad);
//        }

        //1-dən 100-ə qədər cüt ədədlərin cəmini hesabla

//        int cem = 0;
//
//        for(int i=1; i<=100;i++){
//            if(i%2==0){
//                cem+=i;
//            }
//        }
//        System.out.println(cem);


//        int cem =0;
//
//        for(int i=2;i<=100;i+=2){
//            cem+=i;
//        }
//        System.out.println(cem);

        //İstifadəçidən şifrə al, "java123" daxil edənə qədər təkrar soruş


//        System.out.println("Sifreni daxil edin: ");
//
//
//        while(true){
//            String sifre = input.next();
//            if(sifre.equals("java1234")){
//                System.out.println("Giris olundu");
//                break;
//            }else{
//                System.out.println("Sifreni yeniden daxil edin: ");
//            }
//        }


//        String sifre;
//
//        do{
//            System.out.println("Sifreni daxil edin: ");
//            sifre = input.next();
//        }while(!sifre.equals("java1234"));
//            System.out.println("Giris olundu");



        //1-dən 50-yə qədər ədədlər arasında yalnız 3-ə bölünənləri çap et

//        for(int i=1; i<=50;i++){
//            if(i%3==0){
//                System.out.println(i);
//            }
//        }

//

        //İstifadəçi "stop" yazana qədər söz al və hər dəfə uzunluğunu çap et

//        String soz;
//
//        do{
//            System.out.println("Bir soz daxil edin:");
//            soz = input.next();
//            System.out.println(soz + " - uzunluq: " + soz.length());
//        }while(!soz.equals("stop"));


//        String soz;
//
//        do{
//            System.out.println("Bir soz daxil edin:");
//            soz = input.next();
//            if(!soz.equals("stop")){
//                System.out.println(soz + " - uzunluq: " + soz.length());
//            }
//        }while(!soz.equals("stop"));




//        1-dən başlayaraq ədəd çap et. Əgər ədəd 7-yə çatarsa, dövr dayansın.

//        int i=0;
//
//        while(true){
//            i++;
//            System.out.println(i);
//            if(i==7){
//                break;
//            }
//        }

//        int i=1;
//
//        while(i<=7){
//            System.out.println(i);
//            i++;
//        }


//
//        3 sıra və 4 sütundan ibarət ulduzlardan ibarət sadə cədvəl çap et:
//        Kod
//                * * * *
//                * * * *
//                * * * *

//        for(int i=1; i<=3;i++){
//            for(int j=1; j<=4; j++){
//                //System.out.print("[" + i + "," + j + "] ");
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


//        Sonsuz dövr yaradaraq hər 3 saniyədən bir "Sistem işləyir..." mesajını çap et.
//        (İpucu: Thread.sleep(3000); istifadə oluna bilər)

//        while(true){
//            System.out.println("Sistem isleyir");
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }

//        int i=1;
//
//        while(true){
//            System.out.println("[" + i + "]" + " Sistem isleyir");
//            i++;
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }


//        İstifadəçidən yaşını soruş. Əgər yaş 0-dan kiçikdirsə, yenidən soruş.

//        int yas;
//        do{
//            System.out.println("Yasinizi qeyd edin: ");
//            yas = input.nextInt();
//            if(yas<=0){
//                System.out.println("Yanlis daxil etdiniz. Yeniden daxil edin!");
//            }
//        }while(yas<=0);
//            System.out.println("Sizin yasiniz: " + yas);

//
//        İstifadəçidən 5 söz al. Əgər "java" sözü daxil edilərsə,
//        flag true olsun və "Java tapıldı!" mesajı verilsin.

//        String soz;
//        boolean soztapildi = false;
//
//        for(int i=1; i<=5; i++){
//            System.out.println("Bir soz daxil edin: ");
//            soz = input.next();
//            if(soz.equals("java")){
//                soztapildi = true;
//            }
//        }
//
//        if(soztapildi){
//            System.out.println("Java tapildi");
//        }else{
//            System.out.println("Java tapilmadi");
//        }


//
//        1-dən 10-a qədər ədədlərin kvadratını çap et.

//        for(int i=1; i<=10; i++){
//            System.out.println(i*i);
//        }


//        1-dən 100-ə qədər ədədləri çap et. Əgər ədəd 42 olarsa, dövrü dayandır.

//        for(int i=1; i<=100;i++){
//            System.out.println(i);
//            if(i==42){
//                break;
//            }
//        }


//        1-dən 20-yə qədər ədədləri çap et, amma 5 və 10-u atla.

//        for(int i=1; i<=20; i++){
//            if(i==5 || i==10){
//                continue;
//            }
//            System.out.println(i);
//        }

//
//        İki dövr iç-içə olsun. Əgər i == 2 və j == 3 olarsa, yalnız xarici dövrü dayandır.

//        outer:
//        for(int i=1; i<=10;i++){
//            for(int j=1; j<=10; j++){
//                System.out.println("i = " + i + ", j = " + j);
//                if(i==2 && j==3){
//                    break outer;
//                }
//            }
//        }


        // İstifadəçidən 10 ədəd al. Əgər ən azı bir müsbət ədəd daxil edilərsə,
        // flag true olsun və sonunda “Müsbət ədəd daxil edildi” mesajı verilsin.

//        int eded;
//        boolean musbet = false;
//
//        for(int i=1; i<=10; i++){
//            System.out.println("Ededi axil edin: ");
//            eded = input.nextInt();
//            if(eded>0){
//                musbet = true;
//            }
//        }
//        if(musbet){
//            System.out.println("Musbet eded daxil edildi");
//        }else{
//            System.out.println("Siz musbet eded daxil etmemisiniz!");
//        }


        //Şifrə yoxlaması
        //İstifadəçidən 3 dəfə şifrə soruş. Əgər “1234” yazarsa,
        //flag true olsun və “Giriş uğurlu!” mesajı verilsin. Əks halda “Giriş uğursuz” yazılsın.

//        String password;
//        boolean passtrue = false;
//
//        for(int i=1; i<=3; i++){
//            System.out.println("Sifreni daxil edin: ");
//            password = input.next();
//            if(password.equals("1234")){
//                passtrue = true;
//                break;
//            }else{
//                System.out.println("Yanlis sifre yeniden cehd edin! ");
//            }
//        }
//
//        if(passtrue){
//            System.out.println("Giris ugurludur! ");
//        }else{
//            System.out.println("Sifre yanlisdir! ");
//        }

        //Cəmləyici dövr + şərt + continue
        //Tapşırıq: 1-dən 100-ə qədər ədədlərin cəmini hesabla,
        //amma 5-in və 10-un vurma cədvəlində olanları atla (continue istifadə et).

//        int cem = 0;
//
//        for(int i=1; i<=100; i++){
//            if(i%5==0 || i%10==0){
//                continue;
//            }
//            cem+=i;
//        }
//        System.out.println(cem);


        //Tapşırıq: 1-dən 10-a qədər vurma cədvəlini çap et.
        //Format belə olsun: 1 x 1 = 1, 1 x 2 = 2, ..., 10 x 10 = 100

//        for(int i=1; i<=10; i++){
//            for(int j=1; j<=10; j++){
//                System.out.print(i + "*" + j + "=" + (i*j) + ",");
//            }
//            System.out.println();
//        }


//        for(int i=1; i<=10; i++){
//            for(int j=1; j<=10; j++){
//                System.out.printf("%2d x %2d = %3d  ", i, j, i*j);
//            }
//            System.out.println();
//        }


        //do-while ilə menyulu sistem
        //Tapşırıq: İstifadəçiyə aşağıdakı menyunu göstər:
        //
        //Kod
        //1. Salam de
        //2. Tarixi göstər
        //3. Çıxış
        //İstifadəçi 3 seçənə qədər menyu təkrar göstərilsin.

        int giris;
        boolean cixis = false;

        do{
            System.out.println(" 1. Salam de \n 2.Tarixi goster \n 3.Cixis");
            System.out.println("Secim edin: ");
            giris = input.nextInt();
            if(giris==1 || giris==2){
                System.out.println("Yeniden daxil edin");
            }else if(giris==3){
                cixis=true;
            }else{
                System.out.println("Yalniz 1 2 3 sece bilersiniz");
            }
        }while(!cixis);




        //Thread.sleep ilə loading animasiyası
        //Tapşırıq: “Yüklənir...” mesajını 5 dəfə çap et,
        //hər çapdan sonra 1 saniyə gözlə. Thread.sleep(1000) istifadə et.

//        for(int i=1; i<=5; i++){
//            System.out.println("Yuklenir");
//            try {
//                Thread.sleep(1000); // 1 saniyə gözləyir
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }



    }
}
