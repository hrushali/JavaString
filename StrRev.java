import java.io.*;
import java.util.*;

public class StrRev {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder rev = new StringBuilder(A);
    rev.reverse();
        if(A.equals(rev.toString())){
            System.out.println("Yes");
            
        }else{
            System.out.println("No");
        }
    }
}




