
import java.util.*;
public class Input {

    public static void main(String[] args) {
        // Array of primitives
        int[] arr=new int [5];

        Scanner in =new Scanner(System.in);
        // Direct input 
        // arr[0]=1;
        // arr[1]=2;
        // arr[3]=3;
        // arr[4]=5;
        // arr[8]=7;

        //Input using for loop 

        for(int i =0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        
        //Print array using for loop

        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        // Enhanced for loop to print element.
        for(int num:arr){
            System.out.println(num +" ");
        }

        // Convert array to a string and then print .
        
            System.out.println(Arrays.toString(arr));

        


                //Array of objects 
                String [] str=new String[5];

                for(int i=0;i<str.length;i++){
                    str[i]=in.next();
                }

                for(int i=0;i<str.length;i++){
                    System.out.println(str[i]);
                }
    }
}
