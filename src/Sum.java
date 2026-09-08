import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = in.nextInt();
        System.out.print("Enter b:");
        int b = in.nextInt();
        int result = sum(a,b);
        System.out.println(result);
    }
    static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
