import java.lang.*;

public class Factorial {
   private static int factorial(int n) {return n == 0 ? 1 : factorial(n-1) * n;}
   public static void main(String[] args) {
   int i = (int)(Math.random() * 11);
  //  int j = (int)(Math.random() * 11);
  //  int ifactorial = factorial(i);
  //  int jfactorial = factorial(j);
  //  int k = ifactorial + jfactorial;
   System.out.println(i + "! = " + factorial(i));
   // for (i = 1; i<9; i++) {
   //    int j = i+1;
   //    int k = factorial(i)*factorial(j);
   //    System.out.println("The Factorial of " + i + " x the Factorial of " + j + " is " + k);
   // }
   }
}
