import java.util.Scanner;

public class fibo {
   public  static void main(String[] args) {
        // fibonacci
       // f(0) = 0
       //   f(1)=1
//       f(n) = f(n-1) + f(n-2)
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int p = 0;
       int i = 1;
       int summ = 2;
       while(summ <=n){
           int temp = i;
           i = i+p;
           p = temp;
           summ++;
       }
       System.out.println("The fibo at n is " + i);



    }
}