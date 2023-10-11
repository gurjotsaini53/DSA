package _Recursion;

public class TowerOfHanoi {


    public static  void TOH(int n , char source , char Auxilary ,  char Destination)
    {
        if (n==1){
        System.out.println("Moving Disk 1 from ROD "  + source + " To ROD "  + Destination);
        return;}

        TOH(n-1,source,Destination,Auxilary);
        System.out.println("Moving Disk " + n + " From ROD " + source + " To ROD " + Destination);
        TOH(n-1,Auxilary,source,Destination);

    }
    public static void main(String[] args) {
         TOH(4,'A' , 'B' ,'C');
    }
}
