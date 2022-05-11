package staff.managment;

public class Director extends Manager{
    private double budget;

    public Director(String name, String NIno, double salary, String deptName, double budget) {
        super(name, NIno, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }
}
