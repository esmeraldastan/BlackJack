
/**
 * Write a description of class HandCards here.
 * 
 * @author Esmeralda 
 * @version 9.16.16
 */
import java.lang.Math;
import java.util.Scanner; 
public class HandCards{
    
    
     int numCards = (int)(Math.random()*11 + 1);
     int numCards2 = (int)(Math.random()* 11 + 1);
    
    //dealers hand
     int dealerHand = (int)(Math.random()* 11 + 1);
     int dealerHand2 = (int)(Math.random()* 11 + 1); 
       
      
    //total of 2 cards 
     int totalNum = (int)numCards + numCards2 * 1;
    
  
}
