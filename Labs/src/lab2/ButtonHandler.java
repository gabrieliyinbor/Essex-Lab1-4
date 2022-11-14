package lab2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonHandler implements ActionListener {
    FilledFrame frame;
    int size;
    public ButtonHandler(FilledFrame app, int size){
        this.frame = app;
        this.size = size;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.setSize(size+400,size+400);
        frame.invalidate();
        frame.validate();
        frame.repaint();
    }
}
