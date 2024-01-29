package ie.tudublin;

public class Cat
{
	String name;
    private int numOfLives;
	
	public void setName(String name)
	{
		this.name = name;
	}


	public Cat()
	{
		this.name = "rescue puppy";
	}
	
	// A constructor that takes name
	public Cat(String name)
	{
		this.name = name;
        this.numOfLives = 9;
	}
    public int getNumOfLives() {
        return numOfLives;
    }

	// A method
	public void speak()
	{
		System.out.println("Woof. I am " + name);
	}

    public void kill() {
        if (numOfLives > 0) {
            numOfLives--;
            System.out.println("Ouch!");
        } else {
            System.out.println("Dead");
        }
    }
}