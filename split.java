//Split method
import java.util.*;
public class split{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Type the String: ");
        String s = sc.nextLine();
        String arr[] = s.split(" ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+",");
        }
    }
}