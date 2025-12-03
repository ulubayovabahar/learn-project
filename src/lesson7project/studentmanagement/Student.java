package lesson7project.studentmanagement;

public class Student {

    private String name;
    private int id;
    private double gpa;
    private int year;

    public Student(String name, int id, double gpa, int year){
        this.name = name;
        this.id = id;
        this.gpa = gpa;
        this.year = year;
    }

    public String checkHonor(){
        if(this.gpa>=3.5){
            return "Honor Student" ;
        }
            return "Regular Student";
    }

    public void raiseYear(){
        this.year += 1;
    }

    public String toString(){
        return "Name: " + this.name +
                "\nID: " + this.id +
                "\nGPA: " + this.gpa +
                "\nYear: " + this.year +
                "\nStatus: " + checkHonor();




    }




}
