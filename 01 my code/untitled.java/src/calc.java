import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;

        System.out.println("Welcome to himesh`s calculator ");

        while (true) {
            System.out.println("Enter the number 1 here: ");
            int a = sc.nextInt();

            System.out.println("Enter the number 2 here: ");
            int b = sc.nextInt();

            System.out.println("PRESS + FOR ADDITION");
            System.out.println("- FOR SUBTRACTION");
            System.out.println("* FOR MULTIPLICATION");
            System.out.println("/ FOR DIVISION");
            System.out.println("% FOR REMAINDER");
            System.out.println("x TO EXIT");

            char op = sc.next().trim().charAt(0);

            if (op == '+') {
                ans = a + b;
            } else if (op == '-') {
                ans = a - b;
            } else if (op == '*') {
                ans = a * b;
            } else if (op == '/') {
                ans = a / b;
            } else if (op == '%') {
                ans = a % b;
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Enter a valid operation");
                continue;
            }

            System.out.println("The answer is " + ans);
        }

        sc.close();
    }
}
