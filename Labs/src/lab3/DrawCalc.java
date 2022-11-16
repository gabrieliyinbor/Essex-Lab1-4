package lab3;

import javax.swing.*;
import java.awt.*;

public class DrawCalc extends JFrame {
    private JPanel jPanel1;
    private JPanel jPanel2;
    Square square;
    Circle circle;
    JTextField jTextField;
    public DrawCalc(){
        square = new Square(50,10,50);
        circle = new Circle(200,50,50);
        jPanel1 = new JPanel(){
            public void paintComponent(Graphics g){
                square.draw(g);
                circle.draw(g);
            }
        };
        jPanel2 = new JPanel();
        add(jPanel1, BorderLayout.CENTER);
        add(jPanel2,BorderLayout.SOUTH);

        jTextField = new JTextField(10);
        jPanel2.add(jTextField);

        JButton jButtonSetField = new JButton("set");
        JButton jButtonCalcArea = new JButton("calc area");

        jPanel2.add(jButtonSetField);
        jPanel2.add(jButtonCalcArea);

        jButtonSetField.addActionListener(new ButtonHandler(DrawCalc.this,1));
        jButtonCalcArea.addActionListener(new ButtonHandler(this,2));

    }


    public static void main(String[] args) {
        DrawCalc drawCalc = new DrawCalc();
        drawCalc.setSize(600,400);
        drawCalc.setDefaultCloseOperation(drawCalc.EXIT_ON_CLOSE);
        drawCalc.setVisible(true);

    }
}
