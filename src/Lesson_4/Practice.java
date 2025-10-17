package Lesson_4;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        1. Cəmləmə tapşırığı (while loop)
//        İstifadəçidən 0 daxil edənədək ədədlər daxil etməsini istəyən proqram yaz.
//        Ədədlərin cəmini ekrana çıxar.
//        Nümunə:
//        Input: 2, 5, 3, 0
//        Output: Cəm = 10

//        0 daxil edildikdə həm cəmi, həm də ədəd sayını göstərsin,
//        yaxud mənfi ədəd daxil edildikdə xəbərdarlıq versin (“mənfi ədəd daxil edilə bilməz”)

//        int sum = 0;
//        int count =0;
//
//        while(true){
//            System.out.println("Eded daxil edin: ");
//            int num = input.nextInt();
//            if(num<0){
//                System.out.println("Menfi eded daxil edile bilmez!");
//                continue;
//            }
//            if(num==0){
//                break;
//            }
//            sum+=num;
//            count+=1;
//        }
//        System.out.println("Ededlerin cemi: " + sum);
//        System.out.println("Ededlerin sayi: " + count);


//        3. Ədədlərin hasili (for loop)
//        1-dən N-ə qədər ədədlərin hasilini tap.
//        (N istifadəçidən alınır)
//        Məsələn:
//        N = 5 → 1*2*3*4*5 = 120

//        System.out.println("Ededi daxil edin: ");
//        int num = input.nextInt();
//        int fac =1;
//
//        for(int i=1; i<=num; i++){
//            fac*=i;
//        }
//        System.out.println(fac);


//        4. Cüt və tək ədədlər
//        1-dən 100-ə qədər olan ədədləri döngü ilə yoxla.
//        Cüt ədədləri bir sətirdə, tək ədədləri başqa sətirdə göstər.

//        String even = "";
//        String odd = "";
//
//        for(int i=1; i<=100; i++){
//            if(i%2==0){
//                even = even +i + " ";
//            }
//            else{
//                odd = odd +i + " ";
//            }
//        }
//        System.out.println(even);
//        System.out.println(odd);
//
//        5. Rəqəmlərin cəmi
//        İstifadəçidən bir ədəd al, məsələn 1234.
//        Döngü ilə bu ədədin rəqəmlərinin cəmini tap (1+2+3+4 = 10).

//        System.out.println("Bir eded daxil edin: ");
//        int num = input.nextInt(); // 234
//
//        int qaliq =0 ;
//        int cem = 0;

//        do{
//            qaliq = num%10;
//            cem +=qaliq;
//            num=num/10;
//        }while(num>0);
//        System.out.println(cem);

//        for(; num>0; num/=10){
//            qaliq = num%10;
//            cem+=qaliq;
//        }
//        System.out.println(cem);
//
//        6. Sonsuz döngü və break
//        Sonsuz while(true) döngüsü qur.
//        İstifadəçi “exit” yazana qədər daxil etdiyi mətnləri ekrana çap et.
//        Əgər “exit” yazarsa, break ilə döngüdən çıx.

//        while(true){
//            System.out.println("nese yaz");
//            String cumle = input.nextLine();
//            System.out.println(cumle);
//            if(cumle.equals("exit")){
//                break;
//            }
//        }

//
//        9. Nested loop (daxili döngü)
//        Aşağıdakı kimi ulduzlardan ibarət üçbucaq yarat:
//
//        *
//        **
//        ***
//        ****
//        *****

//        İpucu: Daxili for döngüsü istifadə et.

//        for(int i=1; i<=5; i++){
//            for(int j=0; j<i;j++){
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }

//        “boş üçbucaq” (outline triangle) dedikdə məqsəd budur ki:
//        yalnız kənarlarda * olacaq,
//        içi isə boşluqlardan ibarət olacaq.
//        Vizual təsvir (nəticə belə görünəcək):
//            *
//            **
//            * *
//            *  *
//            *   *

//        for(int i=1; i<=6; i++){
//            for(int j=1; j<=i; j++){
//                if(j==1 || j==i || i==1){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }


//        10. Label ilə idarəetmə
//        İki səviyyəli döngü qur:
//        Əgər i = 3 və j = 2 olarsa, xarici döngüdən break et (label istifadə et).
//        İpucu:
//        outer:
//        for(int i=1; i<=5; i++){
//            for(int j=1; j<=5; j++){
//                if(i==3 && j==2) break outer;
//            }
//        }

//        outer:
//        for(int i=0; i<5;i++){
//            for(int j=0; j<5; j++){
//                if(i==3 && j==2){
//                    break outer;
//                }
//                System.out.println(j);
//            }
//        }


        // for ile factoeial hesablamaq

