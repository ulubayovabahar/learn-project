package lesson_7.blocks;

public class Cat {

    public static String name;
    public int age;

    // constructor

    public Cat() {
        System.out.println("Constructor block");
    }

    // static initializer block

    static{
        System.out.println("static initializer block");
    }

    // non-static initializer block
    {
        System.out.println("non-static initializer block");
    }


}
