package lesson7;

public class Human {

    // state - variable

    public String name; //= "Trump";
    public String surname; //= "Donald";
    public int age; //= 79;
    public double weight; //= 65.8;

    // Constructor - yaradan,, quran     -  command + n

//    private Human() {
//    }

//    public Human(String name, String surname, int age, double weight){
//        this(name, surname);
////        this.name = name;
////        this.surname = surname;
//        this.age = age;
//        this.weight = weight;
//
//        //System.out.println("Human onstructor called! ");
//    }

//    public Human(String name, String surname){
//        this.name = name;
//        this.surname = surname;
//    }



    // behaviour - method

    public void eat(){
        weight+=1;
//        System.out.println(weight);
        System.out.println("Eating...");
    }

    public void sleep(){
        System.out.println("Sleeping...");
    }

//    public void walk(){
//        System.out.println(name + " walking...");
//    }

    public void walk(String defaultName){
        if(this.name == null){
            this.name = "Ali";
            //System.out.println(name + " walking...");
        }

        System.out.println(name + " walking...");
    }



}
