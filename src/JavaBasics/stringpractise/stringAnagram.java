package JavaBasics.stringpractise;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class stringAnagram {

        public static int numberNeeded(String first, String second) {
            int [] missingtracker = new int[26];
            if(first.equals(second))
                return 0;
            else {
                for (int i = 0; i < first.length(); i++)
                    missingtracker[first.charAt(i) - (int) 'a']--;
                for (int j = 0; j < second.length(); j++)
                    missingtracker[second.charAt(j) - (int) 'a']++;
                int count = 0;
                for (int i : missingtracker) {
                    count += Math.abs(i);
                }
                return count;
            }
        }


        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String a = in.next();
            String b = in.next();
            System.out.println(numberNeeded(a, b));

            System.out.println(a.charAt(1));
            int i = a.charAt(1);
            System.out.println(i);
        }
}
