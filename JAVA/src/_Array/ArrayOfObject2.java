package _Array;

class Student{
    public  String name;
    Student(String name)
    {
        this.name=name;
    }

  @Override
    public String toString()
    {
        return name;
    }

}
public class ArrayOfObject2 {
    public static void main(String [] args)
    {
        // creating student array
        Student [] StudentArray= new Student[] {new Student("Gurjot"), new Student("Ansh"), new Student("Ayushi")};


        // printing

       for (Student m:StudentArray)
       {
           System.out.println(m);
       }

    }
}
