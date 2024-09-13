package MiddleItem;

import java.util.Scanner; 

public class MiddleItem {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] userValues = new int[9]; 
      int count = 0;    

      for(int i = 0; i < userValues.length; ++i) {
        userValues[i] = scnr.nextInt();

        if(userValues[i] < 0){
            System.out.println(userValues[i] + " is not positive");
            break;
        }
        count++;
        System.out.println("count: " + count);

      }
   }
}
