import java.util.Scanner;
class circle
{
    public static void main(String [] args)
    {
	    Scanner i=new Scanner(System.in);
	    System.out.println("Enter the radius");
	    double radius=i.nextDouble();
	    double area=Math.PI*Math.pow(radius,2);
	    System.out.println("The area is : "+area);
	    double circum=2*Math.PI*radius;
	    System.out.println("The circumference is : "+circum);

    
    }
	    



}
