package GameSchedule;

public interface ScheduleService 
{
	boolean addGame(String name);
	boolean addPlayer(String name,String games[]);
	boolean addDay(String name,String games[]);
	StringBuilder playerwiseReport(String Player);
	StringBuilder daywiseReport(String day);
	StringBuilder gamewiseReport(String game);
}
