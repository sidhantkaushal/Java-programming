public class SearchRotated
{ 
    // Search in a rotated sorted array. 
    public static void main(String[] args) {
        int [] arr={4,5,6,7,7,8,9,4,3,3,3,2,1};
        System.out.println(find_pivotWithDuplicates(arr));
        System.out.println(searchInRotated(arr,3));
        // System.out.println(searchInRotated(arr));
    }

    //  static int searchInRotated(int [] arr,int target){
    //     int pivot=searchPivot(arr);

    // }
    static int searchInRotated(int []arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        int pivot=find_pivot(arr);
        if(pivot==-1){
            return binarysearch(arr, target, 0, arr.length-1);
        }

        if(arr[pivot]==target)
        {
        return pivot;
         }

        if(target>=arr[start])
        {
           
            return binarysearch(arr,target,start,pivot -1);
        }
        else
        {

            return binarysearch(arr,target,pivot+1,arr.length-1);
        }

    }

     static int find_pivot(int [] arr)
     {
         int start=0;
         int end=arr.length-1;
         while(start<=end)
         {
            
        int mid = start + (end-start)/2;
            if( mid<end && arr[mid]>arr[mid+1]){
                 return mid;
            }
            if( mid>end && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            else if(arr[start]>=arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1; 
            }
         }
         return -1;
    }
    static int find_pivotWithDuplicates(int [] arr)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
           
       int mid = start + (end-start)/2;
           if( mid<end && arr[mid]>arr[mid+1]){
                return mid;
           }
           if( mid>start && arr[mid]<arr[mid-1]){
               return mid-1;
           }
           if(arr[start]==arr[mid] && arr[end]==arr[mid]){
            if(arr[start]>arr[start+1]){
                return start;
            }
            start++;
            if(arr[end]<arr[end-1])
            {
                return end-1;
            }
            end--;
           }
           else if (arr[start]==arr[mid] || (arr[start]==arr[mid]&&arr[mid]>arr[end])){
                start=mid+1;
           }
           else{
            end=mid-1;
           }

        }
        return -1;
   }



    static int binarysearch(int []arr,int target,int start,int end){


        while(start<=end){
        //    int mid=(end+start)/2; // For large number of input it is possible that (end+start) may exceed the limit.

        int mid = start + (end-start)/2;

            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid] > target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}
