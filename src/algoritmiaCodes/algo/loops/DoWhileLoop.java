package algoritmiaCodes.algo.loops;

public class DoWhileLoop {
    public static void main(String[] args) {

        int a[] = {10, 20, 30, 40, 50};
        int size = a.length;
        int sum = 0;
        int i = 0;

        do {
            sum = sum + a[i];
            ++i;
        }while (i!=size);

        System.out.println(sum);
    }
}
