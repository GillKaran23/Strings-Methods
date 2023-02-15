import java.util.*;
public class isempty {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Type the String: ");
        String s = sc.nextLine();
        System.out.println("String is empty: "+s.isEmpty());
    }
}
