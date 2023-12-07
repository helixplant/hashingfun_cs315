/* ***************
* #### ###
* Creates a node for the hash table, sets the key and has increment capabilities
* that let the value change each time the instance of the node is visited
***************** */
public class HashNode{

    private int value;
    private String key;

    public HashNode(String word){
        key = word;
        value = 1;
    }
    
    public void incValue(){
        value++;
    }

    public String getKey(){
        return key;
    }

     public int getValue(){
        return value;
    }

}