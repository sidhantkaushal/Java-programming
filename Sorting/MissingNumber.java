public class MissingNumber {
    
    public static void main(String[] args) {
        int [] arr={0,1,3};
        System.out.println(missingNumber(arr));
        
    }
        static void swap(int [] arr, int a,int b)
        {
            int temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
        }
        public static int missingNumber(int[] arr) 
        {
            int i=0;
            while(i<arr.length)
            {
                if(arr[i]==arr.length || arr[i]==i){
                    i++;
                }
                else{
                    swap(arr,i,arr[i]);
                }
            }
    
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j]!=j){
                    return j;
                }
            }
            return arr.length;
        }
 }
    
