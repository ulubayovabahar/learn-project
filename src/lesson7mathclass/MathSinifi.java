package lesson7mathclass;

public class MathSinifi {
    public static void main(String[] args) {

        // Math Classi metodlari
        // Math.ceil(x) => bir boyuk tam reqeme yuvarlaqlasdirir
        // Math.cos(x)  => cosinus - RADIANLA HESABLAYIR
        // Math.sin(x)  => sinius  - RADIANLA HESABLAYIR

        // Java (və bir çox proqramlaşdırma dillərində) Math.cos() funksiyası radian ilə işləyir, dərəcə ilə yox.
        // Əgər sən dərəcə ilə hesablamaq istəyirsənsə, əvvəlcə dərəcəni radiana çevirməlisən:

//        double degrees = 60;
//        double radians = Math.toRadians(degrees); // dərəcəni radiana çevir
//        System.out.println(Math.cos(radians));   // Çıxış: 0.5

        // radian = degree * (pi / 180)

        // Math.floor(x) => bir kicik tam reqeme yuvarlaqlasdirir
        // Math.max(x,y) => boyuk reqemi verir
        // Math.min(x,y) => kicik reqemi verir
        // Math.pow(3,5) => 3^5 - ustlu quvvet
        // Math.random() => 1 ve 0 arasinda rastgele deyer
        // Math.round(x) => normal yuvarlaqlasdriir. mes 1.5 - 2
        // Math.abs(x) => "absolute value" (mütləq dəyər) - yeni hemise 0 ve ya musbet deyer qaytarir
        // Math.sqrt(4) => kokalti

        System.out.println(Math.ceil(9.00001));
        System.out.println(Math.cos(0));
        System.out.println(Math.sin(0));
        System.out.println(Math.floor(8.9));
        System.out.println(Math.max(2.1, 5));
        System.out.println(Math.min(2.1, 5));
        System.out.println(Math.pow(3,5));
        System.out.println(Math.random());
        System.out.println(Math.round(1.3));
        System.out.println(Math.abs(-6));
        System.out.println(Math.sqrt(4));


    }
}
