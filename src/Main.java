

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Accomplished using the EduTools plugin by JetBrains https://plugins.jetbrains.com/plugin/10081-edutools
 */

public class Main {
   public static void main(String[] args) throws Exception{
/*
      System.out.println("hello");
      Scanner input = new Scanner(System.in);
      System.out.println(input.hasNextLine());
      input.close();
      System.out.println("hello");
*/

      Scanner input = new Scanner(System.in);
      int doorNumber;
      int sealNumber;


      String str;

      int amtOfDoors = input.nextInt();

      //test only
      System.out.println("There are "+ amtOfDoors +" doors.");

      for (doorNumber=1; doorNumber<=amtOfDoors; doorNumber++){


         System.out.println("");
         int amtOfSeals=input.nextInt();
         List seals = new ArrayList();
         List needed = new ArrayList();
         String out = "";
         //this runs for each door
         for (sealNumber=1; sealNumber<=amtOfSeals; sealNumber++){


            seals.add(input.nextInt());
            if (sealNumber%2==0){
               needed.add(seals.get(sealNumber - 1));
               needed.add((-1) * (int) seals.get(sealNumber - 2));
            }

            //System.out.println("Door "+doorNumber+" seal "+sealNumber+":  "+input.nextInt());

         }


         System.out.println(seals.toString());
         System.out.println(needed.toString());
         for(Object i:needed) {
            out += (int) i +" ";
         }
         //needed.forEach(i -> out += i+" ");
         out = out.substring(0, out.length() - 1);


      }



      while (input.hasNext()) {


         int amtOfSeals = input.nextInt();


      }

         input.close();



      /*
      try {


         if (input.hasNext()){
            int amtOfDoors = input.nextInt();
            System.out.println("There are "+ amtOfDoors +" doors.");
         }else{
            throw new NullPointerException("???");
         }

      }catch(Exception e){
         throw new InputReadException("Step one failed: " + e );
      }

      try {

         if (input.hasNext()){
            String nums = input.nextLine();
            inputList = Arrays.asList(nums.split(" "));
            System.out.println(inputList.get(0));
            System.out.println(inputList.get(1));
         }else{
            throw new NullPointerException("???");
         }

      }catch(Exception e){
         throw new InputReadException("Step two failed: " + e );
      }
   */
   /*
      while (input.hasNext()){
         System.out.println(input.next());

      }
  */

   }
}