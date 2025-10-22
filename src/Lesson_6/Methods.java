package Lesson_6;

public class Methods {
    public static void main(String[] args) {

        // f(x) = (x+2)*6
//        f(2);
//        f(4);

        ededin_quvveti(2,3);

        }

//        static void f(int x){
//            int result = (x+2) *6;
//            System.out.println(result);
//        }

        static void ededin_quvveti (int a, int b){
        int result =1;
            for(int i=1; i<=b; i++){
                result *= a;
            }
            System.out.println(result);

        }



}
