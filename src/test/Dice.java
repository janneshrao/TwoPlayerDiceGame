package test;
import java.util.*;

public class Dice {
    public static void main(String args[]) {
        Dice d = new Dice();
        System.out.println(d.throwDice());
    }
    public int throwDice() {
        Random random = new Random();
        return random.nextInt(6)+1;
    }
}