import java.util.Scanner;

public class fibo {
   public  static void main(String[] args) {
        // fibonacci
       // f(0) = 0
       //   f(1)=1
//       f(n) = f(n-1) + f(n-2)
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int f_0 = 0;
       int f_1 = 1;
       int f_n = 0;
       for(int i =0;i<=n;i++){
           if (n ==0){
               System.out.println(f_0);
           } else if (n==1) {
               System.out.println(f_1);
           }
           else {
               f_n = f_1 + f_0;
           }
       }
    }
}