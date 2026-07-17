public class sortingCC {



//BUBBLE SORTING
    public static void bubbleSorting(int numbers[]){
        for(int i=0;i<numbers.length-1;i++){
           int swap=0;
            for(int j=0;j<numbers.length-1-i;j++){
                if(numbers[j]>numbers[j+1]){
                    int temp=numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;
                    swap++;
                     
                }  if(swap==0){
                    System.out.println("the array is already sorted!");
                    return; 
                }
            } 
        } 
        }





        
//SELECTION SORTING 
        public static void selectionSort(int arr[]){
                for(int i=0;i<arr.length-1;i++){
                       int minPos=i; //man le mera curr element he smallest h 
                        for(int j=i+1;j<arr.length;j++){
                            if(arr[minPos]<arr[j]){//at this sign ye hume decreasing form me arr dega but if > then ascn me milega 
                                minPos=j;
                            }
                             
                        }
                        int temp = arr[minPos];
                        arr[minPos]=arr[i];
                        arr[i]=temp;}
                }
                
        




    //INSERTION SORTING 
                // public static void insertionSort(int arr[]){
                //     for(int i=1;i<arr.length;i++){
                //         for(int j=0;j<i;j++){
                //             if(arr[i]<arr[j]){
                //                 int temp=arr[j];
                //                 arr[j]=arr[i];
                //                 arr[i]=temp;
                //             }
                //         }
                //     }
                // }//what u  have written is in short bubble sort only this is giving  correct ans but is wrong approach !




            //correct code 
              public static void insertionSort(int arr[]){
                for(int i=1;i<arr.length;i++){
                    int curr=arr[i];
                    int prev =i-1;
                    //finding out the correct pos to insert
                    while(prev>=0 && arr[prev]>curr){//ye wala condition ko change karke we can get ascd dscn
                        arr[prev+1]=arr[prev];
                        prev--;
                    }
                //insertion
                arr[prev+1]=curr;
                }
              }






    //COUNTING SORTING 
              public static void countingSort(int arr[]){
                int largest = Integer.MIN_VALUE;
                for(int i=0;i<arr.length;i++){
                    largest =Math.max(largest,arr[i]);
                }
                int count[]= new int(largest+1);//kyuki zero bhi count jo jayega which we dont want
                for(int i=0;i<arr.length;i++){
                    count[arr[i]]++;
                }
                //sorting
                int j=0;
                for(int i=0;i<count.length;i++){
                    while(count[i]>0){
                        arr[j]=i;
                        j++;
                        count[i]--;

                    }
                }
              }
        
    public static void printarr(int numbers[]){
        for(int k=0;k<numbers.length;k++){
            System.out.println(numbers[k]);
        }
    }
    
    public static void main(String args[]){
        int numbers[]={5,4,1,3,2};
        insertionSort(numbers);
        printarr(numbers);
    }
}
