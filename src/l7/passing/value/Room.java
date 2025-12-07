package l7.passing.value;

public class Room {

    // pass-by-value

//    public void increaseCountBy5(int count){
//        count +=5;
//        System.out.println(count);
//    }

    // pass-by-reference

    public int count =5  ;

    public void increaseCountBy5(Room room){
        room.count +=5;
    }

}
