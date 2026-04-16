 							//constructor chaining
public class Pokemon    
{
	String Name;
	int Health;
	int Power;

	public Pokemon(String Name, int Health, int Power)  //constructor created
	{
		this(Power);  //this.Power=Power;-->this can also be used also works but since this is an example of constructor chaining.
		this.Name=Name;
		this.Health=Health;
		
	}

	public Pokemon(int Power)  //constructor created
	{
		this.Power=Power;
	}

        public void display()
	{
		System.out.println("Name is "+Name);
		System.out.println("Health is "+Health);
		System.out.println("Power is "+Power);

	}

	public static void main(String args[])
	{
		Pokemon p1=new Pokemon("Pikachu",100,110); //object for 1st pokemon
		Pokemon p2=new Pokemon("Bulbasaur",100,103); //object for 2nd pokemon

		p1.display();
		p2.display();
	}
}


//flow of program how jvm is moving from where to where