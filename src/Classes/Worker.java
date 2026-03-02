package Classes;

public class Worker {
    private String name;
    private String birthDate;
    String endDate;
    public Worker(String name, String birthDate, String endDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }
    public Worker(){
        this.name = "";
        this.birthDate = "";
        this.endDate = "";
    }
    public String getBirthDate() {
        return birthDate;
    }
    public String getName(){
        return name;
    }
    public String getEndDate() {
        return endDate;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    public int getAge(){
        return Integer.parseInt(this.birthDate.split(" ")[2]);
    }
    public double collectPay(){
        System.out.println(getName() + " collected his salary.");
        return 0.0;
    }
    private void terminate(){
        System.out.println(getName() + " terminated.");
    }
}
