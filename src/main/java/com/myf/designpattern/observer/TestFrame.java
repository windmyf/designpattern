package com.myf.designpattern.observer;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestFrame extends Frame {

    public void launch(){
        Button button = new Button("press me");
        button.addActionListener(new MyActionListener());
        button.addActionListener(new MyActionListener2());

        this.add(button);
        this.pack();

        this.addWindowListener(
                new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                }
        );

        this.setLocation(400,400);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        new TestFrame().launch();
    }


    private class  MyActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("button pressed!");
        }
    }

    private class MyActionListener2 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("button pressed 2!");
        }
    }
}
