// import java.util.PriorityQueue;
// public class heaps {
//     //priority queues : real life examples me jab data priority basis par structured chahiye ho tab we use this 
//     //is naam ki class already exists in jcf(java collective framework)
    

//     //ADD: works on FIFO logic  tc: O(logn)
//     //remove(): O(logn)
//     //peek:O(1)

//     static class Student implements Comparable<Student>{  //overridding
//     String name;
//     int rank;

//     public Student(String name , int rank){
//         this.name = name;
//         this.rank = rank;
//     }


//     @Override
//     public int compareTo(Student s2){
//         return this.rank - s2.rank; //+ then s1>s2, - then s1<s2
//     }}



//     public static void main(String args[]){
//     PriorityQueue<Integer> pq = new PriorityQueue<>();

//     pq.add(3);
//     pq.add(4);
//     pq.add(1);
//     pq.add(7);

//     while(!pq.isEmpty()){
//         System.out.println(pq.peek());
//         pq.remove();
//     }

//     //BY DEFAULT ASCENDING ORDER  ME priority mil gai but bade ko zyada imp rakhna h toh
//     //PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

// }


//  public static void main(String args[]){
//     PriorityQueue<Student> pq = new PriorityQueue<>();

// //     pq.add(new Student("a",4));
//      pq.add(new Student("b",3));
// pq.add(new Student("c",1));
// pq.add(new Student("d",7));



//     while(!pq.isEmpty()){
//         System.out.println(pq.peek().name + "-"+pq.peek().rank);
//         pq.remove();
//     }

   
// }




    







//HEAPS:llike binary trees it is of 2 types:min heap , ax heap
//heaps : visualized as = bt
// and implemented as  arrays/arraylist


//PROPERTIES:1)binary tree: at max 2 children 
//2) complete bt: cbt is a bt in which all the levels are completely filled except  possibly the last one , which is filled from left to right 
//3) heap order property : children >= parent(maxheap) ; children <=parent (minheap)


//why not nodes used for the same ???
//ans = in node search karke empty place par we can add one node par esme order maintaain nhi hoga tc : O(n)


//(node) index = i
//left child = 2i+1
//right child = 2i+2

//here insertion is O(1)



//INSERTION
//1)add at last index 
//2)start compare with parent node , if child value smaller than parent then swap 

// import java.util.*;
// public class heaps{

//     static class Heap {
//     ArrayList<Integer> arr = new ArrayList<>();
//     public void add(int data){
//         //add at last idx
//         arr.add(data);

//         int x = arr.size()-1;// x is child index 
//         int par = (x-1)/2;//par index



//         //swap
//         while(arr.get(x)< arr.get(par)){//O(logn)
//             int temp = arr.get(x);
//             arr.set(x,arr.get(par));
//             arr.set(par,temp);


//             x = par;
//             par = (x-1)/2;
//         }
//     }



//     public int peek(){
//         return arr.get(0);
//     }  



//     //  private void  heapify(int i){//it will fix my heap 
//     //   int left = 2*i + 1;
//     //   int right = 2*i + 2;
//     //   int minIdx = i ;
      
//     //   if(left < arr.size() && arr.get(minIdx) > arr.get(left) ){
//     //     minIdx = left;
//     //   }

//     //   if(right < arr.size() &&  arr.get(minIdx) > arr.get(right) ){
//     //     minIdx = right ;
//     //   }

//     //   if(minIdx != i){
//     //     //swap
//     //     int temp = arr.get(i);
//     //     arr.set(i, arr.get(minIdx));
//     //     arr.set(minIdx, temp);
//     //     heapify(minIdx);
//     //   }

      

//     // }





    //DELETE IN HEAP USING HEAPIFY FUNCTION 
    // 1) 1st and last node
    // 2) remove last index arr.remove(arr.size()-1)
    // 3) fix my heap using heapify function 

    // public int remove() {
    //     int data = arr.get(0);

    //     //swap 1st and last node 
    //     int temp = arr.get(0);
    //     arr.set(0,arr.get(arr.size()-1));
    //     arr.set(arr.size()-1,temp);

    //     //delete last 
    //     arr.remove(arr.size()-1);

    //     //heapify func tc:O(logn)
    //     heapify(0);
    //     return data;
    // }



    // public boolean isEmpty(){
    //     return arr.size() == 0;
    // }






    //HEAP SORT  tc: O(nlogn)
    // 1)arr ka max heap baneaga (for aascending order)
    // 2)arr ka min heap (for descending  order )
    // 3) then for non leaf [voh jinke child hote h ]unko heapify kar dena hai 
    //4)largest is pushed to the end swap(first and last) and heapify (0) for n-1

    import java.util.*;
    public class heaps{

    



    public static void heapify(int arr[], int i, int size) {
        
      int left = 2*i + 1;
      int right = 2*i + 2;
      int maxIdx = i ;
      
      if(left < size && arr[left] > arr[maxIdx] ){
        maxIdx = left;
      }

      if(right < size &&  arr[right] > arr[maxIdx] ){
        maxIdx = right ;
      }

      if(maxIdx != i){
        //swap
        int temp = arr[i];
        arr[i] = arr[maxIdx];
        arr[maxIdx] = temp;
        heapify(arr, maxIdx, size);
      }

      

    }

    }




    public static void heapSort(int arr[]){
        //1. build max heap 
        int n = arr.length;
        for(int i=n/2 ; i>=0 ; i--){
            heapify(arr,i,n);



        }
        //2. push max to the end
        for(int i=n-1; i>0; i--){
            //swap(largest - first with last)
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr,0,i);

        } 
    }











private static void heapify(int[] arr, int i, int n) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'heapify'");
    }











public static void main(String args[]){
 int arr[] = {1,2,4,5,3};
 heapSort(arr);
}





    



   

