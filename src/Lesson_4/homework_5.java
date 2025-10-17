package Lesson_4;
import java.util.Scanner;

public class homework_5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//        Task 5 - (sandıq kilidi oyunu, çətin):
//
//        Sandıq açarı 4 rəqəmli ədəd (kodda əllə təyin edin).
//        İstifadəçi üçün bu kodu tapmağa menyu ilə imkan verin.
//
//                Menyu aşağıdakı kimi olmalıdır:
//        Daxil etdiyiniz kod: (bu hissəyə istifadəçi rəqəmləri seçdikcə yeni rəqəm düşəcək).
//        Hazırki rəqəm: 1 (növbəti rəqəmi yığmağa keçdikdə bu ədəd bir vahid artmalıdır,
//        4 rəqəm var deyə bu ədəd 4-ə kimi (daxil olmaqla) getməlidir).
//        Aşağıdakılardan birinə basın:
//        1 (artır) - (seçilən ədədin bir vahid artırılması yerinə yetirilməlidir.
//        Əgər ədəd 9-a bərabərdirsə, 0 ilə əvəzlənməlidir)
//        2 (azalt) - (seçilən ədədin bir vahid azaldılması yerinə yetirilməlidir.
//        Əgər ədəd 0-a bərabərdirsə, 9 ilə əvəzlənməlidir)
//        3 (növbəti rəqəmə keç) - (sıradakı növbəti rəqəmi dəyişdirməyə keçməlidir proqram,
//        əgər son (4-cü) rəqəmdə idisə, ekrana müvafiq xəta mesajı çıxmalıdır və heç bir dəyişiklik baş verməməlidir)
//        4 (öncəki rəqəmə keç) - (sıradakı öncəki rəqəmi dəyişdirməyə keçməlidir proqram,
//        əgər ilk (1-ci) rəqəmdə idisə, ekrana müvafiq xəta mesajı çıxmalıdır və heç bir dəyişiklik baş verməməlidir)
//        0 (kodu yoxla) - İstifadçi tərəfindən seçilmiş rəqəmlərin yaratdığı ədədi kodla müqayisə etməlidir proqram və
//        düzdürsə, uğur mesajı ekrana çıxmalıdır. Səhvdirsə, xəta mesajı çıxmalıdır və proqram sonlanmalıdır.
//        Proqramın işləmə nümunəsi üçün aşağıdakı videonu izləyə bilərsiniz.

//            1 - reqemi artir
//            2 - reqemi azalt
//            3 - novbeti reqeme kec
//            4 - onceki reqeme kec
//            5 - kodu yoxla


        int cehd_sayi = 100, input;

        String sifre = "1234";
        int a1=0, a2=0, a3=0, a4=0;
        int hazirki_index = 1;


        while(cehd_sayi>0){
            System.out.println("Seyfin hazirki veziyyeti: " + a1 + a2 + a3+ a4);
            System.out.println("Hazirda deyisdirilen reqemin nomresi: " + hazirki_index);
            System.out.println("Asagidakilardan birini secin ve ENTER basin:");
            System.out.println("1 → hazırki rəqəmi artır \n" +
                               "2 → hazırki rəqəmi azalt  \n" +
                               "3 → növbəti rəqəmə keç  \n" +
                               "4 → əvvəlki rəqəmə keç \n" +
                               "0 → kodu yoxla və proqramı bitir");
            input = scan.nextInt();
            if(input==1){
                if(hazirki_index==1){
                    a1 = (a1+1) % 10;
                } else if (hazirki_index==2) {
                    a2= (a2+1) %10;
                } else if (hazirki_index==3) {
                    a3= (a3+1) %10;
                } else if (hazirki_index==4) {
                    a4= (a4+1) %10;
                }
            }
            else if(input==2){
                if(hazirki_index==1){
                    a1 = (a1-1+10) % 10;
                } else if (hazirki_index==2) {
                    a2= (a2-1+10) %10;
                } else if (hazirki_index==3) {
                    a3= (a3-1+10) %10;
                } else if (hazirki_index==4) {
                    a4= (a4-1+10) %10;
                }
            }
            else if(input==3){
                hazirki_index++;
                if(hazirki_index>4){
                    hazirki_index = 1;
                }
            }
            else if(input==4){
                hazirki_index--;
                if(hazirki_index<1){
                    hazirki_index = 4;
                }
            }
            else if(input==0){
                String yeniSifre = "" + a1 + a2 + a3 + a4;
                if(yeniSifre.equals(sifre)){
                    System.out.println("Dogru sifreni qeyd etmisiniz");
                    break;
                }else{
                    System.out.println("Sifre yanlishdir!");
                    cehd_sayi--;
                    System.out.println("Qalan cehd sayi: " + cehd_sayi);
                }
            }else{
                System.out.println("Dogru secim daxil edin!");
            }
        }

        if(cehd_sayi==0){
            System.out.println("Cehd sayiniz bitdi! Siz sifreni 100 defe yanlis daxil etmisiniz!");
        }







