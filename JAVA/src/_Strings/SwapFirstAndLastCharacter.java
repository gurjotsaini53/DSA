package _Strings;

import java.awt.font.ShapeGraphicAttribute;

public class SwapFirstAndLastCharacter {

    public static String SwapFirstAndLastCharacterOfWord(String s)
    {
        int size = s.length();
        int start = 0 ;
        char [] str=s.toCharArray();
        for (int i =0;i<size;i++)
        {
            if (str[i]==' ' || i==(size-1))
            {
                    char temp = str[start];

                if (i==size-1)
                {
                    str[start]=str[i];
                    str[i]=temp;
                }
                else {
                    str[start] = str[i-1];
                    str[i-1]=temp;
                }
                start=i+1;
            }

        }
             String ans = new String(str);
             return ans;
    }
    public static void main(String[] args) {
        String s= "gurjot singh is a full stack developer in xyz organization";
        System.out.println(SwapFirstAndLastCharacterOfWord(s));
    }
}
