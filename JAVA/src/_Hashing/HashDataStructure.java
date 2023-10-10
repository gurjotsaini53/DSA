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






    public static void main(String[] args) {

    }
}
