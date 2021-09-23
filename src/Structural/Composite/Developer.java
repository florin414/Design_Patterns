package Structural.Composite;

public class Developer implements Employee {
    private String name;
    private int empId;
    private String position;

    public Developer(String name, int empId, String position) {
        this.name = name;
        this.empId = empId;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(empId + " " + name + " " + position);
    }
}
