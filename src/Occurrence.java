public class Occurrence{
    public static void main(String[] args) {
        int n = 1223224;
        int count = 0;
        while(n>0)
        {
            int rem = n%10;
            if(rem == 2){
                count++;

            }
            n/=10;
        }
        System.out.println(count);
    }
}