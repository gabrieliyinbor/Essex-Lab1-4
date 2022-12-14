package lab2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FilledFrame extends JFrame
{
    int size = 400;

    public FilledFrame()
    {
        JButton butSmall   = new JButton("Small");
        JButton butMedium  = new JButton("Medium");
        JButton butLarge   = new JButton("Large");
        JButton butMessage = new JButton("Say Hi!");

        SquarePanel panel = new SquarePanel(this);
        JPanel butPanel = new JPanel();

        butPanel.add(butSmall);
        butPanel.add(butMedium);
        butPanel.add(butLarge);
        butPanel.add(butMessage);
        add(butPanel, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);

        setSize( size+100, size+100 );
        butSmall.addActionListener(new MessageHandler(this,"Small Clicked"));
        butMedium.addActionListener(new MessageHandler(this,"Medium Clicked"));
        butLarge.addActionListener(new MessageHandler(this,"Large Clicked"));
        butMessage.addActionListener(new MessageHandler(this,"Hiiii"));
        butSmall.addActionListener(new ButtonHandler(this,20));
        butMedium.addActionListener(new ButtonHandler(this,40));
        butLarge.addActionListener(new ButtonHandler(this,80));


    }

}
