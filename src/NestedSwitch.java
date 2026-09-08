import java.util.Scanner;
public class NestedSwitch {
    public static  void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your choice");
        int empID = in.nextInt();


        switch(empID){
            case 1:
                System.out.println("Pratap Singh");
                break;
            case 2:
                System.out.println("rahul singh");
                break;
            case 3:
                String department = in.next();

                switch(department){
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management department");
                        break;
                    default:
                        System.out.println("Invalid");
                }
             break;
            default:
                System.out.println("invalid");
        }
    }
}
