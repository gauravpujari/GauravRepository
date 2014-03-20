package GameSchedule;

public interface DayDAO 
{
	Day []day=new Day[10];
	boolean saveDay(Day day);
	Day finDay(String dayname);
	Day[] findDaybyGame(String game);
}
