package GameSchedule;

public class ScheduleServiceImpl implements ScheduleService 
{
	PlayerDao playerdao=new PlayerDAOImpl();
	DayDAO daydao=new DayDAOImpl();
	GameDAO gamedao=new GameDAOImpl();
	public boolean addDay(String name, String[] games) 
	{
		if(daydao.finDay(name)==null)
		{
			Day day=new Day();
			Game []game = new Game[games.length];
			for(int i=0;i<games.length;i++)
			{
				game[i]=new Game();
				game[i].setGamename(games[i]);
			}
			day.setName(name);
			day.setGame(game);
			daydao.saveDay(day);
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean addGame(String name) 
	{
		if(gamedao.findGame(name)==null)
		{
			Game game=new Game();
			game.setGamename(name);
			gamedao.saveGame(game);
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean addPlayer(String name, String[] games) 
	{
		if(playerdao.findPlayer(name)==null)
		{
			Player player=new Player();
			Game []game = new Game[games.length];
			for(int i=0;i<games.length;i++)
			{
				game[i]=new Game();
				game[i].setGamename(games[i]);
			}
			player.setName(name);
			player.setGame(game);
			playerdao.savePlayer(player);
			return true;
		}
		else
		{
			return false;
		}
	}

	public StringBuilder daywiseReport(String day) 
	{
		StringBuilder sb=new StringBuilder("");
		if(day!=null)
		{
			Day dayobj=daydao.finDay(day);
			sb.append("\nDay :"+dayobj.getName());
			Game games[]=dayobj.getGame();
			Player []player;
			for (Game game : games) 
			{
				sb.append("\n\t Game:"+game.getGamename());
				player=playerdao.findPlayerByGame(game.getGamename());
				for (Player player2 : player) 
				{
					if(player2!=null)
					sb.append("\tPlayer:"+player2.getName());
				}
			}
		}
		return sb;
	}

	public StringBuilder gamewiseReport(String game) 
	{
		StringBuilder sb=new StringBuilder();
		if(game!=null)
		{
			sb.append("\nGame:"+game);
			Player player[]=playerdao.findPlayerByGame(game);
			Day day[]=daydao.findDaybyGame(game);
			for (Day day2 : day) 
			{
				if(day2!=null)
				{
					sb.append("\n\tDay:"+day2.getName());
					for (Player player1 : player) 
					{
						if(player1!=null)
						{
							sb.append("\tPlayer:"+player1.getName());
						}
					}
				}
			}
		}
		return sb;
	}

	public StringBuilder playerwiseReport(String Player) 
	{
		StringBuilder sb=new StringBuilder();
		if(Player!=null)
		{
			Player playerobj=playerdao.findPlayer(Player);
			sb.append("\nPlayer:"+playerobj.getName());
			Game game[]=playerobj.getGame();
			Day []day;
			for (Game games:game)
			{
				sb.append("\n\tGame:"+games.getGamename());
				day=daydao.findDaybyGame(games.getGamename());
				for (Day day2 : day) 
				{
					if(day2!=null)
					{
						sb.append("\tDay:"+day2.getName());
					}
				}
			}
			
		}
		return sb;
	}

}
