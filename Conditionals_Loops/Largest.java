import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        if(a>b){
            if(a>c){
                System.out.println(a);
            }else{
                System.out.println(c);
            }
        }
        else{
            if(b>c){
                System.out.println(b);
            }else{
                System.out.println(c);
            }
        }
    }
}
