package lab3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonHandler implements ActionListener {
    private DrawCalc theApp;
    private int action;

    public ButtonHandler(DrawCalc theApp, int action) {
        this.theApp = theApp;
        this.action = action;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (this.action == 1) {
            try {
                this.theApp.square.sideLength = Integer.parseInt(theApp.jTextField.getText());
                this.theApp.circle.radius = Integer.parseInt(theApp.jTextField.getText());

            } catch (NumberFormatException ex) {
                System.out.println("Can't cast " + theApp.jTextField.getText() + "to Integer");
            }
        }


        if (this.action == 2) {
            theApp.square.sideLength = theApp.square.getArea();
            theApp.circle.radius = theApp.circle.getAreaOfCircle();
            theApp.repaint();
        }


    }
}
