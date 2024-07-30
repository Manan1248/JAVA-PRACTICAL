import java.util.Scanner;
class practical3
{
    public static void main(String[]args)
    {
        System.out.println("Enter the mobile number in format of +91 12 345 67890");
        Scanner sc = new Scanner(System.in);
	String i=sc.nextLine();
        
        System.out.print("op code:");

            for (int j=0;j<2;j++)
{
		System.out.print(i.charAt(j));
                
}

 System.out.print("msc code:");

            for (int j=2;j<5;j++)
{
System.out.print(i.charAt(j));

}

System.out.print(" subscriber code:");

            for (int j=5;j<=9;j++)
{
System.out.print(i.charAt(j));

}
}
}
