package casting;

public class CastingPrimitiveTypes {
    public static void main(String[] args) {

        System.out.println(castingIntegerIntoDouble(3,4));
    }
    public static double castingIntegerIntoDouble(int n1,int n2){

        double d1 = 3.2;
        double d2 = 3.9999;

        n1 = (int) d1;  //n1 now has a value of 3
        n2 = (int) d2;  //n2 now has a value of 3

        return n1+n2;
    }
}
