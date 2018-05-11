package JavaBasics.stringpractise;

public class stringmemory {
    public  static void main(String args[]){
        String s1= "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        String s4 = new String("abc");
        String s5 = s1;
        String s6 = s3;
        s1 = "asd";


        System.out.print("s1 ==s2 ");
        System.out.println(s1==s2);

        System.out.print("s3 ==s4 ");
        System.out.println(s3==s4);

        System.out.print("s5 ==s1 ");
        System.out.println(s5==s1);

        System.out.print("s6 ==s3 ");
        System.out.println(s6==s3);

        Integer i1 = 10;
        Integer i2 = 10;
        i1= 15;

        System.out.print("i1 ==i2 ");
        System.out.println(i1==i2);



    }
}
