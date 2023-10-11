package _Recursion;

public class Recursion1 {
  public static void recur(int n)
  {
      if (n==0)
      {
          return;
      }
      System.out.println("Recursion IN " + n);
      recur(n-1);
      System.out.println("Recursion OUT " + n);

  }
    public static void main(String[] args) {
    recur(10);
    }
}
