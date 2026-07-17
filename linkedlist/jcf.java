import java.util.LinkedList;
public class jcf {
    
/////////////////////////////////////////////////////
// JAVA COLLECTIVE FRAMEWORK:group of inbuilt ds in java
//useful: arraylists, linkedlists, stack, queue, hashset, hashmap

        //MERGE SORT 
        //1) ll ka middle find out
        //2)divide in left half and right half , agar mid ke next ko null kar diya tab ye ho jayega
        //3) now call mergesort for both the lists
        //4) merge
        














    public static void main(String args[]){


        //create- we can only store objects , int float etc nhi Integer class etc use karni padegi
        LinkedList<Integer> ll = new LinkedList<>();


        //add
        ll.addLast(2);
        ll.addFirst(1);
        System.out.println(ll);

        //remove 
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);

    }


    
}
