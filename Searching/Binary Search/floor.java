public class floor {
     
    static int searchfloor(int []arr,int target){

        int start=0;
        int end=arr.length-1;
        int mid=0;
        if(target < arr[0]){
            return -1;
        }
    
        while(start<=end){
        //    int mid=(end+start)/2; // For large number of input it is possible that (end+start) may exceed the limit.

        mid = start + (end-start)/2;

            if(arr[mid]==target){
                return arr[mid];
            }
            else if(arr[mid] > target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }

        return arr[end];
    }

    
    public static void main(String[] args) {
        int [] arr={3,4,6,7,8};
        int target=5;
        System.out.println(searchfloor(arr,target));
    }  
    
}
