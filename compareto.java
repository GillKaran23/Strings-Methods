import java.util.*;
public class compareto {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Type the String: ");
        String s = sc.nextLine();
        System.out.print("Type the String: ");
        String s1 = sc.nextLine();

        System.out.println("Output is: "+s.compareTo(s1));
    }
}
