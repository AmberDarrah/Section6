import java.util.Scanner;
public class Pin
{
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        int pin = 6969;
        System.out.println("Enter Your Pin: ");
        int entry = enter.nextInt();

        while (entry != pin)
        {
            System.out.println("Incorrect Pin");
            System.out.println("Enter Your Pin: ");
            entry = enter.nextInt();
        }
        System.out.println("The Pin Is Correct");
        System.out.println("You Now Have Access To Your Account");
    }
}
