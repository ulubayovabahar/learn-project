package Lesson_4;
import java.util.Scanner;

public class Practice_labels {
    public static void main(String[] args) {

//        LABEL
//        Label sadəcə döngüyə (for, while) ad verməkdir.
//        Bu ad vasitəsilə biz break və ya continue əmrlərinə deyirik ki,
//        “gedib hansı döngünü dayandırsın və ya atlasın”.

//       Normal Break

//        for(int i=1; i<=3; i++) {
//            for (int j = 1; j <= 3; j++) {
//                if (j == 2) {
//                    break; //yalnız daxili (j) döngünü dayandırır
//                }
//                System.out.println("i= " + i + " " + "j= " + j);
//            }
//        }

//        Normal Continue

//        for(int i=1; i<=3; i++) {
//            for (int j = 1; j <= 3; j++) {
//                if (j == 1) {
//                    continue; //yalniz j döngünün növbəti addımına keçir
//                }
//                System.out.println("i= " + i + " " + "j= " + j);
//            }
//        }


//      Label ile Break

//        xarici_dongunun_adi:
//        for(int i=1; i<=3; i++) {
//            for (int j = 1; j <= 3; j++) {
//                if (j == 2) {
//                    break xarici_dongunun_adi; //həm daxili, həm də xarici döngünü tam dayandırır
//                }
//                System.out.println("i= " + i + " " + "j= " + j);
//            }
//        }

//      Label ile Cantinue

        xarici_dongunun_adi:
        for(int i=1; i<=3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (j == 2) {
                    continue xarici_dongunun_adi; //birbaşa xarici döngünün növbəti addımına keçir
                }
                System.out.println("i= " + i + " " + "j= " + j);
            }
        }








    }
}
