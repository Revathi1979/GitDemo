
import java.time.*;

public class DateAndTime {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		
		System.out.println(date);
		
		LocalTime time = LocalTime.now();
		
		System.out.println(time);
		
		int day = date.getDayOfMonth();
		
		int month = date.getMonthValue();
		
		int year = date.getYear();
		
		System.out.printf("Day : %d, Month : %d, Year :%d\n", day, month, year);
		
		int hour = time.getHour();
		
		int minute = time.getMinute();
		
		int second = time.getSecond();
		
		int nano = time.getNano();
		
		System.out.printf("Hour : %d, Minute :%d, Second :%d, Nano :%d\n", hour, minute, second, nano);
		
		LocalDateTime datetime = LocalDateTime.now();
		
		System.out.println(datetime);
		
		
		int daydt = datetime.getDayOfMonth();
		
		int monthdt = datetime.getMonthValue();
		
		int yeardt = datetime.getYear();
		
		System.out.printf("Day : %d, Month : %d, Year :%d\n", daydt, monthdt, yeardt);
		
		int hourdt = datetime.getHour();
		
		int minutedt = datetime.getMinute();
		
		int seconddt = datetime.getSecond();
		
		int nanodt = datetime.getNano();
		
		System.out.printf("Hour : %d, Minute :%d, Second :%d, Nano :%d\n", hourdt, minutedt, seconddt, nanodt);
		
		ZoneId zone = ZoneId.systemDefault();
		
		System.out.println(zone);
		
	}

}
