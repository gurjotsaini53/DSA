package _Strings;

public class SwapTwoStringWithoutThirdVariable {


    public static void main(String[] args) {

        String a = "Gurjot" ;
        String b = "Singh" ;
        a= a + b;

        b = a.substring(0,a.length()-b.length()) ;
        a = a.substring(b.length(), a.length()) ;

        System.out.println(a);
        System.out.println(b);
    }

}
