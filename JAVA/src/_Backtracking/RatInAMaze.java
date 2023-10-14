package _Backtracking;

import java.util.Scanner;

public class RatInAMaze {

    public static void maze(int [][] iMaze, int row, int col, String solution , boolean [][] bMaze) {

        /*
        required two cases
         */

        // 1 - positive base case, when reaches to last cell in the iMaze
        if (row == iMaze.length - 1 && col == iMaze[0].length - 1) {
            System.out.println(solution);
            return;
        }

        // 2 - negative base case

        if (row < 0 || col < 0 || row >= iMaze.length || col >= iMaze[0].length || bMaze[row][col] || iMaze[row][col] == 1) {
            return;
        }


        // set the bMaze[row][col] to true, if visited to the cell

        bMaze[row][col] = true;

        // 4 - recursive calls from each cell - Top, Down, left , Right

        maze(iMaze, row - 1, col, solution + "T", bMaze);
        maze(iMaze, row + 1, col, solution + "D", bMaze);
        maze(iMaze, row, col - 1, solution + "L", bMaze);
        maze(iMaze, row, col + 1, solution + "R", bMaze);

        // set all the bMaze [row][col] to false , if moved back from the cell

        bMaze[row][col] = false;

    }

    public static void main(String[] args) {
        int n ;
        Scanner inp = new Scanner(System.in);

        n = inp.nextInt();

        int [][] arr = new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j] = inp.nextInt();
            }
        }


        boolean [][] bMaze = new boolean[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if (arr[i][j]==1)
                bMaze[i][j] =true;
                else
                    bMaze[i][j]=false;

            }
        }

        maze(arr,0,0,"" , bMaze);
    }


}
