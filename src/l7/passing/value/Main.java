package l7.passing.value;

public class Main {
    public static void main(String[] args) {

        // pass-by-value
        // pass-by-reference


        // pass-by-value

//        Room room = new Room();
//
//        int currentCount = 5;
//        room.increaseCountBy5(currentCount);
//
//        System.out.println(currentCount);


        // pass-by-reference

        Room room = new Room();

        System.out.println(room.count);

        room.increaseCountBy5(room);

        System.out.println(room.count);



    }
}
