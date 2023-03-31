public class LinearSearch {

    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        System.out.println(ls2(arr,2));
    }

    // 1-search in the array:return index
    static int ls(int []arr, int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    // 2-search in the array:return element 
    static int ls1(int []arr, int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return arr[i];
            }
        }
        return Integer.MIN_VALUE;
    }
    // 3-search in the array:return bool
    static boolean ls2(int []arr, int target){
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }
}
