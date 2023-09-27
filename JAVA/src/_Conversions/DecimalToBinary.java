package _Conversions;

public class DecimalToBinary {


    public static String decimal(int n)
    {
        String ans = "";

        while (n>0)
        {
            int rem = n%2;
            ans+=rem;
            n/=2;
        }

        return ans;

    }
    public static void main(String[] args) {
        int n = 70000000;
        StringBuilder ans = new StringBuilder(decimal(n));
        System.out.println(ans.reverse());

    }
}
