package untility;

import java.text.*;
import java.util.*;

public class DateUtility {

    public static Date convertDate(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day);
        return calendar.getTime();
    }


//12. Method to return current date in string format(MM/dd/yyyy)
    public static String getCurrentDateAsString() {
        SimpleDateFormat currentDateString = new SimpleDateFormat("dd/MM/yyyy");
        String stringDate = "";
        //System.out.println("Get Current Date as String using simple date format:" + currentDateString.format(stringDate));

        return stringDate;
    }


//11. Method to return current date.
    public static Date currentDateAsDate() {
        SimpleDateFormat currentDate = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        //System.out.println("Get Current Date as String using simple date format:" +currentDate.format(date));
        return date;
    }


    //13. Method to return by converting the date to string format(MM/dd/yyyy)
    public static String convertDateToString(Date date) {
        if (date == null)
            date = new Date();
        SimpleDateFormat dateToString = new SimpleDateFormat("dd/MM/yyyy");
        return dateToString.format(date);
    }


//14. Method to return by converting the String(MM/dd/yyyy) to date
    public static Date convertStringToDate(String date) {
        SimpleDateFormat date1 = new SimpleDateFormat("dd/MM/yyyy");
        try {
            return date1.parse(date);
        } catch (ParseException e) {
            return new Date();

        }
    }

    public static Date convertStringToDateEx(String date) throws ParseException {
        SimpleDateFormat date1 = new SimpleDateFormat("dd/MM/yyyy");
        return date1.parse(date);
    }


//20. Method to return by converting the date string(MM/dd/yyyy) to string format(August 10, 2021)
    public static Date dateNumberToLetter(String date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        try {
            return dateFormat.parse(date);
        } catch (ParseException e) {
            return new Date();

        }

    }

    //19. Method to return current time as string in 24hrs format
    public static String getCurrentTime() {
        SimpleDateFormat currentTime = new SimpleDateFormat("HH:mm ");
        Date date = new Date();
        return currentTime.format(date);
    }


//18. Method to return current time as string in 12hrs format
    public static String getCurrentTime12hr() {
        SimpleDateFormat currentTime = new SimpleDateFormat("hh:mm aa ");
        Date date = new Date();
        return currentTime.format(date);
    }

    public static String getMonthStringToLetter(String date) {
        Date date1 = convertStringToDate(date);
        return new SimpleDateFormat("MMM dd, yyyy").format(date1);
        }

 //15. Method to return by converting the date string(MM/dd/yyyy) to string format(August 10, 2021)
    public static String getMonthToLetter(String date) {
            Date date1 = convertStringToDate(date);
            return new SimpleDateFormat("MMMM dd, yyyy").format(date1);
        }



 // 1. Method to return the last date of the month from given date string(Format: MM/dd/yyyy)
    public static Date getMonthOfLastday(String dateStr) {

        Date date = convertStringToDate(dateStr);

        Calendar calendar = Calendar.getInstance();
        if (date != null) {
            calendar.setTime(date);
        }
        calendar.add(Calendar.MONTH, 1);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        calendar.add(Calendar.DATE, -1);

        Date lastDayOfMonth = calendar.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println("Last Day of Given Month: " + sdf.format(lastDayOfMonth));
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        return date;
    }


//2. Method to return the first date of the month from given date string(Format: MM/dd/yyyy)
    public static Date getMonthOfFirstday(String dateStr) {

        Date date = convertStringToDate(dateStr);

        Calendar calendar = Calendar.getInstance();
        if (date != null) {
            calendar.setTime(date);
        }
        calendar.add(Calendar.MONTH, 0);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        calendar.add(Calendar.DATE, 0);

        Date lastDayOfMonth = calendar.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMinimum(Calendar.DAY_OF_MONTH));
        System.out.println("First Day of Month: " + sdf.format(lastDayOfMonth));
        return date;

    }


 //  3. Method to return the difference of two date in Day Hr Min Sec format
    public static String getDifferentDate(String dateStart, String dateStop) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        Date startDate = null;
        Date stopDate = null;
        try {
            startDate = format.parse(dateStart);
            stopDate = format.parse(dateStop);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        long diff = 0;
        if (stopDate != null) {
            diff = stopDate.getTime() - startDate.getTime();
        }

        long diffSeconds = diff / 1000 % 60;
        long diffMinutes = diff / (60 * 1000) % 60;
        long diffHours = diff / (60 * 60 * 1000) % 24;
        long diffDays = (diff / (1000 * 60 * 60 * 24)) % 365;
        StringBuilder str = new StringBuilder();
        if (diffDays > 0) {
            str.append(diffDays).append("Day ");

        }
           if(diffHours > 0) {
               str.append(diffHours).append("Hr ");

        }
          if (diffMinutes > 0) {
              str.append(diffMinutes).append("Min ");

        }
        if (diffSeconds > 0) {
           str.append(diffSeconds).append("Sec");
      }
        return str.toString();
    }


    //8. Method to return current day
    public static int getCurrentDay() {
        Calendar calendar = Calendar.getInstance();
        return  calendar.get(Calendar.DATE);
    }

    //9. Method to return current month.
    public static int getCurrentMonth() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.MONTH) + 1;
    }

    //10. Method to return current year.
    public static int getCurrentYear() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.YEAR);
    }


