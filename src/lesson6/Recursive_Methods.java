package lesson6;

public class Recursive_Methods {

//    static int f(int x) {
//        int cem = 0;
//        for (int i=1;i <= x; i++){
//            cem += i;
//        }
//        return cem;
//    }

// 1. Məsələ — 1-dən n-ə qədər say
// Ekrana 1-dən n-ə qədər ədədləri çap et (rekursiv şəkildə). 1 2 3 4 5
//  f(x)
//  f(5) = f(4) + 1
//  f(4) = f(3) + 1
//  f(3) = f(2) + 1
//  f(2) = f(1) + 1
//  f(1) = 1
//
//  f(x) = f(x-1) + 1
//  if(x=1) return 1


//    static int n(int x){
//        if(x==0){
//            return 0;
//        }
//        int n = n(x-1) + 1;
//        System.out.println(x);
//        return n;
//    }


// 2. Məsələ — n-dən 1-ə qədər say
//        Ekrana n-dən 1-ə qədər ədədləri çap et (yenə rekursiv şəkildə).

//    static int f(int x){
//
//        System.out.println(x);
//        if(x==1){
//            return 1;
//        }
//        int f = f(x-1) + 1;
//        return f;
//    }

// 3. Məsələ — 1-dən n-ə qədər ədədlərin cəmini tap
//        Funksiya sum(n) olsun. Nəticədə 1 + 2 + 3 + ... + n dəyərini qaytarsın.

//    static int sum(int n){
//
//        if(n==1){
//            return 1;
//        }
//
//        int cem = n + sum(n-1);
//        return cem;
//
//    }

// 4. Məsələ — Faktorial
//        n! tap — yəni n × (n-1) × (n-2) × ... × 1.

//    static int fac(int a){
//
//        if(a==1){
//            return 1;
//        }
//
//        int factorial = a * fac(a-1);
//        return factorial;
//
//    }

// 5. Məsələ — Cüt ədədlərin cəmi
//        1-dən n-ə qədər yalnız cüt ədədləri toplayan rekursiv funksiya yaz.

//    static int cut (int a){
//
//        if(a==0){
//            return 0;
//        }
//        else if(a%2==0){
//            int cutCem = a + cut(a-1);
//            return cutCem;
//        }else{
//            return cut(a-1);
//        }
//
//    }

// 6. Məsələ — Ədədləri tərsinə çap et
// Məsələn printReverse(1234) çağırıldıqda ekrana 4321 çıxsın.

// 7. Məsələ — Ədədi rəqəmlərə böl
//        Məsələn split(245) → ekrana 2, 4, 5 ayrı-ayrılıqda yazılsın (rekursiv).

//    static int split(int a){
//
//
//    }


// 8. Məsələ — Rəqəmlərin cəmini tap
//        Məsələn sumDigits(245) → nəticə 2 + 4 + 5 = 11.

// 9. Məsələ — Fibonacci
//        Rekursiv şəkildə fib(n) tap.
//                Yəni: 1, 1, 2, 3, 5, 8, 13, ...

// 10. Məsələ — Qovluq içində faylların sayını tap (simulyasiya)
//        Tutaq ki, bir qovluğun içində həm fayllar, həm də başqa qovluqlar var.
//        Rekursiv funksiya bütün iç-içə qovluqları gəzinib ümumi fayl sayını tapsın.


    public static void main(String[] args) {

        // int f = f(5);

        // int n = n(5);

//        int cem = sum(5);
//        System.out.println(cem);

//        int factorial = fac(5);
//        System.out.println(factorial);

//        int cutEdedlerinCemmi = cut(12);
//        System.out.println(cutEdedlerinCemmi);

    }
}

