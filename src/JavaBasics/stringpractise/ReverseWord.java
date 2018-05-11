package JavaBasics.stringpractise;

import com.sun.org.apache.xpath.internal.WhitespaceStrippingElementMatcher;
import com.sun.org.apache.xpath.internal.operations.Equals;

import java.util.Scanner;

public class ReverseWord {
    public static StringBuilder reverse(String s){
        int j = s.length()-1;
        StringBuilder revr = new StringBuilder();
        for(int i= s.length()-1;i>=0;i--){
            if (i==0){
                revr=revr.append(s.substring(i,j+1));
            }
            if(Character.isWhitespace(s.charAt(i))){
                revr = revr.append(s.substring(i,j+1));
                j=i;
            }
        }
        return  revr;
    }
    public  static  void  main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s="";
        s += scan.nextLine();
//        s= scan.nextLine();
        StringBuilder revr = new StringBuilder();
        revr = reverse(s);
        System.out.println(s);
        System.out.println(revr);



    }
}
