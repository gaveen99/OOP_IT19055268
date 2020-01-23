import java.util.Scanner;
class currency
{
	public static void main(String[] args)
	{
		Scanner i=new Scanner(System.in);
		System.out.println("Enter the amount");
		double currency=i.nextDouble();
		double dollar=currency/182.26;
		double pound=currency/222.74;
		double euro=currency/206.36;
		System.out.println("5000 LKR in USD= "+dollar);
		System.out.println("5000 LKR in Pounds = "+pound);
		System.out.println("5000 LKR = Euros "+euro);


	
	}
}
