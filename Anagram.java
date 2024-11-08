import java.util.Scanner;

public class Anagram {

    static boolean isAnagram(String a, String b) {
          // If lengths are different, they can't be anagrams
        if (a.length() != b.length()) {
            return false;
        }

        // Loop to check frequencies of characters in both strings
        for (char ch = 'a'; ch <= 'z'; ch++) {
            int countA = 0;
            int countB = 0;

            // Count occurrences of 'ch' in string 'a'
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == ch) {
                    countA++;
                }
            }

            // Count occurrences of 'ch' in string 'b'
            for (int i = 0; i < b.length(); i++) {
                if (b.charAt(i) == ch) {
                    countB++;
                }
            }

            // If counts don't match for any character, return false
            if (countA == countB) {
                return true;
            }else{
                 return false;
            }
        }

        // If all counts match, return true
        return false;
    
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

