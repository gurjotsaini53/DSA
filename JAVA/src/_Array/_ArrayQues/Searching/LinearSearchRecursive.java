package _Array._ArrayQues.Searching;

import java.util.Scanner;

public class LinearSearchRecursive {


        public static int LinearSearchRecursive(int s , int e, int arr[], int key)
        {
           if (s<=e)
           {
               if (arr[s]==key) return s;
              return LinearSearchRecursive(s+1,e,arr,key);
           }
           return -1;
        }
        public static void main(String[] args)
        {
            Scanner inp = new Scanner(System.in);
            int size = inp.nextInt();
            int arr[] = new int[size];
            for (int i=0;i<size;i++)
            {
                arr[i]=inp.nextInt();
            }

            int key= inp.nextInt();

            int ans = LinearSearchRecursive(0,size-1,arr,key);

            if (ans==-1) System.out.println("Element not found");
            else System.out.println("Element found at " + ans + " index");

        }
    }


