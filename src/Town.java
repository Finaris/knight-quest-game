import java.util.*;

public class Town extends Area
{
	
	Random rand = new Random();
	private static String townName, questName;
	
	public Town(String n, String d, String p, String[] t, String[] q)
	{
		super(n, d, p);
		townName = t[rand.nextInt(t.length)];
		questName = q[rand.nextInt(q.length)];
	}
	
	public static String getTownName()
	{
		return townName;
	}
	
	public static String getQuestName()
	{
		return questName;
	}
	
}

