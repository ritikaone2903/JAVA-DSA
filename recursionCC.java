
public class recursionCC{

//PRINT INT
        // public static void printDecint n){
        //       if(n==1){
        //             System.out.println(n);
        //             return ;
        //         }   
        //     System.out.print(n+" ");
        //         printInt(n-1);
              
        //     }


//PRINT IN DECREASING ORDER 
        public static void printInc2(int n){
            if(n==1){
                System.out.print(n+" ");
                return;
            }
            printInc2(n-1);
            System.out.print(n+" ");
            
        }



//FACTORIAL 
        public static int fact(int n ){
            if(n==0){
               
                return 1;
            }
          int fnm1= fact(n-1);
          int fn= n * fnm1;
          return fn;

        }




//PRINT IN INCREASING ORDER
        public static void printInc(int n ){
            if(n==5){
                System.out.print(n);
                return;
            }
            System.out.print(n+" ");
            printInc(n+1);
        }



//SUM OF N NATURAL NUMBERS
        public static int sum(int n){
            if(n==1){
                return 1;
            }
           int snm1 = sum(n-1);
           int sn= n+ snm1;
           return sn;
        }





//FIBONACI NUMBERS PRINTING 
        public static int fib(int n ){
            if(n==0){
                return 0 ;
            }
             if(n==1){
                return 1 ;
            }
            int fibnm2=fib(n-2);
            int fibnm1=fib(n-1);
            int fibn=fibnm1+fibnm2;

            return fibn;
        }




//SORT CCHECK
        public static boolean isSorted(int arr[],int i){
            if(i==arr.length-1){
                return true; 
            }
            if(arr[i+1]<arr[i]){
                return false;
            }

           return isSorted(arr,i+1);
        }






//FIRST OCCURANCE OF ELEMENT IN AN ARRAY
        public static int firstOcr(int arr[],int i,int key){
            if(i==arr.length){
                return -1;
            }
            if(arr[i]==key){
                return i;
            }
            return firstOcr(arr,key,i+1);
        }






//LAST OCCURANCE 
        public static int lastOccurence(int arr[],int key,int i){
            if(i==arr.length){
                return -1;
            }
            int isfound = lastOccurence(arr,key,i+1);
            if(isfound ==-1 && arr[i]==key){
                return i;
                
            }
            
            return  isfound;
        }







//POWER FUNC 
        public static int power(int x,int n){
            if(n==0){
                return 1;
            }
        //    int  xnm1=power(x,n-1);
        //    int xn= x* xnm1;
        //    return xn;
            return x*power(x,n-1);
        }






//power n opt   
        public static int po(int a, int n){
            if(n==0){
                return 1;
            }
            //  int halfpowersq = po(a,n/2)*po(a,n/2);
            //not much optimised same func call two times
            int halfpower = po(a,n/2);
            int halfpowersq = halfpower*halfpower;
            if(n%2 !=0){
                halfpowersq = a* halfpowersq;
            }
           return halfpowersq;

        }





//TILING PROBLEM 
        public static int tilingProblem(int n ){// floor size(2 *n)
            //base case 
            if(n==0 || n==1){
                return 1;
            }
            //kaam 
            //for vertical case
            int fnm1 = tilingProblem(n-1);
            //for horizontal case
            int fnm2 = tilingProblem(n-2) ;
            //total ways
            int totalWays= fnm1 + fnm2;
            return totalWays;
        }







//REMOVE DUPLICATES IN STRING 
         public static void removeDuplicates( String str, int idx, StringBuilder newstr, boolean map[]){
            //base case 
            if(idx==str.length()){
                System.out.println(newstr);
                return;
            }
            char currchar = str.charAt(idx);
            if(map[currchar-'a']==true ){
                removeDuplicates(str, idx+1, newstr, map);
            }

            else{
                map[currchar-'a'] = true;
                removeDuplicates(str, idx+1, newstr.append(currchar), map);
            }
         }





//PAIRS IN A PARTY
         public static int friendsPairing(int n ){
            //base case 
            if(n==1 || n==2){
                return n;
            }
            //kaam 
            int totalWays =  friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
            return totalWays;
         }





//BINARY STRINGS PRINT 
        public static void printBinaryStrings(int n, int lastPlace, String str){
            //base case 
            if(n==0){
                System.out.println(str);
                return;
            }
            //kaam 
            // if(lastPlace==0){
            //     printBinaryStrings(n-1, 0, str.append(0));
            //     printBinaryStrings(n-1, 1, str.append(1));
            // }
            // else{
            //     printBinaryStrings(n-1, 0, str.append(0));
            // }
            printBinaryStrings(n-1,0,str+0);
            if(lastPlace==0){
                printBinaryStrings(n-1,1,str+1);
            }

            

        }








































        public static void main(String args[]){
           printBinaryStrings(3,0,"");
 
}}