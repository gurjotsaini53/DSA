package _Strings;

public class ReverseAString {


    public static void Revere_a_String(String s)
    {
        int size = s.length();
        char [] str=s.toCharArray();
        for (int i =0;i<=size/2;i++)
        {
            char temp = str[i];
            str[i]=str[size-i-1];
            str[size-i-1]= temp;
        }
        System.out.println(str);

    }
    public static void main(String[] args) {
        String s= "Gurjot";
       Revere_a_String(s);
        System.out.println(s);
    }
}
