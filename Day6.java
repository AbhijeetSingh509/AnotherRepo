import java.util.Scanner;
import java.util.*;

public class Day6 {
    public static boolean isPalind(String a){
        // String alow = a.toLowerCase();

        // char[] aStr = a.toCharArray();
        int first = 0;
        int last = a.length()-1;

        while(first<=last){
            if(a.charAt(first)==a.charAt(last)){
                first++;
                last--;
            } 
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String: ");
        String a = sc.next();
        System.out.println(isPalind(a)); 
    }
}