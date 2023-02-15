import java.util.*;
public class join {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Type the First String: ");
        String s = sc.nextLine();
        System.out.print("Type the Second String: ");
        String s1 = sc.nextLine();
        String s2 = String.join(" ",s,s1);
        System.out.println("String after joining is: " +s2);
    }
}
