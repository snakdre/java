package Classes;


public class HourlyEmployee extends Employee {

    private double hourlyPayRate;
    public HourlyEmployee(String name, String birthDate, String endDate, long employeeId, String hireDate, double hourlyPayRate) {
        super(name, birthDate, endDate, employeeId, hireDate);
        this.setHourlyPayRate(hourlyPayRate);
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }
    public void getDoublePay(){
        double oldSalary = getHourlyPayRate();
        setHourlyPayRate(getHourlyPayRate()*2);
        System.out.println("The employee went from $" + oldSalary + " to $" + getHourlyPayRate());
    }

}

