package chapter04;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		
		Date now = new Date();
		System.out.println(now);
		
		printDate1(now);
		printDate2(now);

	}
	
	public static void printDate1(Date d)
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
// 		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초 ");
		System.out.println(sdf.format(d));
	}
	
	public static void printDate2(Date d)
	{
//		// 년도 + 1900 을 해줘야 함(밀레니엄버그흔적..)
		int year = d.getYear();
		
		//월(0 ~ 11) + 1을 해줘야 됨
		int month = d.getMonth();
		
		int date = d.getDate();
		
		// 시간
		int hours = d.getHours();
		int minutes = d.getMinutes();
		int seconds = d.getSeconds();
		
		
		System.out.println((year+1900) + "-" + (month+1) + "-" + date + " " + hours + ":" + minutes + ":" + seconds );
	}

}
