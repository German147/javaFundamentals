package algoritmiaCodes.algo.WorkingWithStrings;

public class RemovesDuplicate {
    public static void main(String[] args) {
        int num[] = {1,2,2,2,3,4};
        System.out.println(removeDuplicates(num));
    }
    public static int removeDuplicates(int[] A) {
        if (A.length==0) return 0;
        int j=0;
        for (int i=0; i<A.length; i++)
            if (A[i]!=A[j]) A[++j]=A[i];
        return ++j;
    }
}
