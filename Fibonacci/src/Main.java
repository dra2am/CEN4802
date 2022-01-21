import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter a number: ");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int result = getFibonacci(n);

        System.out.println("The " +n+ "nth number of the Fibonacci sequence is "+ result);
    }

    public static int getFibonacci(int n)
    {
        if (n == 1 || n == 0){
            return n;
        }
        return getFibonacci(n - 1) + getFibonacci(n - 2);
    }
}
