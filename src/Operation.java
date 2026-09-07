import java.util.Scanner;
public class Operation{
    public static void main(String[] args) {
        int res = 0;
        Scanner in = new Scanner(System.in);

        while(true){
            System.out.println("Enter the operator:");
            char ch = in.next().trim().charAt(0);
            if(ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%'){
                System.out.println("Enter num1 and num2:");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                if(ch == '+'){
                    res = num1+num2;
                }
                if(ch == '-'){
                    res = num1 - num2;
                }
                if(ch == '*'){
                    res = num1*num2;
                }
                if(ch == '/'){
                    if(num2!=0){
                        res = num1/num2;
                    }
                }
                if(ch == '%'){
                    res = num1%num2;
                } }
            else if(ch  == 'x'|| ch =='X'){
                break;
            }
            else{
                System.out.println("Invalid Operator");
            }
            System.out.println(res);


        }
    }
}