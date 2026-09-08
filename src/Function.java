import java.util.Scanner;
public class Function {
    public static void main(String[] args) {
        int result = sum();
        System.out.println(result);
    }
    static int sum() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1:");
        int num1 = in.nextInt();
        System.out.print("Enter number 2:");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;
    }
}
