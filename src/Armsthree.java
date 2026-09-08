
public class Armsthree {
    public static void main(String[] args) {

      
        for(int i = 100;i<1000;i++){
            if(isArmstrong(i)){
                System.out.print(i + " ");
            }
        }

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
