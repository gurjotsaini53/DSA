package _Strings;

public class CountNumberOfUniqueWords {

    public static void main(String[] args) {
        String  s = new String("Java is great C++ is also great") ;
        String[] str = s.split(" ") ;
//        for (String x : str)
//        {
//            System.out.println(x);
//        }
         int count = 0 ;
         boolean flag;

        for (int i = 0 ; i < str.length-1 ; i++)
        {
           flag  = false ;
            for(int j = i+1 ;j<str.length;j++) {
                if (str[i].equalsIgnoreCase(str[j])) {
//                    System.out.println(str[i] + " " + str[j]);
                    flag = true;
                }
            }
            if (!flag)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
