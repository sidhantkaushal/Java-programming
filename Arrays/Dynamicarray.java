import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Dynamicarray {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        // 1D Arraylist
        ArrayList<Integer> list =new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        System.out.println(list);

        // 2D array list
        
        ArrayList<ArrayList<Interger>> arr=new ArrayList<>();

        for(int i=0;i<3;i++){
            arr.add(new ArrayList<>());
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr.get(i).add(in.nextInt());
            }

        }


    }
}
