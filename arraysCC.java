import java.util.*;
public class arraysCC{
//PASS BY REFRENCE 
    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=(marks[i]+1);}
        }
    

//LINEAR SEARCH 
    public static int linearSearch(int numbers[], int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }

//LARGEST NUMBER
    public static int getLargest(int numbers[]){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(max<numbers[i]){
                max=numbers[i];
            }
        }return max;
    }


//BINARY SEARCH
     public static int binarySearch(int numbers[],int key){
        int start=0;
        int n=numbers.length;
        int end=n-1;
               while(start<=end){
                    int mid=(start+end)/2;
                    if(numbers[mid]==key){
                        return mid;
                    }
                    else if(numbers[mid]<key){
                        start = mid +1;
                    }
                    else{
                        end = mid - 1;
                    }
               }
            return -1;
     }



//REVERSE OF AN ARRAY
    //  public static int reverse(int numbers[]){
    //     int first=0,last =numbers.length-1;
    //     while(first<last){
    //         int temp =numbers[last];
    //         numbers[last]=numbers[first];
    //         numbers[first]=temp;
    //         first ++;
    //         last --;
    //     }
    //     return -1;
    //  }ERROR




//PAIRS IN AN ARRAY 
     public static int pairs(int numbers[]){
        int tp =0;
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("("+numbers[i]+","+numbers[j]+")");
                tp++;
            }
        }
        return tp;
     }





     //PRINT SUBARRAYS 
            public static int printSubarrays(int numbers[]){
                int ts=0;
                    for(int i=0;i<numbers.length;i++){
                        for(int j=i;j<numbers.length;j++){
                            for(int k=i;k<=j;k++){
                                System.out.print(numbers[k]+" ");
                                ts++;
                            }
                            System.out.println();
                        }

                    }return ts;
            }//rest code perfect but error in finding the number of total subarrays!








    //MAX SUBARRAY SUM
            // public static void maxSum(int numbers[]){
            //     int currsum=0;
            //     int maxSum=Integer.MIN_VALUE;
            //     for(int i=0;i<numbers.length;i++){
            //         int start=i;
            //         for(int j=i;j<numbers.length;j++){
            //             int end =j;
            //             currsum=0;
            //             for(int k=start;k<end;k++){
            //                 currsum+=numbers[k];
            //             }
            //             if(maxSum<currsum){
            //                 maxSum=currsum;
            //             }
            //         }
            //     }System.out.println("max sum is "+maxSum);
            // }  





    //PREFIX SUM METHOD 
            // public static int prefixSum(int numbers[]){
            //     int max=Integer.MIN_VALUE;
            //     int prefix[]= new int[numbers.length];
            //     int sum =0;
            //         for(int i=0;i<numbers.length;i++){
            //             sum=sum+numbers[i];
            //             for(int j=1;j<numbers.length;j++){
            //                 prefix[j]=sum;
            //             }
            //             }
            //         for(int k=0;k<numbers.length;k++){
            //             int start=k;
            //             int end=numbers.length-1;
            //             if((prefix[end]-prefix[start-1])>max){
            //                 max=(prefix[end]-prefix[start-1]);
            //             }
            //         }
            //         return max;
            //         }
            // }







            //correct approach
            public static void prefixSum(int numbers[]){
                int currsum=0;
                int maxsum=Integer.MIN_VALUE;
                int prefix[]= new int[numbers.length];
                prefix[0]=numbers[0];
                for(int i=1;i<numbers.length;i++){
                    prefix[i]=prefix[i-1]+numbers[i];}
                for(int i=0;i<numbers.length;i++){
                    int start=i;
                    int end=numbers.length-1;
                    currsum=start==0? prefix[end] : prefix[end]-prefix[start-1];
                    if(currsum>maxsum){
                        maxsum=currsum;
                    }
                }

                System.out.println("the max sum is "+maxsum);//correct method!
            }







    //KADANES METHOD
                public static void kadanes(int numbers[]){
                    int currsum=0;
                    int maxsum=Integer.MIN_VALUE;
                        for(int i=0;i<numbers.length;i++){
                            currsum=currsum+numbers[i];
                                if(currsum<0){
                                    currsum=0;
                                } maxsum=Math.max(currsum,maxsum);
                                
                                    
                                
                        }System.out.println("the max subarray sum is "+maxsum);
                }







    //TRAPPED RAINWATER 
                public static void trappedRainwater(int heights[]){
                    int n=heights.length;
                    int maxleft[]= new int[n];
                    int maxright[]=new int[n];
                    maxleft[0]=heights[0];
                        for(int i=1;i<n;i++){
                           maxleft[i]=Math.max(heights[i]-maxleft[i-1]);

                        }
                        for(int j=heights.length-2;j>0;j--){
                                maxright[j]=Math.max(heights[j]-maxright[j+1]);
                            }
                        }
                        int trappedwater=0;
                            for(int i=0;i<n;i++){
                                int waterlevel;
                                waterlevel=Math.min(maxleft,maxright);
                                trappedwater+= waterlevel-heights[i];
                            }
                            return trappedwater;
                }










    public static void main(String args[]){
        int heights[]= {2,3,4,1,2,1,5,3};
        trappedRainwater(heights);
    }

