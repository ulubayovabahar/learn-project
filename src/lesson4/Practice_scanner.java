package Lesson_4;
import java.util.Scanner;

public class Practice_scanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        Təsvir: İstifadəçi bir tam ədəd daxil edir. Əgər ədəd cütdürsə,
//        “Cüt ədəd”, yox əgər təkdirsə, “Tək ədəd” yaz.

//        System.out.println("Eded daxil edin: ");
//        int eded = input.nextInt();
//
//        if(eded==0){
//            System.out.println("Eded 0-dir");
//        }else if(eded%2==0){
//            System.out.println("Cut eded");
//        }
//        else{
//            System.out.println("Tek eded");
//        }

//        Təsvir: İstifadəçi bir tam ədəd daxil edir. Proqram həmin ədədin kvadratını çap edir.

//        System.out.println("Eded daxil edin");
//        int eded = input.nextInt();
//
//        System.out.println(eded*eded);

//        Təsvir: İstifadəçi bir tam ədəd daxil edir. Proqram həmin ədədin faktorialını hesablayır.

//        System.out.println("Eded daxil edin: ");
//        int eded = input.nextInt();
//        int fac =1;
//
//        for(int i=1; i<=eded; i++){
//            fac*=i;
//        }
//        System.out.println(fac);

//        Təsvir: İstifadəçi n daxil edir. Proqram 1 + 2 + ... + n cəmini hesablayır.

//        System.out.println("Eded daxil edin: ");
//        int eded = input.nextInt();
//        int cem=0;
//
//        for(int i=1; i<=eded; i++){
//            cem+=i;
//        }
//        System.out.println(cem);


//        Təsvir: İstifadəçi bir tam ədəd daxil edir. Proqram həmin ədədin rəqəmlərini tərsinə çap edir.

//        System.out.println("Eded daxil edin: ");  //123
//        int eded = input.nextInt();
//        int qaliq=0;
//        int ededinTersi =0;
//
//        while(eded>0){
//            qaliq = eded % 10; //3
//            ededinTersi = ededinTersi * 10 + qaliq; //3
//            eded = eded/10;
//        }
//        System.out.println(ededinTersi);

//        Rəqəmlərin cəmini hesabla
//        İstifadəçi bir tam ədəd daxil edir. Proqram həmin ədədin bütün rəqəmlərinin cəmini hesablayır.
//        Məsələn: 1234 → 1 + 2 + 3 + 4 = 10

//        System.out.println("Ededi daxil edin: ");  //123
//        int eded = input.nextInt();
//        int qaliq = 0;
//        int cem = 0;
//
//        while(eded>0){
//            qaliq = eded % 10;
//            eded = eded / 10;
//            cem+=qaliq;
//        }
//        System.out.println(cem);

//        Ədədin rəqəmlərində 7 varsa, say
//        İstifadəçi bir tam ədəd daxil edir. Proqram həmin ədədin içində neçə dəfə 7 rəqəmi olduğunu sayır.
//        Məsələn: 17727 → 3 dəfə 7 var

//        System.out.println("Ededi daxil edin: ");  //123
//        int eded = input.nextInt();
//        int qaliq = 0;
//        int saygac =0;
//
//        while(eded>0){
//            qaliq = eded % 10;
//            eded = eded / 10;
//            if(qaliq==7){
//                saygac+=1;
//            }
//        }
//        System.out.println(saygac);

//        İstifadəçi adını daxil edir, hərfləri tək-tək çap et
//        İstifadəçi bir String daxil edir. Proqram hər hərfi ayrı sətirdə çap edir.
//        Məsələn: Bahar →

//        System.out.println("Adiniz daxil edin: ");
//        String ad = input.next();
//
//        for(int i=0; i<ad.length(); i++){
//            System.out.println(ad.charAt(i));
//        }

//        Verilmiş ədədlər arasında ən böyüyünü tap
//        İstifadəçi neçə ədəd daxil edəcəyini deyir, sonra o qədər ədəd daxil edir. Proqram ən böyüyünü tapır.
//        İpucu: max dəyişəni ilə müqayisə et
        // {12,17,45,87,92}

