public class HomeWork2App {
    public static void main(String[] args) {
       // CompareTwoNumbers(13,4);
        //System.out.println(CompareTwoNumbers(13,4)); this string is just for check method CompareTwoNumbers works good

        //DetectSign(-5);

        DetectSign2(8);
        //System.out.println(DetectSign2(8)); this string is just for check method DetectSign2 works good

        //PrintStringNTimes("i like java",5);


        IsLeapYear(1600);
        IsLeapYear(1900);
        IsLeapYear(1904);
        IsLeapYear(2000);
        //System.out.println(IsLeapYear(2020)); //this string is just for check method IsLeapYear works good
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
            System.out.println("Number is positive");
        }
        else System.out.println("Number is negative");
    }


    private static boolean DetectSign2(int a) {
        if (a >= 0) {
            return (false);
        }
        return(true);
    }

    private static void PrintStringNTimes(String str, int N) {
        for (int i = 0; i < N; i++) {
            System.out.println(str);
        }
    }

    private static void IsLeapYear(int year) {
        if (year % 4 == 0)   {
            if (year % 400 == 0){
                System.out.println("Year " + year + " is leap");
            } else if (year % 100 == 0) {
                System.out.println("Year " + year + " is NOT leap");
                    }
            else System.out.println("Year " + year + " is leap");
        } else System.out.println("Year " + year + " is NOT leap");

    }
}
