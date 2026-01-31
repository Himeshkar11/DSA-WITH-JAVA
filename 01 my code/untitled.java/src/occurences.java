import java.util.Scanner;

public class occurences {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the main number ");
       int number = sc.nextInt();
//       String num = (String) number; // was possible in python but here no ahh
        System.out.println("Enter the check number ");
       int check = sc.nextInt();
//       char ch = (char) check;
       int count = 0;
       while(number>0){
        int rem = number%10;
           if(rem == check){
               count++;
           }
        number = number/10;
        }
        System.out.println(count);
    }
}