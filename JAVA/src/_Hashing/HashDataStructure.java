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
     bucketIndex = getBucketIndex(key);
     HashNode head  =  buckets[bucketIndex];

     while(head != null)
     {
         if (head.key.equals(key))
         {
             head.value = value;
             return;
         }

         head=head.next;
     }


     HashNode node = new HashNode(key,value);
     node.next = head;
     buckets[bucketIndex] = node;
     size++;
 }
    public String get(Integer key){
         bucketIndex = getBucketIndex(key);
         HashNode head = buckets[bucketIndex];

         while (head!=null)
         {
             if (head.key.equals(key)) return head.value;
             head=head.next;
         }

         return null ; // return null if key not present;
    }

    public String search(Integer key)
    {
        bucketIndex = getBucketIndex(key);

        HashNode head = buckets[bucketIndex];
        while (head !=null)
        {
            if (head.key.equals(key))
            {
                return head.value;
            }
            else{
                head = head.next;
            }
        }

        return "No data found";
    }

    public String delete(Integer key)
    {
     bucketIndex = getBucketIndex(key);
     HashNode head = buckets[bucketIndex];
     HashNode prev = null;

     while (head!=null)
     {
         if (head.key.equals(key)) break;

         prev = head;
         head=head.next;
     }

     if (head==null) return null;

     if (prev !=null) prev.next = head.next;
     else buckets[bucketIndex]=head.next;
     size--;
     return head.value;
    }

    public void getBucketDetails()
    {
           occupiedBuckets  = 0;
           emptyBuckets=0;
           for(int bIndex = 0 ; bIndex<totalBucketSize;bIndex++)
           {
               System.out.println("[ "+ bIndex+" ]");

               HashNode head = buckets[bIndex];
               while(head!=null)
               {
                   ++occupiedBuckets;
                   System.out.println("\t " + head.key + " - " + head.value);
                   head=head.next;
               }

               emptyBuckets = totalBucketSize - occupiedBuckets;
               System.out.println();
           }
    }


    public static void main(String[] args) {


       HashDataStructure obj = new HashDataStructure(10);

       obj.put(5,"Gurjot");
       obj.put(6,"Guri");
        System.out.println(obj.search(6));
       obj.delete(6);
       obj.put(1,"Madhav");
       obj.put(11,"Goyal");
       obj.put(15,"Ansh");



       obj.getBucketDetails();
    }
}
