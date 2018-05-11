package JavaBasics.inheritpractise;

class C extends B{
    C(){super();
System.out.println("Consuctor of C class");
    }

    void C1 (){
        System.out.println("C1");
    }
}


public class A {
    A(){
        System.out.println("Consuctor of A class");
    }

    void A1 (){
        System.out.println("A1");
    }

    public  static void main(String[] args){

        System.out.println("**************************************");
        A aa= new A();
        A ab = new B();
        A ac = new C();
        System.out.println("**************************************");
//      B ba= new A();
        B bb = new B();
        B bc = new C();
        System.out.println("**************************************");
//      C ca= new A();
//      C cb = new B();
        C cc = new C();
        System.out.println("**************************************");
//      D da= new A();
//      D db = new B();
        D dd = new D();
        System.out.println("**************************************");





    }
}
