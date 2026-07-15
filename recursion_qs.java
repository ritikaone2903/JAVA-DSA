public class recursion_qs {
    public static void printIndex(int arr[],int key,int idx){
        //base case 
        // if(arr[idx]==arr.length-1){
        //galti h arr[idx toh element ho gaya na sirf index chahiye]
        if(idx==arr.length){
            return ;
        }
        //kaam 
        //     printIndex(arr,key,idx+1);
        // if(arr[idx]==key){
        //     System.out.print(idx+" ");
        // }return;
        //pehle check hogana key se fir next call karegee
           
        if(arr[idx]==key){
            System.out.print(idx+" ");
        }
         printIndex(arr,key,idx+1);
        return;
    }



    // public static String numToStr(String str,int idx,String newstr){
    //     //base case 
    //     if(idx==str.length()){
    //         return  "";
    //     }
    //     //kaam 
    //     newstr+=(char)str.charAt(idx);
    //     numToStr(str,idx+1,newstr);
    //      return newstr;
    // }


    static String digits[]=  {"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void printDigits(int number){
        if(number==0){
            return;
        }
        int lastDigit = number%10;//gives first digit
        printDigits(number/10);
        System.out.print(digits[lastDigit]+ " ");
    }




// public static int lengthCounter(String str,int counter){
//     //base case
//     if(idx==str.length()){
//         return 0;
//     }
//     counter++;
//     lengthCounter(idx+1,str,counter);
//     return counter;
// }

public static int length(String str){
    if(str.length()==0){
        return 0;
    }
    return length(str.substring(1))+1;
}




public static void towerOfHanoi(int n,String src,String helper,String dest){

    //base case 
    if(n==1){
        System.out.println("transfer this disk"+n+"from"+src+"to"+dest) ;
        return;
    }
    towerOfHanoi(n-1,src,dest,helper);
    System.out.println("transfer disk"+n+"from"+src+"to"+helper);
    towerOfHanoi(n-1,helper,src,dest);

    
}














    public static void main(String args[]){
     int n=4;
     towerOfHanoi(n,"A","B","C");
    }
    
}
