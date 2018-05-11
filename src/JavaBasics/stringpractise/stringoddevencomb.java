package JavaBasics.stringpractise;

import java.util.Scanner;

public class stringoddevencomb {
        public static void stringcomb(String[] seven, String[] sodd, int count){
            String sfinal[]= new String[count];
            for(int i =0;i<count;i++){
                sfinal[i] = seven[i]+new String("  ")+new String("  ")+sodd[i];
            }
            for (int i = 0; i<count;i++){
                System.out.println(sfinal[i]);

            }
        }

        public static void oddeven(String[] s, int count){
            String[] seven = new String[count];
            String[] sodd = new String[count];
            for (int i =0;i<count;i++){
                seven[i] ="";
                sodd[i]="";
                for (int j =0;j<s[i].length();j++){
                    if(j%2==0){
                        seven[i]=seven[i]+s[i].charAt(j);
                    }
                    else{
                        sodd[i]=sodd[i]+s[i].charAt(j);
                    }
                }
            }
            stringcomb(seven, sodd, count);
        }

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner scan = new Scanner(System.in);
            int count = scan.nextInt();
            String s[]= new String[count];
            for (int i = 0; i<count;i++){
                s[i] = scan.next();
            }
            oddeven(s,count);
        }

}
