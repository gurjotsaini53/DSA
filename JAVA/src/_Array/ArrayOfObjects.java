package _Array;


class Students{
    public int Roll_no;
    public  String name;

    Students(int roll_no, String name)
    {
        this.name=name;
        this.Roll_no=roll_no;
    }
}
public class ArrayOfObjects {

    public static void main(String [] args)
    {
        // creating student array
        Students [] StudentArray= new Students[3];

        StudentArray[0] = new Students(1,"Gurjot");
        StudentArray[1] = new Students(2,"Ansh");
        StudentArray[2] = new Students(3,"Ayushi");

        // printing

        for(int i=0;i<StudentArray.length;i++)
        {
            System.out.println(StudentArray[i].Roll_no + " : " + StudentArray[i].name);
        }

    }
}
