package JavaBasics.arraypractise;

public class Overlaprectangle {
    double x;
    double y;



    public static void main(String[] args){
        Overlaprectangle l1 = new Overlaprectangle();
        Overlaprectangle r1 = new Overlaprectangle();
        Overlaprectangle l2 = new Overlaprectangle();
        Overlaprectangle r2 = new Overlaprectangle();

        boolean result;
        l1.x = 3;
        l1.y = 5;
        r1.x = 3.5;
        r1.y = 3;
        l2.x = 2;
        l2.y = 4;
        r2.x = 4;
        r2.y = 3;
        result = findoverlap(l1,r1,l2,r2);
        System.out.println(result);

    }

   static Boolean findoverlap (Overlaprectangle l1, Overlaprectangle r1, Overlaprectangle l2, Overlaprectangle r2){
        Boolean result;
        if(l1.x > r2.x || l2.x > r1.x){
            result = false;
        }
        else if (l1.y < r2.y || l2.y < r1.y){
            result = false;
        }
        else {
            result = true;
        }
        return (result);
    }
}
