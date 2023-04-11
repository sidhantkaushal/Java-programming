public class OrderAgnosticBS {
    public static void main(String[] args) {
        int arr1[]={1,23,45,56,67};
        int arr2[]={9,8,7,6,4,2,1};
        System.out.println(OA_BinarySearch(arr2, 4));
        System.out.println(OA_BinarySearch(arr1, 23));
        ;
    }
    
    static int OA_BinarySearch(int [] arr,int target){
        int start=0;
        int end=arr.length-1;
        // Find wheather the array is ascending or descending.
        boolean isAsc=arr[start]<arr[end];
        while(start<=end){
        //    int mid=(end+start)/2; // For large number of input it is possible that (end+start) may exceed the limit.
        int mid = start + (end-start)/2;

            if(arr[mid]==target){
                return mid;
            }

            if(isAsc)
            {
                if(arr[mid] > target){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else
            {
                if(arr[mid] < target){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }

            }

        }
        return -1;

    }
}
