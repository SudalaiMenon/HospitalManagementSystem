package untility;

import java.text.*;
import java.util.Calendar;
import java.util.Date;

public class DateUtility {

    public static Date convertDate(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day);
        return calendar.getTime();
    }

    public static String getCurrentDateAsString() {
        SimpleDateFormat currentDateString = new SimpleDateFormat("dd/MM/yyyy");
        String stringDate = "";
        //System.out.println("Get Current Date as String using simple date format:" + currentDateString.format(stringDate));

        return stringDate;
    }

    public static Date currentDateAsDate() {
        SimpleDateFormat currentDate = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        //System.out.println("Get Current Date as String using simple date format:" +currentDate.format(date));
        return date;
    }

    public static String convertDateToString(Date date) {
        if (date == null)
            date = new Date();
        SimpleDateFormat dateToString = new SimpleDateFormat("dd/MM/yyyy");
        return dateToString.format(date);
    }

    public static Date convertStringToDate(String date)  {
        SimpleDateFormat date1 = new SimpleDateFormat("dd/MM/yyyy");
        try {
            return date1.parse(date);
        } catch (ParseException e) {
            return null;
        }
    }
    public static Date convertStringToDateEx(String date) throws ParseException {
        SimpleDateFormat date1 = new SimpleDateFormat("dd/MM/yyyy");
        return date1.parse(date);
    }

    public static Date dateNumberToLetter(String date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        try{
            return dateFormat.parse(date);
        }catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static String getCurrentTime() {
        SimpleDateFormat currentTime = new SimpleDateFormat("HH:mm ");
        Date date = new Date();
        return currentTime.format(date);
    }
    public static String getCurrentTime12hr() {
        SimpleDateFormat currentTime = new SimpleDateFormat("hh:mm aa ");
        Date date = new Date();
        return currentTime.format(date);
    }
    public static String getMonthStringToLetter(String date) {
        try {
            Date date1 = new SimpleDateFormat("yyyy/MM/dd").parse(date);
            return new SimpleDateFormat("MMM dd, yyyy").format(date1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String getMonthToLetter(String date) {
        try {
            Date date1 = new SimpleDateFormat("yyyy/MM/dd").parse(date);
            return new SimpleDateFormat("MMMM dd, yyyy").format(date1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }


    public static void main(String[] args) {
       // System.out.println(DateUtility.dateNumberToLetter("2021/9/01"));
        System.out.println("Time 24hrs format:" + DateUtility.getCurrentTime());
        System.out.println("Time 12hrs format:" + DateUtility.getCurrentTime12hr());
        System.out.println("Get Month Input String to Date format One:" + DateUtility.getMonthStringToLetter("2021/08/01"));
        System.out.println("Get Month Input String to Date format Two:" + DateUtility.getMonthToLetter("2021/08/01"));


    }
}

