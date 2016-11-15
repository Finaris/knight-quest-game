import java.util.*;

public class Cave extends Area
{
	
	Random rand = new Random();
	private int numOfEncounters = rand.nextInt(3) + 1;
	private String[] monsterName;

	public Cave(String n, String d, String p, String[] m)
	{
		super(n, d, p);
		monsterName = m;
	}
	
}
