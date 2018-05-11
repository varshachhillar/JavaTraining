package JavaBasics;

public class ThisPractise {

    int a;
    int b;

    ThisPractise(int x, int y){
        this.a= x;
        this.b = y;
    }

    public static void main(String[] args){
        ThisPractise t1 = new ThisPractise(10, 11);
        ThisPractise t2 = new ThisPractise(20, 21);

        System.out.print(t1.a);
        System.out.print(t1.b);
    }
}
