/*
Name: Amil Patel
Class section: 5994
Instructor: Kyla McMullen
Due date: November 15, 2016
Brief Description: Class for Pokedex Object
*/

public class Pokedex {
	
	static int counter = 0;
	Pokemon [] pokemonArray;
	
	public Pokedex(int size)
	{
		pokemonArray = new Pokemon[size];
	}
	
	public String [] listPokemon()
	{
		String [] list = new String [counter];
		
		for(int i = 0; i < counter; i++ )
			list[i] = pokemonArray[i].getSpecies();
		
		if(list.length == 0)
			return null;
		
		return list;
	}
	
	public boolean addPokemon(String Species)
	{
		for(int i = 0; i < counter; i++)
		{
			if(Species.equalsIgnoreCase(pokemonArray[i].getSpecies()) == true )
			{
				System.out.println("Duplicate");
				return false;
			}
		}
			
		if (pokemonArray.length == counter)
		{
			System.out.println("Max");
			return false;
		}
		
		else
		{
			pokemonArray[counter] = new Pokemon(Species);
			counter++;
			return true;
		}
		
	}
	
	public int[] checkStats(String species)
	{
		int [] stats = new int [3];
		
		for(int i = 0; i < counter; i++)
		{
			if(species.equalsIgnoreCase(pokemonArray[i].getSpecies()) == true )
			{
				stats [0] = pokemonArray[i].getAttack();
				stats [1] = pokemonArray[i].getDefense();
				stats [2] = pokemonArray[i].getSpeed();
				
				return stats;
			}
		}
		
		return null;
	}
	
	public void sortPokemon()
	{
		for(int i = 0; i < counter; i++)
		{
			int alpha = i;
			
			for(int j = i; j < counter; j++)
			{
				if(pokemonArray[j].getSpecies().compareToIgnoreCase(pokemonArray[alpha].getSpecies()) < 0)
					alpha = j;
			}
			
			String temp = pokemonArray[i].getSpecies();
			pokemonArray[i] = new Pokemon(pokemonArray[alpha].getSpecies());
			pokemonArray[alpha] = new Pokemon(temp);	
		}
	}
}
