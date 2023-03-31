
import java.util.*;
public class array{
    public static void main(String[] args) {
        //Syntax
        // datatype[] reference-variable-name=new datatype[size];
        int [] arr1= new int [] {1,2,3,4,5};
        Scanner in =new Scanner(System.in);        // To print array 
        // First method
        // for(int i=0;i<arr1.length;i++){
        //     System.out.println(arr1[i] +" ");
        // }


        // Second method


        // for(int num:arr1){
        //     System.out.println(num);
        // }

        //Third method

        // System.out.println(Arrays.toString(arr1));

        String [] str=new String[5];
        
        for(int i=0;i<str.length;i++){
            str[i]=in.next();
        }
        str[1]="sid";
        System.out.println(Arrays.toString(str));

    }
}
