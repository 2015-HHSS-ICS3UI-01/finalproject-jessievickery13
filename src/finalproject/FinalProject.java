/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.util.Scanner;

/**
 *
 * @author vickj2854
 */
public class FinalProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Title of game is: Guess that Number!
        
        // Start by creating the scanner
        
        Scanner input = new Scanner(System.in);
        
        // Level 1 (out of 25) create a random #
       
        int randomNumber1 = (int) (Math.random() * 25) + 1;
        
        // make player choose between 1 and 25 until correct
        
        int timesAnswered1 = 0;

        while(true) {
            
             timesAnswered1 = timesAnswered1 + 1;
            System.out.println("Level 1: Choose a number between 1 and 25 please.");
            int guess1 = input.nextInt();
       
            if(guess1 == randomNumber1) {
                
                System.out.println("You guessed the number correctly! You guessed " + timesAnswered1 + " times");
                break;
            } else if (guess1 > randomNumber1) {
                
                // guess is too high
                
                System.out.println("Sorry, guess is too high.");
                
            } else if (guess1 < randomNumber1) {
                
                // guess is too low
                
                System.out.println("Sorry, guess is too low.");
                
            }
        }
                // Level 2 (out of 50) create a random #
                
                int randomNumber2 = (int) (Math.random() * 50) + 1;
                
                // make player choose between 1 and 50 until correct
                
                int timesAnswered2 = 0;
                
                while(true) {
                     timesAnswered2 = timesAnswered2 + 1;
                    
                    System.out.println("Level 2: Choose a number between 1 and 50 please.");
                    int guess2 = input.nextInt();
                    
                    if(guess2 == randomNumber2) {
                        System.out.println("You guessed the number correctly for the second time! You guessed " + timesAnswered2 + " times" + "Very nice.");
                        break;
                    } else if (guess2 > randomNumber2) {
                        
                        // guess is too high
                        
                        System.out.println("Sorry, guess it too high.");
                    } else if (guess2 < randomNumber2) {
                        
                        // guess is too low 
                        
                        System.out.println("Sorry, guess is too low.");
                        
                    }
                }
                
                // Level 3 (out of 75) create a random # 
                
                int randomNumber3 = (int) (Math.random() * 75) + 1;
                
                //make player choose between 1 and 75 until correct
                 int timesAnswered3 = 0;
                 
                while(true) {
                    timesAnswered3 = timesAnswered3 + 1;
                    
                    System.out.println("Level 3: Choose a number between 1 and 75 please.");
                    int guess3 = input.nextInt();
                    
                    if(guess3 == randomNumber3) {
                        System.out.println("You guessed the number correctly for the third time! You guessed " + timesAnswered2 + " times" + "Wow.");
                        break;
                    } else if (guess3 > randomNumber3) {
                        
                        // guess is too high
                        
                        System.out.println("Sorry, guess is too high.");
                    } else if (guess3 < randomNumber3) {
                        
                        // guess is too low
                        
                        System.out.println("Sorry, guess is too low.");           
                        
                    }    
                }
                
                // Level 4 (out of 100) create a random #
                
                
                 int randomNumber4 = (int) (Math.random() * 100) + 1;
                 
                //make player choose between 1 and 100 until correct
                 int timesAnswered4 = 0;
                while(true) {
                     timesAnswered4 = timesAnswered4 + 1;
                     
                    System.out.println("Level 4: Choose a number between 1 and 100 please.");
                    int guess4 = input.nextInt();
                    
                    if(guess4 == randomNumber3) {
                        System.out.println("You guessed all the numbers correctly! You guessed " + timesAnswered2 + " times" + "Great job.");
                        break;
                    } else if (guess4 > randomNumber4) {
                        
                        // guess is too high
                        
                        System.out.println("Sorry, guess is too high.");
                    } else if (guess4 < randomNumber4) {
                        
                        // guess is too low
                        
                        System.out.println("Sorry, guess is too low."); 
                        
                    } 
                }
                
                // Guess That Number! game finished
                
                
                
                
                
                                   
            
           
            
                
        
        
        
        
        
        
        
        
                
                
                
                
        
        
        
                
        
                
    }
}
