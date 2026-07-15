public class LinkedList {

    //an element here is called node and node ki ek chain ko we call LL
    //in L node : data and next(reference var , ye ek obj ko point karta hai) is stored 
    //since abhi we know the blueprint of a node toh we can be a class for it 

    //CREATION
     public static class Node {
        int data ;
        Node next ;

        public Node(int data){ // this is our constructor
            this.data = data; //initialize
            this.next = null; //by default null store karva dete h we assume at start ke koi aur node nhi h
        }


    }

            //we always keep a track of head node (start wala) and tail node (end wala)
            //class ke andar he as a property define kar diya h
        public static Node head;
        public static Node tail;


        //METHODS
        //1)ADD
        //2)REMOVE 
        //3)print
        //4)search



        //ADD- O(1)
        public void addFirst(int data){
           //step 1:create new node
                Node newNode = new Node(data);
            //if empty
                if(head == null){
                    head = tail = newNode;
                    return;
                }


            //for one or  more node wali LL
            //step2: new node next = head
            newNode.next = head;//this is my linking step esse he LL  create hoti hai

            //step3:head ki value ab new node wali ho jaye
            head = newNode;

        }



        //ADD LAST - O(1)
        public void addLast(int data){
            //1)create a node 
            Node newNode = new Node(data);

            if( head == null){
                head = tail = newNode;
                return;
            }
            //2)tail.next = new node
            tail.next = newNode;

            //3)tail = newnode 
            tail = newNode;

        }




        //PRINT - O(n)
        //we cannot change head and tail ye tabhi change hote h jab LL is changed 
        //so we make a new node temp
        public void print(){//head etc  h toh no parameter req
        if(head==null){
            System.out.println("ll is empty");
            return;
        }
            Node temp = head; 
        while(temp!=null){
        System.out.print(temp.data + "->");
        temp = temp.next;
        }
        System.out.println("null"); 
    }





    //ADD IN  MIDDLE - O(n) because we have to search for index
    //we dont have to copy paste here unlike arrays

    public void add(int idx , int data ){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0 ;

        while(i<idx-1){
            temp = temp.next;
            i++;
        }

        //i=idx-1 ; temp  -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }













    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(0,9);
        ll.print(); 

}}
