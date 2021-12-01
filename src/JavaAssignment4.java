import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class JavaAssignment4 {
    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter input size: ");
        int size = scan.nextInt();
        scan.nextLine();
        String signup_date, current_date;
        ArrayList<Date> signupDateList = new ArrayList<>();
        ArrayList<Date> currentDateList = new ArrayList<>();
        System.out.println("Enter signup date and current date: ");
        Date signUpDate, currentDate;


        for (int i = 0; i < size; i++) {
            signup_date = scan.next();
            current_date = scan.next();
            signUpDate = new SimpleDateFormat("dd-MM-yyyy").parse(signup_date);
            currentDate = new SimpleDateFormat("dd-MM-yyyy").parse(current_date);


            signupDateList.add(signUpDate);
            currentDateList.add(currentDate);
        }
        allowableRange(signupDateList, currentDateList);
    }

    public static void allowableRange(ArrayList<Date> signupDateList, ArrayList<Date> currentDateList) throws ParseException {
        for (int i = 0; i < signupDateList.size(); i++) {
            Date sUpDate = signupDateList.get(i);
            Date curDate = currentDateList.get(i);

            //Calendar instances of sign-up date and current date
            Calendar signUp = Calendar.getInstance();
            signUp.setTime(sUpDate);
            Calendar cur = Calendar.getInstance();
            cur.setTime(curDate);

            //extracting current day, month and year
            int curDay = cur.get(Calendar.DAY_OF_MONTH);
            int curMonth = cur.get(Calendar.MONTH) + 1;
            int curYear = cur.get(Calendar.YEAR);
            int signUpYear = signUp.get(Calendar.YEAR);

            //difference in years between current date and signup date
            int diffYear = curYear - signUpYear;
            if (diffYear == 0)
                System.out.println("No range");
            //modifying signup date to get anniversary date
            signUp.add(Calendar.YEAR, diffYear);
            //subtracting 30 days from anniversary date
            signUp.add(Calendar.DAY_OF_MONTH, -30);
            Date before30 = signUp.getTime();
            Calendar b30 = Calendar.getInstance();
            b30.setTime(before30);
            int before_month, before_day, before_year;
            before_day = b30.get(Calendar.DAY_OF_MONTH);
            before_month = b30.get(Calendar.MONTH) + 1;
            before_year = b30.get(Calendar.YEAR);

            //adding 60 days to get the date after 30 days to the anniversary date
            signUp.add(Calendar.DAY_OF_MONTH, 60);
            Date after30 = signUp.getTime();
            Calendar a30 = Calendar.getInstance();
            a30.setTime(after30);
            int after_month, after_day, after_year;
            after_day = a30.get(Calendar.DAY_OF_MONTH);
            after_month = a30.get(Calendar.MONTH) + 1;
            after_year = a30.get(Calendar.YEAR);


            if (a30.compareTo(cur) > 0 && b30.compareTo(cur) > 0)
                System.out.println("No range");

            else if (b30.compareTo(cur) < 0 && a30.compareTo(cur) > 0) {
                System.out.println();

                System.out.printf("%02d-%02d-%2d %02d-%02d-%2d", before_day, before_month, before_year, curDay, curMonth, curYear);

                System.out.println();
            } else if ((a30.compareTo(cur) < 0 && b30.compareTo(cur) < 0)) {
                System.out.printf("%02d-%02d-%2d %02d-%02d-%2d", before_day, before_month, before_year, after_day, after_month, after_year);


                System.out.println();
            }


        }
    }
}
