package lab3;

import java.awt.*;

public class Circle extends Shape{
    int radius;
    public Circle(int posX, int posY, int radius) {
        super(posX, posY);
        this.radius = radius;
    }
    public Integer getAreaOfCircle(){
        return (int)(Math.PI) * (int)(Math.pow(radius,2));
    }
    public void draw(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(this.posX, this.posY, radius, radius);
    }
}
