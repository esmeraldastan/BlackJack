
/**
 * Write a description of class Notes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Notes{
    public static String score(int percent)throws Exception{
        if (percent < 0 ) {     
            throw new Exception("You apparently cannot count");
        }
        if (percent > 90){
            return "A";
        }
        else if (percent > 80){
            return "B";
        }
        else if (percent > 70){
            return "C";
        }
        else if (percent > 60){
            return "D";
        }
        else{
            return "F";
        }
    }
   
}
