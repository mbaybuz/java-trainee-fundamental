package main.com.github.mbaybuz.CycleWhile;

import javax.swing.*;

public class CycleWhile {

    public static void main(String[] args) {
        int i = 0;

        while (i < 100) {
            System.out.println(i + " ");
            i++;
        }
        System.out.println();
        String in;
        in = JOptionPane.showInputDialog(null, "Введите положительное число", JOptionPane.QUESTION_MESSAGE);
        if (in != null && !in.equals("")) {
            int n = Integer.parseInt(in);
            if (n < 0) {
                System.out.println("Вы ввели отрицательное число");
            }
            else {
                int summa = 0;
                i = 1;
                while (i <= n) {
                    summa += i;
                    i++;
                }
                System.out.println("Сумма чисел от 0 до " +  n + " = " + summa);
            }
        }
        else {
            System.out.println("Вы не ввели число");
        }
    }
}
