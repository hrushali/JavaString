import java.io.*;
import java.util.*;
public class StrToken {
   



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        
        String cleanedStr = s.replaceAll("[^a-zA-Z0-9' ]","");

        
        String[] tokens = cleanedStr.split("[^a-zA-Z0-9']+");

      
        System.out.println(tokens.length);

   
        for (String token : tokens) {
            System.out.println(token);
    }
}
}

    

