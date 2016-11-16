
/**
 * Write a description of class Array here.
 * 
 * @author Esmeralda Lopez
 * @version 11.14.16
 */
public class Array{
    int[] array = { 3,4,7,9,5,0};
    public Array(){
        //We just need a blank constructor 
     }
    public void addNum(int num, int index){
        for ( int i = array.length-1; i> index; i--){
            array[i] = array[i-1];
        }
        array[index] = num;
          /*
         * if i call addNum(9,3)
         * I will have the array 3,4,7,9,9,5 ---> 3,4,7,x,9,5
         */
    }
    public void removeNum(int index){
        for (int i = index; i < array.length - 1; i++){
            array[i] = array[i+ 1];
        }
        array[array.length -1] =0;
        /*
         * If I call removeNum(2)
         * I will get 3,4,9,0,0
         */
    }
}
