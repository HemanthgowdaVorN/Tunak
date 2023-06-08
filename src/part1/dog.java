package part1;

public class dog {
	String name;
	String breed;
	int age;
	String color;
	public dog(String name , String breed,int age , String color) {
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.color = color;
	}
	public String get_name()
	{
		return name;
	}
	public String get_breed()
	{
		return breed;
	}
	public int get_age()
	{
		return age;
	}
	public String get_color()
	{
		return color;
	}
	public String toString () 
	{
		return("Hi my name is "+this.get_name() +" my breed,age and color are "+this.get_breed()+" "+this.get_age()+" "+this.get_color());
	}
	public static void main(String args[])
	{
		dog tony = new dog("tony","quasont",5,"white");
		System.out.println(tony.toString());
	}
}
