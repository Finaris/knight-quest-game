public class Area
{

	private static String areaName, description, personName;
	
	public Area(String n, String d, String p)
	{
		areaName = n;
		description = d;
		personName = p;
	}
	
	public static String getAreaName()
	{
		return areaName;
	}
	
	public static String getPersonName()
	{
		return personName;
	}
	
	public static String getDescription()
	{
		return description;
	}
	
}

