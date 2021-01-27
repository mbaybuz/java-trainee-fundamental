package com.github.mbaybuz.Conditional;

import javax.swing.*;

public class Conditional {

    public static void main(String[] args) {
        int a =7;
        int b = 9;
        if (a < b) {
            System.out.println ("a < b");
        }
        else {
            System.out.println ("a >= b");
        }
        String str = a < b ? "a < b" : "a >= b";
        System.out.println (str);
        System.out.println (a < b ? "a < b" : "a >= b");
        int age = 25;
        if (age > 18) System.out.println ("Человек совершеннолетний");

        String in;
        in = JOptionPane.showInputDialog(null, "Введите число", JOptionPane.QUESTION_MESSAGE);
        System.out.println (in);
        if (in != null && !in.equals("")) {
            double n = Double.parseDouble(in);
            if (n > 0) System.out.println ("Вы ввели положительное число");
            else if (n == 0) System.out.println ("Вы ввели ноль");
            else System.out.println ("Вы ввели отрицательное число");
        }
        else {
            System.out.println ("Вы не ввели число");
        }
    }
}
