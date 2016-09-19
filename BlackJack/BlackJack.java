
/**
 * Write a description of class BlackJack here.
 * 
 * @author Esmeralda 
 * @version 9.13.16
 */
import java.lang.Math;
import java.util.Scanner; 
public class BlackJack{
   public static void manin(String[] args){
    
    HandCards cards = new HandCards();
    
    
    System.out.println("Welcome To The Game Of Black Jack!");
    System.out.println("");
    System.out.println("You have " + cards.numCards + " and " + cards.numCards2 );
    System.out.println("Your total value is: " + cards.totalNum); 
    System.out.println("The dealer has: " + cards.dealerHand + " and " + "# " );
    
    while (cards.totalNum < 21){
         Scanner input = new Scanner(System.in);
         System.out.println("What you like to do: hit or stay");
         String command = input.next(); 
         if ("stay".equals(command)){
              System.out.println(" Alright then....");
              System.out.println(" The dealder has: " + cards.dealerHand + " and " + cards.dealerHand2);
              
          }
         if ("hit".equals (command)){
             System.out.println("Now you have: " +  cards.numCards + ", " + cards.numCards2 + ", " + "and " + cards.numCards3);
             System.out.println("Your total is now: " + cards.total);
    
  
           }
         if ("done".equals(command)){
             System.exit(0);
      }
    
    }
  }
}

