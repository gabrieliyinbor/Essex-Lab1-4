package Lab1;

public class Rectangle extends Shape {
    protected int locationX;
    protected int locationY;
    protected int sizeX;
    protected int sizeY;

    public Rectangle(int lx, int ly , int sizeX, int sizeY){
        this.name = "rectangle";
        this.locationX = lx;
        this.locationY = ly;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }

    public void draw(){
        System.out.println("This is a rectangle with coordinate("+locationX+","+locationY+")and length"+sizeX+", height " + sizeY);
    }
}
