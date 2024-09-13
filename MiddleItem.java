package MiddleItem;

import java.lang.classfile.instruction.StackInstruction;
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
      if(count > 9) {
        System.out.println("Too many numbers");
      }
      else if (count > 0){
        for(int i = 0; i < count; ++i){
            System.out.print(userValues[i] + " ");
        }
        int midIndex = count / 2;
        System.out.println("Middle item: " + userValues[midIndex]);

      }

   }
}
