package model;

public class mop
{
	//----------declaration section---------
	private String name;
	private double legCount;
	private int eyeCount;
	private boolean hasNoses;
	private int armCount;
	
	public mop()
	
	{
// default constructor
		// generally boring and not helpful
		
	}
	
	public mop(String name)
	{
		this.name = name;
}
public mop(String name, double legCount, int eyeCount, boolean hasNose, int arms)
{
	this. legCount = legCount;
	this. eyeCount = eyeCount;
	this. hasNoses = hasNose;
	this. armCount = arms;
	
}
public String toString()
	
	{
			String description = "this monster named" + name + "and it has" + legCount + "legs....." + "its favorite silly thing yo say is " + "You know what they say you aint a chesnut until you've shaken the hand of a jimmy";
			
			return description;
		}
		
}
