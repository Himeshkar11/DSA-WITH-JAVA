import java.util.Scanner;

public class chcase {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a character : ");
         char ch = sc.next().charAt(0);
         int ascii = (int)ch;
         // Upper case  case
         if( (65<=ascii)&& (ascii < 97)){
             System.out.println("The character is in UPPER CASE "+ (char)ascii);
         } else if (ascii  >=97) {
             System.out.println("the character is in lower case "+ (char)ascii);
         }
         else{
             System.out.println("Enter a english alphabet");
         }
     }
}-