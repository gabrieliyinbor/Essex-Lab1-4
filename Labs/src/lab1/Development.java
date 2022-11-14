package lab1;

public class Development extends Employee{
    int maintenanceTime;
    public Development(String name, int salary,String dob,int maintenanceTime){
        this.name = name;
        this.salary = salary;
        this.dob = dob;
        this.maintenanceTime = maintenanceTime;
    }

    public void information() {
        System.out.println("Total hours of maintenance:" + maintenanceTime+ "\n" +
                "name: " + name + "\n" +
                "salary: " + salary + "\n" +
                "dob: " + dob
        );
    }
}
