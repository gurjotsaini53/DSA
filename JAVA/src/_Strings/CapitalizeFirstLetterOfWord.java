package _Strings;

public class CapitalizeFirstLetterOfWord {

    public static String CapitalizeFirstLetter(String s)
    {
        int size = s.length();
        char [] str=s.toCharArray();
        for (int i =0;i<size;i++)
        {
        if (  i==0 || (str[i-1]==' ' && str[i]!= ' '))
            {
                str[i]-=32;
            }

        }
        String ans = new String(str);
        return ans;

    }
    public static void main(String[] args) {
        String s= "     gurjot singh is a full stack developer in xyz           organization";

        System.out.println( CapitalizeFirstLetter(s));
    }
}
