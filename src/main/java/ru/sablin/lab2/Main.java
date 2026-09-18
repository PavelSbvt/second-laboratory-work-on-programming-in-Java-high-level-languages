package ru.sablin.lab2;

import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Лабораторная работы №2");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BMI form = new BMI();
        frame.setContentPane(form.getContentPane());

        frame.pack();
        frame.setMinimumSize(new java.awt.Dimension(400, 1000));
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
