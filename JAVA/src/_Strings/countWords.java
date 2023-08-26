package _Strings;

public class countWords {
   public static  int CountWords(String str)
   {
       if (str.isEmpty()|| str=="\0") return 0;
       String[] s = str.trim().split("\\s+") ;
       return s.length;
   }

//    public static  int CountWords(String str)
//    {
//        if (str.isEmpty()|| str=="\0") return 0;
//        char ch [] = str.toCharArray();
//
//        int count = 0 ;
//        for (int i= 1;i<ch.length;i++)
//        {
//            if (ch[i-1]==' ' && ch[i]!=' ') count++;
//
//        }
//        return  count;
//    }
    public static void main(String[] args) {
        String s= " is                            gurjot singh                ";
        System.out.println(CountWords(s));
    }
}
