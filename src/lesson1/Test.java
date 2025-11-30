package Lesson_1; //Test fayli Lesson_1 qovluqundadir

public class Test {
    public static void main(String[] args){
        System.out.println("Hello World!");
        //javac test.java  # compile → test.class
        //java test        # run

        //java test.java   # compile + run eyni anda (Java 11+)
        //Java 11-dan başlayaraq Java "single-file source code" mode gətirib.
        //Bu zaman .java faylını öncə gizlicə compile edir,
        //sonra dərhal run edir. Sən ayrıca javac işlətmirsən,
        //çünki bu proses arxa planda avtomatik gedir.

        //Proyekti run edirik. JRE kodlari yuxaridan ashagi oxumaga bashlayir
        //Terminalda sonda [Process finished with exit code 0] - gorunur
        //Burada 0 olmasi o demekdir ki, her sey success(ugurlu) idi. yeni proqram sonlanib.

        //JVM - proyekti run eden eden zaman metn bytecode cevrilir, memoriye yeni RAM-a yuklenir.
        //Proqram yuklenen zaman memory-den silinir. Proqram yuklenen zaman yer tutmasin deye silinir
        //BU prosesi heyata keciren JVM - Java Virtual MAsindir.

        //JIT - KOdlari yazmisiq, lakin komputerin isleme struktura uygun o qeder de ideal yazilmayib
        //ishleyir lakin ideal yazilmayib. memory CPU eziyyet cekir. JIT onu onlar ucun daha anlashilan
        //veziyyete getirir.ona gore de Just in Time deyilir. Prosesi suretlendirir.
        //Java’da "Just-In-Time Compiler" (JIT Compiler) Java bytecode-u proqram çalışarkən (runtime zamanı)
        // daha sürətli yerinə yetirmək üçün maşın dilinə çevirən mexanizmdir.


        //Scope - əhatə dairəsi
        //scope — dəyişənin və ya funksiyanın proqram daxilində harada istifadə oluna biləcəyini göstərir.

        // int reqem = 5;
        //keyword - int
        //user defined - reqem

    }
}
