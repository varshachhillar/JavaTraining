package JavaBasics.arraypractise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class phonebook {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        HashMap<String,Integer> phbook = new HashMap<>();
        ArrayList<String> query = new ArrayList<>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phbook.put(name,phone);
        }
        while(in.hasNext("")){
            String s = in.next();
            query.add(s);
        }
        in.close();

        for (String q: query) {
            if(phbook.get(q)== null){
                System.out.println("Not found");
            }
            else {
                System.out.println(q +"="+phbook.get(q));
            }
        }
    }
}
