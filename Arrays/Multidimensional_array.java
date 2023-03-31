import java.util.Arrays;
import java.util.Scanner;

public class Multidimensional_array {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        // Direct declaration of 2-d array.
        // int [][] arr1={
        //     {1,2,3},
        //     {4,5,6},
        //     {7,8,9}
        // };


        // Two dimensional array.

        //Initialization of 2d array
        int [][] arr2=new int[3][3];

        // Taking input
        System.out.println("Enter the numbers in 2d array of 3x3");
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[i].length;j++){
                arr2[i][j]=in.nextInt();
            }

        }

        //Print 2d array

        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[i].length;j++){
                System.out.print(arr2[i][j] +" ");
            }
            System.out.println();
        }

        arr2[0][0]=19;

        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[i].length;j++){
                System.out.print(arr2[i][j] +" ");
            }
            System.out.println();
        }

        for(int i=0;i<arr2.length;i++){
            System.out.println(Arrays.toString(arr2[i]));
        }
    }
}
