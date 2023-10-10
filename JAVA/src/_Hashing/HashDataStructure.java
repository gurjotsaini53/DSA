package _Hashing;



public class HashDataStructure {
    private class HashNode{
        private Integer key;
        private String value;

        private HashNode next;

        public HashNode(Integer key, String value)
        {
            this.key=key;
            this.value=value;
        }
    }

    private HashNode[] buckets;
    private int size;
    private int bucketIndex;
    private int totalBucketSize;

    // [.][][.][.][][][][]

    private int emptyBuckets;
    private int occupiedBuckets;


   public HashDataStructure(int capacity)
   {
       this.size=0;
       this.totalBucketSize = capacity;
       this.buckets = new HashNode[totalBucketSize];
   }



   public int size()
   {
       return size;
   }

   public boolean isEmpty(){
       return size==0;
   }

   public int hashCode(Integer key)
   {
       return key%totalBucketSize;
   }

   public int getBucketIndex(Integer key)
   {
       return hashCode(key);
   }

   private int getTotalBucketSize(){
       return totalBucketSize;
   }

   private int getOccupiedBuckets()
   {
       return occupiedBuckets;
   }

   private int getEmptyBuckets(){
       return emptyBuckets;
   }



   // 4 main methods of hashmap data strucures.


 public void put(Integer key,String value){

 }
    public void get(Integer key){

    }
    public void  set(Integer key){

    }
    public void search(Integer key)
    {

    }

    public void delete(Integer key)
    {
        
    }
    public void show()
    {

    }


    public static void main(String[] args) {

    }
}
