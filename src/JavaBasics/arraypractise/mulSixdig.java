package JavaBasics.arraypractise;

//Check when multiplying a 6 digit number with 2 gives a number which has all the same numbers.
public class mulSixdig {
    public static void main(String [] args){
        int a = 000000;
        Integer b = a*2;
        int num=a,flag=1;

        String str = b.toString();

        while (num !=0){
            Integer dig = num%10;
            if (! str.contains(dig.toString())){
                flag =0;
                break;
            }
            num = a/10;
        }
        if(flag==1)
            System.out.println("same digits");
        else
            System.out.println("Not Same");
    }
}
