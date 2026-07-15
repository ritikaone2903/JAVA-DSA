import java.util.*;
public class HashMapCode {
        static class HashMapCode<K,V>{//k and v here is genricc jab typee is not fixed ki kya hoga  then in that case wee use generic i.e, es class me 2 objectss ayenge one is k (key) other is v (value) 
            private class Node {
                K key;
                V value;

                public Node(K key, V value){
                    this.key = key;
                    this.value = value;
                }
            }

                private int n;//n
                private int N;
                private LinkedList<Node> //N

                @Suppressarnings("unchecked")//in line20 we annot directly write linkedlists type batana padta h toh es warning ko overcome karke code chalane ke liye we have written this
                public HashMap(){
                    this.N = 4 ;
                    this.bucket = newLinkedList[4];
                    for(int i=0; i<4 ; i++){
                        this.bucket[i] = new LinkedList<>();

                    }
                }


                    private int hashFunction(K key){
                       int hc = key.hashCode();  
                       //now since the o/p can be + or - we first take the absolute value
                        return Math.abs(hc) % bukcets.length;
                    }



                    private int SearchInLL(K key, int bi){
                        LinkedList<Node> ll= buckets[bi];
                        int di = 0;


                        for(int i=0; i<ll.n(); i++){
                            Node node = ll.get(i);
                            if(node.key== key){
                                return di;
                            }
                            di++;

                        }
                        return -1;

                    }
                    public void put(K key , V value){
                        int bi = hashFunction(key);//0 to 3
                        int di = SearchInLL(key);//valid index or -1
                        if(di != -1){
                            Node node = buckets[bi].get(di);
                            node.value = value;
                        }
                        else {
                            buckets[bi].add(new Node(key,value));
                            n++;
                        }
                        double lambda = (double)
                        
                    }

                    public boolean containsKey(K key){
                        return false ;
                    }
                
            
        }
    
}
