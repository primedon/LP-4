import java.util.Scanner;

public class fibbonacci {
    static Scanner sc=new Scanner(System.in);
    // public static int fibo(int n){
    //     if (n==1||n==2) {
    //         return 1;
    //     }
    //     int ans1=fibo(n-1);
    //     int ans2=fibo(n-2);
    //     int ans=ans1+ans2;
    //     return ans;
    // }
     public static int fibo(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
    public static void main(String[] args) {
        // int f0 = 0;
        // int f1 = 1;
        // int sum = 0;
        // System.out.println(f0);
        // System.out.println(f1);
        // for (int i = 2; i < 10; i++) {
        //     sum = f0 + f1;
        //     System.out.println(sum);

        //     f0 = f1;
        //     f1 = sum;
        // }
        System.out.print("Enter how many terms you want in the Fibonacci series: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            System.out.print("Fibonacci series: ");
            for (int i = 1; i <= n; i++) {
                System.out.print(fibo(i) + " ");
            }
            System.out.println();
        }
    }
}