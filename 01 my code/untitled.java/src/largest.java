import java.util.Scanner;

public class largest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
//        program to find the largest
        if((a>b) && (b>c)){
            System.out.println("The largest is "+ a);
        } else if ((a<b) && (b>c)) {
            System.out.println("The largest is "+ b);
        }
        else{
            System.out.println("The largest is "+ c);
        }
    }
}