//        Massivdə rəqəmi artırmaq və azaltmaq
//        Tapşırıq: 4 elementli massivdə istənilən indeksdəki rəqəmi:
//        1 ilə artır (9 → 0)
//        2 ilə azalt (0 → 9)

//        int[] kod = {0,0,0,0};
//        int currentIndex = 0;
//        int sechim =1;
//
//        System.out.println("1 → hazırki rəqəmi artır \n  2 → hazırki rəqəmi azalt  \n" +
//                           "3 → növbəti rəqəmə keç  \n 4 → əvvəlki rəqəmə keç \n " +
//                            "0 → kodu yoxla və proqramı bitir");
//
//        while(true){
//
//            switch (sechim) {
//                case 1: //artir
//                    System.out.println("sdf");
//                    break;
//                case 2: //azalt
//                    System.out.println("sdf");
//                    break;
//                case 3: //novbeti
//                    System.out.println("sdf");
//                    break;
//                case 4: //evvelki
//                    System.out.println("sdf");
//                    break;
//                case 0: //kodu yoxla, dayandir
//                    System.out.println("sdf");
//                    break;
//
//            }
//
//        }


//        Massivlər – İndeks və manipulyasiya
//        Tapşırıq: İstifadəçi 5 ədəd daxil edir.
//        Ən böyük və ən kiçik ədədlərin indeksini tap
//        Bu iki ədədin yerini dəyiş
//        Sonda yeni massivi çap et

//        System.out.println("5 elementli massivin elementlerini daxil edin: ");
//          // {2,4,9,5,1}
//
//        int[] massiv = new int[5];
//
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//
//        int indexMax = -1;
//        int indexMin = -1;
//
//        for(int i=0; i< massiv.length; i++){
//            System.out.println((i+1) + " elementi daxil edin: ");
//             int eded = input.nextInt();
//
//
//            if(max<eded){
//                max=eded;
//                indexMax = i;
//            }
//            if(min>eded){
//                min=eded;
//                indexMin = i;
//            }
//
//            massiv[i] = eded;
//
//        }
//
//        for(int i=0; i< massiv.length; i++){
//            System.out.print(massiv[i] + " ");
//        }
//
//        System.out.println("min: " + min);











//        Scanner input = new Scanner(System.in);

//        System.out.println("Eded daxil edin: ");
//        String eded = input.next();;
//        boolean dogru = eded.equals("5");
//        System.out.println(dogru);

//        String sifre = "1234";
//        int n1 = 0, n2=0, n3=0, n4=0;
//        String yeni_sifre = "" + n1 + n2 + n3 + n4;
//        int hazirki_reqem = 0;
//        boolean dogru = false;
//        int secim;
//
//        while(true){
//            System.out.println("Seyfin hazirki veziyyeti: " + yeni_sifre);
//            System.out.println("Seyf");
//            secim = input.nextInt();
//            switch(secim){
//                case 1: //reqemi artir
//                    if(hazirki_reqem == 0){
//                        n1 = (n1+1) % 10;
//                    }
//                    else if(hazirki_reqem == 1){
//                        n1 = (n1+1) % 10;
//                    }
//                    else if(hazirki_reqem == 2){
//                        n1 = (n1+1) % 10;
//                    }
//                    else if(hazirki_reqem == 3){
//                        n1 = (n1+1) % 10;
//                    }
//
//
//
//            }
//        }





    }
}
