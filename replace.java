import java.util.*;
public class replace {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Type the String: ");
        String s = sc.nextLine();
        System.out.println("Replaced word: "+ s.replace('b','d'));
    }
}
