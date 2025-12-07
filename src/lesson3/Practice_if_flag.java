package lesson3;
import java.util.Scanner;

public class Practice_if_flag {
    public static void main(String[] args){
//        Task: 1
//        Scanner input = new Scanner(System.in);
//        System.out.println("Adinizi daxil edin:");
//        String ad = input.nextLine();
//
//        System.out.println("Yasinizi daxil edin:");
//        int yas = input.nextInt();
//
//        System.out.println("Boyunuzu daxil edin");
//        double boy = input.nextDouble();
//
//        System.out.println("Məlumat: " + ad + ", " + yas + " yaş, " + boy + " m boy.");
//
//        input.close();

//        Task: 2
//        Bir kinoteatr sistemində bilet almaq üçün iki şərt var:
//        İstifadəçi 18 yaşdan böyük olmalıdır.
//        Əgər istifadəçi 18 yaşdan böyükdürsə, üzvlük kartı (membership card) olmalıdır.
//        Əgər hər iki şərt ödənirsə: "Bilet alına bilər" yazılsın.
//        Əgər yaş uyğun gəlir amma kart yoxdursa: "Üzvlük kartı tələb olunur" yazılsın.
//        Əgər yaş uyğun gəlmirsə: "Yaş məhduddur" yazılsın.


//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Yasinizi daxil edin:");
//        int yas = input.nextInt();
//
//        System.out.println("Uzvluk kartiniz var? true/false");
//        boolean uzvlukKarti = input.nextBoolean();
//
//        if(yas>=18){
//            if(uzvlukKarti){
//                System.out.println("Bileti teqdim edin");
//            }
//            else{
//                System.out.println("Üzvlük kartı tələb olunur");
//            }
//        }
//        else{
//            System.out.println("Yas mehduddur");
//        }


//      Task: 3

//        Şərt (məsələ):
//        İstifadəçi yaşı 21 və ya daha böyük olmalıdır.
//        Əgər yaş uyğun gəlirsə, istifadəçinin VIP kartı (hasVIPCard) olub-olmadığı yoxlanır.
//        Kart varsa → "VIP salona daxil ola bilərsiniz" mesajı çıxır.
//        Kart yoxdursa → "Normal salona daxil ola bilərsiniz" və "Bileti almaq üçün ödəniş edin" mesajları çıxır.
//        Əgər yaş 21-dən kiçikdirsə → "Heç bir salon üçün icazə verilmir" mesajı çıxır.

//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Yasinizi daxil edin:");
//        int yas = input.nextInt();
//
//        System.out.println("Vip kartiniz var? true/false");
//        boolean hasVIPCard = input.nextBoolean();
//
//        if(yas>=21){
//            if(hasVIPCard){
//                System.out.println("VIP salona daxil ola bilersiniz");
//            }
//            else{
//                System.out.println("Normal salona daxil ola bilersiniz");
//                System.out.println("Bileti almaq üçün ödəniş edin");
//            }
//        }
//        else{
//            System.out.println("Hec bir salon ucun icaze verilmir");
//        }


//      Task: 4

//        Bir kino və yaş məhdudiyyətli filmlər sistemi var:
//        İstifadəçi yaşı 13-dən böyük olmalıdır.
//        Əgər yaş uyğun gəlirsə, istifadəçinin üzvlük kartı (hasMembership) olub-olmadığı yoxlanır:
//        Kart varsa → "R-rated filmə giriş icazəlidir" mesajı çıxır.
//        Kart yoxdursa → "Giriş yalnız PG-13 film üçün icazəlidir" mesajı çıxır.
//        Əgər istifadəçi yaşı 18-dən böyükdürsə, və kart yoxdursa → "R-rated film üçün ödəniş edə bilərsiniz" mesajı da çıxır.
//        Əgər yaş uyğun gəlmirsə → "Heç bir film üçün icazə verilmir" mesajı çıxır.


//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Yasinizi daxil edin: ");
//        int age = input.nextInt();
//
//        System.out.println("Uzvluk kartiniz var? true/false");
//        boolean hasVIPCard = input.nextBoolean();
//
//        if(age>=13 && age<18){
//            if(hasVIPCard){
//                System.out.println("R-rated filmə giriş icazəlidir");
//            }
//            else{
//                System.out.println("Giriş yalnız PG-13 film üçün icazəlidir");
//            }
//        }
//        else if(age>=18){
//            if(!hasVIPCard){
//                System.out.println("R-rated film üçün ödəniş edə bilərsiniz");
//            }
//        }
//        else{
//            System.out.println("Heç bir film üçün icazə verilmir");
//        }



//      -------------------------------------------------


//        double balance = 100;
//        Scanner input = new Scanner(System.in);
//        double a = input.nextInt();
//
//        if(a>balance){
//            System.out.println("denish olunmadi");
//            return;
//        }if(a<=balance){
//            System.out.println("odenish olundu");
//        }
//
//
//        int b = 90;
//        System.out.println(b);
//
//
//        String message = (a>balance) ? "denish olunmadi" : "odenish olundu";
//        System.out.println(message);


//      -------------------------------------------------


//        İstifadəçi bir ədəd daxil edir.
//        Əgər ədəd müsbətdirsə, flag = true olsun.
//        Əks halda flag = false olsun.
//        Sonda flag-ın dəyərini ekrana çıxar.

//        Scanner input = new Scanner(System.in);
//
//        boolean musbet = true;
//
//        System.out.println("Bir eded daxil edin: ");
//        int eded = input.nextInt();
//
//        if(eded<0){
//            musbet = false;
//        }
//        else if(eded>0){
//            musbet = true;
//        }
//        else{
//            System.out.println("Eded 0-dir");
//            musbet = false;
//        }
//
//        System.out.println(eded + "  " + musbet);


//      -------------------------------------------------


//        Bir proqram istifadəçidən 5 tam ədəd daxil etməsini istəyir.
//        Əgər daxil edilən ədədlərin arasında ən azı bir cüt ədəd varsa,
//        flag dəyişəni true olacaq, yoxdursa false qalacaq.
//        Sonda proqram flag-ın dəyərini ekrana çıxarsın.
//        Qaydalar:
//        flag əvvəlcə false elan edilir.
//        Hər ədəd daxil edəndə yoxlayırsan cütdür, yoxdursa davam edirsən.


//        Scanner input = new Scanner(System.in);
//        boolean flag = true;
//
//        for(int i=1; i<=5; i++){
//            System.out.println("Ededi daxil edin");
//            int eded = input.nextInt();
//
//            if(eded % 2 == 0){
//                flag=false;
//            }
//            }
//
//            System.out.println(flag);

        // flag - mesele
        Scanner input = new Scanner(System.in);

//        int[] ededler = {1, 5, 7, 9, 15};
//        boolean tapildi = false;
//
//        for(int eded : ededler){
//            if(eded==5){
//                tapildi=true;
//            }
//        }
//
//        if(tapildi==true){
//            System.out.println("5 ededi tapildi! ");
//        }else{
//            System.out.println("5 ededi tapilmadi! ");
//        }

        // Bir massiv verilir: int[] nums = {2, 4, 7, 10, 11, 16};
        // Massivin içində tək ədəd olub-olmadığını yoxla.
        // Əgər heç olmasa 1 dənə tək ədəd varsa, ekrana: Massivdə tək ədəd var
        // Əgər heç bir tək ədəd yoxdursa, ekrana: Massivdə tək ədəd yoxdur

//        int[] nums = {2, 34, 4, 10, 12, 16};
//        boolean tekEded = false;
//
//        for(int num : nums){
//            if(num%2!=0){
//                tekEded=true;
//                break;
//            }
//        }
//
//        if(tekEded){
//            System.out.println("Massivdə tək ədəd var");
//        }else{
//            System.out.println("Massivdə tək ədəd yoxdur");
//        }


        //

//        int[] nums = {3, 6, 8, 9, 12, 15, 18};
//        boolean tekEded = false;
//        boolean uceBolunen = false;
//
//        for(int num : nums){
//            if(num%2!=0){
//                tekEded=true;
//            }
//            if(num%3==0){
//                uceBolunen=true;
//            }
//            if(tekEded && uceBolunen)
//                break;
//        }
//
//        if(tekEded){
//            System.out.println("Massivdə tək ədəd var");
//        }
//
//        if(uceBolunen){
//            System.out.println("Massivdə 3-ə bölünən ədəd var");
//        }
//
//        if(!tekEded && !uceBolunen){
//            System.out.println("Massivdə tək də, 3-ə bölünən də yoxdur");
//        }

        // Sənə bir massiv verilir:
        // int[] nums = {2, 4, 5, 6, 8, 9, 12};
        // Massivdə ardıcıl iki ədədin cəmi 10-dan böyük olub olmadığını yoxla.
        //Əgər belə bir cüt varsa, flag-i true et və döngünü dayandır.
        //Sonra nəticəyə görə ekrana yaz:
        // Əgər belə bir cüt varsa:
        // Massivdə ardıcıl ədədlərin cəmi 10-dan böyük olan cüt var
        // Əks halda:
        // Massivdə belə cüt yoxdur

        int[] nums = {2, 4, 5, 6, 8, 9, 12};
        boolean flag = false;

        for(int i=0; i< nums.length-1; i++){
            if(nums[i]+nums[i+1] >10 ){
                flag=true;
                break;
            }
        }

        if(flag){
            System.out.println("Massivdə ardıcıl ədədlərin cəmi 10-dan böyük olan cüt var");
        }else{
            System.out.println("Massivdə belə cüt yoxdur");
        }








    }
}
