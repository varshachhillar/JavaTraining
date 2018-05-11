package JavaBasics.stringpractise;

import java.util.Scanner;

public class ConcatAndReverse {

    public static StringBuilder reverse (StringBuilder concatstring){
        StringBuilder reverse = new StringBuilder();
        for(int i =concatstring.length()-1; i>=0;i--){
            reverse.append(concatstring.charAt(i));
        }
        return reverse;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String string1 = scan.next();
        String string2 = scan.next();
        StringBuilder concatstring = new StringBuilder(string1.concat(string2));
//        concatstring.reverse();
       concatstring = reverse(concatstring);
        System.out.print(concatstring);
    }
}
