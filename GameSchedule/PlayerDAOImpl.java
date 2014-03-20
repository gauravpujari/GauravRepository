package GameSchedule;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PlayerDAOImpl implements PlayerDao 
{
	List<Player> list=new ArrayList<Player>();
	
	public Player findPlayer(String player) 
	{
		Player p;
		Iterator<Player> iterator =list.iterator();
		if(player!=null)
		{
			while(iterator.hasNext())
			{
				p=iterator.next();
				if(p.getName().equals(player))
				{
					return p;
				}
			}
		}
		return null;
	}

	public Player[] findPlayerByGame(String name) 
	{
		Player p[] = new Player[10];
		Player player;
		Game game[];
		Iterator<Player> iterator =list.iterator();
		int i=0;
		if(name!=null)
		{
			while(iterator.hasNext())
			{
				player=iterator.next();
				game=player.getGame();
				for (Game game2 : game) 
				{
					if(game2.getGamename().equals(name))
					{
						p[i]=player;
						i++;
					}
				}
			}
		}
		return p;
	}

	public boolean savePlayer(Player p) 
	{
		list.add(p);
		return false;
	}
	
}
