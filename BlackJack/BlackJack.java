
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
    
    //intro to second class
    HandCards cards = new HandCards();
    HandCards hit = new HandCards();
    
    
    System.out.println("Welcome To The Game Of Black Jack!");
    System.out.println("");
    // print out cards
    System.out.println("You have " + cards.numCards + " and " + cards.numCards2 );
    System.out.println("Your total value is: " + cards.total); 
    System.out.println("The dealer has: " + cards.dealerHand + " and " + "# " );
    
    //while loop
    while (cards.total <= 21){
         Scanner input = new Scanner(System.in);
         System.out.println("What you like to do: hit or stay");
         String command = input.next(); 
         
         if ("hit".equals (command)){
             System.out.println("Now you have: " +  cards.numCards + " , " + cards.numCards2 + "," + " and " + cards.hit());
             System.out.println("Your total is now: " + cards.total);
             if (cards.total > 21){
                    System.out.println("Haha better luck next time!!");   
                }
                 if (cards.total == 21){
              System.out.println("WHAT?!?! Great you won!");
             }
      }
         else if("stay".equals(command)){
            System.out.println("The dealer reveals the second card: " + cards.numCards2 );
            System.out.println("The dealer now has: "  + cards.numCards + "and " + cards.numCards2);
            System.out.println("The dealer's total is now: " + cards.total ); 
            System.out.println("...");
            if (cards.totaldeal <= 17){
                System.out.println("Dealers new card is; " + cards.hit2());
                System.out.println("New total is:" + cards.totaldeal);
            
            while (cards.totaldeal < 17){
                System.out.println("The dealer now has: " + cards.hit2());
                System.out.println("The dealer's total is now: " + cards.totaldeal);
          }  
          if ("quit".equals(command)){
             System.exit(0);
           }
        }
      }
    }
  }
}

    
      
   
