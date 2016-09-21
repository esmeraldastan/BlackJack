
/**
 * Write a description of class HandCards here.
 * 
 * @author Esmeralda 
 * @version 9.16.16
 */
import java.lang.Math;
import java.util.Scanner; 
public class HandCards{
    int numCards;
    int numCards2;
    int dealerHand;
    int dealerHand2;
    int totaldeal; 
    int total;
    public HandCards(){
        numCards = (int)(Math.random()*10 + 1);
        numCards2 = (int)(Math.random()* 10 + 1);
        
        dealerHand = (int)(Math.random()* 10 + 1);
        dealerHand2 = (int)(Math.random()* 10 + 1);

        //total of 2 cards 
        total = numCards + numCards2;
        totaldeal = dealerHand + dealerHand2;
    }
    public int hit(){
        int card = (int)(Math.random()*10 + 1);
        total += card;
        return card;
    }
    public int hit2(){
        int card2 = (int)(Math.random()*10 + 1);
        totaldeal += card2;
        return card2;
    }
}
