package GameSchedule;

public interface PlayerDao 
{
	Player player[]=new Player[10];
	boolean savePlayer(Player p);
	Player findPlayer(String player);
	Player[] findPlayerByGame(String name);
}
