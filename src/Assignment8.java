import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args) {
        try {
            testExceptions();
        } catch (
                Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("In finally block");

        }
    }

    public static void testExceptions() {
        Scanner scan = new Scanner(System.in);
        int i= scan.nextInt();//gives rise to input mismatch exception
        String str= null;//null pointer exception
        if (str.contains("abcd")) {
            System.out.println("it contains abcd");

        }
        int[] arr = new int[2];
        System.out.println(arr[3]);
    }

}
