package com.github.mbaybuz.Bit;

public class Bit {

    public static void main(String[] args) {
        int a = 4;
        int b = 7;
        String s_a = Integer.toBinaryString(a); //двоичный код числа
        String s_b = Integer.toBinaryString(b);
        System.out.println("s_a = " + s_a);
        System.out.println("s_b = " + s_b);
        System.out.println(s_a + " & " + s_b + " = " + Integer.toBinaryString(a & b));
        System.out.println(s_a + " ^ " + s_b + " = " + Integer.toBinaryString(a ^ b));
        System.out.println("~"  + s_a  + " = " + Integer.toBinaryString(~ a));
        System.out.println("~"  + a  + " = " + (~ a));
        System.out.println(s_a + " >>1 " + Integer.toBinaryString(a>>1));
        System.out.println(a + " >>1 " + (a>>1)); //деление на 2
        System.out.println(s_a + " <<1 " + Integer.toBinaryString(a<<1));
        System.out.println(a + " <<1 " + (a<<1)); //умножение на 2
    }
}
