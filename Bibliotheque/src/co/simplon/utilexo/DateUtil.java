package co.simplon.utilexo;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class DateUtil {

	public static Date toDate(String strDate,String formatDate)
	{
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat(formatDate);
			return dateFormat.parse(strDate);
		}
		catch(ParseException e) {
			e.printStackTrace();
			return null;
		}				
	}
	
	public static String toString(Date date,String formatDate)
	{
		SimpleDateFormat dateFormat = new SimpleDateFormat(formatDate);
		return dateFormat.format(date);
	}
}