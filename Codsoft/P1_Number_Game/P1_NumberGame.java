import java.util.Random;
import java.util.Scanner;
public class P1_NumberGame 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Random rand= new Random();
        System.out.println("!.....Well come to the Number Game....!\nThe Random Number will be genarated\nyou have to guess the number");

        System.out.println("Enter number of round you want to play...");
        int rounds=sc.nextInt();
        int UserScore=0;
        int Tattempt=rounds*10;
        int attempt=0;
        int guess=0;
        int gNum=rand.nextInt(100)+1;
        System.out.println("You have a "+rounds+" rounds and "+Tattempt+" Attempts");
        for (int i=1; i <= rounds;i++){
            
            System.out.println("! ...Round "+i+"...!");
            
            
             while(guess != gNum ){
                while( attempt!=5){
                System.out.println("Enter your guess number from 1 to 100");
                guess = sc.nextInt();
                if(guess<gNum){
                    System.out.println("Its to low....");
                }
                else if(guess > gNum){
                    System.out.println("Its too high....");
                }
                else if(guess == gNum){
                    System.out.println("congratulations!\n you guessed number is correct... ");
                      UserScore++;
                }
                attempt++;
            }
        }
            
    }
        if(guess!=gNum){
            System.out.println("You lose...");
        }
            System.out.println("total attempt are : "+attempt);
            System.out.println("Total Attempt are :-"+rounds);
            System.out.println("Your score is :-"+UserScore);    
          sc.close();
    }       
}