//        System.out.println("Massivin uzunlugunu daxil edin:");
//        int uzunluq = input.nextInt();
//        int[] massiv = new int[uzunluq];
//        int max = Integer.MIN_VALUE;
//
//        for(int i=0; i< massiv.length; i++){
//            System.out.println((i+1) + " Massivin elementini daxil edin: ");
//            int element = input.nextInt();
//            massiv[i] = element;
//            if(max<element){
//                max=element;
//            }
//        }
//
//        for(int i=0; i< massiv.length; i++){
//            System.out.print(massiv[i] + " ");
//        }
//        System.out.println();
//        System.out.println("Massivin en boyuk elementi: " + max);

//        System.out.println("Nece ededli massiv olsun? qeyd edin:");
//        int massivinUzunlugu = input.nextInt();
//        int max=0;
//
//         for(int i=0; i<massivinUzunlugu; i++){
//             System.out.println((i+1) + ". Ededi daxil edin: ");
//             int eded = input.nextInt();
//
//             if(eded>max){
//                 max=eded;
//             }
//         }
//        System.out.println("Massivin en boyuk ededi: " + max);


//        Ədədin palindrome olub-olmadığını yoxla
//        İstifadəçi bir tam ədəd daxil edir. Əgər ədəd tərsinə oxunduqda da eyni qalırsa, “Palindrome” yaz.
//        Məsələn: 121, 1331, 444 → palindrome

//        System.out.println("Bir eded daxil edin: ");
//        int eded = input.nextInt();  //123
//        int original = eded;
//        int ededinTersi = 0;
//
//        while(eded>0){
//            int qaliq;
//            qaliq = eded % 10;  //3
//            ededinTersi = ededinTersi * 10 + qaliq;
//            eded = eded / 10;
//        }
//        System.out.println(ededinTersi);
//        if(original == ededinTersi){
//            System.out.println("Bu eded polidromdur");
//        }else{
//            System.out.println("Bu eded polidrom deyil");
//        }

//        massivin uzunlugunu istifadeci daxil edir ve massivi doldurur.
//        en son netice olaraq ekrana qeyd olunan butun reqemler massiv formasinda ekrana cixir

//        System.out.println("Nece ededli massiv olsun? qeyd edin: ");
//        int uzunluq = input.nextInt();
//        int[] massiv = new int[uzunluq];
//
//        for(int i=0; i<massiv.length; i++){
//            System.out.println((i+1) + " ededi daxil edin: ");
//            int eded = input.nextInt();
//            massiv[i] = eded;
//        }
//
//        for(int i=0;i< massiv.length; i++){
//            System.out.print(massiv[i] + " ");
//        }

//        massivin cəmini və ortalamasını hesablama
//        Növbəti addım: Ən kiçik elementi tapmaq

//        System.out.println("Massivin uzunlugunu daxil edin: ");
//        int uzunluq = input.nextInt();
//        int[] massiv = new int[uzunluq];
//        int cem =0;
//
//        for (int i=0; i< massiv.length; i++){
//            System.out.println("Massivin elementlerini daxil edin:");
//            int eded = input.nextInt();
//            massiv[i] = eded;
//            cem+=eded;
//        }
//        System.out.println("massivin elementlerinin cemi: " + cem);
//        double ortalama = (double) cem / uzunluq;
//        System.out.println("Massivin ortalamasi " + ortalama);

//        System.out.println("Massivin uzunlugunu daxil edin: ");
//        int uzunluq = input.nextInt();
//        int[] massiv = new int[uzunluq];
//        int cem =0;
//        int min = Integer.MAX_VALUE;
//
//        for (int i=0; i< massiv.length; i++){
//            System.out.println("Massivin elementlerini daxil edin:");
//            int eded = input.nextInt();
//            massiv[i] = eded;
//            cem+=eded;
//            if(min>eded){
//                min=eded;
//            }
//        }
//        System.out.println("massivin elementlerinin cemi: " + cem);
//        double ortalama = (double) cem / uzunluq;
//        System.out.println("Massivin ortalamasi " + ortalama);
//        System.out.println("Massivin en kicik elementi: " + min);

//        massivi tersine cevirmek. yeni daxil olubsa {3,2,5} - olmalidir{5,2,3}

//        System.out.println("Massivin uzunlugunu daxil edin:");
//        int uzunluq = input.nextInt();
//        int[] massiv = new int[uzunluq];
//
//        for(int i=0; i< massiv.length; i++){
//            System.out.println("Massivin elementlerini daxil edin:");
//            int eded = input.nextInt();
//            massiv[i] = eded;
//        }
//
//        for(int i= massiv.length-1; i>=0; i--){
//            System.out.print(massiv[i] + " ");
//        }






    }
}
