package lesson_7.passingvalue;

public class Main {
    public static void main(String[] args) {

        Room room = new Room();
        int currentCount = 5;
        room.increaseCount(currentCount);
        System.out.println(currentCount);

    }
}
