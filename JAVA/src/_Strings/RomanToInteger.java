package _Strings;

public class RomanToInteger {


   public static int type(char ch)
    {
        if (ch=='I')
        {
            return 1;
        }
        if (ch=='V')
        {
            return 5;
        }
        if (ch=='X')
        {
            return 10;
        }
        if (ch=='L')
        {
            return 50 ;
        }
        if (ch=='C')
        {
            return 100;
        }
        if (ch=='D')
        {
            return 500;
        }
        if (ch=='M')
        {
            return 1000;

        }

        return -1;
    }


    public static int RomanToIntegerFunc(String RomanNumber)
    {
        char [] str = RomanNumber.toCharArray();
        int size = str.length;

        int res=0;
        for (int i = 0 ; i <size;i++)
        {

            int value1 , value2;
            value1= type(str[i]) ;
            if (i+1<size) {
                 value2 = type(str[i + 1]);
                if(value1>=value2) {
                    res += value1;
                }
                else {
                    res += value2 - value1;
                   i++;
                }
            }
            else {
                res += value1;
            }

        }
        return res;
    }
    public static void main(String[] args) {
        String romanNumber = "XIV" ;
        System.out.println(RomanToIntegerFunc(romanNumber));
    }
}
