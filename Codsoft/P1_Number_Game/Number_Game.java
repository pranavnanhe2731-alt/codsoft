import java.util.Random;
import java.util.Scanner;
public class Number_Game{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Random rand= new Random();
        int UserScore=0;
        int limit=10;
        boolean correctGuess=false;

        System.out.println("\n *******_WELL COME TO THE NUMBER GAME_*******");
        System.out.println("NOTE: You Have Only 10 Attempts In Each Round");

        System.out.print("\n  Enter number of round you want to play:-");
        int rounds=sc.nextInt();

         for (int i=1;i<= rounds;i++){  
            System.out.println("\n\t !...START ROUND "+i+"...!");
            int attempt=0;
            int gNum=rand.nextInt(100)+1;
            while(attempt<limit){
                System.out.print("\tGuess The Number : ");
                int guess=sc.nextInt();
                attempt++;
                if(guess<gNum){
                    System.out.println("\t\tIts To Low...");         
                }
                else if (guess>gNum){
                    System.out.println("\t\tIts To High...");
                }
                else if(guess==gNum){
                    System.out.println("\t\t\nCongratulation....\n\t!...Your Guess Is Correct...!");
                    System.out.println("\tYou Win Round "+i+" In "+attempt+" Attempts");
                    correctGuess = true;
                    UserScore++;
                    break;
                }
            }
            if(!correctGuess){
                if(i==rounds && UserScore==0 ){
                    System.out.println("\n\tYou Lose All Round");
                }
                else{
                System.out.println("\n\tYou lose round "+i+".....\n\tTry In Next Round");
                System.out.println("The number is  "+gNum);
                attempt=0;
                }
            }            
        }       
            System.out.println("\n\t====GAME IS OVER====");
            System.out.println("\t---The Final Result Is---");
            System.out.println(" \t Total Rounds Are : "+rounds);
            System.out.println(" \t Your Score Is : "+UserScore+"/"+rounds);    
          sc.close();
    }       
}
