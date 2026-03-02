package Classes;

public class SalariedEmployee extends Employee {
    private double annualSalary;
    boolean isRetired;
    public SalariedEmployee(long employeeId, String hireDate, double annualSalary) {
        super(employeeId, hireDate);
    }
    public void retire(){
        isRetired = true;
        System.out.println("Salaried Employee is retired");
    }
}
