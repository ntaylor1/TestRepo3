/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpaperscissors;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author n8thegr8
 */
public class RockPaperScissors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int rounds;
        int player1choice;
        int player2choice;
        boolean keepPlaying;
        int userwincounter = 0;
        int tiecounter = 0;
        int randwincounter = 0;
        
        Random rand = new Random();
        
        do{
            keepPlaying = false;
            System.out.println("How many rounds do you want to play?");
            rounds = input.nextInt();
            
           
        if(rounds < 11 && rounds > 0)
        {
            for(int i = 0; i < rounds; i++)
            {
                System.out.println("If you choose rock, enter 1. If you choose paper, enter 2. If you choosse scissors, enter 3.");
                player1choice = input.nextInt();
                player2choice = rand.nextInt(3) + 1;
                if(player1choice == player2choice){
                    tiecounter++;
                    System.out.println("Player 2 made the same choice, this round is a draw.");
                }
                else{
                if(player1choice == 1)
                {
                    if(player2choice == 3)
                    {
                        System.out.println("Player 2 selected scissors, you win");
                        userwincounter++;
                    }
                    else 
                    {
                        System.out.println("Player 2 selected paper, you lose");
                        randwincounter++;
                    }
                        
                }
                if(player1choice == 2)
                {
                    if(player2choice == 1){
                        System.out.println("Player 2 selected rock, you win");
                        userwincounter++;
                    }
            
                    else
                    {
                        System.out.println("Player 2 selected scissors, you lose");
                        randwincounter++;
                    }
                }
                if(player1choice == 3)
                {
                    if(player2choice == 2)
                    {
                        System.out.println("Player 2 selected paper, you win");
                        userwincounter++;
                    }
                        
                    else
                    {
                        System.out.println("Player 2 selected rock, you lose");
                        randwincounter++;
                    }
                        
                }
               }
            }
            
            System.out.println("Number of ties: " + tiecounter);
            System.out.println("Player 1 wins: " + userwincounter);
            System.out.println("Player 2 wins: " + randwincounter);
            if(userwincounter > randwincounter)
                System.out.println("Overall winner: Player 1");
            if(userwincounter < randwincounter)
                System.out.println("Overall winner: Player 2");
            if(userwincounter == randwincounter)
                System.out.println("The game ended in a draw.");
        }
        
        else
            System.out.println("Invalid number of rounds entered");
        
        
        
        
          
        System.out.println("Do you want to keep playing? Enter 1 for yes or 0 for no: ");
        if(input.nextInt() == 1)
            keepPlaying = true;
            
        userwincounter = 0;
        tiecounter = 0;
        randwincounter = 0;
        
        
        }
        while(keepPlaying);
        
        System.out.println("Thanks for playing!");
        
    }
    
}
