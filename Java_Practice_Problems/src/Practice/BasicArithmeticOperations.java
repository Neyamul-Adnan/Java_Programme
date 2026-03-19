import java.util.Scanner;

public class BasicArithmeticOperations {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Input first number: ");
        int a = sc.nextInt();

        System.out.print("Input second number: ");
        int b = sc.nextInt();

        System.out.println(a + " + " + b + " = " +  (a+b));
        System.out.println(a + " - " + b + " = " +  (a-b));
        System.out.println(a + " * " + b + " = " +  (a*b));
        System.out.println(a + " / " + b + " = " +  (a/b));
        System.out.println(a + " mod " + b + " = " +  (a%b));

        /*
        Expected Output :
        125 + 24 = 149
        125 - 24 = 101
        125 x 24 = 3000
        125 / 24 = 5
        125 mod 24 = 5
         */
    }
}
