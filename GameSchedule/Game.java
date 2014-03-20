package GameSchedule;

public class Game 
{
	String gamename;

	public Game() 
	{
		super();
	}

	public Game(String gamename) {
		super();
		this.gamename = gamename;
	}

	public String getGamename() {
		return gamename;
	}

	public void setGamename(String gamename) {
		this.gamename = gamename;
	}
	
}
