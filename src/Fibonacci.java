//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Fibonacci {

    public static long fibRecursive(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibRecursive(n - 1) + fibRecursive(n - 2);
        }
    }
    public static void main(String[] args) {
        int term = 10;
        long result = Fibonacci.fibRecursive(term);
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("The " + term + "th fibonacci number is " + result + ".");

    }
}