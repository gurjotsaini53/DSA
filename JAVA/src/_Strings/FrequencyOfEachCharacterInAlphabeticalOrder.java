package _Strings;

public class FrequencyOfEachCharacterInAlphabeticalOrder {


    public static void Frequency(String s)
    {
         int max= 26; // 26 characters
          int fa[] = new int[max] ;
          int size= s.length();
          char [] str = s.toCharArray();

          for (int i=0;i<size;i++)
          {
              fa[str[i]-'a']++;
          }

          for(int i=0;i<max;i++)
          {
              if(fa[i]!=0)
              {
                  System.out.println((char)(i+'a') + " = " + fa[i]  );
              }
          }

    }
    public static void main(String[] args) {
        String s = "aaaabbbbdddeeeeeaaaff";
        Frequency(s);
    }
}
