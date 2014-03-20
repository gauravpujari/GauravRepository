package GameSchedule;

import java.util.Scanner;

public class GameScheduleClient 
{
	public static void main(String[] args) 
	{
		ScheduleService s=new ScheduleServiceImpl();
		/*String g[]={"criket","badminton"};
		s.addDay("monday", g);
		s.addDay("tuesday", g);
		s.addGame("badminton");
		s.addPlayer("Gaurav", g);
		boolean flag=s.addPlayer("Gaurav", g);
		if(!flag)
		{
			System.out.println("Name is duplicate");
		}
		System.out.println(s.daywiseReport("monday"));
		System.out.println(s.playerwiseReport("Gaurav"));
		System.out.println(s.gamewiseReport("badminton"));*/
		String player_name,game_name,day_name,ch;
		String game[] = null;
		Scanner scan=new Scanner(System.in);
		int choice1st,choice2nd;
		while(true)
		{
			System.out.println("\nWelcome Game Schedule");
			System.out.println("\n\t1:Add\n\t2:Report\n\t3:Exit");
			choice1st=scan.nextInt();
			while(true)
			{
				switch(choice1st)
				{
					case 1:
						System.out.println("\n\t1:Player Add\n\t2:Game Add\n\t3:Day Add");
						choice2nd=scan.nextInt();
						switch(choice2nd)
						{
							case 1:
								System.out.println("Enter player Name :");
								player_name=scan.next();
								int i=0;
								while(true)
								{
									System.out.println("Enter games");
									game[i]=scan.next();
									System.out.println("Do you want to enter another game? press 'y' or 'Y'");
									ch=scan.next();
									if(ch.equals("y")||ch.equals("Y"))
										continue;
									else
										break;
								}
								s.addPlayer(player_name, game);
						}
						
				}
			}
		}
	}

}