//4. Method to return by add 1 hour to given date.
    public static Date getAddOneHour(String strDate) {

       Date date = givenDateTimeStringAsDate(strDate);
        Calendar calendar = Calendar.getInstance();
        if (date != null) {
            calendar.setTime(date);
        }
        calendar.add(Calendar.HOUR_OF_DAY,1);
        return calendar.getTime();
    }

    //5. Method to return by sub 1 hour to given date.
    public static Date getSubOneHour(String strDate) {
        Date date = convertStringToDate(strDate);
        Calendar calendar = Calendar.getInstance();
        if (date != null) {
            calendar.setTime(date);
        }
        calendar.add(Calendar.HOUR_OF_DAY, -1);
        return calendar.getTime();
    }

    //6. Method to return by add 1 day to given date.
    public static Date getAddingOneDay(String strDate) {
        Date date = convertStringToDate(strDate);
        Calendar calendar = Calendar.getInstance();
        if (date != null) {
            calendar.setTime(date);
        }
        calendar.add(Calendar.DAY_OF_MONTH,  1);
        return calendar.getTime();
    }


    //7. Method to return by sub 1 day to given date.
    public static Date getSubtractOneDay(String strDate) {
        Date date = convertStringToDate(strDate);
        Calendar calendar = Calendar.getInstance();
        if (date != null) {
            calendar.setTime(date);
        }
        calendar.add(Calendar.DAY_OF_MONTH, -1);
        return calendar.getTime();
    }

    //17. Method to return the first date of the year from given date string(Format: MM/dd/yyyy)
    public static Date getFirstDateOfYear(String dateStr) {

        Date date = convertStringToDate(dateStr);

        Calendar calendar = Calendar.getInstance();
        if (date != null) {
            calendar.setTime(date);
        }
        calendar.add(Calendar.YEAR, 0);
        calendar.set(Calendar.DAY_OF_YEAR, 1);
        calendar.add(Calendar.DATE, 0);

        Date lastDayOfYear = calendar.getTime();
        calendar.set(Calendar.DAY_OF_YEAR, calendar.getActualMinimum(Calendar.DAY_OF_YEAR));
        return lastDayOfYear;
    }

    //16. Method to return the last date of the year from given date string(Format: MM/dd/yyyy
    public static Date getLastDateOfYear(String dateStr) {

        Date date = convertStringToDate(dateStr);

        Calendar calendar = Calendar.getInstance();
        if (date != null) {
            calendar.setTime(date);
        }
        calendar.set(Calendar.DAY_OF_YEAR, calendar.getActualMaximum(Calendar.DAY_OF_YEAR));
        return calendar.getTime();
    }


    public static Date addHoursToDate(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.HOUR_OF_DAY, 1);
        return calendar.getTime();

    }
    public static Date subHoursToDate(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.HOUR_OF_DAY, -1);
        return calendar.getTime();
    }

//22. Method to return date as string from the given date and the required format
        public static Date givenDateTimeStringAsDate(String dateStr)  {
        SimpleDateFormat dateToString = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            try {
                return dateToString.parse(dateStr);
            } catch (ParseException e) {
                return new Date();
            }

        }

//23. Method to return by add the given hour to given date.
        public static Date addGivenHourToDate(String strDate,int hours) {
        Date date = convertStringToDate(strDate);
        Calendar calendar = Calendar.getInstance();
            if (date != null) {
                calendar.setTime(date);
            }
            calendar.add(Calendar.HOUR_OF_DAY, hours + 2 );
        return calendar.getTime();
    }


//24. Method to return by sub the given hour to given date.
    public static Date subGivenHourToDate(String strDate,int hours) {
        Date date = convertStringToDate(strDate);
        Calendar calendar = Calendar.getInstance();
        if (date != null) {
            calendar.setTime(date);
        }
        calendar.add(Calendar.HOUR_OF_DAY, hours + 2 );
        return calendar.getTime();
    }


//25. Method to return by add the given day to given date.
    public static Date addGivenDayToDate(Date date) {

        Calendar calendar = Calendar.getInstance();
        if (date != null) {
            calendar.setTime(date);
        }
        calendar.add(Calendar.DAY_OF_MONTH, 1 );

        return calendar.getTime();
    }


