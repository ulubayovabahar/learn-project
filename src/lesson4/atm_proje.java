package Lesson_4;
import java.util.Scanner;

public class atm_proje {
    public static void main(String[] args) {

        int hesab = 1000, input, miqdar;
        Scanner scan = new Scanner(System.in);

        System.out.println("Salam, ABB - xosh gelmisiniz! ");
        System.out.println("Hesabiniz : " + hesab + " AZN ");

        while(hesab>0){
            System.out.println();
            System.out.println("1 - Mebleg elave et");
            System.out.println("2 - Meblegi cixart");
            System.out.println("3 - Balansi goster");
            System.out.println("4 - Cixis et");
            System.out.println("Hansi emeliyyati secmek isteyirsiniz?");
            input = scan.nextInt();

            if(input==1){
                System.out.println("Elave etmek istediyiniz meblegi qeyd edin: ");
                miqdar = scan.nextInt();
                hesab += miqdar;
            }else if(input==2){
                System.out.println("Cixartmaq istediyiniz meblegi daxil edin: ");
                miqdar = scan.nextInt();
                hesab -= miqdar;
            }else if(input==3){
                System.out.println("Sizin balansiniz: " + hesab + " AZN");
            }else if(input==4){
                System.out.println("Cisix etdiniz! ");
                break;
            }else{
                System.out.println("Dogru secim daxil edin! ");
            }
        }
        System.out.println("Tesekkurler");





    }
}
