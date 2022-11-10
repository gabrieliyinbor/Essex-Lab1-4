package Lab1;

public class main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(300,100,20);
        shapes[1] = new Rectangle(100,100,40,60);
        shapes[2] = new RedRectangle(200,200,20,30);

        for(Shape shape:shapes)

        {
            shape.printName();
            shape.draw();
            System.out.println();
        }

        Employee[] employees = new Employee[3];
        employees[0] = new Manager("gabriel",2000,"1/10/1998","1508035");
        employees[1] = new Development("wale",1500,"2/12/1995",20);
        employees[2] = new Sales("kwame",2000,"4/1/1995",100);


        for(Employee employee: employees){
            employee.information();
            System.out.println("\n");
        }
    }
}
