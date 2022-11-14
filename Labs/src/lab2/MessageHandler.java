package lab2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MessageHandler implements ActionListener {
    FilledFrame frame;
    String message;
    public MessageHandler(FilledFrame frame, String message){
        this.frame = frame;
        this.message = message;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(frame,message);
    }
}
