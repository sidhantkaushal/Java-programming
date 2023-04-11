
public class SearchInStrings {
    public static void main(String[] args) {
        String name="sidhant" ;
        char ch='a';
        System.out.println(search(name,ch));
    }
    static int search(String str,char ch){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch){
                return i;
            }
        }
        return -1;
    }
}
