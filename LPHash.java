/* ***************
* #### ###
* Linear Probing Hash class
* This utilizes the methodology and some code from the text book
*           https://github.com/kevin-wayne/algs4/blob/master/src/main/java/edu/princeton/cs/algs4/LinearProbingHashST.java
* It has size n, max size m
* creates an LPH from an array of words
* has a set maximum size that is equivalent to the size specified during declaration of an instance of this class
***************** */
public class LPHash{
    private int n; //size
    private int m; //max size

    private HashNode[] nodes; //node array, contains keys and values
 
    public LPHash(int capacity){
        n = 0;
        m = capacity;
        nodes = new HashNode[m];
    }
    
    public void createLPH(String[] words){ //used for the word counter class
        for(String word: words){
            insert(word);
        }
    }
    
    public void printHashTable(){ //used for the word counter class
        for (int i = 0; i < m; i++){
            System.out.print("\n" + i + "   \t");
            if ((nodes[i] != null)){
                System.out.print(nodes[i].getKey() + " " + nodes[i].getValue());}
            else{
                System.out.print("-");}
        }
    }

    private int hash(String key){ //from git link
        int h = key.hashCode();
        h ^= (h >>> 20) ^ (h >>> 12) ^ (h >>> 7) ^ (h >>> 4);
        return h & (m-1);
    }

    public void insert(String key){ //modified from git link, was having null issues with the for loop
        int hash = hash(key);
        int i = hash;
 
        do{ //executes at least once
            if (nodes[i] == null){
                nodes[i] = new HashNode(key);
                n++;
                return;
            }
            if ((nodes[i].getKey()).equals(key)){
                nodes[i].incValue();
                return;
            }
            i = (i + 1) % m;
        } while(i != hash); //fixed the null issues with the hash value
    }


    //not used in current implementation
    public int get(String key){ //modified from git link, more null issues
        int i = hash(key);
        while (nodes[i] != null){ //the while loop runs till null!!!
            if ((nodes[i].getKey()).equals(key))
                return nodes[i].getValue();
            i = (i + 1) % m;
        }
        return 0;
    }
    
    //not used in current implementation
    public int size(){ //from git link
        return n; 
    }
 
    //not used in current implementation
    public boolean isEmpty(){ //from git link
        return size() == 0; 
    }
    
    //not used in current implementation
    public boolean contains(String key){ //from git link
        return get(key) != 0;
    }
}