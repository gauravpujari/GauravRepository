package GameSchedule;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class DayDAOImpl implements DayDAO 
{
	List<Day> list=new ArrayList<Day>();
	
	
	public Day finDay(String dayname) 
	{
		Iterator<Day> iterator=list.iterator();
		Day day;
		while(iterator.hasNext())
		{
			day=(Day)iterator.next();
			if(day.getName().equals(dayname))
			{
				return day;
			}
		}
		return null;
	}

	public Day[] findDaybyGame(String game) 
	{
		Day d[]=new Day[10];
		Day day;
		Game g[];
		ListIterator<Day> iterator=list.listIterator();
		int i=0;
		if(game!=null)
		{
			while(iterator.hasNext())
			{
				day=iterator.next();
				g=day.getGame();
				for (Game game2 : g) 
				{
					if(game2.getGamename().equals(game))
					{
						d[i]=day;
						i++;
					}
				}
			}
		}
		return d;
	}

	public boolean saveDay(Day day) 
	{
		list.add(day);
		return false;
	}

}
