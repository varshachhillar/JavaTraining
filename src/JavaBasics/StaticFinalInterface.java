package JavaBasics;

interface interface1{
    int i=10;
    final int j=11;

     void tes();

}

class test implements interface1{
    test(){
        System.out.println("constructor");
    }

    public void tes(){
        System.out.println("class method");
        System.out.println(i);
        System.out.println(j);
    }

}

public class StaticFinalInterface {
    public static  void main(String[] args){
        test t1 = new test();
        t1.tes();
        System.out.println(test.j);



    }
}
