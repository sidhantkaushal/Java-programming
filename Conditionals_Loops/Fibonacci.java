import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number");
        int n=in.nextInt();
        // int a=0;
        // int b=1,c;
        // for(int i=0;i<n;i++){
        //     if(i==0 || i==1){
        //         System.out.println(i);
        //     }
        //     else{
        //         c=a+b;
        //         System.out.println(c);
        //         a=b;
        //         b=c;
        //     }

        // }
        int a=0,b=1,count=2,ans=0;
        if(n==1){
            System.out.println(0);
        }
        else if(n==2){
            System.out.println(1);
        }
        else{
            while(count<n){
                ans=a+b;
                a=b;
                b=ans;
                count++;
            }
            System.out.println(ans);

        }

    }
}
