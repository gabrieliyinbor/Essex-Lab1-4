package lab1;

public class RedRectangle extends Rectangle{
    public RedRectangle(int lx, int ly, int sx , int sy){
        super(lx,ly,sx,sy);
        this.color = "red";
    }

    public void printName() {
        System.out.println("I am a "+color+" "+name);
    }

    public void draw() {
        System.out.println("This is a "+color+" rectangle with coordinate("+locationX+","+locationY+")and length"+sizeX+", height " + sizeY);
    }
}
