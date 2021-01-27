package main.com.github.mbaybuz.DoWhile;

public class DoWhile {

    public static void main(String[] args) {
        int a = 5;
        while (a > 10) {
            System.out.println("Мы в цикле while");
        }
        do {
            System.out.println("Мы в цикле do-while");
        } while (a > 10);
    }
}
