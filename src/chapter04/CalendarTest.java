package chapter04;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		printDate(cal);
		
		cal.set(Calendar.YEAR, 2020);
		cal.set(Calendar.MONTH, 10); // month(0 ~ 11) -1을 해야됨
		cal.set(Calendar.DATE, 26);
		printDate(cal);
		
		cal.set(2007,11,18);
		cal.add(Calendar.DATE, 5000);
		printDate(cal);
	}
	
	public static void printDate(Calendar cal)
	{
		String[] days = {"일", "월" , "화", "수", "목", "금", "토"};
		
		// 년도
		int year = cal.get(Calendar.YEAR);
		
		// 월 (0 ~ 11) +1을 해야 함
		int month = cal.get(Calendar.MONTH);
		
		// 일
		int date = cal.get(Calendar.DATE);
		
		// 요일 ((1 = 일요일) ~ (7 = 토요일))
		int day = cal.get(Calendar.DAY_OF_WEEK);
		
		// 시
		int hour = cal.get(Calendar.HOUR);
		
		// 분
		int minute = cal.get(Calendar.MINUTE);
		
		// 초
		int second = cal.get(Calendar.SECOND);
		
		System.out.println(year + "-" + (month+1) + "-" + date + " (" + days[day-1] + ") " + hour + ":" + minute + ":" + second);
	}

}
