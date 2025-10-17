package Lesson_3;
import java.util.Scanner;

public class homework_4 {
    public static void main(String[] args) {
//        Task 4 - Pizza sifarişi terminalı:
//
//        İstifadəçidən pizza ölçüsünü, əlavə pendir olub-olmamasını,
//        və əlavə acılı bibər olub-olmamasını soruşun (scanner ilə).
//        Aşağıdakı qiymətlərə əsasən sifarişin yekun qiymətini ekrana çıxarın:
//        S - $8
//        M - $10
//        L - $12
//        Əlavə pendir - $2
//        Əlavə acılı bibər - $1

        Scanner input = new Scanner(System.in);

        System.out.println("Pizza olculeri: S, M, L");
        System.out.println("Olculere gore qiymetler : \n S - $8 \n M - $10 \n L - $12");
        System.out.println("Zehmet olmasa istediyiniz pizza olcusunu qeyd edin:");

        char pizzaOlcusu = input.next().charAt(0);
        int pizzaQiymet = 0;

        if(pizzaOlcusu== 'S' || pizzaOlcusu== 's'){
            pizzaQiymet = 8;
        }
        else if (pizzaOlcusu== 'M' || pizzaOlcusu== 'm' ){
            pizzaQiymet = 10;
        }
        else if(pizzaOlcusu== 'L' || pizzaOlcusu== 'l'){
            pizzaQiymet = 12;
        }
        else{
            System.out.println("Bu pizza olculerini qeyd etmelisiniz: S, M, L");
        }

        System.out.println("Pendirin olmasini isteyirsiniz? \n Əlavə pendir - $2 \n Cavabi beli ve xeyr olaraq qeyd edin!");

        String pendir = input.next();

        int pendirQiymet = 0;

        if(pendir.equals("beli")){
            pendirQiymet = 2;
        }
        else if(pendir.equals("xeyr")){
        pendirQiymet = 0;
    }
        else{
            System.out.println("Pendirin olmasi ucun - beli qeyd edin, eks halda xeyr!");
            return;
        }

        System.out.println("Aci biberin olmasini isteyirsiniz? \n Əlavə acılı bibər - $1 \n Cavabi beli ve xeyr olaraq qeyd edin!");

        String aciBiber = input.next();

        int aciBiberQiymet = 0;

        if(aciBiber.equals("beli")){
            aciBiberQiymet = 1;
        }
        else if(aciBiber.equals("xeyr")){
            aciBiberQiymet = 1;
        }
        else{
            System.out.println("Pendirin olmasi ucun - beli qeyd edin, eks halda xeyr!");
        }


        int umumiHesab = pizzaQiymet + pendirQiymet + aciBiberQiymet ;

        System.out.println("Umumi hesab: " + umumiHesab + "$");


    }
}
