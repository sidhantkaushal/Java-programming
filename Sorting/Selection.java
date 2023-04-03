import java.util.Arrays;

public class Selection {

    static void SelectionSort(int []arr)
    {
        for(int i=0;i<arr.length;i++){
            int lastindex=arr.length-i-1;
            int maxindex=max(arr,0,lastindex);
            swap(arr,maxindex,lastindex);
        }
        System.out.println(Arrays.toString(arr));
    }

    static int max(int [] arr, int start, int end){
        int ans=start;
        for(int i=start;i<=end;i++){
            if(arr[ans] < arr[i]){
                ans=i;
            }
        }
        return ans;
    }
    static void swap(int [] arr, int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    public static void main(String[] args) {
        int [] arr={5,4,2,1,2,5};
        SelectionSort(arr);
    }
}
