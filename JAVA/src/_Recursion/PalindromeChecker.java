package _Recursion;

public class PalindromeChecker {


    public static boolean isPalindrome(String str)
    {
        str = str.replaceAll("\\s+","");
        return isPalindromeRecursive(str,0,str.length()-1);
    }

    public static boolean isPalindromeRecursive(String str, int s , int e)
    {
        if (s>=e){
            return true;
        }
        else if (str.charAt(s)!=str.charAt(e))
        {
            return false;
        }
         isPalindromeRecursive(str,s++,e--);
    }


    public static void main(String[] args) {
        System.out.println(isPalindrome("121"));
    }
}
