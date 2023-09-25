package _Stack.Ques;

import java.util.Arrays;
import java.util.EmptyStackException;

public class KStackInArray {


    private int arr[];
    private int top[];

    private int next[];

    private int free_slot;

    public KStackInArray(int k, int capacity) {
        free_slot = 0;
        arr = new int[capacity];
        next = new int[capacity];

        top = new int[k];

        // make all top to -1;
        for (int i = 0; i < k; i++) {
            top[i] = -1;
        }

        // next [10] = {1,2,3,4,5,6,7,8,9,-1);

        for (int i = 0; i < capacity; i++) {
            next[i] = (i == capacity - 1) ? -1 : i + 1;
        }

        System.out.println(Arrays.toString(Arrays.stream(top).toArray()));
        System.out.println(Arrays.toString(Arrays.stream(next).toArray()));
    }


    public void printStack() {
        System.out.println(Arrays.toString(Arrays.stream(arr).toArray()));

    }

    public void printTop() {
        System.out.println(Arrays.toString(Arrays.stream(top).toArray()));

    }

    public void printNext() {
        System.out.println(Arrays.toString(Arrays.stream(next).toArray()));

    }


    public boolean push(int stackNumber, int value) {
        int index = free_slot;
        free_slot = next[index];
        next[index] = top[stackNumber];
        top[stackNumber] = index;
        arr[index] = value;

    }

    public int pop(int stackNumber) {

        if (free_slot==-1)
        {
            throw new EmptyStackException();
        }
        int index = top[stackNumber];
        int value = arr[index];

        top[stackNumber] = next[index];
        free_slot = index;
        next[index] = free_slot;

        return value;

    }

    public static void main(String[] args) {
        KStackInArray obj = new KStackInArray(3, 10);

        obj.push(1, 10);
        obj.push(1, 20);


        obj.push(2, 50);

        System.out.println(obj.pop(2));
    }
}
