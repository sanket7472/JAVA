class Population 
{
	public static void main(String[] args) 
	{
		long currPopulation = 312032486;
		long seconds = (365*24*60*60)*5;
		long newBirth = seconds/7;
		long death = seconds/13;
		long migrated = seconds/45;

		long newPopulation = currPopulation + newBirth + migrated - death;
		System.out.println("Predicted Population after 5 years by Census :" + newPopulation );
	}
}
