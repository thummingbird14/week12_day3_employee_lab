package staff.managment;

import staff.Employee;

public class Manager extends Employee {

    private String deptName;

    public Manager(String name, String NIno, double salary, String deptName) {
        super(name, NIno, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}
