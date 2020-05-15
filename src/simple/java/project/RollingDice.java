
package simple.java.project;

import java.util.Random; //using random number generator


public class RollingDice {
    
  public static void main(String[] args){
      Random rand = new Random();
      int result = rand.nextInt(7);
      System.out.println("you rolled: "+ result);
  }  
}
