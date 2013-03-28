package Date;

import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
	
	public static void main (String [] args){
		
		Date myDate  = new Date();
		
		System.out.println(myDate);
		
		GregorianCalendar gc = new GregorianCalendar(2013, 2, 20);
		gc.add(GregorianCalendar.DATE, 1);
		Date d2 = gc.getTime();
		
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		
		String sd = df.format(d2);
		
		System.out.println(sd);
	}

}
