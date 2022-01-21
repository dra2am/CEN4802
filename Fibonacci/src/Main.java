import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter a number: ");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int result = getFibonacci(n);

        System.out.println("The " +n+ "nth number of the Fibonacci sequence is "+ result);
    }

    /**
     * This method generates the nth number in the Fibonacci sequence recursively.
     * @param n input received from user in main method
     * @return an integer in the nth position of the Fibonacci sequence.
     * @author Diana Alcantara
     */
    public static int getFibonacci(int n)
    {
        if (n == 1 || n == 0){
            return n;
        }
        return getFibonacci(n - 1) + getFibonacci(n - 2);
    }
}
