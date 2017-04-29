package com.hackerrank.www.introduction;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Scanner;

public class DateAndTime
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        int nmonth=Integer.parseInt(month);
        int nday=Integer.parseInt(day);
        int nyear=Integer.parseInt(year);
        //creating instance 
        Calendar cal=Calendar.getInstance();
		cal.set(nyear, nmonth-1, nday);
		/*Getting day from calendar and converting to
		 * Upper case
		 */
		System.out.println(new DateFormatSymbols().getWeekdays()[cal.get(Calendar.DAY_OF_WEEK)].toUpperCase());
        in.close();
	}

}
