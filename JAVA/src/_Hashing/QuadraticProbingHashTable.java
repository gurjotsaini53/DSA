package _Hashing;


public class QuadraticProbingHashTable {

    private int capacity;
    private int [] table;
    private int [] state;
    public QuadraticProbingHashTable(int capacity)
    {
        this.capacity = capacity;
        table =  new int[capacity];
        state =  new int[capacity];

        for (int i=0;i<capacity;i++)
        {
            state[i]=0; // initialize all zeros
        }
    }


    // insert

    public void insert(int key) {
        int index = hash(key);

        // linear probing to find the next available slot


        int i=0;
        while (state[index] == 1)
        {
            index  = (index+(i*i))%capacity ; // h'(x) = {h(x) + f(i*i)) % z
            i++;
        }

        table[index]=key;
        state[index]=1; // mark slot as occupied
    }




    public void print()
    {
        for(int i=0;i<capacity;i++)
        {
            if (state[i]==1)
                System.out.print(table[i]+" ");
            else if (state[i]==-1)
            {
                System.out.print("Deleted " );
            }
        }
        System.out.println();
    }

    public boolean search(int value)
    {
        int index = hash(value);
        int i=0;

        // linear probing to find the key or an empty slot : keep checking till  next empty slot
        while (state[index]!=0)
        {

            if(state[index] ==1 && table[index]==value)
            {
                // key found
                System.out.println(value +" found at " + index);
                return true;
            }

            index = (index+(i*i))%capacity;
            i++;
        }
        return false;
    }
    public int hash(int value)
    {
        return value%capacity ;
    }

    // delete

    public  void delete(int value)
    {
        int index = hash(value);

        // linear probing to find the key : keep checking till next empty slot
      int i=0;
        while (state[index]!=0)
        {
            if (state[index]==1 && table[index]==value)
            {
                state[index]=-1;  // mark slot as deleted
                return;
            }

            index=(index+(i*i)) % capacity;
            i++;
        }
    }



    // driver code
    public static void main(String[] args) {
        QuadraticProbingHashTable hashTable =  new  QuadraticProbingHashTable (10);


        hashTable.insert(10);
        hashTable.insert(20);
        hashTable.insert(30);

        hashTable.print();

        System.out.println(hashTable.search(20));

        hashTable.delete(10);
        hashTable.print();



    }
}
