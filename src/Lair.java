import java.util.*;

public class Lair extends Area
{
	
	Random rand = new Random();
	private static String dragonName, reward;

	public Lair(String n, String d, String p, String[] dn, String[] r)
	{
		super(n, d, p);
		dragonName = dn[rand.nextInt(dn.length)];
		reward = r[rand.nextInt(r.length)];
	}
	
	public static String getDragonName()
	{
		return dragonName;
	}
	
	public static String getReward()
	{
		return reward;
	}
	
}
