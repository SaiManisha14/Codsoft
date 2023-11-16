import java.util.Scanner;
public class NumberGame{
    public static void main(String[] args){
        System.out.println("Heyy,pick a number between 1 to 100");
           Scanner sc1 = new Scanner(System.in); 
           boolean playAgain;
           do {
              playGame();  
              System.out.println("Would you like to play again?Y/N");
              playAgain = sc1.nextBoolean();  
              } 
              while (playAgain);
               System.out.println("Thanks for playing.Goodbye.");
   }         

         static void playGame() {
            int randnum,Guess;       
            int guessCount=0;      
            randnum = (int)(100 * Math.random()) + 1;
            System.out.println("What is your first guess?");
            Scanner sc= new Scanner(System.in);   
            while (true) {
               Guess = sc.nextInt();  
               guessCount++;
               if (Guess == randnum) {
                  System.out.println("You're correct,Congo!");
                  break;  
               }
               if (guessCount == 6) {
                  System.out.println("You didn't get the number in 6 guesses.");
                  System.out.println("You lose.  My number was " + randnum);
                  break;  
               }
               if (Guess < randnum)
                  System.out.println("That's too low.  Try again:");
               else if (Guess > randnum)
                  System.out.println("That's too high.  Try again:");
            }
            System.out.println();
        } 
                    
     } 