public class IT26102739Lab2Q2
{
	public static void main (String[]args)
	{
		double perimeterSquare, circumferenceCircle, radius, length;
		double pi=22/7;
		length=10;
		perimeterSquare=4*length;
		circumferenceCircle=perimeterSquare;
		radius=circumferenceCircle/(2*pi);
		System.out.println("Radius of the circular fence:" + radius);
	}
}