package Lesson_6_practice;

public class Calculator {

    public int eded1;
    public int eded2;
    public String reng;

    Calculator(int eded1, int eded2, String reng){
        this.eded1 = eded1;
        this.eded2 = eded2;
        this.reng = reng;
    }

    public int toplama(){
        return this.eded1 + this.eded2;
    }

    public int cixma(){
        return this.eded1 - this.eded2;
    }

    public int vurma(){
        return this.eded1 * this.eded2;
    }

    public int bolme(){
        return this.eded1 / this.eded2;
    }



}
