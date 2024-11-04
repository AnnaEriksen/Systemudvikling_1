package model;

public class Teacher extends Person {
    private double salary;

    public Teacher(String name, String address, String qualifications, double salary){
        super(name, address, qualifications);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void udskrivPerson(){
        super.udskrivPerson();
    }

    //metode for at få årsløn
    public double yearSalary(){
        double yearSalary;
        return yearSalary = (this.salary * 12) * 1.125;



    }
}
