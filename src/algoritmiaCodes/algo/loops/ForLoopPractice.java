package algoritmiaCodes.algo.loops;

public class ForLoopPractice {

    public static void main(String[] args) {

        int a[] = {10, 20, 30, 40, 50};
        int size = a.length;
        int sum = 0;

        for (int i = 0; i != size; ++i){
            sum = sum + a[i];
        }
        System.out.println(sum);

    }
}
