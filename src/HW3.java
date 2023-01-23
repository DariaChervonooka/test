import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input two number: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int ans;
        System.out.print("\nEnter an operator (+, -, *, /): ");
        Scanner reader = new Scanner(System.in);
        char operator = reader.next().charAt(0);
        switch(operator) {
            case '+': ans = num1 + num2;
                break;
            case '-': ans = num1 - num2;
                break;
            case '*': ans = num1 * num2;
                break;
            case '/': ans = num1 / num2;
                break;
            default:  System.out.printf("Error! Enter correct operator");
                return;
        }
        System.out.print("\nThe result is given as follows:\n");
        System.out.printf(num1 + " " + operator + " " + num2 + " = " + ans);

    }
}
