package directory;

public class MethodLecture {
    public static void main(String[] args) {
        System.out.println(getSum(1,2));
        System.out.println(birthday("Chris",0));
        String changeMe = "hello codeup!";

        changeString(changeMe);

        System.out.println(changeMe);
    }

    public  static long getSum(long num1, long num2){
        return num1 + num2;
    }
    public static String birthday(String name, int age){
        return name + " is " + age;
    }

    public static void changeString(String s) {
        s = "Wub a lub a dub dub";
        System.out.println(s);
    }

    public static void count(int num){
        System.out.println(num);
        count(num - 1);
    }
}