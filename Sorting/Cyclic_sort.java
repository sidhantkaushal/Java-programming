import java.util.Arrays;
public class Cyclic_sort {

    static void cyclic(int [] arr){
        for(int i=0;i<arr.length;){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
    }
    
    static void cyclic2(int [] arr){
        int i=0;
        while(i<arr.length){
            if(arr[i]==i+1){
                i++;
            }
            else{
                swap(arr,i,arr[i]-1);
            }
        }
    }

    static void swap(int [] arr, int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void main(String[] args) {
        int [] arr={5,4,3,2,1,2,3,};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    
}
