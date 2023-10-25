package _DyanamicProgramming.CoinChangeProblem;

import java.util.Scanner;

public class coinChangeProblem {

  // objective is to find minumum number of coins to make amount 
        static Scanner inp = new Scanner(System.in);


    private int [] coins ;
    private int coinArraySize ;
    private int amount ;

    public coinChangeProblem(int n, int amount) {
        this.amount=amount;
        this.coinArraySize=n;
        coins = new int[coinArraySize];
        for (int i=0;i<coinArraySize;i++)
        {
            coins[i]=inp.nextInt();
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter the amount " );
        int amount = inp.nextInt();
        System.out.print("Enter the size of array " );
        int n = inp.nextInt();
        coinChangeProblem obj = new coinChangeProblem(n,amount);


    }
}
