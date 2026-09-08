//public class GreetFunction {
//    public static void main(String[] args) {
//
//        greet();
//    }
//    static void greet() {
//        System.out.println("Good day ahead");
//    }
//}
public class GreetFunction {
    public static void main(String[] args) {
        String result = myGreet("namasteyy");
        System.out.println(result);
    }
    static String myGreet(String message)
    {
        String greeting = message + " Sinch";
        return greeting;
    }
}