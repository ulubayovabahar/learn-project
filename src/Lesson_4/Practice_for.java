package Lesson_4;
import java.util.Scanner;

public class Practice_for {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);

        //5 defe Hello yazan proqram yaz

//        for(int i=1; i<=5; i++){
//            System.out.println("Hello");
//        }

//        System.out.println("Reqem daxil edin");
//        int eded = 5;
//
//        for(int i=1; i<=eded; i++){
//            System.out.println("Hello");
//        }



        //1-dən 10-a qədər olan bütün cüt ədədləri ekrana çap edən for dövrü yaz.

//        int cut = 0;
//        for(int i=1; i<=10; i++){
//            cut = i%2;
//            if(cut==0){
//                System.out.println(i);
//            }
//        }



        //1-dən 20-yə qədər olan bütün təklik ədədləri ekrana çap et.

//        for(int i=1; i<=20; i++){
//            if(i%2==1){
//                System.out.println(i);
//            }
//        }



        //5-dən 1-ə qədər olan ədədləri tərs sırayla ekrana çap et.

//        for(int i=5; i>0; i--){
//            System.out.println(i);
//        }


        //1-dən 10-a qədər olan ədədlərin kvadratlarını ekrana çap et.

//        int hasil = 0;
//
//        for(int i=1; i<=10; i++){
//            hasil = i*i;
//            System.out.println(hasil);
//        }



        //1-dən 15-ə qədər olan ədədləri bir sətirdə, aralarına boşluq qoyaraq çap et.

//        for(int i=1; i<=15; i++){
//            System.out.println(i);
//        }

        //while
//        int count = 0;
//
//        while(count<10){
//            if(++count % 4 == 0 )
//                continue;{
//                System.out.println(count);
//            }
//        }


        //do {} while ()

//        int count =0;
//
//        do{
//            if (++count % 4 != 0) System.out.println(count);
//        }
//        while(count<10);


//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter username: ");
//        String username = sc.nextLine();
//        String correctPassword = "123456Aa";
//        String password;
//        boolean isLoginSuccessful = false;
//        int remainingRetries = 3;
//
//        do{
//            password = sc.nextLine();
//            if(password.equals(correctPassword)){
//                isLoginSuccessful = true;
//            }
//            else{
//                System.out.println("Wrong password");
//                remainingRetries--;
//            }
//            if(remainingRetries==0){
//                System.out.println("max retries");
//                break;
//            }
//        }
//        while(!isLoginSuccessful);
//        if(isLoginSuccessful){
//            System.out.println("Welcome " + username);
//        }

//      ----------------------------------------------------------

//        Məsələ 1. İki ədədin cəmi
//        Tələb: İstifadəçidən iki tam ədəd al, onların cəmini ekrana yaz.
//        Məntiq:
//        Scanner ilə iki ədəd oxu
//        Topla
//        Çap et

//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Birinci ededi daxil edin:");
//        int birinci_eded = input.nextInt();
//        System.out.println("Ikinci ededi daxil edin: ");
//        int ikinci_eded = input.nextInt();
//
//        System.out.println(birinci_eded + " + " + ikinci_eded + " = " + (birinci_eded+ikinci_eded));

//      ----------------------------------------------------------

//        Məsələ 2. Cüt və ya tək ədəd
//        Tələb: İstifadəçidən bir ədəd al. Əgər ədəd cütdürsə "Cüt", yox təkdirsə "Tək" yaz.
//        Məntiq:
//        Scanner ilə bir ədəd oxu
//        if ilə yoxla: number % 2 == 0 → cüt
//        Əks halda → tək

//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Ededi daxil edin:");
//        int birinci_eded = input.nextInt();
//
//        if(birinci_eded==0){
//            System.out.println("0 daxil etmek olmaz!");
//        }
//        else if(birinci_eded % 2 == 0){
//            System.out.println("Bu eded cutdur");
//        }
//        else{
//            System.out.println("Bu eded tekdir");
//        }

//      ----------------------------------------------------------

//        Məsələ 3. Ən böyük ədəd
//        Tələb: İstifadəçidən 3 ədəd al. Ən böyüyünü ekrana yaz.
//        Məntiq:
//        Scanner ilə 3 ədəd oxu
//        if/else ilə müqayisə et
//        Ən böyüyünü çap et


//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Birinci ededi daxil edin:");
//        int a = input.nextInt();
//        System.out.println("Ikinci ededi daxil edin: ");
//        int b = input.nextInt();
//        System.out.println("Ucuncu ededi daxil edin: ");
//        int c = input.nextInt();
//
//        if(a>=b && a>=c){
//            System.out.println(a);
//        }
//        else if(b>=a && b>=c ){
//            System.out.println(b);
//        }
//        else{
//            System.out.println(c);
//        }


//      ----------------------------------------------------------

//        Məsələ 4. Sadə şərtli giriş
//        Tələb: İstifadəçidən parol al. Əgər "Java123" yazarsa "Düzgün parol"
//        çıxarsın, əks halda "Yanlış parol".
//            Məntiq:
//        Scanner ilə String oxu
//        equals() ilə müqayisə et
//        Şərtə uyğun mesaj ver

//          Scanner input = new Scanner(System.in);
//
//          System.out.println("Sifreni qeyd edin");
//          String sifre = input.next();
//
//          String parol = "Java123";
//
//          if(sifre.equals(parol)){
//              System.out.println("Duzgun parol");
//          }
//          else{
//              System.out.println("Yanlish parol");
//          }


//      ----------------------------------------------------------

//        Məsələ 5. Döngü ilə çap
//        Tələb: 1-dən 10-a qədər bütün ədədləri çap et.
//                Məntiq:
//        for döngüsü qur: for(int i=1; i<=10; i++)
//        System.out.println(i);


