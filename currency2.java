import java.util.Scanner;
class currency
{
	public static void main(String[]args)
	{
		Scanner i=new Scanner(System.in);
		System.out.println("Enter the amount in LKR");
		int amount=i.nextInt();
		System.out.println("");
		double usd=amount/182.26;
		double pounds=amount/222.74;
		double euros=amount/206.36;
		System.out.println(+amount+" LKR  =" +usd+" $");
		System.out.println(+amount+" LKR  = "+pounds+" Pounds");
		System.out.println(+amount+" LKR  =" +euros+ "Euros");




	
	}

}
