package _Strings;

public class DeleteAdjacentDuplicatesInString {


    public static void RemoveAdjacentDuplicates(String s)
    {
        String ans ="" ;
        int n = s.length();
        for(int i = 0 ; i<n-1 ;i++)
        {
                if (s.charAt(i)!=s.charAt(i+1)) {
                    ans += s.charAt(i);
                }
        }
        ans +=s.charAt(n-1);
        System.out.println(ans);
    }
    public static void main(String[] args) {
        RemoveAdjacentDuplicates("aabbbbbaaaaccc");
    }
}
