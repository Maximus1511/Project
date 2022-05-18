public class HomeWork2App {
    public static void main(String[] args) {
        CompareTwoNumbers(13,4);

        System.out.println(CompareTwoNumbers(3,4));
        DetectSign(-5);
        DetectSign2();
    }

    private static boolean CompareTwoNumbers(int a, int b) {
        int sum = 0;
        sum = a + b;
        if((a >= 10) &&(a <= 20)){
            return (true);
        }
        else return (false);
    }

    private static void DetectSign(int a) {
        if (a >= 0) {
            System.out.println("Nubmer is positive");
        }
        else System.out.println("Number is negative");
    }


    private static boolean DetectSign2(int a) {
        if (a >= 0) {
            return (false);
        }
        return(true);
    }
}
