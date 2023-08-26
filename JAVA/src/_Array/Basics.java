package _Array;
import java.util.*;
public class Basics {
    public static void main(String[] args)
    {
        // syntax
        // datatype [] varible_name = new datatype[size];
        // store 5 numbers:

        int [] numbers = new int[5] ; // instanting array
        int [] number1 = {1,2,3,4,5}; // heap


        // declaration
        int [] arr1;
        int [] arr2;

        // diff arr
        byte ByteArray[];
        short ShortArray[];
        int IntArray[];
        boolean BooleanArray[];
        char CharArray[];
        long LongArray[];
        double DoubleArray[];
        float FloarArray[];



        // Intantiating an array in java

        int arr[] ; // only reference is created or array is declared
        arr = new int[5] ; // arr is linked to a memory location in heap

        // syntax
        // type var_name = new type[size];


        // Array Literals

        int [] arr4 = new int [] {1,2,4,5,6,7,7,8};
//        or

        int arr5[] = {1,3} ;// we need not to write new in this literal but array is placed in heap

        for(int x:arr5)
        {
            System.out.print(x + " ");
        }
        System.out.println();
        for(int i=0;i<arr4.length;i++)
        {
            System.out.print(arr4[i] + " ");
        }

        System.out.println();



    }
}
