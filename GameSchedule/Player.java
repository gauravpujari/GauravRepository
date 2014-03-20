package GameSchedule;

public class Player 
{
	String name;
	Game game[];
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Player(String name, Game[] game) {
		super();
		this.name = name;
		this.game = game;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Game[] getGame() {
		return game;
	}
	public void setGame(Game[] game) {
		this.game = game;
	}
	
}
