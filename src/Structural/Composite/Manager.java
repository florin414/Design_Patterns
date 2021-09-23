package Structural.Composite;

public class Manager implements Employee {

    private String name;
    private int empId;
    private String position;
    private int vacationTimeLeft;

    {
        vacationTimeLeft = 1;
    }

    public Manager(String name, int empId, String position) {
        this.name = name;
        this.empId = empId;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(empId + " " + name + " " + position);
    }

    public int checkVacationTimeLeft() {
        return vacationTimeLeft;
    }
}
