import java.util.*;
public class arraylistqsCC {
    //container with most wwater 
    //for given n lines on x axis , use 2 lines to form a container such that it holds maximum water .




    //BRUTE FORCE - O(n^ 2)

    public static  int storeWater(ArrayList<Integer> height ){
        int maxWater = 0 ;//kyuki sirf ek line hui tab toh no water hence 


        for(int i= 0 ; i<height.size() ; i++){
            //this loop fixes the first line now for second line we require another loop 
            for(int j= i+1; j<height.size(); j++){
                //now we have the pair and we calculate the height 
                int ht  = Math.min(height.get(i), height.get(j));
                int width = j-i;
                int currWater = ht * width ;
                maxWater = Math.max(currWater, maxWater);

            }
        }
        return maxWater;

    }





    //2 pointer approach - O(n) linear time complexity 
    //i will make two pointers at the extrems then i will do some work and finally check conditions if yes age bhado 
    //agar lp ne d distance travel kiya tab rp ne n-d kiya hoga so total distance is n hence i is O(n)
    //WHY? small height controls the amt of water so hence itis changed badi wali nhi karti control so we will not change that
    public static int storeWater2(ArrayList<Integer> height){
        int maxWater = 0;
        int lp= 0;
        int rp= height.size()-1 ;

        while(lp<rp){
            //water area 
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp-lp;
            int currWater = ht * width;
            maxWater = Math.max(currWater , maxWater);


            //update pointers 
            if(height.get(lp)  < height.get(rp)){
                lp++;
            }
            else{
                rp--;
            }

        }
         return maxWater;
    }






    //HOW IS THIS DIFF FROM TRAPPING RAINWATER Q 
    //here we only consider 2 bounderies ke bich ka water in rainwater we tried to catch max water so every column had some water here only the container with 2 boundary is considered 
    //pehle container already bana hua tha yaha par we have to make one 





    //   public static void main(String args[]){
    //     ArrayList<Integer> height = new ArrayList<>();
    //     height.add(1);
    //     height.add(8);
    //     height.add(6);
    //     height.add(2);
    //     height.add(5);
    //     height.add(4);
    //     height.add(8);
    //     height.add(3);
    //     height.add(7);
    //     System.out.println(storeWater2(height));
    //   }

















//PAIR SUM -1
//FIND ANY PAIR IN SORTED ARRAYLIST HAS A TARgET SUM




    //BRUTE FORCE - sare pair nikal do nested loop lagegi 2 loops aur O(n^2) tc ayegi 
    public static boolean pairSum1(ArrayList<Integer> list , int target){
        for(int i=0; i<list.size() ; i++){
           //for all possible pairs
           for(int j= i+1; j<list.size(); j++){
            if(list.get(i)+list.get(j) == target){
                return true;
            }
           } 
        }
        return false ;
    }




    //OPTIMIZED APPROACH : using this kyuki sorted hai list  - O(n)
    //case 1: if lp.num + rp.num  == trget print true 
    //case 2: if lp.num + rp.num < target then print false and do lp++
    //case 3: if lp.num + rp.num > target then print flase and do rp-- 
    //here in sorted lp is giving bigger values r is giving smaller values 

    public static boolean pairSum1Op(ArrayList<Integer> list, int target ){
        int lp = 0;
        int rp = list.size()-1;

        while(lp!=rp){
            if(list.get(lp) + list.get(rp) == target){
                return true ;
            }
            else if(list.get(lp) + list.get(rp) > target){
                rp--;
            }
            else{
               lp++; 
            }
        }
        return false ;
    }




    // public static void main(String args[]){
    //     ArrayList<Integer> list = new ArrayList<>();

    //     list.add(1);
    //     list.add(2);
    //     list.add(3);
    //     list.add(4);
    //     list.add(5);
    //     list.add(6);

    //     int target = 5;

    //     System.out.println(pairSum1Op(list,target));
    // }











//PAIR SUM-2
// FIND IF ANY PAIR IN A SORTED AND ROTATED ARRAY LIST HAS A TRGET SUMM
//ROTATED: PARTS OF IT ARE SORTED JUST SEQUENCE KE BICH ME SE EK PIVOT POINT WALE KO UTHA KE ALAG RAKH DIYA HON



//BRUTE FORCE - O(N^2)

    public static boolean pairSum2(ArrayList<Integer> list , int target){
        for(int i=0; i<list.size(); i++){
            for(int j= i+1; j<list.size(); j++){
                if(list.get(i)+list.get(j)==target){
                    return true;
                }
            }
        }
        return false;
    }





    //optimized : 2 pointer approach  - O(N)
    //twist : finding pivot point  == where sorted array breaks 
    //pivot point wala would be the largest then and left pointer willbe i+1 
    //dikkat yaha par rotated me kaise loop chalegi ye h and for that we use :MODULAR ARITHEMATIC
    public static boolean pairSum2Op(ArrayList<Integer> list , int target){
        int bp = -1;//breaking point 
        for(int i=0 ; i<list.size() ; i++){
            if(list.get(i) > list.get(i+1)){
                bp = i;
                break;
            }

        }

        int lp = bp+1; //smallest
        int rp = bp; //largest
        int n = list.size();
        while(lp!=rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            else if(list.get(lp)+list.get(rp) > target){
                rp = (n+rp-1) % n;
            }
            else{
                lp = (lp+1) % n;
            }

        }
        return false;
    }

public static void main(String args[]){
    ArrayList<Integer> list = new ArrayList<>();

    list.add(11);
    list.add(15);
    list.add(6);
    list.add(8);
    list.add(9);
    list.add(10);

    int target = 16;

    System.out.println(pairSum2Op(list,target));

}
}
