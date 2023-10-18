package _GreedyAlgorithms;

import java.util.Arrays;


/
public class IntervalSchedulingProblem {


    public static void doTrainScheduling(int N, int [] arivalTime, int [] depatureTime)
    {
        // int[] arrivalTime  ={900,940,1100,1500,1800}
        // int [] departureTime = {910,1200,1120,1130,1900,2000};


        int i,j, counter =1;
        i=0;

        System.out.println(i);

        // for rest

        for (j=1;j<N;j++)
        {
            System.out.println(" "+ j);
            i=j;
            ++counter;
        }
    }
   public static int Minimumplatform(int n,int[] arivalTime , int [] departureTime)
   {
       Arrays.sort(arivalTime);
       Arrays.sort(departureTime);

       int platform  =0 ;
       int maxPlatform =0;


       int arrivalPointer  = 0;
       int departurePointer = 0 ;

       while(arrivalPointer<arivalTime.length && departurePointer < departureTime.length)
       {

       }
   }
    public static void main(String[] args) {

    }
}
