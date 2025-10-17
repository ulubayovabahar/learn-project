package Lesson_6_practice;

public class main {
    public static void main(String[] args) {

//        System.out.println(kvadrat(5));
//        System.out.println(kvadrat(10));
//        System.out.println(cem(10,15));
//        f(5);
//        ustluQuvvetinHesablanmasi(2,5);
//        System.out.println(ustluQuvvetinHesablanmasi(2,5));
        int ustluQuvvet = ustluQuvvetinHesablanmasi(2,3);
        System.out.println(ustluQuvvet);




    }

//    // f(x) = x^2
//    public static int kvadrat(int n){
//        return n*n;
//    }
//
//    public static int cem(int a, int b){
//        return a + b;
//    }
//
//    // f(x) = (x + 2) * 6;

//    static void f(int x){
//        int result = (x + 2) * 6;
//        System.out.println(result);
//    }

//    static void ustluQuvvetinHesablanmasi(int eded, int ust){
//        int netice =1;
//
//        for(int i=1; i<=ust; i++){
//            netice*=eded;
//        }
//        System.out.println(netice);
//
//    }

    static int ustluQuvvetinHesablanmasi(int eded, int ust){
        int netice =1;

        for(int i=1; i<=ust; i++){
            netice*=eded;
        }
        return netice;

    }


















}
