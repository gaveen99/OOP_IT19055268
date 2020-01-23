class squareroot
{
    public static void main(String [] args)
    {
        System.out.println("enter number");
       int ip=Integer.parseInt(args[0])
        double square=Math.pow(ip,2);
        double sqroot=Math.sqrt(ip);
        System.out.println("The square is "+square);
        System.out.println("The Root is "+sqroot);


        
    }
}