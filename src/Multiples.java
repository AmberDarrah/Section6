import java.util.Scanner;
public class Multiples
{
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        int number;
        System.out.println("Pick A Number From 1-12: ");
        number = enter.nextInt();

        for (int factor = 1; factor <= 12; factor++) {
            int result = number * factor;
            System.out.println(number + " x " + factor + " = " + result);
        }
    }
}
