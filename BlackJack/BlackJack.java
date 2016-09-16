
/**
 * Write a description of class BlackJack here.
 * 
 * @author Esmeralda 
 * @version 9.13.16
 */
import java.lang.Math;
public class BlackJack{
   public static void manin(String[] args){
    
    HandCards cards = new HandCards();
    
    
       
    System.out.println("Welcome To The Game Of Black Jack!");
    
    System.out.println("You have: "  + numCards.HandCards() + " and " + numCards2);
    System.out.println("Your total is: "+ totalNum ); 
    System.out.println("The dealer has :" + dealerHand + " and " + "#" );
    
    
    while (totalNum < 21){
          Scanner input = new Scanner(System.in);
          System.out.println("What you like to do: hit or stay");
          String command = input.next(); 
          if ("hit".equals(command)){
              System.out.println(numCards3);
              
          }
          if ("stay".equals (command)){
              System.out.println("Okay");
    
  
           }
      
        
       
    }
   }
}

