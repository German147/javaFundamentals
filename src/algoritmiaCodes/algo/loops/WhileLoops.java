package algoritmiaCodes.algo.loops;

public class WhileLoops {
    public static void main(String[] args) {

        int a[] = {10, 20, 30, 40, 50};
        int size = a.length;
        int sum = 0;
        int i = 0;

        while (i!=size){
            sum = sum + a[i];
            ++i;
        }
        System.out.println(sum);

    }
}
