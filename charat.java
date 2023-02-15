import java.util.*;
public class charat {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Type the index: ");
        int n = sc.nextInt();
        String s = "Hello Java World";
        System.out.println("charat "+n+" is: "+ s.charAt(n));
    }
}
