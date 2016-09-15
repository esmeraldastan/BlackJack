
/**
 * Write a description of class Player here.
 * 
 * @author Esmeralda
 * @version 9.14.16
 */
import java.lang.Math;
import java.util.Scanner; 
public class Player{
    public void main(String[] args){
      // value of the 2 cards printed ou 
      int numCards = (int)(Math.random()*11 + 1);
      int numCards2 = (int)(Math.random()* 11 + 1);
      int numCards3 = (int)(Math.random()* 11+1 ); 
      //dealers hand
      int dealerHand = (int)(Math.random()* 11 + 1);
      int dealerHand2 = (int)(Math.random()* 11 + 1); 
       
      
      //total of 2 cards 
      int totalNum = (int)numCards + numCards2 * 1;
      
      
      //print info
      
      
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
