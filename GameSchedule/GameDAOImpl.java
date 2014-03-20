package GameSchedule;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class GameDAOImpl implements GameDAO 
{
	List<Game> list=new ArrayList<Game>();
	public Game findGame(String game) 
	{
		Iterator<Game> iterator=list.iterator();
		Game g;
		while(iterator.hasNext())
		{
			g=iterator.next();
			if(g.getGamename().equals(game))
			{
				return g;
			}
		}
		return null;
	}

	public boolean saveGame(Game game) 
	{
		list.add(game);
		return false;
	}


	
}
