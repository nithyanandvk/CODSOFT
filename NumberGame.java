import java.util.*;
public class NumberGame {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random random = new Random();        
        int lowerRange = 1;
        int upperRange = 100;
        int maxAttempts = 9;
        int totalAttempts = 0;
        int totalRounds = 0;        
        boolean playnext = true;        
        System.out.println("Welcome to the Number Guess Game!!!");        
        while (playnext) {
            int numberToBeGuessed = random.nextInt(100);
            int attempts = 0;            
            System.out.println("The number generated is between " + lowerRange + " and " + upperRange + ".");
            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int playerGuess = sc.nextInt();
                attempts++;
                totalAttempts++;                
                if (playerGuess == numberToBeGuessed) {
                    System.out.println("Congrats! You guessed the number correctly in " + attempts + " attempts.");
                    break;
                } else if (playerGuess < numberToBeGuessed) {
                    System.out.println("Your guessed number is less than target Try again.");
                } else {
                    System.out.println("Your guessed number is more than target Try again.");
                }
            }           
            if (attempts == maxAttempts) {
                System.out.println("Sorry, maximum number of attempts is completed . The number was " + numberToBeGuessed );
            }            
            totalRounds++;            
            System.out.print("Will you play again? (yes/no): ");
            String reply = sc.next();
            playnext = reply.equalsIgnoreCase("yes");
        }        
        System.out.println("Game Ended");       
        int userScore=(totalRounds*1000)-(totalAttempts*100);
        System.out.println("user Score is :" + userScore);
        System.out.println("Thank you!!!");        
        sc.close();
    }
}
