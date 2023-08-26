package _Strings;

public class CountPalindromeWordsInAString {


    public static boolean Palindrome(char str[] , int s , int e)
    {
        while(s<e){
            if (str[s]!=str[e])
            {
                return false;
            }
            s++;
            e--;

        }
        return true;
    }

    private static int CountPalindrome(String s) {
        int count = 0 , start = 0 , size = s.length();
        char [] str=s.toCharArray();
        for (int i =0;i<size;i++)
        {
            if (str[i]==' ' || i==size-1) {

                if (i == size - 1) {
                    if (Palindrome(str, start, i)) {
                        count++;
                    }
                }
                else {
                    if (Palindrome(str, start, i - 1)) {
                        count++;
                    }
                    start = i + 1;
                }
            }

        }

        return count;

    }

    public static void main(String[] args) {
        String s= "mom and dad are my best friends";
       String s1 = "madam Arti teaches malayalam";
        System.out.println(CountPalindrome(s));
    }

}
