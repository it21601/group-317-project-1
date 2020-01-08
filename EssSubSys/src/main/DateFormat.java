package main;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class DateFormat {

	private static String date_pattern = "yyyy-MM-dd";
	private static SimpleDateFormat formatter = new SimpleDateFormat(date_pattern);
	
	// read a date string and parse/convert to a date
	public static Date parseDate(String jdate) throws ParseException {
		Date sqldate = formatter.parse(jdate);
		
		return sqldate;
	}
	
	// read a date and format/convert to a string
    public static String formatDate(Date theDate) {
            String result = null;
            if (theDate != null) {
                    result = formatter.format(theDate);
            }
            return result;
    }
}
