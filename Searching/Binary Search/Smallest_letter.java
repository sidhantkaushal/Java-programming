public class Smallest_letter {
    static char searchletter(char []arr,char target){

        int start=0;
        int end=arr.length-1;
        int mid=0;

    
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

        return arr[start%arr.length];
    }

    public static void main(String[] args) {
        char [] arr={'a','b','d','f','h'};
        char target='k';
        System.out.println(searchletter(arr,target));
    }  
}
