package algoritmiaCodes.algo.loops;

public class ForEachLoop {
    public static void main(String[] args) {

        int a[] = {10, 20, 30, 40, 50};
       // int size = a.length;
        int sum = 0;

        for (int data : a) {
            sum = sum + data;
        }
        System.out.println(sum);

    }
}
