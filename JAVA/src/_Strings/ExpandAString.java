package _Strings;

public class ExpandAString {

//    public static void Expand(String str)
//    {
//
//        char arr[] = str.toCharArray();
//        String ans ="";
//        int len = arr.length;
//
//        for (int i=0;i<len;i++)
//        {
//            if(arr[i]>='1' && arr[i]<='9')
//            {
//
//
//
//            }
//
//            while (range>0)
//            {
//
//
//                if (i==0)
//                    ans+=arr[0];
//                else
//                ans+=arr[i-1];
//
//                range--;
//            }
//        }
//        System.out.println(ans);
//    }


    public static void Expand(String str)
    {
        char[] arr = str.toCharArray();
        String Range = "";
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]>='1' && arr[i]<='9')
            {
                Range+=arr[i];

            }

            System.out.println(Range);



        };
    }
    public static void main(String[] args) {
          Expand("a12b5");

//        Expand("a5b12cd2");
    }
}
