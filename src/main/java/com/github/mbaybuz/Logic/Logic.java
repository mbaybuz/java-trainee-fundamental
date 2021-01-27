package com.github.mbaybuz.Logic;

public class Logic {

    public static void main(String[] args) {
        boolean b_1 = true;  //1
        boolean b_2 = false; //0
        System.out.println(b_1 + " && " + b_2 + " = " + (b_1 && b_2)); //1 * 0
        System.out.println(b_1 + " || " + b_2 + " = " + (b_1 || b_2)); //1 + 0
        System.out.println(b_1 + " ^ " + b_2 + " = " + (b_1 ^ b_2));
        System.out.println("!" + b_1 + " = " + !b_1);
        System.out.println("!" + b_2 + " = " + !b_2);
    }
}
