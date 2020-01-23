import java.util.Scanner;
class items
{
	public static void main(String[]args)
	{
		Scanner i=new Scanner(System.in);
		System.out.println("Insert the item name");
		String item_name =i.nextLine();
		System.out.println("Enter the unit price");
		double unit_price=i.nextDouble();
		System.out.println("Enter the quantity");
		double quantity=i.nextDouble();
		double total=unit_price*quantity;
		System.out.println("Total cost will be "+total);


	
	}

}
