package JavaBasics;
import com.sun.org.apache.xpath.internal.operations.Equals;

import java.util.Objects;

public class equalsexplain {
    public static void main(String args[]) {
        String Str1 = new String("This is really not immutable!!");
        String Str5 = new String("This is really not immutable!!");
        String Str2 = Str1;
        String Str3 = "This is really not immutable!!";
        String Str4 = "This is really not immutable!!";

        int a = 3;
        int b = new Integer(4);
        System.out.println("a=3 "+Objects.hashCode(a));

        int c=4;
        a=4;
        System.out.println("a=4 "+Objects.hashCode(a));
        System.out.println("str1 "+Str1.hashCode());

//        Str1 = "This is really not immutable!!";


        System.out.println(Objects.equals(a,c));
        System.out.println(Objects.equals(a,b));


        System.out.println("str1 "+Str1.hashCode());
        System.out.println("str2 "+Str2.hashCode());
        System.out.println("str3 "+Str3.hashCode());
        System.out.println("str4 "+Str4.hashCode());
        System.out.println("str5 "+Str5.hashCode());


        if(Str1.equals("This is really not immutable!!"))
            System.out.println("Returned Value = True "  );
        else{
            System.out.println("Returned Value = False "  );
        }
        if(Str1 == Str2)
            System.out.println(" Str1 == Str2 Returned Value = True "  );
        else{
            System.out.println(" Str1 == Str2 Returned Value = False "  );
        }
        if(Str1 == Str3)
            System.out.println("Str1 == Str3 Returned Value = True "  );
        else{
            System.out.println("Str1 == Str3 Returned Value = False "  );
        }
        if(Str1 == Str5)
            System.out.println(" Str1 == Str5 Returned Value = True "  );
        else{
            System.out.println(" Str1 == Str5 Returned Value = False "  );
        }
        if(Str4 == Str3)
            System.out.println("Str4 == Str3 Returned Value = True "  );
        else{
            System.out.println("Str4 == Str3 Returned Value = False "  );
        }
        if(a==b)
            System.out.println("a==b Returned Value = True "  );
        else{
            System.out.println("a==b Returned Value = False "  );
        }
    }
}
