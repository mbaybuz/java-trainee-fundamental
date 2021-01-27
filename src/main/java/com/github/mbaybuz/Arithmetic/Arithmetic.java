package com.github.mbaybuz.Arithmetic;

public class Arithmetic {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int result = a + b;
        System.out.println("Сумма: " + result);
        result = a - b;
        System.out.println("Разность: " + result);
        result = a * b;
        System.out.println("Произведение: " + result);
        result = a / b;
        System.out.println("Деление: " + result);
        //дробная часть отбрасывается
        double e = a / b;
        System.out.println("Деление: " + e);
        //делим целое на целое, преобразование тоже к целому
        double d = (double) a / b;
        System.out.println("Деление: " + d);
        //производим преобразование
        result = 7 % 3;
        System.out.println("Остаток от деления: " + result);
        // 7 = 2*3 + 1 (1 ─ остаток от деления)
        a++; // a = a + 1; a += 1;
        System.out.println("Инкремент: " + a);
        b--; //b = b - 1;
        System.out.println("Декремент: " + b);
        a = a + b; // a += b;
        System.out.println("Итог: " + a);
    }
}
