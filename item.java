import java.util.Scanner;
class item
{
	public static void main(String []args)
	{
		Scanner i=new Scanner(System.in);
		System.out.println("Enter the item name");
		String item=i.nextLine();
		System.out.println("Enter unit price");
		float unit=i.nextFloat();
		System.out.println("Enter the quantity");
		int quantity=i.nextInt();
		double total=unit*quantity;
		System.out.println("Total cost will be : "+total+" rupees");

		


	
	}

}
