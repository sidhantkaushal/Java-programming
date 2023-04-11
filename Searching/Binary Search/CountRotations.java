public class CountRotations {
    public static void main(String[] args) {
        int []arr={14,17,20,1,2,3,4,6};
        System.out.println(findKRotation(arr));
        
    }
    static int findKRotation(int arr[]) {
        // code here
        int pivot=find_pivot(arr);
        if(pivot==-1) return 0;
        else return pivot+1;
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
            if(mid>0 && arr[mid]<arr[mid-1]){
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
}
