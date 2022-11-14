package lab1;

public class Manager extends Employee{
    public String managerCardId;

    public Manager(String names, int salaries,String DateOfBirth, String managerCardId) {
        this.name = names;
        this.salary = salaries;
        this.dob = DateOfBirth;
        this.managerCardId = managerCardId;
    }
    public void information() {
        System.out.println("ManagerCardId:" + managerCardId+ "\n" +
                "name: " + name + "\n" +
                "salary: " + salary + "\n" +
                "dob: " + dob
        );
    }
}
