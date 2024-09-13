package MiddleItem;

import java.lang.classfile.instruction.StackInstruction;
import java.util.Scanner; 

public class MiddleItem {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] userValues = new int[9]; 
      int count = 0;    

      while(scnr.hasNextInt()){
        int input = scnr.nextInt();

        if(input < 0){
            break;
        }

        if(count >= 9) {
            System.out.println("Too many numbers");
            scnr.close();
            return;
        }

        userValues[count] = input;
        count++;
        System.out.println("count: " + count);
      }
      
      if (count > 0){
        int midIndex = count / 2;
        System.out.println("Middle item: " + userValues[midIndex]);

      }

   }
}
