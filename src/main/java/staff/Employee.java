package staff;

public abstract class Employee {
    private String name;
    private String NIno;
    private double salary;

    public Employee(String name, String NIno, double salary) {
        this.name = name;
        this.NIno = NIno;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNIno() {
        return NIno;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double raise){
        this.salary = this.salary + raise;
    }

    public double payBonus(){
        return this.salary/100;
    }
}


