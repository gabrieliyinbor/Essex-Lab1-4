package lab1;

public class Sales extends Employee {
    int numberOfSales;

    public Sales(String name, int salary, String dob, int numberOfSales) {
        this.name = name;
        this.salary = salary;
        this.dob = dob;
        this.numberOfSales = numberOfSales;
    }


    public void information() {
        System.out.println("The number of sales made Annually is:" + numberOfSales + "\n" +
                "name: " + name + "\n" +
                "salary: " + salary + "\n" +
                "dob: " + dob
        );
    }
}