//26. Method to return by sub the given day to given date.
    public static Date subGivenDayToDate(Date date)
    {

        Calendar calendar = Calendar.getInstance();
        if (date != null) {
            calendar.setTime(date);
        }
        calendar.add(Calendar.DAY_OF_MONTH, -1 );

        return calendar.getTime();
    }


    public static List<Date> listOfDateGivenDateRange(String startdate, String enddate)
    {
        Date date1 = givenDateTimeStringAsDate(startdate);
        Date date2 = givenDateTimeStringAsDate(enddate);
        List<Date> dates = new ArrayList<>();
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date1);

        while (calendar.getTime().before(date2) || calendar.getTime().equals(date2))
        {
            Date result = calendar.getTime();
            dates.add(result);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
        }
        return dates;
    }

    //24.Method to return list of date in string with in the given date range
    public static List<String> listOfDateGivenStringDateRange(Date startDate, Date endDate) {
        List<String> dates = new ArrayList<>();
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(startDate);

        while (calendar.getTime().before(endDate) || calendar.getTime().equals(endDate))
        {
             Date result = calendar.getTime();
            dates.add(String.valueOf(result));
            calendar.add(Calendar.DATE, 1);
        }
        return dates;
    }



    //28. Method to return date without time
    public static Date returnDateWithoutTime(String strDate) {
        Date date = givenDateTimeStringAsDate(strDate);
        return date;
    }
    //22. Method to return date as string from the given date and the required format
    public static String givenDateRequiredFormat() {
         Date date = Calendar.getInstance().getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String strDate = dateFormat.format(date);
return strDate;
    }


    public static void main (String[] args) throws ParseException {
            System.out.println(DateUtility.dateNumberToLetter("2021/9/01"));
            System.out.println("Time 24hrs format:" + DateUtility.getCurrentTime());
            System.out.println("Time 12hrs format:" + DateUtility.getCurrentTime12hr());
            System.out.println("Get Month Input String to Date format One:" + DateUtility.getMonthStringToLetter("2021/08/01"));

            System.out.println("Get Month Input String to Date format Two:" + DateUtility.getMonthToLetter("2021/08/01"));
            System.out.println("Method to return the last date of the month from given date string(Format: MM/dd/yyyy):" + DateUtility.getMonthOfLastday("8/20/2021"));
            System.out.println("Method to return the first date of the month from given date string(Format: MM/dd/yyyy):" + DateUtility.getMonthOfFirstday("8/20/2021"));
            System.out.println("Method to return the difference of two date in Day Hr Min Sec format: " + getDifferentDate("2021/09/07 04:00:50", "2021/09/08 05:30:00 "));
            System.out.println("Get Last day of Given Month:" + DateUtility.getMonthOfLastday("2021/09/08"));

            System.out.println("Method to return current day: " + DateUtility.getCurrentDay());
            System.out.println("Method to return current month: " + DateUtility.getCurrentMonth());
            System.out.println("Method to return current year :" + DateUtility.getCurrentYear());

            System.out.println("Method to return by add 1 hour to given date: " + DateUtility.getAddOneHour("9/13/2021 12:00:00"));
            System.out.println("Method to return by sub 1 hour to given date: " + DateUtility.getSubOneHour("9/13/2021 12:00:00"));
            System.out.println("Method to return by add 1 day to given date: " + DateUtility.getAddingOneDay("9/13/2021"));
            System.out.println("Method to return by sub 1 day to given date: " + DateUtility.getSubtractOneDay("9/13/2021"));

            System.out.println("Get First day of Given Year: " + DateUtility.getFirstDateOfYear("20/8/2021"));
            System.out.println("Get Last day of Given Year: " + DateUtility.getLastDateOfYear("20/8/2021"));
            System.out.println("Adding One hour to current date: " + DateUtility.addHoursToDate(DateUtility.givenDateTimeStringAsDate("20/8/2021 12:05:00")));
            System.out.println("Subtract One hour to current date: " + DateUtility.subHoursToDate(DateUtility.givenDateTimeStringAsDate("20/8/2021 12:05:00")));
            System.out.println("Method to return the given date string and time string to date: " + DateUtility.givenDateTimeStringAsDate("20/8/2021 05:15:12"));
            System.out.println("Method to return by add the given hour to given date: " + DateUtility.addGivenHourToDate("20/8/2021",+1));
            System.out.println("Method to return by subtract the given hour to given date: " + DateUtility.subGivenHourToDate("20/8/2021",-1));

            System.out.println("Method to return by add the given day to given date: " + DateUtility.addGivenDayToDate(DateUtility.givenDateTimeStringAsDate("20/8/2021 12:05:00")));
            System.out.println("Method to return by subtract the given day to given date: " + DateUtility.subGivenDayToDate(DateUtility.givenDateTimeStringAsDate("2021-8-21 12:05:00")));
            System.out.println("Method to return list of date in string with in the given date range: " + DateUtility.listOfDateGivenDateRange("15/8/2021 00:00:00 " ,"30/8/2021 00:00:00") );
            System.out.println("Method to return date without time: " + DateUtility.returnDateWithoutTime("20/8/2021 00:00:00"));
            System.out.println("Method to return date as string from the given date and the required format: " + DateUtility.givenDateRequiredFormat());
            System.out.println("Method to return list of date in string with in the given date range: " + DateUtility.listOfDateGivenStringDateRange(convertStringToDate("15/8/2021 00:00:00") ,convertStringToDate("30/8/2021 00:00:00")) );

    }
        }