//        System.out.println("Ededi daxil edin: ");
//        int eded = input.nextInt();
//
//        int fac = 1;

//        for(int i=1; i<=eded; i++){
//            fac *=i;
//        }
//        System.out.println(fac);

//        while(eded>0){
//            fac*=eded;
//            eded--;
//        }
//        System.out.println(fac);



        //ulduzlar ile ucbucaq - for ile

//        for(int i=1; i<=5; i++){
////            System.out.print("*");
////            for(int j=2; j<=i; j++){
////                System.out.print("*");
////            }
////            System.out.println();
////        }

        //ulduzlar ile ucbucaq - while ile

//        *
//        **
//        ***
//        ****
//        *****

//        int ulduz = 5;
//        int i = 1;
//
//        while(i<=ulduz){
//            int j=1;
//            while(j<i){
//                System.out.print("*");
//                j++;
//            }
//            System.out.println("+");
//            i++;
//        }


        //ededin quvvetinin hesablanmasi

//        System.out.println("Ededi daxil edin: ");
//        int eded = input.nextInt();
//
//        System.out.println("Quvveti daxil edin: ");
//        int quvvet = input.nextInt();
//
//        int i=1;
//        int hasil = 1;
//
//        while(i<=quvvet){
//            hasil*=eded;
//            i++;
//        }
//        System.out.println(hasil);


        //for ile sade eded olub olmamasi
        // 10

//        System.out.println("Ededi daxil edin: ");
//        int eded = input.nextInt();
//
//        int qaliq =1;
//        int cem = 0;
//
//        for(int i=1; i<=eded; i++){
//            qaliq = eded % i;
//            if(qaliq==0){
//                cem++;
//            }
//        }
//
//        if(cem==2){
//            System.out.println("sade ededdir");
//        }else{
//            System.out.println("murekkeb ededdir");
//        }

//        System.out.println("Ededi daxil edin: ");
//        int eded = input.nextInt();
//        boolean sade = true;
//
//        for(int i=2; i<=eded/2; i++){
//            if(eded % i ==0){
//                sade = false;
//                break;
//            }
//        }
//
//        if(sade){
//            System.out.println("Sade ededdir");
//        }else{
//            System.out.println("murekkeb ededdir");
//        }


        //sade ededdir yoxsa murekkeb?

//        int eded ;
//        boolean sade = true;
//
//        do{
//            System.out.println("Eded daxil edin");
//            eded = input.nextInt();
//
//            if(eded<0){
//                System.out.println("Menfi eded daxil etmek olmaz!");
//            }
//            if(eded==0){
//                System.out.println("Eded 0-a beraber ola bilmez!");
//            }else if(eded==1){
//                System.out.println("Bir ne sade ne de murekkeb ededdir!");
//            }
//        }while(eded<2);
//
//        for(int i=2; i<eded; i++){
//            if(eded%i==0){
//                sade = false;
//                break;
//            }
//        }
//        if(sade){
//            System.out.println("Bu eded sadedir");
//        }else{
//            System.out.println("Bu eded murekkebdir");
//        }


        //Armstrong ədədləri (bəzən Narcissistic ədədlər də deyilir)
        //370 → 3³ + 7³ + 0³ = 27 + 343 + 0 = 370 ✅
//        int temp, teklik, onluq, yuzluk, armstrong;
//
//        for(int i=100; i<=999; i++){
//            temp = i;
//
//            teklik = temp % 10;
//            temp = temp / 10;
//
//            onluq = temp % 10;
//            temp = temp / 10;
//
//            yuzluk = temp % 10;
//            temp = temp / 10;
//
//            armstrong = ((teklik*teklik*teklik) + ( onluq*onluq*onluq) + (yuzluk*yuzluk*yuzluk));
//
//            if(armstrong==i){
//                System.out.println(armstrong + " - armstrong ededdir");
//            }
//        }

        //fibonacci ededlerinin tapilmasi
        //0,1,1,2,3,5,8

//        System.out.println("Ededi daxil edin:");
//        int eded = input.nextInt();
//
//        int s1 = 0;
//        int s2 = 1;
//        int toplam = 0;
//
//        for(int i=1; i<=eded; i++){
//            System.out.print(s1 + " , ");
//            toplam = s1 + s2;
//            s1=s2;
//            s2=toplam;
//        }

        //EBOB EKOB

        System.out.println("Birinci ededi daxil edin");
        int eded1= input.nextInt();

        System.out.println("ikinci ededi daxil edin");
        int eded2= input.nextInt();








    }
}
