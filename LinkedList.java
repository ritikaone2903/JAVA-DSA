public class LinkedList {

    //an element here is called node and node ki ek chain ko we call LL
    //in L node : data and next(reference var , ye ek obj ko point karta hai) is stored 
    //since abhi we know the blueprint of a node toh we can be a class for it 

    //SINGLY LL: links aage ke taraf hote h ulta nhi 

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
        public  static int size;


        //METHODS
        //1)ADD
        //2)REMOVE 
        //3)print
        //4)search



        //ADD- O(1)
        public void addFirst(int data){
           //step 1:create new node
                Node newNode = new Node(data);
                size++;
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
            size++;

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
        size++;//uppar wale if me kyu nhi kiya kyuki their we r calling addfirst and it already has size++
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




    //REMOVE OPERATION
    public int removeFirst(){
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val = head.data;
            head= tail = null;
            size = 0;
            return val;
        }
        //how to get prev node ==== size-2
        Node prev = head ;
        for(int i = 0; i<size-2 ; i++){
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }





    //ITERATIVE SEARCH
    //search for a key in a LL and return the position where it is found . if not found return -1

    public int iterativeSearch(int key){
         Node temp = head ; 
         int i = 0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
        temp = temp.next;
        i++;}
        return -1 ;
    }




    //RECURSIVE SEARCH
    //making a helper func

    
       public  int helper(Node head , int Key){
        if(head == null){//base case 
            return -1;
        }

        if(head.data==Key){
            return 0;
        }
        int idx = helper(head.next , Key);
        if(idx==-1){
            return -1;
        }

        return idx+1;

    }
    public int recSearch(int key){
       return helper(head,key);//ye callback h baki kaam helper func karega
    }




    //REVERSE A LINKEDLIST :iterative approach
    // 1) next = curr.next
    // 2)curr.next = prev , this is changing the direction of link backwards : this is REVERSAL STEP 
    // 3) prev = curr
    // 4) curr = next 

    public void reverse(){
        Node curr = tail= head ;//assignment in java is from right to left 
        Node prev = null;
        Node next;

        while(curr != null){
            //step1
            next = curr.next;
            //step2
            curr.next = prev;
            //step 3
            prev = curr;
            //step 4
            curr = next;
        }
        head = prev;

    }







    //FIND AND REMOVE NTH NODE FROM END : iterative aproach : O(n)
     

    public void removeNth(int n){
        //calculate size 
        int sz = 0;
        Node temp = head ;
        while(temp  != null){
           temp =  temp.next;
            sz++;
        }
        //find element 
        if(n == sz){
            head = head.next;
            return;
        }

        int i = 1;
        int iToFind = (sz - n );
        Node prev = head ;
        while(temp!= null){
            if(i <  iToFind){
                prev = prev.next;
                i++;
            }

            prev.next = prev.next.next;
            return ;
        }


    }




    //METHOD TO FIND MID NODE
    //SLOW FAST METHOD
    public Node findMid(Node head){
        Node slow = head ; 
        Node fast = head ;
        while(fast != null && fast.next != null ){
            slow = slow.next; // +1
            fast = fast.next; // +2

        }
        return slow;//this is my midnode
    }

    



    //CHECK IF LL IS PALINDROME
    // 1) one opt is ki convert it or store it in a diff ds like arraylist or string and then uska palindrome niklana ata h
    //but here tc is O(n) and sc is also O(n)
    //better way  

    //1) find mid node
    //2) reverse second half
    //3) check if 1st half = 2nd half

    public boolean checkPalindrome(){
        
        //corner case 
        if(head==null || head.next == null){
            return true;
        }


        //step1
        Node midNode = findMid(head);

        //step2
        Node curr = midNode ;
        Node prev = null ;
        Node next;

        while(curr!= null ){
            next = curr.next ;
            curr.next = prev;
            prev = curr;
            curr = next ;
        }
        Node left  = head ;
        Node right = prev;


        //step3
        while(right != null){
            if(left.data !=right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;


    }





    ///////////////////////////////////////////////////
    //DETECT A LOOP/CYCLE IN LL (FLOYD'S CYCLE FINDING ALGORITHM )
    //approach : 2 slow fast pointers 



    public 
    





















    // public static void main(String args[]){
    //     LinkedList ll = new LinkedList();
    //     ll.addFirst(2);
    //     ll.addFirst(1);
    //     ll.addLast(4);
    //     ll.addLast(5);
    //     ll.add(2,3);
    //     ll.print();
    //     System.out.println(ll.size);
    //     System.out.println(ll.removeLast());
    //     ll.print();
    //     System.out.println(ll.size);
    // }}






    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.addLast(2);
        ll.addLast(1);
        ll.addLast(1);
        ll.addLast(2);
        System.out.print(ll.checkPalindrome());
    }}



