import java.util.Arrays;

public class First_last_array {

    public  static int[] searchRange(int[] nums, int target) {
        int [] ans={-1,-1};
        if(nums.length==0) return ans;
        int start=index(nums,target,true);
        int last=index(nums,target,false);
        ans[0]=start;
        ans[1]=last;
        return ans;
        
    }

    static int index(int [] arr, int target, boolean startindex){
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while(start<=end)
        {

        int mid = start + (end-start)/2;

            if(target > arr[mid]){
                start=mid+1;
            }

            else if(target < arr[mid]){
                end=mid-1;
            }
            
            else{
                ans=mid;
                if(startindex){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,6,6,7,8};
        int ans[]=searchRange(arr, 6);
        System.out.println(Arrays.toString(ans));

    }
}
    