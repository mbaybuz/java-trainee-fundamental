package main.com.github.mbaybuz.Variables;

import static javax.swing.JOptionPane.*;

public class Variables {
    public static void main(String[] args) {
        byte b = 10;
        short s = 10000;
        int i = 1000000000;
        long n = -1000000000;
        float f = 1.01f;
        double d = 10.10101010101010101010100101010101010101010101010101010101;
        boolean b1 = true; //правда
        boolean b2 = false; //ложь
        char c = 'C'; //одинарные кавычки
        String str = "Hello world!";
        String name = "My name is Michael";

        String result = "";
        result += str + "\n";
        result += name + "\n"+ "\n";
        result += "byte b = " + b + "\n";
        result += "short s = " + s + "\n";
        result += "int i = " + i + "\n";
        result += "long l = " + n + "\n";
        result += "float f = " + f + "\n";
        result += "double d = " + d + "\n";
        result += "boolean b1 = " + b1 + "\n";
        result += "boolean b2 = " + b2 + "\n";
        result += "char c = " + c + "\n";

        System.out.println(result);

        String str_n = "111"; //в такой строке должны быть только цифры
        int summa = Integer.parseInt(str_n) + 1000;
        System.out.print("Преобразование: "+summa);

        showMessageDialog (null, result+"Преобразование: "+summa);
    }
}

