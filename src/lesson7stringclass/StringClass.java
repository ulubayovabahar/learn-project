package lesson7stringclass;

public class StringClass {
    public static void main(String[] args) {

        // str.length() - Daxil edirlen charlarin(simvollarin) ayini cap edir
        // str1.concat(str2) - 2 String-i birlesdirir. ( + de istifade olunur)
        // str.indexOf('K') - Simvolun hansi indeksde yerlesdiyini gosterir
        // str.charAt(5) - Qeyd olunan indeksde olan simvolu gosterir

        // str.compareTo("kod") - böyük və kiçik hərflər fərqlidir (A ≠ a)
//        compareTo ilk hərfdən başlayır.
//        Hərflər eyni olarsa → növbəti hərfə keçir.
//        Fərqli hərf tapılarsa → ASCII dəyərləri fərqi qaytarılır (str1.charAt(i) - str2.charAt(i)).
//        Əgər bütün hərflər eynidirsə, uzunluqlarına baxır: qısa string əvvəl gəlir, uzun string sonra → fərq uzunluqla müəyyən olunur.

        // str.compareToIgnoreCase("kod") - böyük/kiçik hərfləri eyni sayır

        // str.contains("kod) - daxil edilen soz Stringin icinde var mi deye yoxlayir
        // str.endsWith("a") - qeyd olunan simvol(lar) ile bitise, true qaytarir
        // str.replace("birinci" , "ikinci") - string deyistirmek ucun istifade olunur
        // str.toUpperCase() - Boyuk
        // str.toLowerCase() - Kicik



//        char[] str = {'k', 'o', 'd'} ;
//
//        String metn = new String(str);
//        System.out.println(metn);
//
//        String m = "kod";

        String metn = "kod";
        System.out.println(metn.length());

        String s1 = "con";
        String s2 = "cat";
        System.out.println(s1.concat(s2));
        System.out.println(s1 + s2);

        System.out.println(metn.indexOf('o'));
        System.out.println(metn.charAt(1));
        System.out.println(metn.compareTo("kerd"));
        System.out.println(metn.contains("od"));
        System.out.println(metn.endsWith("r"));

        String soz = "Baki Kart";
        System.out.println(soz.replace("art", "Seheri"));

        System.out.println(soz.toLowerCase());
        System.out.println(soz.toUpperCase());











    }

}
