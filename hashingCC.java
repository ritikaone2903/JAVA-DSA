// import java.util.*;
// public class hashingCC {
//     public static void main(String args[]){
//         HashMap<String,Integer> hm = new HashMap<>();//creating new hashmap
//         //PUT FUNC: this isto either add new value to an existing key or to add a non exisiting key and value pair directly 
//         //Insert-O(1)
//         hm.put("INDIA",100);
//         hm.put("CHINA",200);
//         hm.put("USA",50);
//         hm.put("INDIA",250);//so value  pehle wali cut ya delete hoke new gets stored

//     //     //get - O(1)
//     //     int population = hm.get("INDIA");
//     //      System.out.println(population);//agar key ya value exist na kare then null is returned 


//     //     //containsKey - O(1)
//     //     //it will give true or false if a key exists or not 
//     //     System.out.println(hm.containsKey("indonesia"));
        

//     //     //remove
//     //    hm.remove("CHINA");//this removes the key and agar print kiya toh value print ho jati h  
//     //     System.out.println(hm);



//     //     //size 
//     //     System.out.println(hm.size());


//     //     //is empty , ans boolean
//     //     hm.clear();//pura map khali ho jayega esse
//     //     System.out.println(hm.isEmpty());


    



//     //ITERATION ON HASHMAP
//     //one new collection name set is formd jisme sari keys store ho jati h on writing th below command 
//     //hm.entrySet() this gives pairs 
//     Set<String> keys = hm.keySet();

//     for (String k : keys) {
//         System.out.println("key="+k+",value="+hm.get(k));
//     }

   

//     //IMPEMENTATION - a array of linked list ke form me hota hai 
//     //put - 2 case key exists or not
    


//     //HASHING: input me kuch data ega and hashcode func ill change its form 
//     // so it will take  key  in and gives out bucket index 


//     // so now if i use put func to add a node toh key ko kaunsi place store hogi that will  hashcode telll us bucket inex return hoga 
//       //so hashmap is fast because of hashfunc jo constant time complexity deta h
//       //REHASHING : new array formed aur arrangement is changeed to keep lamba small lamda is numbe rof nodes in particulaar bucket/total number of buckets
    




//     //hashmaps ki worst case time complexity is O(n) ye tab hoga jab ek he bucket me sare noes store ho jaye aur bi  esliye har bar same meilega so worst scenario me linear tc ho jati h



//     }

    
// }



// // LINKED HASHMAPS : keys are insertion ordered 
// import java.util.*;

// public class hashingCC{
//     public static void main(String args[]){
//         LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
//         lhm.put("INDIA",100);
//         lhm.put("china",250);
//         lhm.put("us",50);

//         System.out.println(lhm);//jis order me pass kiya h usme aya h



//          TreeMap<String,Integer> tm = new TreeMap<>();
//         tm.put("india",100);
//         tm.put("china",250);
//         tm.put("us",50);//o/p me alphabetical order dikhega sorting is always on key basis not value

//         System.out.println(tm);

//         //comapring with hashmaps
//          HashMap<String,Integer> hm = new HashMap<>();
//         hm.put("INDIA",100);
//         hm.put("CHINA",200);
//         hm.put("USA",50);
    
//         System.out.println(hm);
//         }
//         //in internal implementation doubly linkedlist is used  jisse order is maintained

// }







//TREE MAPS : keys are sorted and crud ki tc is O(logn)
//the ds used for implementation of  this is RE BLACK TREES (BST)which are self balancing trees













import java.util.*;
public class hashingCC{


//MAJORITY ELEMENT :  jo max times aya h say >n/3 times 
//we make (num,freq)pairs using hashmaps 
public static void main(String args[]){

    int arr[] = {1,3,2,5,1,3,1,5,1};
    HashMap<Integer, Integer> map = new HashMap<>();

        // for(int i=0; i<arr.length; i++){
        //     if(map.containsKey(arr[i])){
        //         map.put(arr[i],map.get(arr[i])+1);
        //     }else{
        //         map.put(arr[i],1);
        //     }



    for(int i=0; i<arr.length; i++){
        map.put(arr[i],map.getOrDefault(arr[i], defaultValue:0)+1);
    }
            // Set<Integer> keySet  = map.keySet();
            // for(Integer key : keySet){
            //     if(map.get(key) > arr.length/3){
            //         System.out.println(key);
            //     } 
            // }

            for(Integer key : map.keySet()){
                if(map.get(key)> arr.length/3){
                    System.out.println(key);
                }
            }




        }

        
}




//VALID ANAGRAM

