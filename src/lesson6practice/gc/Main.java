package lesson6practice.gc;

public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Kelly");
        Dog dog2 = new Dog("Max");

        dog1 = null; // dog1 obyektinə heç bir dəyişən işarə etmir

       // System.out.println(dog1.name);
        System.out.println(dog2.name);

        // Burada dog1 obyektinə artıq heç bir dəyişən işarə etmədiyi üçün
        // Garbage Collector onu yaddaşdan təmizləyə bilər
        // dog2 hələ istifadə olunur, ona görə təmizlənməyəcək

    }




}



