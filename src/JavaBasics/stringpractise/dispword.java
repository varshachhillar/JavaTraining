package JavaBasics.stringpractise;

import java.util.Objects;

//I was asked to write a code to display the words of a sentence in alphabetical order.
public class dispword {
    public static void main(String[] args){
        String str = "i have a cat";
        StringBuilder sb = new StringBuilder();

        String[] sarr = str.split(" ");
        for (int i =0; i<sarr.length;i++){
            for(int j=i+1;j<sarr.length;j++){
                if(Objects.hashCode(sarr[i].charAt(0))> Objects.hashCode(sarr[j].charAt(0))){
                    String tmp =sarr[i];
                    sarr[i] = sarr[j];
                    sarr[j]=tmp;
                }
            }
            sb = sb.append(sarr[i]).append(" ");
        }
        System.out.println(str);
        System.out.println(sb);
    }
}
