package lesson7projectemployee;

public class Employee {

    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    public double tax(){
        if(this.salary>1000){
            return this.salary*0.03;
        }
        return 0;
    }

    //is saati 40-dan yuksekdirse - her saat bashi 30 AZN hesablansin

    public double bonus(){
        if(this.workHours>40){
            return (this.workHours - 40) * 30;
        }
        return 0;
    }

    // maas artirma - Ralse Salary
    // 10 ilden cox ishleyirse - 5%
    // 10 - 20 il arasi ishleyirse - 10%
    // 20 ilden cox - 15%

    public double raiseSalary(){
        int experience = 2025 - hireYear;
        
        if(experience>=1 &&  experience<10){
            return this.salary * 5 / 100;
        }else if(experience>=10 && experience<20){
            return this.salary * 10 / 100;
        } else if (experience>=20) {
            return this.salary * 15  / 100;
        }
        return 0;
    }

    public void toSttring(){
        System.out.println("Name:  " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Work Hours: " + workHours);
        System.out.println("Hire Date: " + hireYear);
        System.out.println("Tax: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Raise of Salary" + raiseSalary());

    }







}