//        for(int i=1; i<=10; i++){
//            System.out.println(i);
//        }


//      ----------------------------------------------------------

//        1. Cəmləmə məsələsi (for + toplama)
//        Tələb: İstifadəçidən bir ədəd al.
//        1-dən o ədədə qədər bütün ədədlərin cəmini tap və ekrana yaz.
//        Burada for döngüsü və dəyişənlə toplama istifadə olunacaq.
//        (Bu məsələni əvvəlcə sən yaz, sonra mən yoxlayım.)


//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Bir eded daxil edin:");
//        int a = input.nextInt();
//
//        int cem=0;
//
//        for(int i=1; i<=a; i++){
//            cem+=i;
//        }
//        System.out.println(cem);

//      ----------------------------------------------------------

//        2. Break ilə dayandırmaq
//        Tələb: İstifadəçidən istədiyi qədər ədəd al (məsələn, döngü sonsuz getsin).
//        Əgər istifadəçi -1 daxil etsə → proqram dayansın və indiyə qədər daxil
//        etdiyi ədədlərin cəmini yazsın.
//        Burada while(true) və break istifadə etməlisən.


//        Scanner input = new Scanner(System.in);
//
//        int cem = 0;
//
//        while(true){
//            System.out.println("Bir eded daxil edin: ");
//            int eded = input.nextInt();
//
//            if(eded==-1){
//                break;
//            }
//            else{
//                cem+=eded;
//            }
//        }
//        System.out.println(cem);

//      ----------------------------------------------------------



//      Məsələ: İstifadəçi ədəd daxil edir, amma cəmi 50-dən böyük olduqda dayandır

//        Scanner input= new Scanner(System.in);
//        int cem = 0;
//
//        while(true){
//            System.out.println("Eded daxil edin");
//            int eded = input.nextInt();
//            cem+=eded;
//
//            if(cem>50){
//                break;
//            }
//        }
//        System.out.println(cem);

//      ----------------------------------------------------------

//        Scanner input= new Scanner(System.in);
//        int cem = 0;
//
//        while(true){
//            System.out.println("Eded daxil edin: ");
//            int eded = input.nextInt();
//
//            if(eded<0){
//                continue;
//            }
//            else if(eded==0){
//                break;
//            }
//            else{
//                cem+=eded;
//            }
//
//        }
//        System.out.println(cem);

//      ----------------------------------------------------------

//        İstifadəçidən ədəd daxil etməsini istə.
//        Əgər daxil etdiyi ədəd təkdirsə, proqram işləməyə davam etsin
//        və cəmi hesablansın.
//        Əgər daxil etdiyi ədəd cüt olarsa, flag dəyişəni true olsun
//        və dövr dayansın.
//        Sonda yalnız tək ədədlərin cəmi ekrana çıxsın.

//        Scanner input= new Scanner(System.in);
//        int cem = 0;
//        boolean flag = false;
//
//        while(!flag){
//            System.out.println("Eded daxil edin: ");
//            int eded = input.nextInt();
//            if(eded % 2 ==0) {
//                flag = true;
//            }
//                else{
//                    cem+=eded;
//                }
//        }
//        System.out.println(cem);

//      ----------------------------------------------------------

//        Tək ədədlərin cəmi, menfiləri atlayaq, 0 daxil olanda dayanaq

//        Scanner input= new Scanner(System.in);
//
//        int cem =0;
//        boolean flag = false;
//
//        while(!flag){
//            System.out.println("Ededi daxil edin:");
//            int eded = input.nextInt();
//            if(eded==0){
//                flag=true;
//            }
//            else if(eded>0){
//                cem+=eded;
//            }
//        }
//        System.out.println(cem);

//      ----------------------------------------------------------

//        3. Continue ilə atlama
//        Tələb: İstifadəçidən bir ədəd al. 1-dən o ədədə qədər bütün ədədləri yaz,
//        amma cüt ədədləri atla (yəni yalnız tək ədədləri çap et).
//        Burada continue istifadə olunacaq.

//        Scanner input = new Scanner(System.in);
//        System.out.println("Ededi daxil edin: ");
//        int eded = input.nextInt();
//
//        for(int i=1; i<=eded; i++){
//            if(i % 2 == 0){
//                continue;
//            }
//            System.out.println(i);
//        }

//      ----------------------------------------------------------

//        4. Flag istifadə etmək
//        Tələb: İstifadəçidən bir ədəd al və yoxla ki, bu ədəd sadədir,
//        yoxsa yox.
//        Sadə ədəd → yalnız 1 və özünə bölünən ədəddir.
//        Əgər sadədirsə, "Bu ədəd sadədir", yoxdursa "Bu ədəd sadə deyil".
//        Burada bir dəyişəni flag kimi istifadə edəcəyik
//        (məsələn, əvvəlcə boolean isPrime = true;,
//        əgər bölən tapsaq false edirik).


//        Scanner input= new Scanner(System.in);
//
//        System.out.println("Ededi daxil edin");
//        int eded = input.nextInt();
//        boolean flag = true;
//
//        if(eded<=1){
//            System.out.println("Bu eded sade deyil");
//            flag = true;
//        }
//        else {
//            for(int i=2; i<=eded/2; i++){
//                if(eded%i==0){
//                    flag = false;
//                    break;
//                }
//            }
//        }
//
//        if(flag){
//            System.out.println("sadedir");
//        }
//        else{
//            System.out.println("sade deyil");
//        }



//      ----------------------------------------------------------
//      ----------------------------------------------------------
//      ----------------------------------------------------------
//      ----------------------------------------------------------












    }
}
