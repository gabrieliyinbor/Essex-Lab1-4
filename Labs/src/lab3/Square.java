package lab3;

import java.awt.*;

public class Square extends Shape {
    int sideLength;

    public Square(int sideLength, int posX, int posY) {
        super(posX, posY);
        this.sideLength = sideLength;
    }
    public Integer getArea(){
        return(int)(Math.pow(sideLength,2));
    }

    public void draw(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillRect(this.posX, this.posY, this.sideLength, this.sideLength);
    }
}
