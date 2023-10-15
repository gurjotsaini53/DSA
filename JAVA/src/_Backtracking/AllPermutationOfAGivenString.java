package _Backtracking;

public class AllPermutationOfAGivenString {


    public static void FindPermutation(String str, String perm , int index)
    {
        if (str.length()==0)
        {
            System.out.println(perm);
            return;
        }

        for(int i=0;i<str.length();i++)
        {
            char current = str.charAt(i);
             String newStr = str.substring(0,i) + str.substring(i+1);
            FindPermutation(newStr,perm+current,index+1);
        }
    }
    public static void main(String[] args) {
        FindPermutation("ABC","",0);
    }
}
