/*
Name: Amil Patel
Class section: 5994
Instructor: Kyla McMullen
Due date: November 15, 2016
Brief Description: Class for Pokemon object
*/

public class Pokemon {
	
	String species;
	int attack;
	int defense;
	int speed;
	
	public Pokemon(String species)
	{
		setSpecies(species);
		
		setAttack(getSpecies().length() * 4 + 2);
		
		setDefense(getSpecies().length() * 2 + 7);
		
		setSpeed(getSpecies().length() * 3 + 5);
	}
	
	public void grow(int boost)
	{
		attack += boost;
	}
	
	public void harden(int boost)
	{
		defense += boost;
	}
	
	public void haste(int boost)
	{
		speed += boost;
	}
	
	public void setSpecies(String spc)
	{
		species = spc;
	}
	
	public String getSpecies()
	{
		return species;
	}
	
	public int getAttack()
	{
		return attack;
	}
	
	public void setAttack(int atk)
	{
		attack = atk;
	}
	
	public int getDefense()
	{
		return defense;
	}
	
	public void setDefense(int def)
	{
		defense = def;
	}
	
	public int getSpeed()
	{
		return speed;
	}
	
	public void setSpeed(int spd)
	{
		speed = spd;
	}
	
}
