package lesson_7;

public class Employee {
/*  Employee adli sinifimiz olsun
    EmpDriver - main metodu cagirdigimiz sinif olsun

    Employee classinin deyishkenleri:
    Ad
    Maas
    Isleme saati
    Islemeye basladigi il

    5 metodu var:

    birinci metod Employee - nin Constractoru
    4 parametr qebul edecek
    ad
    maas
    Isleme saati
    Islemeye basladigi il

    ikinci metod - Tax method - vergi metodu
    hesablama et
    bir iscinin maasi 1000 manatdan yuksekdir, ondan 3% vergi al

    ucuncu metod - Bonus method - additional hours
    her elave isleme saatina 30 manat elave bonus olsun

    dorduncu metod - RaiseSalary method
    10 ilden az isleyirse - 5%
    10-20 il arasi  - 10%
    20+ il - 19% maas artimi olsun

    besinci metod - toString method
    bu metodlar haqqinda melumati ekrana cap etsin

    Name: Konul
    Salary: 2000.0
    Work hours: 45
    Hire Date: 1985
    Tax: 60.0
    Bonus: 150.0
    Raise of Salary: 300.0

    nece gorunsun:
    Name: Konul
    Salary: 2000.0
    Work hours: 45
    Hire Date: 1985
    Tax: 60.0
    Bonus: 150.0
    Raise of Salary: 300.0
    Salary with tax and bonus: 2000.0
    Total Salary with the raise of salary: 2300.0

    */

    private String name;
    public double salary;
    private int work_hours;
    private int hire_year;

    Employee(String name, double salary, int work_hours, int hire_year){
        this.name = name;
        this.salary = salary;
        this.work_hours = work_hours;
        this.hire_year = hire_year;
    }

    public double tax(){
        if(this.salary>=1000){
            return 1000*0.03;
        }
            return 0.0;
    }

    public int bonus(){
        if(this.work_hours>40){
            return 30* (this.work_hours - 40 );
        }
        return 0;
    }

    public double raiseSalary() {
//        10 ilden az isleyirse - 5%
//        10-20 il arasi  - 10%
//        20+ il - 15% maas artimi olsun

        // hire_year - 2025

        int year = 2025 - hire_year;

        if (year < 10) {
            return salary * 0.05;
        }
        if (year >= 10 && year < 20) {
            return salary * 0.1;
        } else {
            return salary * 0.15;
        }
    }

//        Name: Konul
//        Salary: 2000.0
//        Work hours: 45
//        Hire Date: 1985
//        Tax: 60.0
//        Bonus: 150.0
//        Raise of Salary: 300.0

        public String toString (){
            double tax = tax();
            int bonus = bonus();
            double raise = raiseSalary();
            double totalSalary = salary - tax + bonus;
            double finalSalary = totalSalary + raise;

            return "Name: " + name + "\n" +
                    "Salary: " + salary + "\n" +
                    "Work hours: " + work_hours + "\n" +
                    "Hire Date: " + hire_year + "\n" +
                    "Tax: " + tax + "\n" +
                    "Bonus: " + bonus + "\n" +
                    "Raise of Salary: " + raise + "\n" +
                    "Salary with tax and bonus: " + totalSalary + "\n" +
                    "Total Salary with the raise of salary: " + finalSalary;
        }


    }



