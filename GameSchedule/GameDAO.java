package GameSchedule;

public interface GameDAO 
{
	Game game[]=new Game[10];
	boolean saveGame(Game game);
	Game findGame(String game);
}
