package _Conversions;

public class binaryToDecimal {


    public static int binaryToDecimal(int num)
    {
        int dec = 0, rem, temp=num, i=0; ;

        while(temp!=0)
        {
            rem = temp%10;
            dec+= rem * (int)Math.pow(2,i);
            temp/=10;
            i++;
        }

        return dec;




    }
    public static void main(String[] args) {
        System.out.println(binaryToDecimal(111));
    }
}
