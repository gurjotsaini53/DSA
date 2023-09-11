package _Strings;

import java.util.Scanner;

public class StringPasswordCheck {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String a = inp.nextLine();
       boolean flag =false;
        try {


            char arr[]=a.toCharArray();
            for (int i=0;i<arr.length;i++)
            {
                if (arr[i]>='1' && arr[i]<='9')
                {
                    flag=true;
                }
            }
            if (a.length() < 6) {
                throw new Exception("s");
            }
            else if (!flag)
            {
                throw new Exception("d");
            }
            else
            throw new Exception("e");

        }
        catch (Exception ex)
        {
            if(ex.getMessage()=="s") System.out.println("Too Short");
            else if (ex.getMessage()=="d") System.out.println("No digit");
            else System.out.println("Correct");
        }

    }
}
