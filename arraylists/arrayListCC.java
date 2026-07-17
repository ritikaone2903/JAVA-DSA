//inbuilt in java 
//data storage is linear

//DIFF FROM ARRAYS :
// 1)arr is fixed size but al is dynamic size 
// 2)primitive data type cannot be stored directly here unlike arrays here interger to be stored which is a class aur eska object store karate h 

//in java by default or by convention sab classes ka naam capital se store hota hai 




//syntax 
import java.util.*;

public class arrayListCC {

    public static void swap(ArrayList<Integer>  list, int idx1 ,  int idx2 ){
    int temp =  list.get(idx1);
    list.set(idx1, list.get(idx2));
    list.set(idx2, list.get(idx1) );

}





    public static void main(String args[]){
        //Classname objectName = new ClasName();
        ArrayList<Integer> list = new ArrayList<>();
        //() constructor called and < > esme data type 

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(4);
    //     System.out.println(list);

    //     int element = list.get(2);
    //     System.out.println(element);

    //     list.remove(1);
    //     System.out.println(list);

    //     list.set(0,10);
    //     System.out.println(list);


    //     System.out.println(list.contains(12));



    //     //size
    //     System.out.println(list.size());


    //     //print the whole list
    //     for(int i=0;i<list.size();i++){
    //         System.out.println(list.get(i) + " ");
    // }


    //PRINT REVERSE - O(n)
    for(int i=list.size()-1; i>=0; i--){
        System.out.print(list.get(i)+" ");

    }System.out.println();



    //MAX VALUE  - O(n)
    int max = Integer.MIN_VALUE;
    for(int i=0; i<list.size(); i++){
        // if(max<list.get(i)){
        //     max = list.get(i);
        // }

        max = Math.max(max, list.get(i));

    }
    System.out.print(max);




    //SWAP  2 NUMMBERS
    int idx1 = 1 , idx2 = 3;
    swap(list,idx1,idx2);
    System.out.println(list);



    //in java inbuilt method there to sort 
    //collections clas used 
    //IMP: java has both collection(interface) and collections(class)
    //asc order me milta hai

    Collections.sort(list);
    System.out.print(list);
    //for dsc order
    Collections.sort(list,Collections.reverseOrder());
    //comparator - func jo sorting ka logic decide karta hai
    System.out.print(list);
    



    

}}





 //JCF(JAVA COLLECTION FRAMEWORK):in built classes jinhe hume start se nhi banana padta hai


//OPERATIONS ON AL
// 1) ADD:O(1)
// 2)GET:O(1)
// 3)REMOVE:O(N)
// 4) SET ELEMENT AT INDEX :O(N)
// 5)CONTAINS ELEMENT: O(n);

//internally it is implemented as array as and when the array  gets fully filled another array of double the size is made  depends on the version
 


//list ke andar list kaise deifne hoga?
// ArrayList<ArrayList<Integer>> main = new ArrayList<>();
// ArrayList<Integer> arr = new ArrayList<>();
// arr.add(1);
//     arr.add(2);
//     arr.add(3);


// main.list.add(arr);




