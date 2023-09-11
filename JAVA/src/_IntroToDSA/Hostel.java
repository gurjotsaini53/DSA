package _IntroToDSA;
import javax.swing.*;
import java.util.Map;
import java.util.List;

import java.util.Scanner;
public class Hostel {


    private static Scanner input;
   private boolean isRoomAvailble;
   private int studentAdded=0;

   private int totalRooms =5 ;

   private Map<Integer,List<String>> Listobj;
   private List<String> list;
   private int N;

    static {
        input = new Scanner(System.in);
    }

     public Hostel()
     {
         System.out.println("Enter Number of Students");
         N = input.nextInt();

         int i=0;
         while (i<N)
         {
            String name = in.nextLine();
         addStudent(name);
         i++;

         }
     }

    private boolean isRoomAvailble()
     {
         if (studentAdded<totalRooms)
         {
             return true;
         }
         else return false;
     }

     private void addStudent(String name)
     {
         int i=0;
         while (i<N)
         {
             if(isRoomAvailble())
             {
                 System.out.println((++i)+ ". Student Added");
                 studentAdded++;
                 list.add(name);

             }
             else {

                 System.out.println("can't add " +(++i) + " student (No more room Available)");

                 break;
             }
         }
     }

    public static void main(String[] args) {


        Hostel obj = new Hostel();
    }

}
