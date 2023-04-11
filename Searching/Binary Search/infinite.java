import java.util.Scanner;

public class infinite {

    public static void main(String[] args) {
        int arr[]={2,5,7,9,12,15,16,18,25,28,45,70,78};
        Scanner in =new Scanner(System.in);
        System.out.println("enter the target value:");
        int target=in.nextInt();
        System.out.println(infinite_search(arr,target));
        
    }

    static int infinite_search(int [] arr,int target){
        int start=0;
        int end =1;
        while(target>arr[end]){
            int newstart=end+1;
            end=end+(end-start+1)*2;
            start=newstart;
        }
        return binary_search(arr, target,start,end);
    }
    static int binary_search(int []arr,int target,int start,int end){

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
