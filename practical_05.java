import java.util.Scanner;
import java.util.Random;
public class guessnumber
{
    public static void main(String[]args)
    {
        int i=0;
        Random r = new Random();
        int random = r.nextInt(100);
        //System.out.println("random number is :"+random);

        System.out.println("Guess any number");
        Scanner sc = new Scanner(System.in);

        
        while(i<=100)
        {
            int userinput = sc.nextInt();

            if(userinput==random)
            {
                System.out.println("Congralautions!! you have guessed correct number in "+(i+1)+ " attempts");
            }
            
            else if(userinput<random)
            {
                System.out.println("you have guess smaller number");
            }
            else
            {
                System.out.println("you have choosen larger number");
            }
            i++;
        }
    }
}
