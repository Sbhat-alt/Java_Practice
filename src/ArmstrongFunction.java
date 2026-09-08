import java.util.Scanner;
public class ArmstrongFunction {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        int n = in.nextInt();
        boolean result = isArmstrong(n);
        System.out.println(result);
    }
    static boolean isArmstrong(int n){
        int Original = n;
        int sum = 0;
        int rem = 0;
        while(n>0){
            rem = n%10;
            sum = sum + rem*rem*rem;
            n/=10;
        }
        return sum == Original;
    }
}
