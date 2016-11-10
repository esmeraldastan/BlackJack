
/**
 * Write a description of class GR here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GR{
    public static void main(){
        try{
            System.out.println(Notes.score(91));
            System.out.println(Notes.score(81));
            System.out.println(Notes.score(-51));
        }catch (Exception errorName){
            System.out.println("Error: " + errorName);
    
       }
   }
}
