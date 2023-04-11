import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6,7,8};
        int target=8;
        System.out.println("The target element is present at index "+ search(arr1, target));
    }
    static int search(int []arr,int target){

        int start=0;
        int end=arr.length-1;
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
