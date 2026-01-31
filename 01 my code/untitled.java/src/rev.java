import java.util.Scanner;

public class rev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the main number ");
        int number = 123;
//       String num = (String) number; // was possible in python but here no ahh
        int rev =0;
//       char ch = (char) check;
        while(number >0){
            int rem = number%10;
//            if(rem == check){
//                count++;
//            }
            rev = rev*10 + rem;
            number = number/10;
        }
        System.out.println(rev);
    }
}