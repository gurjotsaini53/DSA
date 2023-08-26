package _Strings;

public class ReverseWordsInAString {

    public static void ReverseString(char [] str, int s, int e)
    {
        while(s<e)
        {
            char temp = str[s];
            str[s]=str[e];
            str[e]=temp;

            s++;
            e--;
        }
    }

    public static String ReverseWords(String s)
    {

        char [] str = s.toCharArray();
        int size = str.length;

        int start = 0 ;
        for (int i=0;i<size;i++)
        {
            if ( str[i]==' '  || i==size-1)
            {
                if (i==size-1)
                {
                    ReverseString(str,start,i);
                }
                else {
                    ReverseString(str,start,i-1);
                    start=i+1;
                }
            }
        }

        String ans = new String(str);
        return ans;
    }
    public static void main(String[] args) {
        String s = "blue is sky the";
        System.out.println(ReverseWords(s));
    }
}
