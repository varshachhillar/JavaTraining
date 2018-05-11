package JavaBasics;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Collections;


public class stringquestion {

    public static String sortString1(String s){
        char arr[] = s.toCharArray();
        Arrays.sort(arr);
        String sorts = new String(arr);
        return sorts;
    }

    public static String sortString2(String s){
        char arr[] = new char[s.length()];
        for(int i = 0;i<s.length();i++){
            arr[i] = s.charAt(i);
        }
        Arrays.sort(arr);
        String sorts = new String(arr);
        return sorts;
    }

    public static String swapchar1(String s, int i, int j){
        char arr[] = s.toCharArray();
        char tmp;
        tmp = arr[i];
        arr[i]=arr[j];
        arr[j]= tmp;
        String swaps = new String(arr);
        return swaps;
    }

    public static String swapchar2(String s, int i, int j){
        String swaps;
        if(j == s.length()-1){
            swaps = s.substring(0,i)+s.charAt(j) + s.substring(i+1,j)+s.charAt(j);
        }
        else {
            swaps = s.substring(0,i)+s.charAt(j)+s.substring(i+1,j)+s.charAt(i)+s.substring(j+1,s.length());
        }
        return swaps;
    }

    public static String swapchar3(String s, int i, int j){
        StringBuffer sb = new StringBuffer(s);
        sb.setCharAt(i,s.charAt(j));
        sb.setCharAt(j,s.charAt(i));
        String swaps = sb.toString();
        return swaps;

    }

    public static void uniqueword1 (String s){
        String word = "";

        HashMap<String, Integer> hm = new HashMap<String , Integer>();
        for(int i = 0 ; i <= s.length(); i++){
            if(Character.isWhitespace(s.charAt(i)) || i== s.length()){
                Integer count = hm.get(word);
                if(count == null){
                    hm.put(word,1);
                }
                else{
                    hm.put(word,++count);
                }
                word = "";
            }
            else{
                word = word + String.valueOf(s.charAt(i));
            }
        }

        for(Map.Entry<String, Integer> e : hm.entrySet()){
            if (e.getValue()> 1){
                System.out.println(e.getKey());
            }
        }
    }


    public static void uniqueword2 (String s){
        Pattern p = Pattern.compile("[a-zA-Z]+");
        Matcher m = p.matcher(s);

        HashMap<String, Integer> hm = new HashMap<String , Integer>();

        while (m.find()){
            String word = m.group();
            Integer count = hm.get(word);
            if(count == null){
                hm.put(word,1);
            }
            else{
                hm.put(word,++count);
            }
        }

        for(Map.Entry<String, Integer> e : hm.entrySet()){
            if (e.getValue()> 1){
                System.out.println(e.getKey());
            }
        }


    }

    public static  void swapstring1(String a, String b){
        int alen = a.length();
        int blen = b.length();
        a = a+b;
        b= a.substring(0,a.length()-blen);
        a = a.substring(alen,a.length());
        System.out.println(a);
        System.out.println(b);

    }

    //remove leading and trailig space
    public static void removespace1(String s){
        s = s.trim();
        System.out.println(s);
    }

    //Reverse a string
    public static void reversestring1(String s){
        //whole string
        StringBuffer s1 = new StringBuffer(s);
        s1.reverse();
        System.out.println(s1);

        //word by word reverse
        StringBuffer s2 = new StringBuffer();
        String ss2 [] = s.split(" ");
        s= "";

        for (int i =0; i < ss2.length; i++){
            s2.append(ss2[i]);
            s2.reverse();
            s= s+ s2+ " ";
            s2.setLength(0);

        }
        System.out.println(s);
    }

    public static void reversestring2(String s){
        //whole string reverse
        StringBuilder s1 = new StringBuilder(s);
        s1.reverse();
        System.out.println(s1);

        //word by word reverse
        StringBuilder s2 = new StringBuilder();
        String ss2 [] = s.split(" ");
        s= "";

        for (int i =0; i < ss2.length; i++){
            s2.append(ss2[i]);
            s2.reverse();
            s= s+ s2+ " ";
            s2.setLength(0);

        }
        System.out.println(s);

    }

    public static void reversestring3 (String s){
        char sc[]= s.toCharArray();
        List<Character> s2 = new ArrayList<>();

        for (char c: sc){
            s2.add(c);
        }

        Collections.reverse(s2);
        ListIterator li = s2.listIterator();
        while (li.hasNext()){
            System.out.print(li.next());
        }

    }


    //remove front 0
    public static void removestring1 (String s){
        StringBuffer s1 = new StringBuffer(s);
        int i =0;

        while(s1.charAt(i) == '0'){
            i++;
        }

        s1.replace(0, i, "");
        System.out.println(s1);
    }

    //Longest Common Substring in an Array of Strings
    public static void  longstring1(String srr[]){
        int len = srr.length;

        String s = srr[0];
        int slen = s.length();
        String res="";

        for(int i = 0; i< slen ; i++){
            for (int j=i+1;j< slen; j++){
                String sub = s.substring(i,j+1);

                int k = 1;
                for(k=1;k<len;k++){
                    if (!srr[k].contains(sub)){
                        break;
                    }
                }
                if(k == len && res.length()< sub.length()){
                    res = sub;
                }
            }
        }

        System.out.println(res);

    }

    //smallest sub string with all distinct character
    public static void smallstring1(String s){
        int len = s.length();
        String sub = "";
        List<String> srr = new ArrayList<String>();
        List<Character> crr = new ArrayList<Character>();
        crr.add(s.charAt(0));

        for(int i =0; i<len; i++){
            for(int j = i+1;j<len;j++){
                if(s.charAt(j-1) != s.charAt(j) && s.charAt(i) != s.charAt(j)){
                    sub = s.substring(i,j+1);
                    if (!srr.contains(sub)){
                        srr.add(sub);
                    }
                    if(!crr.contains(s.charAt(j))){
                        crr.add(s.charAt(j));
                    }
                }
                else{
                    break;
                }
            }
        }
        String res = s;

        for (int x =0; x< srr.size(); x++){
            for (int y =0; y< crr.size();y++){
                if (!srr.get(x).contains(crr.get(y).toString())){
                    break;
                }
                if(y == crr.size()-1 && res.length() > srr.get(x).length()){
                    res = srr.get(x);
                }
            }
        }
            System.out.println(res);
    }
    








    }
