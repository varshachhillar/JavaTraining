package JavaBasics.arraypractise;

import java.util.Scanner;

public class binary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int count = 0, len=0;
        String bnum = Integer.toBinaryString(num);
        for (int i = 0; i < bnum.length(); i++) {
            if (bnum.charAt(i) == '1')
                count++;
            else {
                if (len < count)
                    len = count;
                count = 0;
            }
        }
        if (len < count)
            len = count;
        System.out.println(len);
    }
}
