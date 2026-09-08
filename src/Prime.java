import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        int c = 2;
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if(num<=1){
            System.out.println("neither prime nor composite");
        }
        while(c*c<=num){
            if(num%c==0){
                System.out.println("Composite number");
                break;
            }
            else {c = c + 1;}
        }
        if(c*c>num){
            System.out.println("Prime number");
        }
    }
}
