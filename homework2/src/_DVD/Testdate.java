package _DVD;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Testdate {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd");
		simple.setLenient(false);
		Date d = simple.parse("2010-8-1");
		Date date = new Date();
		long time = date.getTime();
		String s = simple.format(d);
		System.out.println(d);
		System.out.println(s);
		System.out.println(date);
		System.out.println(time);
	}
}
