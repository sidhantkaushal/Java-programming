import java.util.Arrays;

public class SearchIn2Darray 
{
    public static void main(String[] args) {
        int [][] arr={
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };
        System.out.println(Arrays.toString(search1(arr,9)));
    }

    static Boolean search(int [][] arr,int target)
    {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    return true;
                }
        } 
       
    }
    return false;
    
    }
    static int[] search1 (int [][] arr,int target)
    {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }
        } 
       
    }
    return new int[]{-1,-1};
    
    }
}
