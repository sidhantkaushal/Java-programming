import java.util.Arrays;
import java.util.Scanner;

public class Array_basic_que {

    // Swap function :

    static void Swap(int []arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }

    // Find max in array :
    static int Maxinarray(int[]arr){

        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        return max;
    }

    static void reverse(int []arr){
        int s=0;
        int e=arr.length-1;
        while(s<e){
            Swap(arr, s, e);
            s++;
            e--;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[]={1,2,3,4,5,6,7,8,9};
        Swap(arr, 1, 8);
        System.out.println(Arrays.toString(arr));
        int a=Maxinarray(arr);
        System.out.println(a);
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    
}
